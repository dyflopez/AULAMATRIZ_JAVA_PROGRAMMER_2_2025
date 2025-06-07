package anotaciones.ejemplo2;

import java.lang.reflect.InvocationTargetException;

public class MainMetodoExample{
    public static void main(String[] args) throws NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        Logistica l = new Logistica();

        System.out.println("envar el parametro null");

        Uils.ejecutarEnvio(l,"despacho",(Object) null);
    }
}
