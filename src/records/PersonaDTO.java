package records;

public class PersonaDTO {
    private final String name;
    private final int  edad;

    public PersonaDTO(String name, int edad) {
        validaciones();
        this.name = name;
        this.edad = edad;
    }


    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public void validaciones(){
        if(edad<18){
            //throw new IllegalArgumentException("la edd no puede ser menor a 18");
        }
    }
}
