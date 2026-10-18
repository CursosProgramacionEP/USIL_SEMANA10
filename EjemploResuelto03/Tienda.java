import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public void registrarPedido(Pedido p) {     // el Pedido también llega ya creado
        pedidos.add(p);
    }

    public double ventaTotal() {
        double suma = 0;
        for (Pedido p : pedidos) {
            suma = suma + p.total();
        }
        return suma;
    }

    public void mostrar() {
        System.out.println("Tienda " + nombre + ": " + pedidos.size() + " pedido(s)");
        for (Pedido p : pedidos) {
            p.mostrar();
        }
        System.out.println("Venta total: S/ " + ventaTotal());
    }
}
