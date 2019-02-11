/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import com.jidesoft.swing.AutoCompletion;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AddNewEmployee extends javax.swing.JInternalFrame {

    private static InfDB idb;
    private MethodService methodService;
    private boolean firstNameFocused = false; // Used in focusGain
    private boolean lastNameFocused = false; // Used in focusGain
    private boolean mailFocused = false; // Used in focusGain
    private boolean phoneFocused = false; // Used in focusGain
    private boolean passFocused = false; // Used in focusGain

    /**
     * Creates new form EditBlogInternalFrame
     */
    public AddNewEmployee(InfDB idb) {
        initComponents();
        this.idb = idb;
        methodService = new MethodService(idb);
        //fillCombobox();
        comboboxAlternatives();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAddNewEmployee = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        jLabelSureName = new javax.swing.JLabel();
        jLabelEmailAdress = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jLabelAccessType = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jAccessType = new javax.swing.JComboBox();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonSaveNewEmployee = new javax.swing.JButton();
        jLabeltextMessage = new javax.swing.JLabel();
        lEmployeeAdded = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Örebro universitet");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        lblAddNewEmployee.setFont(lblAddNewEmployee.getFont().deriveFont(lblAddNewEmployee.getFont().getStyle() | java.awt.Font.BOLD, lblAddNewEmployee.getFont().getSize()+5));
        lblAddNewEmployee.setText("Add new employee");

        jLabelSureName.setText("Last name:");

        jLabelEmailAdress.setText("E-Mail:");

        jLabelPhoneNumber.setText("Phone number:");

        jLabelAccessType.setText("Access type:");

        jTextFieldLastName.setText("Your last name");
        jTextFieldLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldLastNameFocusGained(evt);
            }
        });

        jTextFieldMail.setText("email@example.com");
        jTextFieldMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldMailFocusGained(evt);
            }
        });

        jTextFieldPhone.setText("0X-XX XXX XX");
        jTextFieldPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPhoneFocusGained(evt);
            }
        });

        jAccessType.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelFirstName.setText("First name:");

        jTextFieldFirstName.setText("Your first name");
        jTextFieldFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFirstNameFocusGained(evt);
            }
        });

        jLabelPassword.setText("Password:");

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });

        jButtonSaveNewEmployee.setText("Save");
        jButtonSaveNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveNewEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(lblAddNewEmployee))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategory)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSureName)
                                    .addComponent(jLabelEmailAdress)
                                    .addComponent(jLabelPhoneNumber)
                                    .addComponent(jLabelAccessType)
                                    .addComponent(jLabelFirstName)
                                    .addComponent(jLabelPassword))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldLastName)
                                            .addComponent(jTextFieldPhone)
                                            .addComponent(jTextFieldMail)
                                            .addComponent(jAccessType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldFirstName)
                                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabeltextMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButtonSaveNewEmployee)
                        .addGap(89, 89, 89)
                        .addComponent(lEmployeeAdded)))
                .addContainerGap(467, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(lblCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddNewEmployee)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSureName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmailAdress)
                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNumber)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAccessType)
                    .addComponent(jAccessType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveNewEmployee)
                    .addComponent(lEmployeeAdded))
                .addGap(46, 46, 46)
                .addComponent(jLabeltextMessage)
                .addGap(0, 85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveNewEmployeeActionPerformed
        //Metoden skapar nya användare.
        if (Validation.textfieldWithValue(jTextFieldMail) && Validation.isValidEmailAddress(jTextFieldMail.getText()) && Validation.textfieldWithValue(jTextFieldPhone)
                && Validation.textfaltTal(jTextFieldPhone) && Validation.textfieldWithValue(jTextFieldFirstName) && Validation.textfieldWithValue(jTextFieldLastName)
                && Validation.textfieldWithValue(jPasswordField1)) {
            
            try {
                
                int id = createId();
                String phonenumber = jTextFieldPhone.getText();
                String mail = jTextFieldMail.getText();
                String firstname = jTextFieldFirstName.getText();
                String lastname = jTextFieldLastName.getText();
                String password = jPasswordField1.getText();
                String access = jAccessType.getSelectedItem().toString();
                String sid = getSID(access);

                String fraga1 = "select MAIL from PERSONER where MAIL = '" + mail + "';";
                String checkMail = idb.fetchSingle(fraga1);

                String fraga2 = "select TELEFON from PERSONER where TELEFON = '" + phonenumber + "';";
                String checkPhonenumber = idb.fetchSingle(fraga2);

                if (!mail.equals(checkMail) && !phonenumber.equals(checkPhonenumber)) {
                    
                    String question = "insert into PERSONER (ID,FNAMN,ENAMN,MAIL,TELEFON,SID,LOSENORD) values"
                            + "(" + id + ",'" + firstname + "','" + lastname + "','" + mail + "'," + phonenumber + "," + sid + ",'" + password + "');";
                    System.out.println(question);
                    idb.insert(question);

                    lEmployeeAdded.setText("The person is now added to the employee list.");
                    
                } else if (mail.equals(checkMail)) {
                    JOptionPane.showMessageDialog(null, "E-Mail is already in use!");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Phonenumber is allready in use!");
                    
                }

            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }

    private void comboboxAlternatives() {

        int sid = LoggedUser.getBehorighet();

        switch (sid) {
            case 1:
                System.out.println("SID");
                fillCombobox();
                break;
            case 2:
                System.out.println("SID");
                fillComboboxEducation();

                break;
            case 3:
                System.out.println("SID");
                fillComboboxResearch();
                break;

        }
    }

    private void fillComboboxEducation() {
        try {
            String fraga = "select BEHORIGHET from SYSTEMTILLGANG where SID = 3 or SID = 4 or SID = 6";
            ArrayList<String> svar = idb.fetchColumn(fraga);
            for (String oneBox : svar) {
                jAccessType.addItem(oneBox);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }

    private void fillComboboxResearch() {
        try {
            String fraga = "select BEHORIGHET from SYSTEMTILLGANG where SID = 2 or SID = 5";
            ArrayList<String> svar = idb.fetchColumn(fraga);
            for (String oneBox : svar) {
                jAccessType.addItem(oneBox);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }//GEN-LAST:event_jButtonSaveNewEmployeeActionPerformed

//Metoden kollar igenom databasen och ser över vilket id i person tabellen som är ledigt.
    private int createId() {
        try {
            String svar = "";
            int id = 0;
            while (svar != null) {
                id++;
                String fraga = "select ID from PERSONER"
                        + " where ID =" + id;
                svar = idb.fetchSingle(fraga);
            }
            return id;
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong!");
            System.out.println("Internt felmeddelande" + e.getMessage());
            return 0;
        }

    }

    //Metoden fyller comboboxen vad för användare som finns i databasen.
    private void fillCombobox() {

        try {
            String fraga = "select BEHORIGHET from SYSTEMTILLGANG";
            ArrayList<String> svar = idb.fetchColumn(fraga);
            for (String oneBox : svar) {
                jAccessType.addItem(oneBox);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }

    //Metoden jämför namnet den användare man ska skapa och hämtar ut SID och skickar tillbaka det.
    private String getSID(String access) {
        try {
            String fraga = "SELECT SID from SYSTEMTILLGANG where behorighet ='" + access + "'";
            System.out.println(fraga);
            String sid = idb.fetchSingle(fraga);
            System.out.println(sid);
            return sid;
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
        return "";
    }
    private void jTextFieldFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameFocusGained

        if (firstNameFocused == false) { // If the field is focused the box is cleared
            jTextFieldFirstName.setText("");
            firstNameFocused = true;
        }

    }//GEN-LAST:event_jTextFieldFirstNameFocusGained

    private void jTextFieldLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLastNameFocusGained

        if (lastNameFocused == false) { // If the field is focused the box is cleared
            jTextFieldLastName.setText("");
            lastNameFocused = true;
        }

    }//GEN-LAST:event_jTextFieldLastNameFocusGained

    private void jTextFieldMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMailFocusGained

        if (mailFocused == false) { // If the field is focused the box is cleared
            jTextFieldMail.setText("");
            mailFocused = true;
        }

    }//GEN-LAST:event_jTextFieldMailFocusGained

    private void jTextFieldPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPhoneFocusGained

        if (phoneFocused == false) { // If the field is focused the box is cleared
            jTextFieldPhone.setText("");
            phoneFocused = true;
        }

    }//GEN-LAST:event_jTextFieldPhoneFocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained

        if (passFocused == false) { // If the field is focused the box is cleared
            jPasswordField1.setText("");
            passFocused = true;
        }

    }//GEN-LAST:event_jPasswordField1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jAccessType;
    private javax.swing.JButton jButtonSaveNewEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAccessType;
    private javax.swing.JLabel jLabelEmailAdress;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelSureName;
    private javax.swing.JLabel jLabeltextMessage;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JLabel lEmployeeAdded;
    private javax.swing.JLabel lblAddNewEmployee;
    private javax.swing.JLabel lblCategory;
    // End of variables declaration//GEN-END:variables
}
