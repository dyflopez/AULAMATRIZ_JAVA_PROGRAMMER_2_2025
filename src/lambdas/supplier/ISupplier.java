package lambdas.supplier;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.function.Supplier;

public class ISupplier {

    /**
     * Dispone de un metodo abstracto llamado GET que no recibe ningun parametro y devuelve un objeto
     * la interfaz Supplier solamente produce un valor retorna un valor sin necesidad de parametros
     *
     *
     * ()-> return logica
     *
     *
     * Declaracion
     * Supplier<T>
     */

    //UUID  alfanumerico
    public static Supplier<UUID> generateUUID = ()-> UUID.randomUUID();

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hola mundo";
        Supplier<Integer> ramdomNumbers = () -> (int) (Math.random()*100);
        Supplier<Double> decinales = () -> Math.random();

        System.out.println(supplier.get());
        System.out.println(generateUUID.get());
        var number = ramdomNumbers.get();
        System.out.println("***************"+number);
        for (int i=0;i<number;i++){
            System.out.println(decinales.get());
        }

    }
}
