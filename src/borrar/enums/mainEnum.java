package borrar.enums;

public class mainEnum {
    public static void main(String[] args) {
        System.out.println(Nivel.BAJO.getPrioridad());
        System.out.println(Nivel.BAJO.name());
        System.out.println("****");

        String descripcion = "Medio";

        NivelDetails nivel = NivelDetails.fromDescripcion(descripcion);

        System.out.println("Descripción: " + nivel.getDescripcion());  // Medio
        System.out.println("Prioridad: " + nivel.getPrioridad());      // 2
        System.out.println("¿Es crítico?: " + nivel.esCritico());      // false
    }
}
