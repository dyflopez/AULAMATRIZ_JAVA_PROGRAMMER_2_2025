package clases.locales;

public class CalculadoraLocal {

    /**
     * Es una clase que vive o esta dentro de un metodo
     *  puede acceder a variables final del metodo
     *
     *  Cuando se usa una Clase local
     *
     *  - controlar una logica espesifica
     *  - aplicar formateos internos o propios
     *  - controlar eventos dentro de un metodo
     */

    public void calcularcuadrado(int number){
        class Cuadrado{
            public int calcular(int number){
                return number*number;
            }
        }
        Cuadrado cuadrado = new Cuadrado();
        System.out.println("El cuadrado de " + number + " es: " + cuadrado.calcular(number));
    }

}
