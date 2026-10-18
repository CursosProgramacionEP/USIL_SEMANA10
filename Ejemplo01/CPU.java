public class CPU {
    private String fabricante;
    private double velocidad;

    public CPU(String fabricante, double velocidad) {
        this.fabricante = fabricante;
        this.velocidad = velocidad;
    }

    public String getFabricante() { return fabricante; }
    public double getVelocidad() { return velocidad; }
}
