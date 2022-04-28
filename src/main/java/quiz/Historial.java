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
          System.out.println("-----------------------------");
          System.out.println("Historial:");
          for (Usuario usuario : listaDeJugadores) {
              System.out.println(usuario.getNombreUsuario() + " " + usuario.getPuntaje() + " " + usuario.getEstado());
          }
          System.out.println("-----------------------------");
      }




}
