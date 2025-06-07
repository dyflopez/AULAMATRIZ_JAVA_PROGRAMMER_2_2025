package borrar.anotacion;

public class MainAnotation {



    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario();
        // Antes de aplicar @PorDefecto
        System.out.println("ANTES:");
        System.out.println("Nombre: " + u.getNombre());
        System.out.println("Correo: " + u.getCorreo());
        System.out.println("Edad: " + u.getEdad());

        EjecutorConPorDefecto.aplicar(u);

        // Después
        System.out.println("\nDESPUÉS:");
        System.out.println("Nombre: " + u.getNombre());
        System.out.println("Correo: " + u.getCorreo());
        System.out.println("Edad: " + u.getEdad());
    }
}
