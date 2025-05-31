package records;

import java.util.UUID;

public record PersonaRecord(
        //@NotBlank(message = "Name cannot be blank")
        String nombre,
        //@Email()
        int edad,
        String codOrganizacion
)  implements IUtils {
    public PersonaRecord{
      // this.validaciones();
    }

    public void validaciones(){
        if(edad<18){
            throw new IllegalArgumentException("la edd no puede ser menor a 18");
        }
    }

    @Override
    public String getUUID() {
        return UUID.randomUUID().toString();
    }
    public String getOrganizacion(){
        return switch (codOrganizacion){
            case "DEV" -> "Desarrollador";
            case "DV" -> "DevOps";
            default ->  throw  new IllegalArgumentException("no se encontro codigo de la organizacion");
        };
    }


}
