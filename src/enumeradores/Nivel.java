package enumeradores;

public enum Nivel {
    BAJO(1),
    MEDIO(2),
    ALTO(3);

    private final int proridad;

    Nivel(int proridad) {
        this.proridad = proridad;
    }

    public int getProridad() {
        return proridad;
    }
}
