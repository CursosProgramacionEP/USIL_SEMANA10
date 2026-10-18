import java.util.ArrayList;

public class Hospital {
    private String nombre;
    // TODO 4: declara el atributo departamentos (ArrayList de Departamento) y créalo vacío

    public Hospital(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDepartamento(Departamento d) {
        // TODO 5: agrega el Departamento recibido a la lista
    }

    public void mostrar() {
        System.out.println("Hospital " + nombre);
        // TODO 6: recorre los departamentos y llama al mostrar() de cada uno
    }
}
