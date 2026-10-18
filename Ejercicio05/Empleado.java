public class Empleado {
    protected int codigo;
    protected String nombre;
    protected String dni;

    public Empleado(int codigo, String nombre, String dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
    }

    public double calcularSueldo() {
        return 0;
    }

    public void mostrar() {
        System.out.println("Código: " + codigo + " | Nombre: " + nombre + " | DNI: " + dni);
    }
}
