package anotaciones.ejemplo3;


public class User {

    @AtributeDefault("Anonimo")
    private  String name;

    @AtributeDefault("fakeEmail@gmail.com")
    private String email;

    @AtributeDefault("18")
    private int edad;

    private  String lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
