package lambdas.Ipredicate;

public class Persona {

    private String name;
    private int edad;
    private String lastName;

    public Persona(String name, int edad, String lastName) {
        this.name = name;
        this.edad = edad;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
