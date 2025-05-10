package operador.lambda.example;

import operador.lambda.IOperaciones;

public class CalculadoraBasica {

    public IOperaciones suma = (numero1, numero2) -> numero1 + numero2;
    public IOperaciones resta  = (numero1, numero2) -> numero1 - numero2;
    public IOperaciones multiplicacion = (numero1, numero2) -> numero1 * numero2;


    public static void main(String[] args) {
        CalculadoraBasica calculadora = new CalculadoraBasica();
        System.out.println("Suma: " + calculadora.suma.operacion(5, 3));
        System.out.println("Resta: " + calculadora.resta.operacion(5, 3));
        System.out.println("Multiplicacion: " + calculadora.multiplicacion.operacion(5, 3));
    }
}
