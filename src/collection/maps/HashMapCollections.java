package collection.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollections {
    /**
     * HashMap es una implementacion de la interfaz Map
     * su almacenamiento es clave -valor
     * No tiene un orden espesifico
     * Permite claves y valores null
     * Es asincrono
     *
     * Cuando usar un HashMap:
     *  cuando no se necesita un orden
     *  cuando se necesita un acceso rapido
     *  cuando se necesita un almacenamiento de clave-valor
     *  Hasmap me da un gran rendimiento
     *
     */


    public static void main(String[] args) {
        // Declaracion de un HashMap
        HashMap<Integer, String> empelados = new HashMap<>();
        empelados.put(1, "Juan");
        empelados.put(2, "Pedro");
        empelados.put(3, "Maria");

        var salida= empelados.get(10);
        System.out.println(salida); // null

        var salidaDelete = empelados.remove(1); // Eliminar el empleado con clave 1
        System.out.println(salidaDelete);
        empelados.remove(10); // Eliminar el empleado con clave 1
        empelados.put(null, "Juan");
        // Imprimir el HashMap
        System.out.println("empelados.keySet()");
        for(Integer key : empelados.keySet()){
            System.out.println("Key: " + key + ", Value: " + empelados.get(key));
        }
        //EntrySet
        System.out.println("empelados.entrySet()");
        for (Map.Entry<Integer, String> entry : empelados.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("empelados.values()");
        for (String value : empelados.values()) {
            System.out.println("Value: " + value);
        }


    }
}
