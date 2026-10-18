import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();   // una sola lista para los dos tipos

        System.out.print("¿Cuántos empleados va a registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("--- Empleado " + i + " ---");
            System.out.print("Código: ");
            int codigo = sc.nextInt();
            sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("DNI: ");
            String dni = sc.nextLine();
            System.out.print("Tipo (1 = contratado, 2 = por horas): ");
            int tipo = sc.nextInt();

            if (tipo == 1) {
                System.out.print("Sueldo mensual: ");
                double sueldo = sc.nextDouble();
                empleados.add(new EmpleadoContratado(codigo, nombre, dni, sueldo));
            } else {
                System.out.print("Horas trabajadas: ");
                int horas = sc.nextInt();
                System.out.print("Tarifa por hora: ");
                double tarifa = sc.nextDouble();
                empleados.add(new EmpleadoPorHoras(codigo, nombre, dni, horas, tarifa));
            }
            sc.nextLine();
        }

        double gastoTotal = 0;
        for (Empleado e : empleados) {
            e.mostrar();                       // polimorfismo: cada uno muestra lo suyo
            gastoTotal = gastoTotal + e.calcularSueldo();
        }
        System.out.println("Gasto total mensual en sueldos: S/ " + gastoTotal);

        sc.close();
    }
}
