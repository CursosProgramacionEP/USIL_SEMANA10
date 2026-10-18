public class Computadora {
    private String marca;
    private Teclado teclado;
    private Monitor monitor;
    private CPU cpu;

    public Computadora(String marca) {
        this.marca = marca;
        this.teclado = new Teclado("USIL-K1");       // la Computadora crea sus partes
        this.monitor = new Monitor("LG", 24);
        this.cpu = new CPU("Intel", 3.2);
    }

    public void mostrar() {
        System.out.println("Computadora " + marca);
        System.out.println("- Teclado: " + teclado.getModelo());
        System.out.println("- Monitor: " + monitor.getMarca() + " de " + monitor.getPulgadas() + " pulgadas");
        System.out.println("- CPU: " + cpu.getFabricante() + " a " + cpu.getVelocidad() + " GHz");
    }
}
