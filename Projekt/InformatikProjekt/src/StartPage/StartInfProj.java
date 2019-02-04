package StartPage;

import java.io.File;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Alvin Johansson
 */
public class StartInfProj {
    
    private static InfDB idb;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Denna fil körs för att starta programmet.
        
        try {
            
            String file = new File("IP.FDB").getAbsolutePath();
            System.out.println(file);
            idb = new InfDB (file);
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Error: Failed to establish connection to database. Woops.");
            System.out.println("Internt felmeddelande " + ettUndantag.getMessage());
        }

        new LoginWindow(idb).setVisible(true);
    }
    
}