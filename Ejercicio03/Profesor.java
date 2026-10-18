public class Profesor {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    public Profesor(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSueldo() {
        return horasTrabajadas * tarifaHora;
    }

    public String getNombre() { return nombre; }
    public int getHorasTrabajadas() { return horasTrabajadas; }
    public double getTarifaHora() { return tarifaHora; }
}
