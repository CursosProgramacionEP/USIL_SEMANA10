public class Main {
    public static void main(String[] args) {
        // Nivel 3: los productos existen por sí solos
        Producto teclado = new Producto("Teclado", 90.0);
        Producto mouse = new Producto("Mouse", 45.5);
        Producto audifonos = new Producto("Audífonos", 120.0);

        // Nivel 2: los pedidos se crean afuera y reciben productos ya creados
        Pedido p1 = new Pedido("P-001");
        p1.agregarProducto(teclado);
        p1.agregarProducto(mouse);

        Pedido p2 = new Pedido("P-002");
        p2.agregarProducto(audifonos);
        p2.agregarProducto(mouse);      // el mismo producto en dos pedidos

        // Nivel 1: la tienda recibe pedidos ya creados
        Tienda t = new Tienda("TecnoUSIL");
        t.registrarPedido(p1);
        t.registrarPedido(p2);
        t.mostrar();
    }
}
