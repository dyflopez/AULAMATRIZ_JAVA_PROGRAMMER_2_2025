package anotaciones.ejemplo2;

import anotaciones.ejemplo3.AtributeDefault;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.nio.file.Files;

public class Uils {

    public static  void ejecutarEnvio(Object intancia, String metodo, Object... args) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Method[] metodos = intancia.getClass().getMethods();
        for(Method m: metodos){
            if(m.getName().equals(metodo) && m.getParameterCount() == args.length ) {
                Parameter[] parameters = m.getParameters();
                for(int i =0 ; i<parameters.length;i++){
                    ValueDefaultParameter vp = parameters[i].getAnnotation(ValueDefaultParameter.class);
                    if(vp != null && args[i] == null){
                        args[i] = vp.value();
                    }
                }
            }

            m.invoke(intancia,args);
            return;
        }
        throw new NoSuchFieldException("metodo no encontrado" + metodo);
    }

    public static  void applyDefaultAtrributes(Object obj) throws IllegalAccessException {
        Class<?> clazz  = obj.getClass();

        for(Field campo : clazz.getDeclaredFields()){
            campo.setAccessible(true);//Permito acceder a los atributos privados
            AtributeDefault ad = campo.getAnnotation(AtributeDefault.class);
            if(ad != null){
                Class<?> tipo  =  campo.getType();

                Object valorActual =  campo.get(obj);
                if(tipo == String.class && valorActual == null){
                    campo.set(obj,ad.value());
                }
                if(tipo == int.class && (int)valorActual == 0){
                    campo.set(obj,Integer.parseInt(ad.value()));
                }
                //....valdar lo que se requiera
            }
        }
    }
}
