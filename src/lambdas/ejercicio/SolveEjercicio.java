package lambdas.ejercicio;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SolveEjercicio {

    public static void main(String[] args) {

        String name[] = new String[10];
        name[0]="daniel";
        name[1]="yesid";
        name[2]="dan";
        name[3]="ana";
        name[4]="gabriela";
        name[5]="Juan";
        name[6]="David";
        name[7]="diana";
        name[8]="luz";
        name[9]="aul";

        Supplier<Integer> randmonNumer = () -> (int) (Math.random()*10);
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[randmonNumer.get()]);
        }

        //Supplier para crear un usuario
        Supplier<Users> newUser = ()-> new Users(name[randmonNumer.get()],true);
        Predicate<Users>  estaActivo = Users::isActive;
        Function<Users,String> saludo = u -> "Welcome "+ u.getName();
        Consumer<String> mensaje = m -> System.out.println(m);
        //andThen
       // Consumer<Users> fullFlow = saludo.andThen(mensaje);



        Users u = newUser.get();
        if (estaActivo.test(u)){
            mensaje.accept(saludo.apply(u));
        }else {
            mensaje.accept("Usuario inactivo");
        }



    }
}
