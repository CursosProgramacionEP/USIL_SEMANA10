public class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar() {
        System.out.println(placa + ": motor encendido");
    }

    public void mostrar() {
        System.out.println("Vehículo " + placa + " - " + marca + " " + modelo);
    }
}
