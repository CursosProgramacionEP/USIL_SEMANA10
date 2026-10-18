public class EmpleadoContratado extends Empleado {
    private double sueldoMensual;

    public EmpleadoContratado(int codigo, String nombre, String dni, double sueldoMensual) {
        super(codigo, nombre, dni);      // super(...) llama al constructor de Empleado
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }

    @Override
    public void mostrar() {
        super.mostrar();                 // reutiliza lo que ya imprime Empleado
        System.out.println("  Contratado - Sueldo: S/ " + calcularSueldo());
    }
}
