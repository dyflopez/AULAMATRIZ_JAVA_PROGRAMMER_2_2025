package mejoras.java;

public class TexBlockMainJava {
    public static void main(String[] args) {
        //Java clasico
        String tableUsers = "CREATE TABLE usuario( \n" +
                "     id INT AUTO_INCREMENT PRIMARY KEY,\n"+
                "     name VARCHAR(50) NOT NULL,\n" +
                "     email VARCHAR(100) NOT NULL,\n"+
                "     edad INT \n"+
                ");";

        //JSON
        String json ="{\n" +
                " \"name\" : \"daniel\""+
                " \"ege\" : 20"+
                "}";
        //TEXTBLOCK
        /**
         * TextBock son las troples comillas,  es una forma "moderda"  de escribir cadenas de texto mutilea en java ("""")
         * Esto se introdujo en java 13+ sin embargo ya estnd
         */
        String jsonUser = """
                {
                    "name":"daniel",
                    "age":30,
                    "age":30,
                    "age":30,
                }
                """;
        System.out.println(jsonUser);
        System.out.println(json);
        //Ventaja
        /**
         * Menos errores en el conenido
         * Se ve el codigo mas limpio y desde el inicio se puede inferir el resultado
         *Alta compatibilidad con String
         */
        System.out.println("***variables en TEXTBLOCK");
        jsonUser = """
                {
                    "name":"daniel",
                    "age":30,
                    "isActive":true,
                }
                """;
        System.out.println(json);
        System.out.println("forma1 de escribir en text blocks");
        String name="Yesid";
        int edad=90;
        boolean status=true;

        jsonUser = """
                {
                    "name":"%s",
                    "age":%d,
                    "isActive":%b,
                }
                """;

        String show = String.format(jsonUser,name,edad,status);
        System.out.println(show);
        System.out.println("****FORMA  2*************");
        double range=5.59;
        char type='A';

        show = String.format("""
                {
                    "name": %s,
                    "age": %d,
                    "isActive": %b,
                    "range": %.2f,
                    "type": %c
                }
                """,name,edad,status,range,type);

        System.out.println(show);


        System.out.println("****************FORMA 3****************");

        json ="""
                {
                    "name": %NAME%,
                    "age": #AGE#,
                    "isActive": %ACTIVE%,
                    "range": %RANGE%,
                    "type": %TYPE%
                }
                """;

        show = json
                .replace("%NAME%",name)
                .replace("#AGE#",String.valueOf(edad))
                .replace("%ACTIVE%",String.valueOf(status))
                .replace("%RANGE%",String.valueOf(range))
                .replace("%TYPE%",String.valueOf(type))
        ;
        System.out.println(show);
    }
}
