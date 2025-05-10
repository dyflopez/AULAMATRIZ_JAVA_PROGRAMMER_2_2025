package collection.dequeeCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeeCollections {

    /**
     *  FIFO - LIFO
     *
     *  FIFO : Primero que entra, primero en salir (First in , First out)
     *  LIFO : Ultimo que entra, primero en salir (Last in , First out)
     */
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        /**
         *  add : Agrega a la cola
         *  remove : Elimina de la cola (deveuelve el elemento)
         *  peek : Devuelve el primer elemento de la cola
         *  push : Agrega un elemento al inicio de la pila
         */
        deque.add("Daniel"); // abajo
        deque.add("Yesid"); // abajo
        deque.push("Gonzalez"); // arriba
        deque.add("Florez"); // abajo
        deque.push("De quezada"); // arriba



        deque.forEach(System.out::println);
        System.out.println("====================================");
        deque.removeFirst();
        deque.removeLast();
        deque.forEach(System.out::println);


        System.out.println("====================================");
        deque.getFirst();
        deque.getLast();
        deque.forEach(System.out::println);
    }

}
