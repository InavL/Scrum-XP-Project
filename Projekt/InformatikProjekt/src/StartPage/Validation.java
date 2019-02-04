
package StartPage;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
<<<<<<< HEAD
=======
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
>>>>>>> 80701347930992dda05e41e06ea97423bba0eb6e
import javax.swing.JTextField;

/**
 *
 * @author Sadeer
 */
// metod som leta efter bokstäverna a-z, A-Z och åäö / ÅÄÖ, inga andra tecken tillåts
public class Validation {
    
   
        public boolean one(String one){
        String check = "[a-öA-Ö0-9 ]+";
        boolean b = one.matches(check);
        return b;
        
    }
   
    public boolean two(String two){
        String check = "[0-9_.]+";
        boolean b = two.matches(check);
        return b;
        
    }
   
    
    public boolean three(String three){
        String check = "-?[0-9]+";
        boolean b = three.matches(check);
        return b;
        
    }
   
    public boolean four(String four){
        String check = "[a-öA-Ö]+";
        boolean b = four.matches(check);
        return b;
        
    }
    
    public boolean five(String five){
        String check = "[a-öA-Ö0-9]+";
        boolean b = five.matches(check);
        return b;
        
    }
    
    //Kollar om textfältet har ett värde
    public static boolean textfieldWithValue(JTextField tf) {
        
        boolean value = true;
        
        if(tf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Textfältet är tomt!");
            tf.requestFocus();
            return false;
        } 
        return value;
<<<<<<< HEAD
    }  
=======
    }
    
    //Kollar om textfältet har ett värde
    public static boolean textareaWithValue(JTextArea ta) {

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

>>>>>>> 80701347930992dda05e41e06ea97423bba0eb6e
    //Kollar om ett element har valts i en combobox
    public static boolean elementSelectedInCombobox(JComboBox<String> enCombobox, String oneMessage) {
        boolean elementSelected = true;
        if(enCombobox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, oneMessage);
            enCombobox.requestFocusInWindow();
            return false;
        }
        return elementSelected;
    }
<<<<<<< HEAD
      
}
    
=======
    
    
}


>>>>>>> 80701347930992dda05e41e06ea97423bba0eb6e
