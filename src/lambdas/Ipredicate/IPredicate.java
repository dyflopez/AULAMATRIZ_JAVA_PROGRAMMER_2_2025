package lambdas.Ipredicate;

import java.util.function.Predicate;

public class IPredicate {
    /**
     * Teiene un metodo abstracto llamado TEST
     * Recibe un parametro y devuele una comparacion boolean -> retorna true/false
     *
     */

    public static void main(String[] args) {
        Predicate<Integer> mayorEdad = edad -> edad> 18;
        if(mayorEdad.test(10)){
            System.out.println("mayor de edad");
        }else {
            System.out.println("menor de edad");
        }


        System.out.println("*****************");
        Persona daniel = new Persona("daniel",10,"florez");



        Predicate<Persona> personaTest = persona -> persona.getEdad()<18;

        System.out.println(personaTest.test(daniel));
    }

}
