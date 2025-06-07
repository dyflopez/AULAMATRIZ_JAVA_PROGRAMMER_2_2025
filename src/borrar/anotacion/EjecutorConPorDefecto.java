package borrar.anotacion;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class EjecutorConPorDefecto {
    public static void ejecutar(Object instancia, String metodo, Object... args) throws Exception {
        Method[] metodos = instancia.getClass().getDeclaredMethods();

        for (Method m : metodos) {
            if (m.getName().equals(metodo) && m.getParameterCount() == args.length) {
                Parameter[] parametros = m.getParameters();

                for (int i = 0; i < parametros.length; i++) {
                    PorDefecto def = parametros[i].getAnnotation(PorDefecto.class);
                    if (def != null && args[i] == null) {
                        args[i] = def.value();
                    }
                }

                m.invoke(instancia, args);
                return;
            }
        }

        throw new NoSuchMethodException("Método no encontrado");
    }

    public static void aplicar(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();

        // Recorre todos los atributos declarados
        for (Field campo : clazz.getDeclaredFields()) {
            campo.setAccessible(true); // permite acceder a atributos privados

            PorDefectoAtributos anot = campo.getAnnotation(PorDefectoAtributos.class);

            // Si el campo tiene la anotación @PorDefecto
            if (anot != null) {
                Class<?> tipo = campo.getType();
                Object valorActual = campo.get(obj);

                // Para String: si es null, asignar valor por defecto
                if (tipo == String.class && valorActual == null) {
                    campo.set(obj, anot.value());
                }

                // Para int: si es 0, asignar valor por defecto (convertido a int)
                else if (tipo == int.class && (int) valorActual == 0) {
                    campo.set(obj, Integer.parseInt(anot.value()));
                }

                // Extensión: agregar boolean, double, etc.
            }
        }
    }
}
