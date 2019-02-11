

package StartPage;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellin
 */
public class MethodService {
    
    private static InfDB idb;
    
    public MethodService(InfDB idb) {
        this.idb = idb;

    }
    
    public void setDesign(JTabbedPane oneTabbedPane) {
        for (int i = 0; i < oneTabbedPane.getTabCount(); i++) {
            oneTabbedPane.setBackgroundAt(i, Color.WHITE);
            oneTabbedPane.getComponentAt(i).setBackground(Color.WHITE);
        }
    }
    
    public void fillComboboxAllCategory1(JComboBox<String> enCombobox) {
        try {
            //Hämtar en lista på namnen på alla kategori1 i databasen
            ArrayList<HashMap<String, String>> categoryList = idb.fetchRows("SELECT kat1_ID FROM kat1");
            //Loopar igenom listan och lägger till alla kategorier till kategorilistan
            for (int i = 0; i < categoryList.size(); i++) {
                String categoryName = categoryList.get(i).get("KAt1_ID");
                enCombobox.addItem(categoryName);
            } 
        }
        catch (InfException oneException) {
            oneException.getMessage();
        }
        catch (NullPointerException anotherException) {
            anotherException.getMessage();
        }   
    }
    
    public void fillComboboxBranch (JComboBox<String> enCombobox) {
        try {
            //Hämtar en lista på kategorier på alla kategori1 i databasen
            ArrayList<HashMap<String, String>> categories = idb.fetchRows("SELECT kat2_namn FROM kat2");
            //Loopar igenom listan och lägger till alla kategorier i kategorilistan
            for (int i = 0; i < categories.size(); i++) {
                String oneCat = categories.get(i).get("KAT2_NAMN");
                enCombobox.addItem(oneCat);
            } 
        }
        catch (InfException oneException) {
            oneException.getMessage();
        }
        catch (NullPointerException anotherException) {
            anotherException.getMessage();
        }   
    }
    
        public void fillComboboxBranchKat1 (JComboBox<String> enCombobox) {
        try {
            //Hämtar en lista på kategorier på alla kategori1 i databasen
            ArrayList<HashMap<String, String>> categories = idb.fetchRows("SELECT kat1_namn FROM kat1");
            //Loopar igenom listan och lägger till alla kategorier i kategorilistan
            for (int i = 0; i < categories.size(); i++) {
                String oneCat = categories.get(i).get("KAT1_NAMN");
                enCombobox.addItem(oneCat);
            } 
        }
        catch (InfException oneException) {
            oneException.getMessage();
        }
        catch (NullPointerException anotherException) {
            anotherException.getMessage();
        }   
    }
        
        public void fillComboboxAllUsers(JComboBox<String> enCombobox) {
        try {
            //Hämtar en lista på förnamn och efternamn på alla elever i databasen
            ArrayList<HashMap<String, String>> userList = idb.fetchRows("SELECT fnamn, enamn FROM personer");
            //Loopar igenom listan och lägger till alla namn till elevlistan
            for (int i = 0; i < userList.size(); i++) {
                String firstname = userList.get(i).get("FNAMN");
                String surname = userList.get(i).get("ENAMN");
                enCombobox.addItem(firstname + " " + surname);
            } 
        }
        catch (InfException ettUndantag) {
            ettUndantag.getMessage();
        }
        catch (NullPointerException ettAnnatUndantag) {
            ettAnnatUndantag.getMessage();
        }   
    }
        
        public void fillComboboxAccessTypes (JComboBox<String> enCombobox) {
        try {
            //Hämtar en lista på alla behörigheter i databasen
            ArrayList<HashMap<String, String>> accessTypes = idb.fetchRows("SELECT behorighet FROM SYSTEMTILLGANG");
            //Loopar igenom listan och lägger till alla behörigheter i behörighetslistan
            for (int i = 0; i < accessTypes.size(); i++) {
                String oneCat = accessTypes.get(i).get("BEHORIGHET");
                enCombobox.addItem(oneCat);
            } 
        }
        catch (InfException oneException) {
            oneException.getMessage();
        }
        catch (NullPointerException anotherException) {
            anotherException.getMessage();
        }   
    }
        
}
