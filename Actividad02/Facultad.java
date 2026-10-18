import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private ArrayList<Departamento> departamentos = new ArrayList<>();

    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDepartamento(String nombreDepartamento) {
        // TODO 1: recibe solo el NOMBRE y haz aquí el new Departamento(...) antes de agregarlo
    }

    public void mostrar() {
        System.out.println("  Facultad de " + nombre + " (" + departamentos.size() + " departamento(s))");
        for (Departamento d : departamentos) {
            System.out.println("    - " + d.getNombre());
        }
    }
}
