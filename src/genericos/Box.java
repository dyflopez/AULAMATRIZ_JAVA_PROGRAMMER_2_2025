package genericos;

public class Box<T extends Number> {
    private T item;

    public void save(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}
