
package StartPage;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;


public class MethodClass {

    
    
    public MethodClass(){
        
    
        
        
    }
    
        public static ArrayList<String> getComboBoxCategory(String katNamn,String katTabell,InfDB idb)
    {
        try
        {
            String fraga = "Select "+katNamn+" from '"+katTabell+"'";
            ArrayList<String> allaKategorier1 = idb.fetchColumn(fraga);
            return allaKategorier1;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
        return null;

    }

}
