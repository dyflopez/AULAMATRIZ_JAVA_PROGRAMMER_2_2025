import operador.lambda.Calculadora;
import operador.lambda.IOperaciones;

public class Main {
    public static void main(String[] args) {
        IOperaciones suma = (a,b) -> a + b;
        IOperaciones resta = (a,b) -> a - b;
        IOperaciones multiplicacion = (a,b) -> a * b;

        System.out.println("Resultado" + suma.operacion(10, 20));
        System.out.println("Resultado" + resta.operacion(10, 20));
        System.out.println("Resultado" + multiplicacion.operacion(10, 20));

        Calculadora calculadora = new Calculadora();
        System.out.println("Resultado" + calculadora.suma(10, 20));
    }
}