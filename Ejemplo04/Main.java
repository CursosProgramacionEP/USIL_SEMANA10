public class Main {
    public static void main(String[] args) {
        EmpleadoContratado ana = new EmpleadoContratado(1001, "Ana Soto", "45871236", 4500);
        EmpleadoPorHoras luis = new EmpleadoPorHoras(1002, "Luis Mena", "70125489", 80, 25.0);

        ana.mostrar();
        luis.mostrar();

        double gasto = ana.calcularSueldo() + luis.calcularSueldo();
        System.out.println("Gasto total en sueldos: S/ " + gasto);
    }
}
