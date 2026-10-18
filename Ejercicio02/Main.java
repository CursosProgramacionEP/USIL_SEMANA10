public class Main {
    public static void main(String[] args) {
        // Fíjate: el único new de este Main es el de Universidad
        Universidad u = new Universidad("USIL");

        Facultad fiia = u.agregarFacultad("Ingeniería e Inteligencia Artificial");
        fiia.agregarDepartamento("Sistemas de Información");
        fiia.agregarDepartamento("Ingeniería de Software");

        Facultad negocios = u.agregarFacultad("Ciencias Empresariales");
        negocios.agregarDepartamento("Administración");

        u.mostrar();

        u = null;   // al desaparecer la universidad desaparecen facultades y departamentos
        System.out.println("Cierra la universidad: sus facultades y departamentos dejan de existir.");
    }
}
