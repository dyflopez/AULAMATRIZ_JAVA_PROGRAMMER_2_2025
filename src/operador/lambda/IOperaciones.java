package operador.lambda;

@FunctionalInterface
public interface IOperaciones {

    //  El operador  (->) es una lambda o usa una exprecion lambda
    /*
   *  Se implemento apartir de java 8+
   *  Programaicon funional o el tema de las funciones anonimas ..... Bloque de codigo que no tiene nombre
   *
   *   (Parametros de entrada) -> {bloque de codigo}
   *   (Parametros de entrada) -> bloque de codigo}
   *  *   (nombre) -> system.out.println("Hola " + nombre);
   *      (porcentaje) -> {
   *    if (porcentaje > 100) {
   *           return 100;
   *     } else if (porcentaje < 0) {..return.}
   *    return
   *
   *    }
   *
     */
   int operacion(int numero1, int numero2);

    //  Se puede usar el modificador default para definir un metodo por defecto


   default int suma(int numero1, int numero2) {
       return numero1 + numero2;
   }

    default int resta(int numero1, int numero2) {
         return numero1 - numero2;
    }

    static void imprimir() {
        System.out.println("Hola desde la interfaz");
    }
}
