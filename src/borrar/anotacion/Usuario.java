package borrar.anotacion;

public class Usuario {
    @PorDefectoAtributos("anonimo")
    private String nombre;

    @PorDefectoAtributos("correo@demo.com")
    private String correo;

    @PorDefectoAtributos("18")
    private int edad;

    // Getters para verificar los valores
    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }
}
