
package StartPage;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;


public class MethodClass {
    private InfDB idb;
    
    
    
    
    public MethodClass(InfDB idb){
        
    
        
        
    }
    
        public static ArrayList<String> kategori1(String katNamn, String katTabell)
    {
        try
        {
            String fraga = "select " + katNamn + " from " + katTabell;
            ArrayList<String> allaKategorier1 = idb.fetchColumn(fraga);
            return allaKategorier1;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }
    
}
