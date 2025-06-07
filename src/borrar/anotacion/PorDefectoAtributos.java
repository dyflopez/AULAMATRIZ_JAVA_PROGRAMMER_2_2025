package borrar.anotacion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // disponible en runtime
@Target(ElementType.FIELD)          // se puede aplicar a atributos
public @interface  PorDefectoAtributos {
    String value(); // valor por defecto a usar
}
