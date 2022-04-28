package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class BancoPreguntas {

    static Random randomNumber = new Random();
    Integer randomInt = randomNumber.nextInt(5 - 0) + 0;

    //public ArrayList<String> opcionesRespuesta = new ArrayList<String>(Arrays.asList("a", "b", "c", "d" ));
    public String[][] opcionesRespuesta = {
            {"a. asd","b. bsd", "c. Km", "d. dsd"},
            {"a. 2asd","b. 2bsd", "c. 2csd", "d. 2dsd"},
            {"a. 3asd","b. 3bsd", "c. 3csd", "d. 3dsd"},
            {"a. 4asd","b. 4bsd", "c. 4csd", "d. 4dsd"},
            {"a. 5asd","b. 5bsd", "c. 5csd", "d. 5dsd"},
            {"a. 6asd","b. 6bsd", "c. 6csd", "d. 6dsd"},
            {"a. 7asd","b. 7bsd", "c. 7csd", "d. 7dsd"},
            {"a. 8asd","b. 8bsd", "c. 8csd", "d. 8dsd"},
            {"a. 9asd","b. 9bsd", "c. 9csd", "d. 9dsd"},
            {"a. 10asd","b. 10bsd", "c. 10csd", "d. 10dsd"},
            {"a. 11asd","b. 11bsd", "c. 11csd", "d. 11dsd"},
            {"a. 12asd","b. 12bsd", "c. 12csd", "d. 12dsd"},
            {"a. 13asd","b. 13bsd", "c. 13csd", "d. 13dsd"},
            {"a. 14asd","b. 14bsd", "c. 14csd", "d. 14dsd"},
            {"a. 15asd","b. 15bsd", "c. 15csd", "d. 15dsd"},
            {"a. 16asd","b. 16bsd", "c. 16csd", "d. 16dsd"},
            {"a. 17asd","b. 17bsd", "c. 17csd", "d. 17dsd"},
            {"a. 18asd","b. 18bsd", "c. 18csd", "d. 18dsd"},
            {"a. 19asd","b. 19bsd", "c. 19csd", "d. 19dsd"},
            {"a. 20asd","b. 20bsd", "c. 20csd", "d. 20dsd"},
            {"a. 21asd","b. 21bsd", "c. 21csd", "d. 21dsd"},
            {"a. 22asd","b. 22bsd", "c. 22csd", "d. 22dsd"},
            {"a. 23asd","b. 23bsd", "c. 23csd", "d. 23dsd"},
            {"a. 24asd","b. 24bsd", "c. 24csd", "d. 24dsd"},
            {"a. 25asd","b. 25bsd", "c. 25csd", "d. 25dsd"},
    };
    public ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>(Arrays.asList(
            new Pregunta( 1, "Pregunta 1.1", opcionesRespuesta[randomInt], "c"),
            new Pregunta( 1, "Pregunta 1.2", opcionesRespuesta[randomInt], "a"),
            new Pregunta( 1, "Pregunta 1.3", opcionesRespuesta[randomInt], "a"),
            new Pregunta( 1, "Pregunta 1.4...", opcionesRespuesta[randomInt], "a"),
            new Pregunta( 1, "Pregunta 1.5...", opcionesRespuesta[randomInt], "a"),
            new Pregunta( 2, "Pregunta 2.1", opcionesRespuesta[randomInt+5], "b"),
            new Pregunta( 2, "Pregunta 2.2", opcionesRespuesta[randomInt+5], "b"),
            new Pregunta( 2, "Pregunta 2.3", opcionesRespuesta[randomInt+5], "b"),
            new Pregunta( 2, "Pregunta 2.4", opcionesRespuesta[randomInt+5], "b"),
            new Pregunta( 2, "Pregunta 2.5", opcionesRespuesta[randomInt+5], "b"),
            new Pregunta( 3, "Pregunta 3.1", opcionesRespuesta[randomInt+10], "c"),
            new Pregunta( 3, "Pregunta 3.2", opcionesRespuesta[randomInt+10], "c"),
            new Pregunta( 3, "Pregunta 3.3", opcionesRespuesta[randomInt+10], "c"),
            new Pregunta( 3, "Pregunta 3.4", opcionesRespuesta[randomInt+10], "c"),
            new Pregunta( 3, "Pregunta 3.5", opcionesRespuesta[randomInt+10], "c"),
            new Pregunta( 4, "Pregunta 4.1", opcionesRespuesta[randomInt+15], "d"),
            new Pregunta( 4, "Pregunta 4.2", opcionesRespuesta[randomInt+15], "d"),
            new Pregunta( 4, "Pregunta 4.3", opcionesRespuesta[randomInt+15], "d"),
            new Pregunta( 4, "Pregunta 4.4", opcionesRespuesta[randomInt+15], "d"),
            new Pregunta( 4, "Pregunta 4.5", opcionesRespuesta[randomInt+15], "d"),
            new Pregunta( 5, "Pregunta 5.1", opcionesRespuesta[randomInt+20], "a"),
            new Pregunta( 5, "Pregunta 5.2", opcionesRespuesta[randomInt+20], "a"),
            new Pregunta( 5, "Pregunta 5.3", opcionesRespuesta[randomInt+20], "a"),
            new Pregunta( 5, "Pregunta 5.4", opcionesRespuesta[randomInt+20], "a"),
            new Pregunta( 5, "Pregunta 5.5", opcionesRespuesta[randomInt+20], "a")

    ));

    // tODO: Aqui la idea es tener una pregunta al azar
    public Pregunta obtenerPregunta(Integer ronda){

        Pregunta preguntaElegida = preguntas.stream()
                .filter(pregunta -> pregunta.getRonda() == ronda)
                .collect(Collectors.toList())
                .get(randomInt);

        return preguntaElegida;
    }
}
