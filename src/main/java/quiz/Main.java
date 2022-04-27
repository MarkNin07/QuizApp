package quiz;

import java.util.Scanner;

public class Main {
    static Presentador presentador = new Presentador();

    static Reglas reglas = new Reglas();
    static Integer opcionElegida = 1;

    public static void desplegarMenu(){
        do {
            opcionElegida = presentador.mostrarMenuPrincipal();

            switch (opcionElegida) {
                case 1:
                    presentador.iniciarJuego();
                    break;
                case 2:
                    reglas.mostrarReglas();
                    break;
                case 3:
                    System.out.println("Ver historial");
                    presentador.getHistorialUsuarios();
                    break;
                default:
                case 4:
                    System.exit(0);
                    break;
            }

        } while (!presentador.getTerminarJuego());
    }

    public static void main(String[] args) {
        while (true){

            presentador.mostrarMenuInicial();

            Scanner scanner = new Scanner(System.in);
            Integer primeraOpcion = scanner.nextInt();

            if(primeraOpcion == 1){
                presentador.solicitarDatos();
                desplegarMenu();
            }else if (primeraOpcion == 2) {
                presentador.getHistorialUsuarios();
            }else {
                break;
            }
        }

    }

}
