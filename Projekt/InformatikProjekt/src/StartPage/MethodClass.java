
package StartPage;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;


public class MethodClass {
    private static InfDB idb;
    
    
    
    
    public MethodClass(InfDB idb){
        
    
        
        
    }
    
//    private Point getPlats() { // Används inte men ser till att en ny ruta som öppnas öppnas över den förra istället för uppe i vänstra hörnet av skärmen
//        Point plats = new Point();
//        plats = this.getLocation();
//        return plats;
//    }
    
        public static ArrayList<String> kategori1(String katNamn, String katTabell)
    {
        try
        {
<<<<<<< HEAD
            String fraga = "Select '" + katNamn + "' from '" + katTabell + "';";
=======
            String fraga = "select " + katNamn + " from " + katTabell;
>>>>>>> fdf97cc772cef9d9ebc208520de5265ab78cc0fe
            ArrayList<String> allaKategorier1 = idb.fetchColumn(fraga);
            return allaKategorier1;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
        return null;

    }
                public static void Hamta(){
            //String fraga =  "Select ID,FNAMN,ENAMN from PERSONE";
            //ArrayList<HashMap<String,String>> svar = idb.fetchRows(fraga);
        }
    
}
