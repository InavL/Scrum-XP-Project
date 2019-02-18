package StartPage;

import java.awt.Point;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

public class MethodClass {

    private static Connection con;
    private Point plats = new Point();

    public MethodClass(Connection con) {

    }

//    private Point getPlats() { // Används inte men ser till att en ny ruta som öppnas öppnas över den förra istället för uppe i vänstra hörnet av skärmen
//        Point plats = new Point();
//        plats = this.getLocation();
//        return plats;
//    }
    public static ResultSet getComboBox(String katNamn, String katTabell, Connection con) {
        try {
            Statement stmt = null;
            String fraga = null;
            
            stmt = con.createStatement();
            
            fraga = "Select '" + katNamn + "' from '" + katTabell + "';";

            ResultSet rs = stmt.executeQuery(fraga);
            return rs;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
        return null;

    }

    //Gör en check om personen som är inloggad om den har admin status eller inte.
    public static boolean isAdmin() {

        int sid = LoggedUser.getBehorighet();
        if (sid < 4) {
            return true;
        }
        return false;
    }

}
