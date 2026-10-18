public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHoras(int codigo, String nombre, String dni, int horasTrabajadas, double tarifaHora) {
        // TODO 4: llama a super(...) y guarda horasTrabajadas y tarifaHora
        super(codigo, nombre, dni);
    }

    // TODO 5: sobrescribe calcularSueldo(): horasTrabajadas * tarifaHora

    // TODO 6: sobrescribe mostrar() llamando a super.mostrar() y mostrando horas, tarifa y sueldo
}
