package quiz;

public class MenuConcurso implements Menu {
    @Override
    public void mostrarMenuBienvenida() {
        System.out.println("Bienvenido al concurso");
    }

    @Override
    public void mostrarMenuPrincipal() {
        System.out.println("\n-------------------------");
        System.out.println("Quiz App");
        System.out.println("---------------------------");
        System.out.println("Las opciones del juego son: ");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Mostrar reglas del juego");
        System.out.println("3. Salir del programa\n");

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
    public void menuInicial(){

        System.out.println("\n-----------------");
        System.out.println("Bienvenido!");
        System.out.println("-----------------");
        System.out.println("1. Ingresar usuario");
        System.out.println("2. Ver puntaje historial");
        System.out.println("3. Salir");
        System.out.println("\nIngrese una de las opciones anteriores: ");
    }

    /*@Override
    public void mostrarPantallaTerminarJuego() {

    }  */
}
