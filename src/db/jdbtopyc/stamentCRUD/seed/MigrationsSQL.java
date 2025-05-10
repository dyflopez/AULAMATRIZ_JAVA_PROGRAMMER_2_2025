package db.jdbtopyc.stamentCRUD.seed;

import java.sql.*;

public class MigrationsSQL {

    public void createTableUsers(Statement statement){
        try {
            System.out.println("Creacion SQL");
            String tableUsers = "CREATE TABLE usuario( \n" +
                    "     id INT AUTO_INCREMENT PRIMARY KEY,\n"+
                    "     name VARCHAR(50) NOT NULL,\n" +
                    "     email VARCHAR(100) NOT NULL,\n"+
                    "     edad INT \n"+
                    ");";
            var salida = statement.executeUpdate(tableUsers);
            System.out.println("se creo la tabla correctamente" + salida);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void  insertUser(Statement statement) throws SQLException {
        String newUser = "INSERT INTO usuario (name,email,edad) VALUES ('DANIEL','daniel0223@hotmail.es',15);";
        boolean success =  statement.execute(newUser);

        /*if(success){
            System.out.println("la operacion se hizo correctamente");
        }else {
            System.out.println("La operacion falo correctamente");
        }*/
    }

    public void getInformacion(Connection connection, int age) throws SQLException {


        String sql = "SELECT * FROM usuario WHERE edad > ?";
        PreparedStatement pStatement = connection.prepareStatement(sql);

        pStatement.setInt(1, age);
        //pStatement.setInt( <indicne>, Variable);

        ResultSet  resultSet  =  pStatement.executeQuery();

        while (resultSet.next()){
            String name  = resultSet.getString("name");
            int id  = resultSet.getInt("id");

            System.out.println("Name " + name +"--- id " +  id);
        }
    }
}
