package clases;

import clases.anidadas.inner.Class.Venta;
import clases.locales.CalculadoraLocal;

public class MainAnidadas {

    /**
     *   Clase anidada  interna(Inner Classes) :
     *   Clases Local(Local Classes):
     *   Clases Anonimas (Anonymous Classes):
     *   Clase estatica anidada (Static Nested Classes):
     */
    public static void main(String[] args) {
        // Clase anidada interna
        Venta venta = new Venta();
        Venta.Mensaje mensaje = venta.new Mensaje();
        mensaje.imprimir();
        // Clase local
        CalculadoraLocal calculadoraLocal = new CalculadoraLocal();
        calculadoraLocal.calcularcuadrado(5);


    }
}
