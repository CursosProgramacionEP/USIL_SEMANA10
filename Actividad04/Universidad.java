import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Facultad> facultades = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarFacultad(String nombreFacultad, int cantidadAlumnos, double pension) {
        // TODO 1: composición. Recibe los DATOS y haz aquí el new Facultad(...) antes de agregarla.
    }

    public void mostrar() {
        System.out.println("Universidad " + nombre + " (" + facultades.size() + " facultad(es))");
        for (Facultad f : facultades) {
            System.out.println("- " + f.getNombre() + ": " + f.getCantidadAlumnos()
                    + " alumnos x S/ " + f.getPension() + " = S/ " + f.calcularIngreso());
        }
    }

    public String facultadMayorIngreso() {
        // TODO 2: recorre la lista y devuelve el nombre de la facultad con mayor calcularIngreso()
        return "";
    }

    public int totalAlumnos() {
        // TODO 3: suma la cantidad de alumnos de todas las facultades
        return 0;
    }
}
