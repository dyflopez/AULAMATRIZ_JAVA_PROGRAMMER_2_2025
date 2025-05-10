import abstracts.Animal;

public class Gorrion extends Animal {
    public Gorrion(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        System.out.println("Comiendo semillas");
    }
}
