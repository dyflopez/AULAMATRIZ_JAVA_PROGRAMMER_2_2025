package collection.listas;

import java.util.ArrayList;

public class ListasCollectionAll {

    /**
     *  Listas en java (api collection list)
     *  cada elemento de una lista tiene una posicion  aparir el orden de llegada
     *  (inxex 0)  primero dato => daniel
     *  (inxex 1)  Segundo  dato => daniel   ( permite repetir valores)
     *
     *  2) los List  estan compuestos de tipos Genericos <T>
     *
     *  1) ArrayList
     *  2)List
     *  3) LinkedList
     *  4) Vector
     *
     */

    public static void main(String[] args) {

        //ArrayList
        /**
         * Caracteristicas de los ArrayList
         * 1) Se acceden por medio de un indice
         * 2) Permite elementos duplicados
         * 3) La naturaleza de su recorrio es sincrono
         *  Consejo cuando yo quieor ejecutar proceso o usar estas listas en
         *  subprocesos o entornos de concurrencia no es el mejor
         *
         *  ArrayList Implementan la interfaz List
         */

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Daniel");
        lista.add("yesid");

        lista.forEach(System.out::println);

    }
}
