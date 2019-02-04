
package StartPage;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;


public class MethodClass {

    
    
    public MethodClass(){
        
    
        
        
    }
    
<<<<<<< HEAD
        public static ArrayList<String> kategori1(String katNamn, String katTabell,InfDB idb)
=======
<<<<<<< HEAD
        public static ArrayList<String> getComboBoxCategory(String katNamn,String katTabell,InfDB idb)
=======
        public static ArrayList<String> kategori1(String katNamn, String katTabell)
>>>>>>> 80701347930992dda05e41e06ea97423bba0eb6e
>>>>>>> fdd0a75eb3cc89c68f19ff38c6c09194a9221951
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
