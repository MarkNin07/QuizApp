package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class BancoPreguntas {

    static Random randomNumber = new Random();
    Integer randomInt = randomNumber.nextInt(5 - 0) + 0;

    public String[][] opcionesRespuesta = {
            {"a. Km","b. Klm", "c. Ktm", "d. Kmt"},
            {"a. un Hada","b. un Genio", "c. un Mago", "d. un Gatito"},
            {"a. Manzana","b. Pocima", "c. Bebida embrujada", "d. Galleta"},
            {"a. 25","b. 30", "c. 0", "d. 20"},
            {"a. Resultado","b. Problema", "c. Producto", "d. Total"},
            {"a. Tortuga","b. Cucharacha", "c. Hormiga", "d. Delfin"},
            {"a. Jupiter","b. Mercurio", "c. Pluton", "d. Tierra"},
            {"a. Mercurio","b. Tierra", "c. Venus", "d. Pluton"},
            {"a. Perro","b. Canguro", "c. Ballena", "d. Avestruz"},
            {"a. 100 unidades","b. 1 unidades", "c. 10 unidades", "d. 12 unidades"},
            {"a. S.O.S","b. 911", "c. A.U.X", "d. HELP"},
            {"a. el corazon","b. una costilla", "c. un ojo", "d. una Pierna"},
            {"a. Betty","b. Rocath", "c. Pebble", "d. Sam"},
            {"a. Hr","b. Hi", "c. He", "d. Fe"},
            {"a. Topacio","b. Zafiro", "c. Rubi", "d. esmeralda"},
            {"a. Geofago","b. Terricola", "c. Terrestre", "d. Antropologo"},
            {"a. LXXIX","b. XXXXXXXIX", "c. XXIC", "d. XIIIX"},
            {"a. Nada","b. Dios", "c. Lo extraterrestres", "d. Los medicos"},
            {"a. agua","b. Levadura", "c. Amor", "d. Harina"},
            {"100 Segundos","b. 65 Segundos", "c. 90 Segundos", "d. 120 Segundos"},
            {"a. 20 Segundos","b. 5 Segundos", "c. 60 Segundos", "d. 30 segundos"},
            {"a. Medidor","b. Modem", "c. Transformador de corriente", "d. Transformador de potencial."},
            {"a. 2","b. 3", "c. 1", "d. 0"},
            {"a. java","b. SQL", "c. Python", "d. Javascript"},
            {"a. Remote","b. upload", "c. Commit", "d. Push"},
    };
    public ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>(Arrays.asList(
            new Pregunta( 1, "¿Cual es la abreviatura de kilometro?", opcionesRespuesta[randomInt], "a"),
            new Pregunta( 1, "¿Quien salio de la lampara de Aladino?", opcionesRespuesta[randomInt], "b"),
            new Pregunta( 1, "¿Blancanieves cae en un hechizo de la bruja por comer una?", opcionesRespuesta[randomInt], "a"),
            new Pregunta( 1, "¿Cuanto es 5+10*2-5?", opcionesRespuesta[randomInt], "d"),
            new Pregunta( 1, "¿'el orden de los factores no altera el…'?", opcionesRespuesta[randomInt], "c"),
            new Pregunta( 2, "¿Cual de los siguientes animales vive por mas anios?", opcionesRespuesta[randomInt+5], "a"),
            new Pregunta( 2, "¿Cual de estos planetas es el mas grande?", opcionesRespuesta[randomInt+5], "a"),
            new Pregunta( 2, "¿Cual es el planeta mas cercano al Sol?", opcionesRespuesta[randomInt+5], "a"),
            new Pregunta( 2, "Cual de los siguientes animales no es un mamifero?", opcionesRespuesta[randomInt+5], "d"),
            new Pregunta( 2, "¿una Docena es un conjunto de cuantas unidades?", opcionesRespuesta[randomInt+5], "d"),
            new Pregunta( 3, "¿Cual es la senal telegrafica para pedir auxilio?", opcionesRespuesta[randomInt+10], "a"),
            new Pregunta( 3, "¿De que parte de Adan creo Dios a la mujer?", opcionesRespuesta[randomInt+10], "b"),
            new Pregunta( 3, "¿Cual es el nombre de la hija de Pedro Picapiedra en la serie animada?", opcionesRespuesta[randomInt+10], "c"),
            new Pregunta( 3, "¿Cual es el simbolo quimico del hierro?", opcionesRespuesta[randomInt+10], "d"),
            new Pregunta( 3, "¿Cual de estas piedras es de color verde?", opcionesRespuesta[randomInt+10], "d"),
            new Pregunta( 4, "¿Como se llama el habito de comer tierra?", opcionesRespuesta[randomInt+15], "a"), //
            new Pregunta( 4, "¿Como se escribe el 79 en numeros romanos?", opcionesRespuesta[randomInt+15], "a"),
            new Pregunta( 4, "¿un ateo es aquel que no cree en...?", opcionesRespuesta[randomInt+15], "b"),
            new Pregunta( 4, "¿Para que el pan se fermente o crezca debe llevar?", opcionesRespuesta[randomInt+15], "b"),
            new Pregunta( 4, "¿Cuantos segundos tiene un minuto y medio?", opcionesRespuesta[randomInt+15], "c"),
            new Pregunta( 5, "¿Cual es el maximo desfase de reloj permitido para un punto de medicion tipo 3 segun la creg038?", opcionesRespuesta[randomInt+20], "c"),
            new Pregunta( 5, "¿Cual de estos no pertenece al sistema de medicion segun la creg038?", opcionesRespuesta[randomInt+20], "d"),
            new Pregunta( 5, "¿Cuantas fallas son permitidas antes de ser cancelada una frontera comercial segun la creg 038?", opcionesRespuesta[randomInt+20], "b"),
            new Pregunta( 5, "NodeJs es un framework para…", opcionesRespuesta[randomInt+20], "d"),
            new Pregunta( 5, "un comando que se usa para subir cambios a un repositorio de git de manera remoto es", opcionesRespuesta[randomInt+20], "d")

    ));

    public Pregunta obtenerPregunta(Integer ronda){

        Pregunta preguntaElegida = preguntas.stream()
                .filter(pregunta -> pregunta.getRonda() == ronda)
                .collect(Collectors.toList())
                .get(randomInt);

        return preguntaElegida;
    }
}
