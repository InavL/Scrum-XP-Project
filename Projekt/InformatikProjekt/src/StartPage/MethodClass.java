
package StartPage;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;


public class MethodClass {
    private static InfDB idb;
    
    
    
    
    public MethodClass(InfDB idb){
        
    
        
        
    }
    
<<<<<<< HEAD
        public static ArrayList<String> getComboBoxCategory(String katNamn,String katTabell,InfDB idb)
=======
        public static ArrayList<String> kategori1(String katNamn, String katTabell)
>>>>>>> 80701347930992dda05e41e06ea97423bba0eb6e
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
<<<<<<< HEAD

=======
                public static void Hamta(){
            //String fraga =  "Select ID,FNAMN,ENAMN from PERSONE";
            //ArrayList<HashMap<String,String>> svar = idb.fetchRows(fraga);
        }
    
>>>>>>> 80701347930992dda05e41e06ea97423bba0eb6e
}
