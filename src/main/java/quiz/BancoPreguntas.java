package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BancoPreguntas {

    public ArrayList<String> opcionesRespuesta = new ArrayList<String>(Arrays.asList("a", "b", "c", "d" ));
    public ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>(Arrays.asList(
            new Pregunta( 1, "Pregunta 1", opcionesRespuesta, "a"),
            new Pregunta( 2, "Pregunta 2", opcionesRespuesta, "b"),
            new Pregunta( 3, "Pregunta 3", opcionesRespuesta, "c"),
            new Pregunta( 4, "Pregunta 4", opcionesRespuesta, "d"),
            new Pregunta( 5, "Pregunta 5", opcionesRespuesta, "a")

    ));

    public Pregunta obtenerPregunta(Integer ronda){
        Pregunta preguntaElegida = preguntas.stream()
                .filter(pregunta -> pregunta.getRonda() == ronda)
                .collect(Collectors.toList())
                .get(0);

        return preguntaElegida;
    }
}
