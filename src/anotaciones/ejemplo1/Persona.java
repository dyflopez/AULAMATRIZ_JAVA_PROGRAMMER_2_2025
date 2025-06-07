package anotaciones.ejemplo1;

@MyAnnotation(description = "clase con prioridad baja" ,prioridad = 2)
public class Persona {
    public void save(){
        System.out.println("Se guardo la persona");
    }
}
