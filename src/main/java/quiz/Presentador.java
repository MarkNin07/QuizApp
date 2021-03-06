package quiz;

import java.util.Scanner;

public class Presentador {
    Menu menu = new MenuConcurso();
    Scanner obtenerInput = new Scanner(System.in);
    private final Integer cantidadRondas = 5;
    private final Integer premioPorRonda = 500;
    private Boolean terminarJuego = false;
    private Historial historial = new Historial();
    private Usuario usuario = new Usuario();
//    private Boolean usuarioRetirado = false;
//    private Boolean seHaEquivocado = false;

    private String solicitarDato(String mensaje){
        System.out.println(mensaje);
        return this.obtenerInput.nextLine();
    }

    public String solicitarDatos() {
        String nombreUsuario = solicitarDato("Ingrese su nombre de usuario: ");
        this.usuario.setNombreUsuario(nombreUsuario);
        return nombreUsuario;
    }


    public Integer mostrarMenuPrincipal(){
        this.menu.mostrarMenuPrincipal();
        String opcionElegida = solicitarDato("Ingrese la opcion del menu a elegir: ");
        return Integer.parseInt(opcionElegida);
    }

    public void mostrarMenuInicial(){
        this.menu.menuInicial();
    }

    private boolean validarRespuestaPregunta(Pregunta pregunta, String respuesta){
        return pregunta.getRespuestaCorrecta().equalsIgnoreCase(respuesta);
    }

    private boolean validarRespuestaRetiro(Integer respuesta){
        return respuesta == 1;
    }

    public void iniciarJuego(){
        Boolean deseaContinuar = true;
        Boolean usuarioRetirado = false;
        Boolean seHaEquivocado = false;

        for(int ronda = 1 ; ronda <= this.cantidadRondas; ronda++){
            BancoPreguntas bancoPreguntas = new BancoPreguntas();
            Pregunta preguntaElegida;

            preguntaElegida = bancoPreguntas.obtenerPregunta(ronda);
            this.menu.mostrarMenuPregunta(preguntaElegida);

            String respuestaUsuario = solicitarDato("Ingrese su respuesta: ");
            boolean respuestaCorrecta = validarRespuestaPregunta(preguntaElegida, respuestaUsuario);

            if(!respuestaCorrecta){
                this.usuario.setPuntaje(0);
                System.out.println("Ha perdido, su premio es: " + this.usuario.getPuntaje());
                this.usuario.setEstado(EstadoUsuario.HA_PERDIDO);
                this.terminarJuego = true;
                seHaEquivocado = true;
                this.historial.agregarUsuario(this.usuario);
                this.usuario = new Usuario();
                break;
            }

//            usuario acert?? la pregunta y se le suma el puntaje
            this.usuario.setPuntaje(this.usuario.getPuntaje() + this.premioPorRonda);

            if(ronda <  this.cantidadRondas){
                this.menu.menuDecidirContinuar();
                Integer respuestaRetiro = Integer.parseInt(solicitarDato("Ingrese su respuesta: "));
                deseaContinuar = validarRespuestaRetiro(respuestaRetiro);
            }


            if(!deseaContinuar){
//                usuario se retira
                System.out.println("Su premio de retiro es: " + this.usuario.getPuntaje());
                this.usuario.setEstado(EstadoUsuario.SE_HA_RETIRADO);
                this.terminarJuego = true;
                usuarioRetirado = true;
                this.historial.agregarUsuario(this.usuario);
                this.usuario = new Usuario();
                break;
            }
        }

        if (!usuarioRetirado && !seHaEquivocado){
            this.terminarJuego = true;
            System.out.println("El premio acumulado es: " + this.usuario.getPuntaje());
            this.usuario.setEstado(EstadoUsuario.HA_GANADO);
            this.historial.agregarUsuario(this.usuario);
            this.usuario = new Usuario();
        }

    }

    public void getHistorialUsuarios() {
        this.historial.mostrarUsuarios();
    }

    public Boolean getTerminarJuego() {
        return this.terminarJuego;
    }
}
