package StartPage;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvin Johansson
 */
public class StartInfProj { // The program is run through this file

//    private static InfDB idb;
    private static Connection con;

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {

//        String driver = "";
//        String url = "jdbc:mysql://10.22.14.106:3306/scrumprojekt";
//        String username = "infop";
//        String password = "Green2019";
        
        windowsStil(); // Calls the method for setting up the design
//        con = null;
        
        try {
            
//            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.
                    getConnection("jdbc:mysql://10.22.1.54:3306/scrumprojekt",
                             "infop", "Blue2019");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
            
        } catch (/*ClassNotFoundException | */SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
        
        System.out.println("Funkar");
        
        // TODO Auto-generated catch block

//        try {
//
//            //String file = new File("IP.FDB").getAbsolutePath(); // Tells the program where the database is located
////            con = DriverManager.getConnection("jdbc:mysql://10.22.1.54:3306/scrumprojekt","infop","Blue2019"); // Tells the program where the database is located
//            con = createConnection(driver, url, username, password);
//            DatabaseMetaData meta = con.getMetaData();
//            System.out.println(meta.getDatabaseProductName());
//            System.out.println(meta.getDatabaseProductVersion());
//
//            String sqlQuery = "SELECT PERSON_ID, FIRST_NAME, LAST_NAME FROM PERSON ORDER BY LAST_NAME";
//            System.out.println("before insert: " + query(con, sqlQuery, Collections.EMPTY_LIST));
//
//            con.setAutoCommit(false);
//            String sqlUpdate = "INSERT INTO PERSON(FIRST_NAME, LAST_NAME) VALUES(?,?)";
//            List parameters = Arrays.asList( "Foo", "Bar" );
//        
//        } catch (SQLException ettUndantag) {
//            JOptionPane.showMessageDialog(null, "Error: Failed to establish connection to database. Woops.");
//            System.out.println("Internal error: " + ettUndantag.getMessage());
//        }

        new LoginWindow(con).setVisible(true);
    }

    private static void windowsStil() { // Innehåller designelement för Huvudfönstret

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Windows".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }

    }

}
