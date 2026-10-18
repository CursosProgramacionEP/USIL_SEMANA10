public class Vehiculo {
    protected String codigo;
    protected String marca;
    protected String modelo;
    protected double precioDia;

    public Vehiculo(String codigo, String marca, String modelo, double precioDia) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precioDia = precioDia;
    }

    public double calcularAlquiler(int dias) {
        return precioDia * dias;
    }

    public void mostrar(int dias) {
        System.out.println("Vehículo " + codigo + " - " + marca + " " + modelo
                + " | S/ " + precioDia + " por día | Alquiler: S/ " + calcularAlquiler(dias));
    }
}
