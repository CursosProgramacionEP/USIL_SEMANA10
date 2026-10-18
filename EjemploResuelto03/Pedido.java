import java.util.ArrayList;

public class Pedido {
    private String codigo;
    private ArrayList<Producto> productos = new ArrayList<>();

    public Pedido(String codigo) {
        this.codigo = codigo;
    }

    public void agregarProducto(Producto p) {   // el Producto llega ya creado
        productos.add(p);
    }

    public double total() {
        double suma = 0;
        for (Producto p : productos) {
            suma = suma + p.getPrecio();
        }
        return suma;
    }

    public void mostrar() {
        System.out.println("  Pedido " + codigo + " (" + productos.size() + " producto(s))");
        for (Producto p : productos) {
            System.out.println("    - " + p.getNombre() + ": S/ " + p.getPrecio());
        }
        System.out.println("    Total del pedido: S/ " + total());
    }
}
