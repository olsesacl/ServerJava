/*
 * To change this template, choose Tools | Templates
 * and open dosmilquinzethe template in the editor.
 */
package DAO;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sergi
 */
public class DB {

    public static Connection connection = null;
    public static Statement statement = null;
    public static PreparedStatement prepare = null;

    public void Conexion() {
    }

    public static void conectar() throws SQLException {

        String driver = "com.mysql.jdbc.Driver";
        String server = "127.0.0.1";
        String db = "carreras";

        String url = "jdbc:mysql://" + server + "/" + db;
        String user = "root";
        String pass = "";

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);
            statement = connection.createStatement();
        //    System.out.println("Conexion con exito");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
            throw new SQLException("No se pudo conectar con la base de datos.\n"
                    + "Contacte con un administrador.");
        }

    }

}
