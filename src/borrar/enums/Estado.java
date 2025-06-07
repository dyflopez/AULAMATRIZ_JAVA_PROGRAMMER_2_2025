package borrar.enums;

public enum Estado {
    ACTIVO("Disponible"),
    INACTIVO("No disponible");

    private final String descripcion;

    Estado(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}