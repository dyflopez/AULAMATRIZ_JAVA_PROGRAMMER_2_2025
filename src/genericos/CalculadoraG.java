package genericos;

public class CalculadoraG<T extends Number> {

    public T sumar(T number1, T number2){
        if(number1 instanceof Integer && number2 instanceof Integer){
            return (T) Integer.valueOf(number1.intValue() + number2.intValue());
        }else if (number1 instanceof Double && number2 instanceof Double) {
            return (T) Double.valueOf(number1.doubleValue() + number2.doubleValue());
        }
        else{
            throw new UnsupportedOperationException("Tipo de dato no soportado");
        }
    }

}
