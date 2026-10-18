public class Main {
    public static void main(String[] args) {
        // Los jugadores se crean AFUERA: existen por sí solos
        Jugador juan = new Jugador("Juan Ruiz", 25);
        Jugador maria = new Jugador("María Ayala", 28);

        Equipo equipoA = new Equipo("Equipo A");
        equipoA.agregarJugador(juan);
        equipoA.agregarJugador(maria);

        Equipo equipoB = new Equipo("Equipo B");
        equipoB.agregarJugador(juan);          // el mismo jugador en dos equipos

        equipoA.mostrar();
        equipoB.mostrar();

        equipoA = null;                        // se disuelve el Equipo A
        System.out.println("Se disuelve el Equipo A.");
        System.out.println("El jugador sigue existiendo: " + juan.getNombre());
    }
}
