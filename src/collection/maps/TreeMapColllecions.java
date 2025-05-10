package collection.maps;

import java.util.TreeMap;

public class TreeMapColllecions {

    /**
     * * TreeMap
     *  *  Es una implementacion de la interfaz Map pero basa en arboles
     *  los elementos se ordenan por la clave segun su naturaleza de orden
     *  *  *  No permite claves o valores null
     *  *  *  Es sincronizado
     *  *  *  Es mas lento que el HashMap
     *  Implementa la interfaz SortedMap
     *
     *  Cuando suamos un TreeMap:
     *  *  *  Cuando necesitamos un orden
     *  *  *  Cuando las clabes no sean nulas
     *
     */


    public static void main(String[] args) {

        TreeMap<Integer, String> empleados = new TreeMap<>();
        empleados.put(10, "Juan");
        empleados.put(1, "Pedro");
        empleados.put(30, "Maria");


        for (Integer key : empleados.keySet()) {
            System.out.println("Key: " + key + ", Value: " + empleados.get(key));
        }

        TreeMap<String, String> frutas = new TreeMap<>();
        frutas.put("Banana", "la mejor fruta de todas");
        frutas.put("manzana", "la mejor fruta de colombia");
        frutas.put("banano", "la mejor fruta de peru");
        frutas.put("mOra", "la mejor fruta de ecuador");
        frutas.put("mora", "la mejor fruta de australia");
        frutas.put("chontaduro", null);

        for (String key : frutas.keySet()) {
            System.out.println("Key: " + key + ", Value: " + frutas.get(key));
        }
    }
}
