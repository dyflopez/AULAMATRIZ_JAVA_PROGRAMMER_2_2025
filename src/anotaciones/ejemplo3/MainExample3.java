package anotaciones.ejemplo3;

import anotaciones.ejemplo2.Uils;
import jdk.jshell.execution.Util;

public class MainExample3 {
    public static void main(String[] args) throws IllegalAccessException {
        User  u =  new User();
        System.out.println(u.toString());

        System.out.println("aplicando la configuracion");
        Uils.applyDefaultAtrributes(u);
        System.out.println(u.toString());
    }
}
