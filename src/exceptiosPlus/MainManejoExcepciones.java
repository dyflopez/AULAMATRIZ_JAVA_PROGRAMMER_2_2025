package exceptiosPlus;

import com.sun.tools.javac.Main;

public class MainManejoExcepciones {
    public static void main(String[] args) throws MyCheckedException {
        try {
            MainManejoExcepciones.lanzarCheckedExcepton();
        } catch (MyCheckedException e) {
            System.out.println("error lanzarCheckedExcepton");
        }

      //  MainManejoExcepciones.unCheckedExcepton();

        try {
            int a= 1/0;
        }catch (ArithmeticException e){
            throw new MyCheckedException("fallo por division en 0",e);
        }
    }

    public static void lanzarCheckedExcepton() throws MyCheckedException {
        throw new MyCheckedException("Se lanza error MyCheckedException");
    }

    public static void unCheckedExcepton(){
        throw new MyUnCheckedException("Se lanza error MyCheckedException");
    }

}
