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
        
        windowsStil();

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
    
    private static void windowsStil() {
        // Innehåller designelement för Huvudfönstret
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}