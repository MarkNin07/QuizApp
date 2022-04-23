package quiz;

public class Main {

    public static void main(String[] args) {
        Presentador presentador = new Presentador();
        Usuario usuario;

        presentador.iniciarAplicacion();
        String nombreUsuario = presentador.solicitarDatos();
        usuario = new Usuario(nombreUsuario);

        Integer opcionElegida = presentador.mostrarMenuPrincipal();

        switch (opcionElegida){
            case 1:
                presentador.iniciarJuego(usuario);
                break;
            case 2:
                System.out.println("Ver historial");
                break;
            case 3:
                System.out.println("Ver reglas del juego");
                break;
            default:
            case 4:
                System.exit(0);
                break;
        }
    }

}
