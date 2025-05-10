package lambdas.function;

import java.util.function.Function;

public class IFunction {

    /**
     * tiene una interfas funcional llamad apply
     * Recibe un valor , lo procesay lo retorna
     *
     * Fuction<T,R>
     *     T :tipo de entrada
     *     R : valor de slaida
     *
     *     Utilizar en transformaciones, en las map
     */

    public static void main(String[] args) {
        Function<String,String> showHello = name -> "hola rey " + name;

        System.out.println(showHello.apply("daniel"));


        //andThen()
        // quiero que un texto no tenga espacios y se evuelva en mayusculas
        String text = "  hola desde aula matriz    ";

        System.out.println("*****salida normal****");
        System.out.println(text.trim().toUpperCase());

        Function<String,String> trim = s -> s.trim();
        Function<String,String> toUpper = s -> s.toUpperCase();


        System.out.println("*****salida andThen****");
        Function<String,String> process  = trim.andThen(toUpper);

        System.out.println( process.apply(text));
    }
}
