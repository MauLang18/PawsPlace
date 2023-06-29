package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class conexion {
    public static Connection getConexion() {
        /*String url = "jdbc:sqlserver://127.0.0.1:1433;"
                + "database=BD_PETMARKET;"
                + "user=sa;"
                + "password=171822;";*/
        
        String url = "jdbc:sqlserver://customcodecr.database.windows.net:1433;"
                + "database=PETMARKET;"
                + "user=superadmin;"
                + "password=M18m31N14;";

        try {
            /*Properties properties = new Properties();
            properties.setProperty("user", "sa");
            properties.setProperty("password", "171822");
            properties.setProperty("encrypt", "false");
            properties.setProperty("trustServerCertificate", "true");

            Connection con = DriverManager.getConnection(url, properties);*/
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
