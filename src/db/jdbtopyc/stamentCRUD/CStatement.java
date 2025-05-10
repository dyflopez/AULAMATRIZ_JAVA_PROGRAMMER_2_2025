package db.jdbtopyc.stamentCRUD;

import db.jdbtopyc.ConnectionDB;
import db.jdbtopyc.stamentCRUD.seed.MigrationsSQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CStatement {

    /***
     * CreateStatement : es un metodo que utiliza JDBC para crear objetos Statement y ejecutar  operacones o
     * consultas en la base de datos.  SELECT, UPDATE, DELETE, CREATE
     *
     * Metodos
     *
     * executeQuery(String sql) : Ejecuta una consulta  SQL que devuelve un conjunto de resultados SELECT
     * ExecuteUpdate(String sql) : Ejecuta una un SQL que *actualiza* la base de datos y devuelve el numero de gilas
     * que se afecto en el proceso
     *
     * execute(String sql) : Ejecuta un SQL de cualqueir tipo (arbitraria) Seleccion, insercion, delete,create...
     *
     *
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionDB connectionDB = new ConnectionDB();
        MigrationsSQL migrationsSQL = new MigrationsSQL();

        Connection connection = connectionDB.exampleError();
        Statement statement = connection.createStatement();
//        migrationsSQL.createTableUsers(statement);
        migrationsSQL.insertUser(statement);
        migrationsSQL.getInformacion(connection,20);



        /**
         *
         *
         */

    }
}
