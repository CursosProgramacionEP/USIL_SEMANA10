public class Main {
    public static void main(String[] args) {
        // Polimorfismo: los tres son Vehiculo, pero cada uno muestra lo suyo
        Vehiculo[] flota = {
            new Vehiculo("A1B-100", "Genérico", "Base"),
            new Auto("X2Y-200", "Toyota", "Yaris", 4),
            new Camioneta("Z3W-300", "Hyundai", "Santa Fe", true)
        };

        for (Vehiculo v : flota) {
            v.mostrar();        // Java elige el mostrar() de la clase real
            v.arrancar();       // este se hereda de Vehiculo
        }
    }
}
