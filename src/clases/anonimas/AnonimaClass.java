package clases.anonimas;

import operador.lambda.IOperaciones;

public class AnonimaClass {

    /**
     *  Anonymous Classes: Es una clase que no tiene nombre y sire para sobrescribir el comporatamiento un metodo o clase
     *  Casos de uso : Hilos, eventos, callbacks , prueba rapida no buena...
     */
    public static void main(String[] args) {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hola desde un hilo");
            }
        });
        hilo.start();

        var objto = new IOperaciones() {
            @Override
            public int operacion(int numero1, int numero2) {
                return numero1 * numero2;
            }
        };

       var salida =  objto.operacion(5, 10);
        System.out.printf("El resultado de la multiplicacion es: %d", salida);
    }
}
