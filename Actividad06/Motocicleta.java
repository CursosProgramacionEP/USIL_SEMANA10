public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String codigo, String marca, String modelo, double precioDia, int cilindrada) {
        // TODO 3: super(...) y guarda la cilindrada
        super(codigo, marca, modelo, precioDia);
    }

    // TODO 4: sobrescribe calcularAlquiler(int dias): el costo base MÁS un recargo del 10 %.
    //         Pista: puedes reutilizar super.calcularAlquiler(dias).

    // TODO 5: sobrescribe mostrar(int dias) para añadir la cilindrada en cc.
}
