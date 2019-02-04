/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;








import java.awt.Point;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author krist
 */
public class Inloggning extends javax.swing.JFrame {

    private Point plats = new Point();
    private final InfDB idb;
    private static int inloggad = 0;
    
    /**
     * Creates new form Inlogging
     */
    public Inloggning(InfDB idb) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.idb = idb;
    }
    
    private Point getPlats() { // Används inte men ser till att en ny ruta som öppnas öppnas över den förra istället för uppe i vänstra hörnet av skärmen
        plats = this.getLocation();
        return plats;
    }
    
    public static int getInloggad(){ // en funktion för att andra klasser ska kunna ha koll på vilken behörighet användaren har
        return inloggad;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pwdLosen = new javax.swing.JPasswordField();
        tfMail = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtMail = new javax.swing.JLabel();
        txtLosen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pwdLosen.setText("1234567890");

        tfMail.setText("exempel@oru.se");

        btnLogin.setText("Log in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtMail.setText("E-mail");

        txtLosen.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMail)
                    .addComponent(txtLosen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        if (Validation.textfieldWithValue(tfMail) && Validation.pwdFieldHasValue(pwdLosen) == true) {
            try {
                
                String mail = txtMail.getText();
                String pwd = String.valueOf(pwdLosen.getPassword());
                String query = "SELECT LOSENORD from PERSONER where MAIL =" + mail;
                String svar = idb.fetchSingle(query);
                String queryBehorighet = "SELECT SID from PERSONER where MAIL =" + mail;
                String svarBehorighet = idb.fetchSingle(queryBehorighet);
                
                if (pwd.equals(svar)) {
                    new MainPage(idb).setVisible(true);
                    int svBehorighet = Integer.parseInt(svarBehorighet);
                    inloggad = svBehorighet;
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Fel användarnamn och lösenordskombination.");
                }
                
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen! Skrev du fel användarnamn och lösenordskombination?");
                System.out.println("Internt felmeddelande " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField pwdLosen;
    private javax.swing.JTextField tfMail;
    private javax.swing.JLabel txtLosen;
    private javax.swing.JLabel txtMail;
    // End of variables declaration//GEN-END:variables
}
