package collection.listas;

import java.util.LinkedList;

public class LinckedListCollection {

    /**
     *  Es una implementacino de List  y de Deque
     *
     *  El alamacenamiento es en nodos o enlazado
     *  el acceso a los elementos es lento
     *  la incersion y la eliminacion son mas rapidas
     *  No es sincrono , es decir, no es seguro para el acceso concurrente
     *
     */
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.forEach(System.out::println);

    }
}
