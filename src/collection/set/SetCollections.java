package collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollections {

    /**
     *
     * Los elementos no tienen una posicion no un valor
     * usar metodos equals y hashCode
     *
     * implementar la interfaz Set
     *
     * dos tipos de Set
     *
     * HashSet
     * LinkedHashSet
     * TreeSet
     *
     *
     * NO permite elementos duplicados
     * NO permite elementos nulos *
     * NO permite orden
     */
    public static void main(String[] args) {
        Set <String> frutas = new TreeSet<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Naranja");
        frutas.add("Manzana");
        frutas.add("manzana");
        frutas.add("Mango");
        frutas.add("Aguacate");
        frutas.add("Sandia");

        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion: " + i+"*********");
            for(String fruta : frutas){
                System.out.println(fruta);
            }
        }


    }
}
