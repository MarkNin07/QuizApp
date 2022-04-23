package quiz;

import java.util.Scanner;

public class Presentador {
    Menu menu = new MenuConcurso();
    Scanner obtenerInput = new Scanner(System.in);
    private final Integer cantidadRondas = 5;
    private final Integer premioPorRonda = 500;
    private Integer premioAcumulado;

    private String solicitarDato(String mensaje){
        System.out.println(mensaje);
        return obtenerInput.nextLine();
    }

    public void iniciarAplicacion(){
        menu.mostrarMenuBienvenida();
    }

    public String solicitarDatos() {
        String nombreUsuario = solicitarDato("Ingrese su nombre de usuario: ");
        return nombreUsuario;
    }

    public Integer mostrarMenuPrincipal(){
        menu.mostrarMenuPrincipal();
        String opcionElegida = solicitarDato("Ingrese la opcion del menu a elegir: ");
        return Integer.parseInt(opcionElegida);
    }

    private boolean validarRespuestaPregunta(Pregunta pregunta, String respuesta){
        return pregunta.getRespuestaCorrecta().equalsIgnoreCase(respuesta);
    }

    private boolean validarRespuestaRetiro(Integer respuesta){
        return respuesta == 1;
    }

    public void iniciarJuego(Usuario usuario){
        BancoPreguntas bancoPreguntas = new BancoPreguntas();
        Pregunta preguntaElegida;

        for(int ronda=1; ronda <= cantidadRondas; ronda++){
            preguntaElegida = bancoPreguntas.obtenerPregunta(ronda);
            menu.mostrarMenuPregunta(preguntaElegida);

            String respuestaUsuario = solicitarDato("Ingrese su respuesta: ");
            boolean respuestaCorrecta = validarRespuestaPregunta(preguntaElegida, respuestaUsuario);

            if(!respuestaCorrecta){
                premioAcumulado = 0;
                break;
            }

            menu.menuDecidirContinuar();
            Integer respuestaRetiro = Integer.parseInt(solicitarDato("Ingrese su respuesta: "));
            boolean deseaContinuar = validarRespuestaRetiro(respuestaRetiro);

            if(!deseaContinuar){
                break;
            }

            premioAcumulado += premioPorRonda;

        }
    }
}
