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

    public static ArrayList<String> getComboBox(String katNamn, String katTabell, InfDB idb) {
        try {
            System.out.println("fghjklöä");
            String fraga = "Select '" + katNamn + "' from '" + katTabell + "';";
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
