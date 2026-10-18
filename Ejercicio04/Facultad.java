public class Facultad {
    private String nombre;
    private int cantidadAlumnos;
    private double pension;

    public Facultad(String nombre, int cantidadAlumnos, double pension) {
        this.nombre = nombre;
        this.cantidadAlumnos = cantidadAlumnos;
        this.pension = pension;
    }

    public double calcularIngreso() {
        return cantidadAlumnos * pension;
    }

    public String getNombre() { return nombre; }
    public int getCantidadAlumnos() { return cantidadAlumnos; }
    public double getPension() { return pension; }
}
