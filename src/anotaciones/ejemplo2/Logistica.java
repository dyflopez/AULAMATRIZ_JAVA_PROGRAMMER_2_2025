package anotaciones.ejemplo2;

public class Logistica {

    public void despacho(
            @ValueDefaultParameter(value = "empaquetadora") String destino
    ){
        System.out.println("El producto se despacha a " + destino);
    }
}
