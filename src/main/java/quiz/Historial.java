package quiz;

import java.util.ArrayList;

public class Historial {

      private ArrayList<Usuario> listaDeJugadores;

      public Historial() {
          this.listaDeJugadores = new ArrayList<>();
      }

      public void agregarUsuario(Usuario usuario) {
          if (usuario.getNombreUsuario() != null) {
              this.listaDeJugadores.add(usuario);
          }
      }

      public void mostrarUsuarios() {
          for (Usuario jugador : listaDeJugadores) {
              System.out.println(jugador.getNombreUsuario() + " " + jugador.getPuntaje());
          }
      }




}