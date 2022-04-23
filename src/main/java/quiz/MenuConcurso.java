package quiz;

public class MenuConcurso implements Menu {
    @Override
    public void mostrarMenuBienvenida() {
        System.out.println("Bienvenido al concurso");
    }

    @Override
    public void mostrarMenuPrincipal() {
        System.out.println("Las opciones del juego son: ");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Mostrar reglas del juego");
        System.out.println("3. Mostrar historial del juego");
        System.out.println("4. Salir del programa");
    }

    @Override
    public void mostrarMenuPregunta(Pregunta pregunta) {
        System.out.println("La pregunta es: ");
        System.out.println(pregunta.getEnunciado());
        pregunta.imprimirOpcionesRespuesta();
    }

    @Override
    public void menuDecidirContinuar() {
        System.out.println("¿Desea continuar? ");
        System.out.println("1. Si");
        System.out.println("2. No");

    }

    @Override
    public void mostrarPantallaTerminarJuego() {

    }
}
