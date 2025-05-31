package records;

//LOMBOK
public class UserDTO {

    private  String name;

    private  String lastname;

    public UserDTO(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

}