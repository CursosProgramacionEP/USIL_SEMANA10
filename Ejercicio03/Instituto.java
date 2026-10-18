import java.util.ArrayList;

public class Instituto {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public Instituto(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {   // agregación: el Profesor llega ya creado
        profesores.add(p);
    }

    public void mostrar() {
        System.out.println("Instituto " + nombre + " (" + profesores.size() + " profesor(es))");
        for (Profesor p : profesores) {
            System.out.println("- " + p.getNombre() + ": " + p.getHorasTrabajadas()
                    + " h x S/ " + p.getTarifaHora() + " = S/ " + p.calcularSueldo());
        }
    }

    public double sueldoTotal() {
        // TODO 1: recorre la lista y devuelve la suma de los sueldos
        return 0;
    }

    public double sueldoPromedio() {
        // TODO 2: usa sueldoTotal() y profesores.size(). Cuidado si la lista está vacía.
        return 0;
    }
}
