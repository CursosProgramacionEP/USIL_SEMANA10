import java.util.ArrayList;

public class Departamento {
    private String nombre;
    // TODO 1: declara el atributo doctores (ArrayList de Doctor) y créalo vacío

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDoctor(Doctor d) {
        // TODO 2: agrega a la lista el Doctor que llega por parámetro (NO uses new Doctor aquí)
    }

    public void mostrar() {
        System.out.println("  Departamento de " + nombre + ":");
        // TODO 3: recorre la lista y muestra "    - nombre (especialidad)"
    }
}
