public class Automovil extends Vehiculo {
    private int cantidadPuertas;

    public Automovil(String codigo, String marca, String modelo, double precioDia, int cantidadPuertas) {
        // TODO 1: super(...) con los cuatro datos del vehículo y guarda cantidadPuertas
        super(codigo, marca, modelo, precioDia);
    }

    // TODO 2: sobrescribe mostrar(int dias): llama a super.mostrar(dias) y añade las puertas.
    //         El cálculo del alquiler NO cambia, así que calcularAlquiler() no se sobrescribe.
}
