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
            JOptionPane.showMessageDialog(null, "Databasen kunde inte anslutas!");
            System.out.println("Internt felmeddelande " + ettUndantag.getMessage());
        }

        new Inloggning(idb).setVisible(true);
        
    }
    
}