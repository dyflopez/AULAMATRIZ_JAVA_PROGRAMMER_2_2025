package borrar.enums;

public enum Nivel {
    BAJO(1,"Dificultad Facil",true),
    MEDIO(2,"Dificultad Media",true),
    ALTO(3,"Dificultad Dios",true);

    private final int prioridad;
    private final String descripcion;
    private final boolean jefeIsActive;

    Nivel(int prioridad, String descripcion, boolean jefeIsActive) {
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.jefeIsActive = jefeIsActive;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isJefeIsActive() {
        return jefeIsActive;
    }

    public static Nivel findLevel(String descripcion){
        for (Nivel n : Nivel.values()){
            if(n.descripcion.equalsIgnoreCase(descripcion)){
                return n;
            }
        }
        throw new IllegalArgumentException("NIVEL NO CORRECTO");
    }
}
