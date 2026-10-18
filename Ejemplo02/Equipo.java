import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJugador(Jugador j) {   // el Jugador llega ya creado
        jugadores.add(j);
    }

    public void mostrar() {
        System.out.println("Equipo " + nombre + ": " + jugadores.size() + " jugador(es)");
        for (Jugador j : jugadores) {
            System.out.println("- " + j.getNombre() + " (" + j.getEdad() + " años)");
        }
    }
}
