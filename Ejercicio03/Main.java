import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del instituto: ");
        String nombreInstituto = sc.nextLine();
        Instituto instituto = new Instituto(nombreInstituto);

        System.out.print("¿Cuántos profesores va a registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("--- Profesor " + i + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Horas trabajadas: ");
            int horas = sc.nextInt();
            System.out.print("Tarifa por hora: ");
            double tarifa = sc.nextDouble();
            sc.nextLine();

            // TODO 3: crea el Profesor con esos datos y agrégalo al instituto
        }

        instituto.mostrar();
        System.out.println("Sueldo promedio: S/ " + instituto.sueldoPromedio());
        System.out.println("Gasto total en sueldos: S/ " + instituto.sueldoTotal());

        sc.close();
    }
}
