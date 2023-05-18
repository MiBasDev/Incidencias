/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase que implementa a persistencia dos usuarios da aplicación.
 *
 * @author Miguel Bastos Gándara.
 */
public class UserDB {

    private static Connection connection = null;

    /**
     * Método que devolve o usuario co nome pasado como parámetro, ou null se
     * non existe;
     *
     * @param userName Nome do usuario a buscar.
     * @return Usuario con ese nome.
     */
    public static User findByName(String userName) {
        User user = null;
        try {
            String sql = "Select * FROM User WHERE username=?";
            PreparedStatement pst = getConnection().prepareStatement(sql);
            pst.setString(1, userName);
            ResultSet rst = pst.executeQuery();
            if(rst.next()) {
                user = new User(rst.getString("username"), rst.getString("password"), rst.getString("name"), rst.getString("surname"), rst.getInt("type"));
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return user;
    }

    /**
     * Método que se conecta á base de datos.
     *
     * @return Conexión coa base de datos.
     */
    public static Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:sqlite:incidences.db", "", "");
                System.out.println("Conexion realizada con éxito");
            }
            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
