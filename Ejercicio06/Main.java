import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        System.out.print("¿Cuántos vehículos va a registrar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("--- Vehículo " + i + " ---");
            System.out.print("Código: ");
            String codigo = sc.nextLine();
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();
            System.out.print("Precio de alquiler por día: ");
            double precioDia = sc.nextDouble();
            System.out.print("Tipo (1 = automóvil, 2 = motocicleta): ");
            int tipo = sc.nextInt();

            if (tipo == 1) {
                System.out.print("Cantidad de puertas: ");
                int puertas = sc.nextInt();
                vehiculos.add(new Automovil(codigo, marca, modelo, precioDia, puertas));
            } else {
                System.out.print("Cilindrada (cc): ");
                int cc = sc.nextInt();
                vehiculos.add(new Motocicleta(codigo, marca, modelo, precioDia, cc));
            }
            sc.nextLine();
        }

        System.out.print("¿Cuántos días de alquiler? ");
        int dias = sc.nextInt();

        double ingresoAutos = 0;
        double ingresoMotos = 0;
        double ingresoTotal = 0;

        for (Vehiculo v : vehiculos) {
            v.mostrar(dias);
            double alquiler = v.calcularAlquiler(dias);
            ingresoTotal = ingresoTotal + alquiler;
            // TODO 6: acumula en ingresoAutos o en ingresoMotos según el tipo real del objeto.
            //         Pista: if (v instanceof Automovil) { ... }
        }

        // TODO 7: compara ingresoAutos con ingresoMotos y muestra qué tipo genera mayor ingreso
        System.out.println("Ingreso total de la empresa: S/ " + ingresoTotal);

        sc.close();
    }
}
