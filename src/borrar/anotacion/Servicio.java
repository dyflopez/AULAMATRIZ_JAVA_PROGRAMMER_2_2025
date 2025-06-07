package borrar.anotacion;

public class Servicio {
    public void guardar(@PorDefecto("admin") String usuario) {
        System.out.println("Usuario: " + usuario);
    }
}
