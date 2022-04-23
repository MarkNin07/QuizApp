package quiz;

import java.util.ArrayList;

public class Pregunta {

    private Integer ronda;
    private String enunciado;
    private ArrayList <String> opcionesRespuesta;
    private String respuestaCorrecta;

    public Pregunta(Integer ronda, String enunciado, ArrayList<String> opcionesRespuesta, String respuestaCorrecta){
        this.ronda = ronda;
        this.enunciado = enunciado;
        this.opcionesRespuesta = opcionesRespuesta;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public Integer getRonda(){
        return ronda;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public ArrayList<String> getOpcionesRespuesta() {
        return opcionesRespuesta;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void imprimirOpcionesRespuesta(){
        for (String opcionesRespuesta: opcionesRespuesta) {
            System.out.println(opcionesRespuesta);
            
        }
    }
}
