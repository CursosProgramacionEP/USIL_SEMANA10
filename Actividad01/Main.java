public class Main {
    public static void main(String[] args) {
        // Los doctores se crean AFUERA: existen sin hospital ni departamento
        Doctor rosa = new Doctor("Rosa Vega", "Cardiología");
        Doctor hugo = new Doctor("Hugo Díaz", "Pediatría");

        Departamento cardio = new Departamento("Cardiología");
        cardio.agregarDoctor(rosa);

        Departamento emergencia = new Departamento("Emergencia");
        emergencia.agregarDoctor(rosa);     // la misma doctora en dos departamentos
        emergencia.agregarDoctor(hugo);

        Hospital h = new Hospital("Clínica San Ignacio");
        h.agregarDepartamento(cardio);
        h.agregarDepartamento(emergencia);
        h.mostrar();

        h = null;   // desaparece el hospital
        System.out.println("Cierra el hospital, pero " + rosa.getNombre() + " sigue existiendo.");
    }
}
