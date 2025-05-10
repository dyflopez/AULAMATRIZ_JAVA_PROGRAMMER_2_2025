package abstracts;

public abstract class Animal {

    public String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void mimir() {
        System.out.println("Zzzzz");
    }

    public void volar() {
        System.out.println("Estoy volando");
    }

    public void nadar() {
        System.out.println("Estoy nadando");
    }

    public abstract void comer();
}