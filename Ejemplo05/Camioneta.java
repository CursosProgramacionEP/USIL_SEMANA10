public class Camioneta extends Vehiculo {
    private boolean tieneTolva;

    public Camioneta(String placa, String marca, String modelo, boolean tieneTolva) {
        super(placa, marca, modelo);
        this.tieneTolva = tieneTolva;
    }

    @Override
    public void mostrar() {
        String tolva = tieneTolva ? "con tolva" : "sin tolva";
        System.out.println("Camioneta " + placa + " - " + marca + " " + modelo + " (" + tolva + ")");
    }
}
