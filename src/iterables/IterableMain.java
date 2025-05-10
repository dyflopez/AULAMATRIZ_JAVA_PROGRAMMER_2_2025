package iterables;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableMain {

    /**
     * Iterable : un Iterable es una interfaz que permite recorrer
     * una colección de elementos por medio de un ciclo por ejemplo for.
     *
     * Los objetos iterables implementan la interfaz Iterable<T>
     * El api Collections o por ejemplo la Listas (List) usan  o implementan los iterables
     *
     * La interfaz iterable esta compuesta 2 métodos:
     *  1. hastNExter() : devuelve un booleano que indica si hay un siguiente elemento
     *  2. next() : devuelve el siguiente elemento
     */



    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hola");
        list.add("daniel");


        Iterator<String> iterable = list.iterator();
        System.out.println(iterable.next());
       iterable.remove();
       boolean hasNext = iterable.hasNext();
       System.out.println("Hay un siguiente elemento: " + hasNext);
       if(hasNext) {
           System.out.println("Hay un siguiente elemento");
           System.out.println(iterable.next());
       }

    }

}
