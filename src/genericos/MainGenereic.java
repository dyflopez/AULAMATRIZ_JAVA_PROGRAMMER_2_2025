package genericos;

import java.util.List;
import java.util.Optional;

public class MainGenereic {

    /**
     *  Genericos :  ES una Caracterstica que nos da java la cual nos permite codear codigo fexible y reutilizable
     *  Los genericos estan desde java 6/5
     *  Se identifican con el simbolo <T>
     *
     *
     *  Ventajas
     *  -   Reutilizacion de codigo
     *  -   Seguridad de tipo de dato
     *  -   ayuda a evitar errores en tiempo de compilacion
     *  -   lo utilizamos sin darnos cuenta en Collection
     *
     *  <T> es un tipo de dato generico, se puede cambiar por cualquier tipo de dato
     *  <E> es un tipo de dato generico para colecciones | Elemento
     *  <K> es un tipo de dato generico para clave | Key  MAPS <K,V>
     *  <V> es un tipo de dato generico para valor | Value MAPS <K,V>
     *  <N> es un tipo de dato generico para numero | Number
     *  <S> es un tipo de dato generico para cadena | String
     *  <?> es un tipo de dato generico para objeto | Object
     *
     *  <T extends Number> es un tipo de dato generico que hereda de Number
     *
     *  Tipos de genericos
     *  -   Genericos de clase  =>  Class NombreClass<T>
     *  -  Genericos de metodo  => <T> void nombreMetodo(T objeto)
     *  -  Genericos de interfaz => interface NombreInterfaz<T>
     *  -  Mapas genericos => Map<K,V>
     *  -  Bounded generics (extends) => <T extends Number>  (herencia)
     *  -  Wildcards genericos (extends) => <? extends Casa > (herencia)
     */

    List<String> lista = List.of("Hola", "Mundo", "Genericos");
    Optional<String> optional = Optional.of("Hola Mundo");


    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.save(1);
        int item = box.get();
        System.out.printf("El item guardado es: %s%n", item);

        //calculadora generica ejemplo
        CalculadoraG<Integer> calculadoraG = new CalculadoraG<>();
        CalculadoraG<Double> calculadoraS = new CalculadoraG<>();

        System.out.println(calculadoraG.sumar(1, 2));
        System.out.println(calculadoraS.sumar(1.0, 2.0));
    }
}
