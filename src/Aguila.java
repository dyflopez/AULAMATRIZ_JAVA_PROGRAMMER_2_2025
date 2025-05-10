import interfaces.IAnimal;

public class Aguila implements IAnimal {
    @Override
    public void volar() {
        System.out.println("El águila vuela alto");
    }
}
