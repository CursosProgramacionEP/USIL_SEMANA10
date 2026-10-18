public class Main {
    public static void main(String[] args) {
        // Aquí no se crea ningún Teclado, Monitor ni CPU: lo hace la Computadora
        Computadora c = new Computadora("Lenovo");
        c.mostrar();

        c = null;   // si la Computadora desaparece, sus partes también
    }
}
