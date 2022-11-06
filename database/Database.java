package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Connection con;

    static {
        try{
            String jdbcURL = "jdbc:postgresql://localhost:5432/console_store_users_database";
            con = DriverManager.getConnection(jdbcURL, "postgres", "Asdfghj2!");

            System.out.println("Connected");

        }catch (SQLException e){
            System.out.println("Error in connection");
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return con;
    }
}
