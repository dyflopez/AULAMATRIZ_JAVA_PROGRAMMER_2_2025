package collection.maps;

import java.util.LinkedHashMap;

public class LinkedHashMapCollections {

    /**
     *  Implementa la interface Map
     *  mantiene el orden de inserción de los elementos.
     *  Permite clave y valor nulos.
     *  permite k ,v
     *
     *  Cuando usarlo:
     *  - Cuando se necesita mantener el orden de inserción de los elementos.
     *  - Cuando se necesita un acceso rápido a los elementos.
     */
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1", "uno");
        linkedHashMap.put("2", "dos");
        linkedHashMap.put("10", "tres");
        linkedHashMap.put("3", "cuatro");
        linkedHashMap.put(null, null);

        var elementDeleted = linkedHashMap.remove("1");

        System.out.println("elementDeleted: " + elementDeleted);

        for (String key : linkedHashMap.keySet()) {
            System.out.println("key: " + key + " value: " + linkedHashMap.get(key));
        }
    }
}
