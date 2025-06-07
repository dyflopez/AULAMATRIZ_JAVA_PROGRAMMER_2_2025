package borrar.enums;

public enum NivelDetails {
    BAJO(1, "Bajo", false),
    MEDIO(2, "Medio", false),
    ALTO(3, "Alto", true);

    private final int prioridad;
    private final String descripcion;
    private final boolean critico;

    NivelDetails(int prioridad, String descripcion, boolean critico) {
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.critico = critico;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean esCritico() {
        return critico;
    }
    public static NivelDetails fromDescripcion(String descripcionBuscada) {
        for (NivelDetails nivel : NivelDetails.values()) {
            if (nivel.getDescripcion().equalsIgnoreCase(descripcionBuscada)) {
                return nivel;
            }
        }
        throw new IllegalArgumentException("Descripción no válida: " + descripcionBuscada);
    }
}
