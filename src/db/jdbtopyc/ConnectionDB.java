package db.jdbtopyc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionDB connectionDB = new ConnectionDB();
        connectionDB.exampleError();
       // connectionDB.doConnectionPostgres();
    }
    //private String jdbcUrl="jdbc:<baseDatos>://<localConexion>:<puerto>/<nombreBaseDatos>";
    private String jdbcUrl="jdbc:mysql://rds-aulamtriz-mysql.cpas4e6wm2o7.us-east-1.rds.amazonaws.com:3306/db-daniel";
    private String user="admin";
    private String password="AULAmatriz9394*";

    private String jdbcUrlPostgres="jdbc:postgres://localhost:5432/postgres";
    private String userPostgres="postgres";
    private String passwordPostgres="postgres";

    public Connection doConnectionPostgres(){
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrlPostgres,userPostgres,passwordPostgres);
            return connection;
        }catch (Exception e){
            System.out.println(e.getCause()+"-"+e.getMessage());
            return null;
        }finally {
            System.out.println("se llamo al metodo doConnectionPostgres");
        }
    }

    public Connection doConnectionMysqlDB () throws SQLException, ClassNotFoundException {
        /**
         * Checked Exception(Excepciones Comprobadas) : son aquellas excepciones que el compilar(IDE)
         * obliga a manejar las excepciones con el uso de try-catch o throws
         * Resumen => desarrrollador debe anticipar o manejar la excepcion en tiempo de compilaicon..
         *
         * UnChecked Exception(Excepciones no Comprobadas): Son excepciones que el compilador(IDE) no abliga a menjarlas.
         * son excepciones que ocurren en tiempo de ejecucion. NullPointerException
         *
         */
        //indicar cual driver vamos a usar
        Class.forName("com.mysql.cj.jdbc.Driver");
        //coneccion a la db
        //DriverManager.getConnection("<url>,<user>,<password>");
        Connection connection = DriverManager.getConnection(jdbcUrl,user,password);
        return connection;

    }

    public Connection exampleError(){
        try{
            return this.doConnectionMysqlDB();
        }catch (Exception e){
            System.out.println("Error" + e.getMessage() + " - " + e.getCause());
            return  null;
        }
    }
}
