package StartPage;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Sadeer
 */
// metod som leta efter bokstäverna a-z, A-Z och åäö / ÅÄÖ, inga andra tecken tillåts
public class Validation {

    public boolean one(String one) {
        String check = "[a-öA-Ö0-9 ]+";
        boolean b = one.matches(check);
        return b;

    }

    public boolean two(String two) {
        String check = "[0-9_.]+";
        boolean b = two.matches(check);
        return b;

    }

    public boolean three(String three) {
        String check = "-?[0-9]+";
        boolean b = three.matches(check);
        return b;

    }

    public boolean four(String four) {
        String check = "[a-öA-Ö]+";
        boolean b = four.matches(check);
        return b;

    }

    public boolean five(String five) {
        String check = "[a-öA-Ö0-9]+";
        boolean b = five.matches(check);
        return b;

    }

    //Kollar om textfältet har ett värde
    public static boolean textfieldWithValue(JTextField tf) {

        boolean value = true;

        if (tf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Textfältet är tomt!");
            tf.requestFocus();
            return false;
        }
        return value;
    }

    //Kollar om textfältet har ett värde
    public static boolean textareaWithValueTA(JTextArea ta) {

        boolean value = true;

        if (ta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Textfältet är tomt!");
            ta.requestFocus();
            return false;
        }
        return value;
    }

    public static boolean pwdFieldHasValue(JPasswordField rutaAttValidera) { // kontrollerar ifall det finns något värde i ett passwordfält

        boolean resultat = true;

        if (rutaAttValidera.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Lösenordsrutan är tom!");
            resultat = false;
        }

        return resultat;
    }

    //Kollar om ett element har valts i en combobox
    public static boolean elementSelectedInCombobox(JComboBox<String> enCombobox, String oneMessage) {

        boolean elementSelected = true;

        if (enCombobox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, oneMessage);
            enCombobox.requestFocusInWindow();
            return false;
        }
        return elementSelected;
    }

    public static boolean idTesting(JTextField id, InfDB idb) {
        
        //Kollar så att ID:et finns med i tabellen PERONSER.
        
        boolean resultat = true;

        try {
            String personID = id.getText(); //Hämta värdet i fältet.

            String fraga = "select FNAMN from PERSONER where ID = '" + personID + "';";
            String hamtatFornamn = idb.fetchSingle(fraga); 

            //Försöker att hämta förnamn som matchar ID:et.

            if (hamtatFornamn == null) { 
            //Kollar om värdet som man vill hämta finns.
            
                JOptionPane.showMessageDialog(null, "The ID is incorrect."); 
                //Om man får null som värde.

                resultat = false;
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
        return resultat;
    }
    
    
    //Kollar om man har valt ett värde i en jList
    public static boolean valtVarde(String text){
        boolean resultat=true;
            if(text==null){
                JOptionPane.showMessageDialog(null, "You must select an alternative");
                resultat=false;
        }
        return resultat;
    }
    
    //Kollar om textfältet är ett heltal.
    public static boolean textfaltTal(JTextField tf) {
   
        boolean ettTal = true; 
        
        try{
            String instring = tf.getText();
            Integer.parseInt(instring);   
            tf.requestFocus();  
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Use numbers!");
            ettTal = false;    
        }    
        return ettTal;
    }
    
    public static boolean isEmail(JTextField tf){
        
        boolean resultat = true;
        
        String instring =tf.getText();
            
        if(!instring.contains("@") && !instring.contains(".")){
                JOptionPane.showMessageDialog(null, "The email is incorrect");
                resultat=false;
        }
        return resultat;
    }
    
    public static boolean emailExisting(JTextField tf, InfDB idb)
    {
        boolean resultat = true;
        
        String instring = tf.getText();
        
        try
        {
            String test = idb.fetchSingle("select ID from PERSONER where MAIL = '" + instring + "';");
            
            if(test == null)
            {
                JOptionPane.showMessageDialog(null, "The email is incorrect");
                resultat = false;
            }
        }
        catch(InfException ex)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
        return resultat;
    }

}
