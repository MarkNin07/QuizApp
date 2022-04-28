package quiz;

public class Usuario {

    private String nombreUsuario;
    private Integer puntaje = 0;
    private EstadoUsuario estado;

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

    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }

    public EstadoUsuario getEstado() {
        return estado;
    }
}
