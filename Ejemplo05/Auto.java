public class Auto extends Vehiculo {
    private int numeroPuertas;

    public Auto(String placa, String marca, String modelo, int numeroPuertas) {
        super(placa, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public void abrirMaletero() {
        System.out.println(placa + ": maletero abierto");
    }

    @Override
    public void mostrar() {
        System.out.println("Auto " + placa + " - " + marca + " " + modelo
                + " (" + numeroPuertas + " puertas)");
    }
}
