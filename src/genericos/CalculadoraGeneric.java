package genericos;

public class CalculadoraGeneric<T extends Number> {
    public double sumar(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    public int restar(T num1, T num2) {
        return num1.intValue() - num2.intValue();
    }
}
