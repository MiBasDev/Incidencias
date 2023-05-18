
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Clase que inicia a execución da aplicación.
 *
 * @author Miguel Bastos Gándara.
 */
public class IncidenceManager {

    /**
     * Método que inicia el menú por consola.
     */
    public void showInitMenu() {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("Benvid@ a aplicacion de notificacion de incidencias");
            boolean login = false;
            User userToLog;
            do {
                System.out.println("Nome de usuario:");
                String userName = scan.nextLine();
                System.out.println("Contrasinal:");
                String pass = scan.nextLine();
                userToLog = UserDB.findByName(userName);
                if (userToLog != null && userToLog.getPassword().equals(pass)) {
                    login = true;
                }
            } while (!login);
            if (userToLog != null && userToLog.getType() == User.ADMIN) {
                IncidenceAdmin admin = new IncidenceAdmin();
                admin.setVisible(true);
            } else {
                showIncidencesMenu(userToLog);
            }
            System.out.println("Queres saír da aplicación?(s/n)");
            String close = scan.nextLine();
            if (close.charAt(0) == 's') {
                exit = true;
            }
        } while (!exit);
    }

    private void showIncidencesMenu(User user) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("");
            System.out.println("Benvid@, " + user.getName());
            System.out.println("As túas incidencias");
            ArrayList<Incidence> inc = IncidenceDB.findByUser(user.getUsername());
            for (int i = 0; i < inc.size(); i++) {
                switch (inc.get(i).getStatus()) {
                    case Incidence.STATUS_UNSOLVED:
                        System.out.println(inc.get(i).getId() + " (sen resolver): " + inc.get(i).getDescription());
                        break;
                    case Incidence.STATUS_PENDING:
                        System.out.println(inc.get(i).getId() + " (pendente): " + inc.get(i).getDescription());
                        break;
                    case Incidence.STATUS_SOLVED:
                        System.out.println(inc.get(i).getId() + " (resolta): " + inc.get(i).getDescription());
                        break;
                }
            }
            System.out.println("Escolle unha opción:");
            System.out.println("1. Crear unha incidencia");
            System.out.println("2. Pechar a sesión");
            int option = scan.nextInt();
            scan.nextLine();
            if (option == 1) {
                System.out.println("Introduce a descrición da incidencia:");
                String description = scan.nextLine();
                System.out.println("Indica o equipo sobre o que trata a incidencia:");
                String computer = scan.nextLine();
                Incidence incidence = new Incidence(0, description, computer, "", Incidence.STATUS_UNSOLVED, user);
                IncidenceDB.save(incidence);
            } else {
                exit = true;
            }
        } while (!exit);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Para que se vea bien.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IncidenceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncidenceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncidenceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncidenceAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        IncidenceManager manager = new IncidenceManager();
        Connection c = UserDB.getConnection();
        manager.showInitMenu();
        try {
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
