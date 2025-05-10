package interfaces;

public class Mazda implements IVehiculo {
    @Override
    public void acelerar(int velocidad) {
        System.out.println("Acelerando a " + velocidad + " km/h");
    }
}
