package anotaciones.ejemplo1;

public class MainExampleAnnotation {
    public static void main(String[] args) {
        Persona persona = new Persona();
        MyAnnotation ma = persona.getClass().getAnnotation(MyAnnotation.class);
        if(ma != null){
            System.out.println("Descripcion " +  ma.description());
            System.out.println("prioridad " +  ma.prioridad());
        }
    }
}
