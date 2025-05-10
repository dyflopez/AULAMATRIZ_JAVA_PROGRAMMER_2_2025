package mejoras.java;

public class SwitchMain {
    public static void main(String[] args) {

        /**
         *Switch Mejorado : Se implemento en java 14+
         * funciona como una expresion
         * esta usando la flecha -> en lugar de Case y break
         *
         * QUE SOLUCIONA
         * Quita el olvido del break ,
         * Sintaxis es mas dinamica o facil
         * es mas limpio el codigo
         * es compatibe co el lamnda
         */
        String day ="miercoles";
        int salida;

        switch (day){
            case "lunes":
                salida = 1;
                break;
            case "martes":
                salida = 2;
                break;
            case "miercoles":
                salida = 3;
                break;
            case "jueves":
                salida = 4;
            case "viernes":
                salida = 5;
                break;
            case "sabado":
                salida = 6;
                break;
            case "domingo":
                salida = 7;
                break;
            default:
                salida= -1;
                break;
        }

        System.out.println(salida);
        /**
         * Desventajas del clasico , codigo un poco complejo , repetitivo,  y riesgo de olvidar el break
         *
         *
         *
         */


        // Yield => return
        salida = switch (day){
            case "lunes" -> 10;
            case "martes" -> 20;
            case "miercoles" -> {
                System.out.println("ingreso a miercoles");
                yield 30;
                // System.out.println("asdasdasd"); => error
                //return error los switch solo permiten el retorno con yield
            }
            case "jueves" -> 40;
            case "viernes" -> 50;
            case "sabado" -> 60;
            case "domingo" -> 70;
            default  -> 80;
        };

        System.out.println(salida);


        System.out.println("**************** sin reotorno");
        int nota = 5;

        switch (nota/10){
            case 10,9,8  -> {
                System.out.println("excelente");
            }
            case 7 -> {
                System.out.println("malo");
            }
            default  -> {
                System.out.println("reprobado");
            }
        };
    }
}
