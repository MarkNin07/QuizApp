package quiz;

public class Usuario {
    //private final String nombreUsuario;
    private String nombreUsuario;
    private Integer puntaje = 0;

    /*public Usuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }*/

    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }

    public Integer getPuntaje() {
        return this.puntaje;
    }
}
