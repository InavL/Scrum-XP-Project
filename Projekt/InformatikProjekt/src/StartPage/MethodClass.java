package StartPage;

import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

public class MethodClass {

    private static InfDB idb;
    private Point plats = new Point();

    public MethodClass(InfDB idb) {

    }
<<<<<<< HEAD
    
//    private Point getPlats() { // Används inte men ser till att en ny ruta som öppnas öppnas över den förra istället för uppe i vänstra hörnet av skärmen
//        Point plats = new Point();
//        plats = this.getLocation();
//        return plats;
//    }
    
        public static ArrayList<String> getComboBox(String katNamn, String katTabell, InfDB idb)
    {
        try
        {
       // String fraga = "Select KAT1_NAMN from KAT1";    
        String fraga = "Select '" + katNamn + "' from '" + katTabell + "';";
=======

    public static ArrayList<String> getComboBox(String katNamn, String katTabell, InfDB idb) {
        try {
            System.out.println("fghjklöä");
            String fraga = "Select '" + katNamn + "' from '" + katTabell + "';";
>>>>>>> 013f67cbada38dd04b6271d7bb300aedd72aec6b
            ArrayList<String> allaKategorier1 = idb.fetchColumn(fraga);
            return allaKategorier1;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
        return null;

    }

    public static void Hamta() {
        //String fraga =  "Select ID,FNAMN,ENAMN from PERSONE";
        //ArrayList<HashMap<String,String>> svar = idb.fetchRows(fraga);
    }

}
