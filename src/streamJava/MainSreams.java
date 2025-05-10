package streamJava;

import lambdas.ejercicio.Users;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainSreams {


    /**
     * STREAM : objeto que pemrite realizar de una forma rapida y sensilla operaciones
     *      * Busqueda
     *      * Filtrado
     *      * calculos
     *      * se usa con  con los collections
     *
     *
     *      PAra utilizar un stream se utiliza una interfaz de java.util.stream
     *      el Stream recorre desde el inicio hasta el fin los datos
     *      *IMPORTANTE!!!!!!!
     *      Ventajas :
     *      Programacion Declaratica : codifo mas corto y legible
     *      Operaciones lamnda o interfaces funcionales
     *      Eficiente y permite el paralelismo :
     *      No Es mutable
     *      Facilita las operaciones .... es mas senicillo
     *
     */
    public static void main(String[] args) {
        // Stream  siempre va a crearse apartir de una lista o u collection

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(30);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        numeros.add(5);
        numeros.add(20);
        numeros.add(91);
        numeros.add(20);
        Stream<Integer> numerosStream = numeros.stream();
        numeros.stream().forEach(System.out::println);

        numeros.stream().filter(n->n>10);



        //Existen dos tipos de metodo Stream
        /**
         *  MEtodos intermedios: El resultado de su ejecucion es un nuevo Stream Ejemplo filter
         *  Metodos Finales:  Genera un resultado Ejemplo forEatch o coint
         */
        var cantidad = numeros.stream().count();
        System.out.println(cantidad);
        //Distinct
        //Devuelve un Stream que elimna los datos duplicados (final);
        System.out.println("**********DISTINCT************");
        numeros
                .stream()
                .filter(f -> f==2)
                .distinct()
                .forEach(System.out::println);

        System.out.println("**********Match************RETORNA---TRUE---FALSE");
        /**
         *  anyMatch: Devuelve true si algun elemento cumple con las condiciones del predicado
         *  allMatch: Devuelve true si todos los elementos cumplen con la condicion del predicado
         *  nonMatch : Devuevle true si ninguno cumple con la condicion o predicado
         */


        System.out.println("**********anyMatch************RETORNA---TRUE---FALSE");
        Predicate<Integer> validadMaximoEdad = edad->edad>80;

        boolean salida = numeros
                    .stream()
                    //.anyMatch(n -> n>80);
                    .anyMatch(validadMaximoEdad);

        System.out.println(salida);

        System.out.println("**********allMatch************RETORNA---TRUE---FALSE");
        salida = numeros
                .stream()
                .anyMatch(n -> n<100);
                //.allMatch(validadMaximoEdad);

        System.out.println(salida);

        System.out.println("**********anyMatch************RETORNA---TRUE---FALSE");

        salida = numeros
                .stream()
                //.anyMatch(n -> n>80);
                .anyMatch(validadMaximoEdad);

        System.out.println(salida);

        System.out.println("**********nonMatch************RETORNA---TRUE---FALSE");
        salida = numeros
                .stream()
                //.noneMatch(n -> n>100);
                 .noneMatch(validadMaximoEdad);

        System.out.println(salida);
        System.out.println("**********Filer**********Es intermedio****");
        numeros
                .stream()
                //.filter(validadMaximoEdad)
                .filter(f-> f == 3)
                .distinct()
                .forEach(System.out::println);
        System.out.println("**********Limit**********Es intermedio****");
        /**
         * limit : devuelve un nuevo Stream con el n numeros de elementos
         * skip: se salta los n primeros elementos
         */
        numeros
                .stream()
                .limit(9)
                //.forEach(System.out::println);
                .forEach(f -> System.out.println(f));

        System.out.println("**********skip**********Es intermedio****");
        numeros
                .stream()
                .skip(100)
                .forEach(System.out::println);
        // Como traer de un rango espesifoco
        numeros
                .stream()
                .skip(4)
                .limit(3) //   0  1  2 3 4 5 6 7  8 9 -> (4 --- 7) ...
                .forEach(System.out::println);
        System.out.println("**********dropWhile**********Es intermedio****");
        //desde un valos espesiifco traer 5 datos siguientes
        numeros
                .stream()
                .dropWhile(n-> n !=2)
                .dropWhile(n-> n !=20)
                .limit(5)
                .forEach(System.out::println);
        System.out.println("**********MAP**********Es intermedio****");
        /**
         * Transforma cada alemento en otro stream
         *
         */
        numeros
                .stream()
                .map(n -> {
                    return new Users("daniel", true,n);
                })
                .forEach(System.out::println);
        System.out.println("**********Sort**********Es intermedio****");
        /**
         * ordena los elementos en un orden natural
         */
        numeros
                .stream()
                .sorted()
                .toList()
                .forEach(System.out::println);
        System.out.println("**********peek**********Es intermedio****");
        numeros
                .stream()
                .map(n -> {
                    return new Users("daniel", true,n);
                })
                .peek(u->  u.setName( u.getName().toUpperCase()))
                .forEach(System.out::println);
        System.out.println("**********min/max**********Es final****");
        /**
         * Devuelve el valor minimo o maximo de un stream
         *
         */
        Optional<Integer> op = numeros
                                .stream()
                                .max(Integer::compareTo);

        if(op.isPresent()){
            System.out.println(op.get());
        }
        System.out.println("**********findAny**********Es metodo final****");

        op =  numeros
                .stream()
                .findAny();

        System.out.println(op.get());

        System.out.println("**********findFirst**********Es metodo final****");

        op =  numeros
                .stream()
                .findFirst();

        System.out.println(op.get());

        System.out.println("**********mapToIeger**********Es metodo final****");


        numeros
                .stream()
                .map(n -> {
                    return new Users("daniel", true,n);
                })
                .mapToInt(u -> u.getName().length())
                .forEach(System.out::println);

        System.out.println("**********reduce**********Es metodo final****");
        var sumaTotal = numeros
                        .stream()
                        .reduce(100,Integer::sum);
        System.out.println(sumaTotal);

        var txt = Stream.of("Hola" , "rey","welcome","to","home")
                .reduce("-",(a,b)-> a+" "+ b);
        System.out.println(txt);
    }
}
