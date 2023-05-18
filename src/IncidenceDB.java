
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Clase que implementa a persistencia das incidencias.
 *
 * @author Miguel Bastos Gándara.
 */
public class IncidenceDB {

    /**
     * Método que busca as incidencias xeradas polo usuario.
     *
     * @param username Nome do usuario do que bsucar as incidencias.
     * @return Incidencias do usuario.
     */
    public static ArrayList<Incidence> findByUser(String username) {
        ArrayList<Incidence> userIncidences = new ArrayList<>();
        try {
            String sql = "Select * FROM Incidence WHERE sender=?";
            PreparedStatement pst = UserDB.getConnection().prepareStatement(sql);
            pst.setString(1, username);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                Incidence incidence = new Incidence(rst.getInt("id"), rst.getString("description"), rst.getString("computer"), rst.getString("resolution"),
                        rst.getInt("status"), new User(username, "", "", "", 0));
                userIncidences.add(incidence);
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return userIncidences;
    }

    /**
     * Método que garda unha incidencia no arraylist de incidencias.
     *
     * @param incidence Incidencia a gardar.
     */
    public static void save(Incidence incidence) {
        try {
            String sql = "INSERT INTO Incidence (description, computer, resolution, status, sender) VALUES (?,?,?,?,?)";
            PreparedStatement pst = UserDB.getConnection().prepareStatement(sql);
            pst.setString(1, incidence.getDescription());
            pst.setString(2, incidence.getComputer());
            pst.setString(3, incidence.getResolution());
            pst.setInt(4, incidence.getStatus());
            pst.setString(5, incidence.getSender().getUsername());
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Método que busca as incidencias que están no estado que se indique no
     * parámetro.
     *
     * @param status Estado a buscar.
     * @return Incidencias do estado.
     */
    public static ArrayList<Incidence> findByStatus(int status) {
        ArrayList<Incidence> statusIncidences = new ArrayList<>();
        try {
            String sql = "Select * FROM Incidence JOIN User ON incidence.sender=user.username WHERE status=?";
            PreparedStatement pst = UserDB.getConnection().prepareStatement(sql);
            pst.setInt(1, status);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                Incidence incidence = new Incidence(rst.getInt("id"), rst.getString("description"), rst.getString("computer"), rst.getString("resolution"),
                        status, new User(rst.getString("username"), rst.getString("password"), rst.getString("name"), rst.getString("surname"),
                                rst.getInt("type")));
                statusIncidences.add(incidence);
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return statusIncidences;
    }

    /**
     * Método que refresca los datos de una incidencia en la BD.
     *
     * @param incidence Incidencia a refrescar.
     */
    public static void update(Incidence incidence) {
        try {
            String sql = "UPDATE Incidence SET status=?, resolution=? WHERE id=?";
            PreparedStatement pst = UserDB.getConnection().prepareStatement(sql);
            pst.setInt(1, incidence.getStatus());
            pst.setString(2, incidence.getResolution());
            pst.setInt(3, incidence.getId());
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
