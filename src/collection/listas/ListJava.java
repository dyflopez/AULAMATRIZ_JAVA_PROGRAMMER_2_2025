package collection.listas;

import java.util.*;

public class ListJava {

    /**
     *  List  : es una interfaz que no puede ser instanciada directamente
     *  los list siempre crean aaprtir de otro array .... ArrayList o linkedList
     */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(); // acceso rapido , inserciones son lentas , no paralelo
        List<String> listaV = new Vector<>(); // Acceso es rapido, es muy lento en procesado y es pesado
        List<String> listaLL = new LinkedList<>(); // inserciones sn rapidas en cualquier punto , el acceso a los indices es lento
        lista.add("felipe");

        //inmutabilidad
        /**
         * Cuando hablamos de la inmutablilidad  en java nos referimos que no se peude:
         *  1. Modificar elemento
         *  2. Agregar elemento
         *  3. Eliminar elemento
         *
         *  La clase o la coleccion no cambia porque esta cerrada
         *
         *
         *
         *  asList   :
         *  No puedo Agregar o eliminar elementos
         *  Si puedo cambiar los valores
         */
        List<String> nombresEmpleados = Arrays.asList("Juan", "Pedro", "Maria", "Jose", "Ana");

        nombresEmpleados.set(0, "Daniel"); // Cambia el valor de la posicion 0

        System.out.println("for tradicional ");
        //Tadicion de listar con un for
        for (int i =0 ;i<nombresEmpleados.size();i++){
            System.out.println(nombresEmpleados.get(i));
        }
        //For ech
        System.out.println("for each");;
        for(String nombre : nombresEmpleados){
            System.out.println(nombre);
        }
        //For lambda
        System.out.println("For lambda");;
        nombresEmpleados.forEach(nombre -> System.out.println(nombre));
        //nombresEmpleados.add("Javier"); No se puede agregar
        //nombresEmpleados.remove("Juan"); No se puede eliminar

        // conclusion : Arrray.asList es una coleccion que de tamaño fijo que se puede cambiar los valores

        // List.of
        List<String> nombresEmpleados2 = List.of("Juan", "Pedro", "Maria", "Jose", "Ana");
        System.out.println("*********List.of********* ");
        // No se puede agregar - nombresEmpleados2.add("Javier");
        // No se puede eliminar - nombresEmpleados2.remove("Juan"); // No se puede eliminar
        // Cambia el valor de la posicion 0 - nombresEmpleados2.set(0, "Daniel");
        nombresEmpleados2.forEach(System.out::println);

        //List.copyOf
        lista.add("felipe");
        List<String> listaCopia = List.copyOf(lista);
        //List<String> listaCopia1 = Arrays.asList(lista);
        //List<String> listaCopia3 = List.of(lista);

        listaCopia.forEach(System.out::println);

    }

}
