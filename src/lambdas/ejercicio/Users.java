package lambdas.ejercicio;

public class Users {
    private String name;
    private boolean active;
    private  int edad;

    public Users(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public Users(String name, boolean active, int edad) {
        this.name = name;
        this.active = active;
        this.edad = edad;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", active=" + active +
                ", edad=" + edad +
                '}';
    }
}
