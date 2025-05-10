package interfaces;

public interface IVehiculo {

    /**
     *  Interfaces permite usar dos tipos de metodos
     *  1. Metodos abstractos (sin cuerpo)
     */
    void acelerar(int velocidad);
    /*
        *  2. Metodos por defecto : Tienen una logica y se implementan por defecto ,
        *   los metodos default no es necesario implementarlos en la clase que los implementan
        *   Sin embargo los metodos se pueden heredar y sobreescribir
        *
        *   Paraque sirve un metodo default?
        *   - Realizar operaciones comunes a todas las clases que implementan la interfaz
        *   - Se puede agregar funcionalidad a interfaces sin romper el codigo existente
        *   - Se puede estandarizar un comportamiento mas no se obligatorio
        *
     */
    default void pitar() {
        System.out.println("Piiiii");
    }

    /**
     *  Metodos estaticos : Se pueden llamar sin instanciar la clase
     *  - Se pueden usar para crear metodos de utilidad
     *  - Se pueden usar para crear metodos de fabrica
     */
    static String alertaGasolina(int nivelGasolina) {
        if (nivelGasolina < 20) {
            return "reserva";
        }else if (nivelGasolina < 10) {
            return "poco";
        }
        return "se agoto la gasolina";
    }
}
