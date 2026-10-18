import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Facultad> facultades = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public Facultad agregarFacultad(String nombreFacultad) {
        // TODO 2: haz aquí el new Facultad(...), agrégala a la lista y devuélvela
        return null;
    }

    public void mostrar() {
        System.out.println("Universidad " + nombre);
        // TODO 3: recorre las facultades y llama al mostrar() de cada una
    }
}
