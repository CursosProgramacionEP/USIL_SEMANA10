public class EmpleadoContratado extends Empleado {
    private double sueldoMensual;

    public EmpleadoContratado(int codigo, String nombre, String dni, double sueldoMensual) {
        // TODO 1: llama a super(...) con codigo, nombre y dni, y luego guarda sueldoMensual
        super(codigo, nombre, dni);
    }

    // TODO 2: sobrescribe calcularSueldo() con @Override. Debe devolver el sueldo mensual.

    // TODO 3: sobrescribe mostrar() con @Override. Llama primero a super.mostrar()
    //         y luego imprime "  Contratado - Sueldo: S/ ..."
}
