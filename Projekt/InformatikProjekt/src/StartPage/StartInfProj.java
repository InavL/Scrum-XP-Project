package StartPage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alvin Johansson
 */
public class StartInfProj { // The program is run through this file
    
    private static Connection con;

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        windowsStil(); // Calls the method for setting up the design
        
        try {
            con = DriverManager.
                    getConnection("jdbc:mysql://localhost/scrumprojekt",
                             "root", "rundboll");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }

        new LoginWindow(con).setVisible(true);
    }

    private static void windowsStil() { // Innehåller designelement för Huvudfönstret

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Windows".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

    }

}
