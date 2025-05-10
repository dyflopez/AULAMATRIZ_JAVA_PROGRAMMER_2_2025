package collection.listas;

import java.util.Vector;

public class VectorList {

    /**
     * Vector : procesamiento es sincrono
     * cuando se el recorrido es un poco lento, porque tiene que pasar por cada elemento hasta llegar al punt necesario
     *
     *
     *
     */
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Elemento 1");
        vector.add("Elemento 1");
        vector.add("Elemento 1");
        vector.add("Elemento 1");
        vector.add("Elemento 1");
        vector.forEach(System.out::println);
    }
}
