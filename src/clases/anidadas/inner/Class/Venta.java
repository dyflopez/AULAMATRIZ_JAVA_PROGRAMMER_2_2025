package clases.anidadas.inner.Class;

public class Venta {

    /**
     * - Es una clase que contiene otra clase interna que no es statica
     * - Se puede acceder a todos los atributos y metodos de la clase externa
     *
     */
    private  String producto="a";

    public class Mensaje{
        public void imprimir(){
            System.out.println("El producto es: " + producto);
        }
    }
}
