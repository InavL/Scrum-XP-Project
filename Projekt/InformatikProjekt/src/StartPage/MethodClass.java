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

//    private Point getPlats() { // Används inte men ser till att en ny ruta som öppnas öppnas över den förra istället för uppe i vänstra hörnet av skärmen
//        Point plats = new Point();
//        plats = this.getLocation();
//        return plats;
//    }
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

    //Gör en check om personen som är inloggad om den har admin status eller inte.
    public static boolean isAdmin() {

        int sid = LoggedUser.getBehorighet();
        System.out.println(sid);
        if (sid < 4) {
            return true;
        }
        return false;
    }

}
