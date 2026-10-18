import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la universidad: ");
        String nombreUniversidad = sc.nextLine();
        Universidad universidad = new Universidad(nombreUniversidad);

        System.out.print("¿Cuántas facultades va a registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("--- Facultad " + i + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Cantidad de alumnos: ");
            int alumnos = sc.nextInt();
            System.out.print("Pensión: ");
            double pension = sc.nextDouble();
            sc.nextLine();

            // En composición el new NO va aquí: se lo pasamos a la universidad
            universidad.agregarFacultad(nombre, alumnos, pension);
        }

        universidad.mostrar();
        System.out.println("Facultad con mayor ingreso: " + universidad.facultadMayorIngreso());
        System.out.println("Total de alumnos: " + universidad.totalAlumnos());

        sc.close();
    }
}
