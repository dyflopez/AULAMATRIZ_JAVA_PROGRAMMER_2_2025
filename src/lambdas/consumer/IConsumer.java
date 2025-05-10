package lambdas.consumer;

import java.beans.Customizer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IConsumer {
    /**
     *
     *   Dispone d eun metodo abstracto  llamado accept
     *   Se utuliza para el procesmiento de datos...
     *   Recibe un parametro y lo procesa
     *
     *   Consumer<T> name = proceso (logica)
     */

    public static void main(String[] args) {
        Consumer<String> imprimirCadena = s -> System.out.println(s);

        imprimirCadena.accept("Hola mundo");

        //compleja que es pasar una lista umar numeros

        List<Integer> numers = Arrays.asList(5,4,3,1,6,20);

        Consumer <List<Integer>> obtenerSuma = lista -> {
            int suma =0;
            for (int n : lista) {
                suma +=n;
            }
            System.out.printf("suma " + suma);
        };
        obtenerSuma.accept(numers);

        //imprimir los nombres
        List<String> names = Arrays.asList("daniel" , "yesid" , "flore" ,"lopez");

        Consumer<String> nombresMayuscula = name -> System.out.println(name.toUpperCase()+ " ");


        //names.forEach(nombresMayuscula);
        names.forEach(n->nombresMayuscula.accept(n));




    }


}
