/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.sql.Connection;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellin
 */
public class CreateMeeting extends javax.swing.JInternalFrame {

    private static Connection con;
    private static InfDB idb;
    private MethodService methodService;
    private boolean dateFocused = false; // Used in focusGain
    private boolean startTimeFocused = false; // Used in focusGain
    private boolean endTimeFocused = false; // Used in focusGain

    /**
     * Creates new form EditBlogInternalFrame
     */
    public CreateMeeting(InfDB idb) {
        initComponents();
        this.idb = idb;
        methodService = new MethodService(con);
        skapaMote();
        //txtTitle.requestFocusInWindow(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnaddDateTime = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtStartTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEMail = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaEMail = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaDateTime = new javax.swing.JTextArea();
        AddEMail = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        txtEndTime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Create a new meeting.");

        jLabel3.setText("Title:");

        jLabel4.setText("Write the date and the time for the meeting.");

        jLabel5.setText("Date:");

        txtDate.setText("YYYY-MM-DD");
        txtDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateFocusGained(evt);
            }
        });

        btnaddDateTime.setText("Add");
        btnaddDateTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddDateTimeActionPerformed(evt);
            }
        });

        jLabel6.setText("Start time:");

        txtStartTime.setText("HH:MM");
        txtStartTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStartTimeFocusGained(evt);
            }
        });

        jLabel7.setText("Invite others to the meeting.");

        jLabel8.setText("E-mail:");

        txtAreaEMail.setColumns(20);
        txtAreaEMail.setRows(5);
        jScrollPane3.setViewportView(txtAreaEMail);

        txtAreaDateTime.setColumns(20);
        txtAreaDateTime.setRows(5);
        jScrollPane4.setViewportView(txtAreaDateTime);

        AddEMail.setText("Add");
        AddEMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEMailActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtEndTime.setText("HH:MM");
        txtEndTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEndTimeFocusGained(evt);
            }
        });

        jLabel9.setText("End time:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(58, 58, 58)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEndTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtStartTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnaddDateTime)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)))
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(72, 72, 72)
                                    .addComponent(AddEMail))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(txtEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddEMail)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtEndTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnaddDateTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void skapaMote() {
        try {
            String hogstaID = idb.fetchSingle("select MAX(MID) from MOTEN");
            int maxIdInt = Integer.parseInt(hogstaID);
            int maxInt = maxIdInt + 1;

            int userID = LoggedUser.getID();

            idb.insert("insert into MOTEN values(" + maxInt + ", " + userID + ", 'test', '01-01-01 00:00:00', '01-01-01 00:00:00');");

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }

    private void btnaddDateTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddDateTimeActionPerformed
        if (Validation.textfieldWithValue(txtDate) && Validation.textfieldWithValue(txtStartTime)) {
            String date = txtDate.getText();
            String startTime = txtStartTime.getText();
            String endTime = txtEndTime.getText();

            txtAreaDateTime.append(date + " " + startTime + " - " + date + " " + endTime + "\n");

            txtStartTime.setText("");
            txtEndTime.setText(" ");

            try {
                String hogstaID = idb.fetchSingle("select MAX(FORSLAGS_ID) from MOTES_FORSLAG");
                int maxIdInt = Integer.parseInt(hogstaID);
                int maxInt = maxIdInt + 1;

                String start = date + " " + startTime + ":00";
                String end = date + " " + endTime + ":00";

                String hamtaID = idb.fetchSingle("select max(MID) from MOTEN");

                idb.insert("insert into MOTES_FORSLAG values(" + maxInt + ", '" + hamtaID + "', '" + start + "', '" + end + "', 0);");
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_btnaddDateTimeActionPerformed

    private void btnAddEMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    }//GEN-LAST:event_btnAddActionPerformed

    private void AddEMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEMailActionPerformed
        if (Validation.textfieldWithValue(txtEMail) && Validation.emailExisting(txtEMail, idb)) {
            String eMail = txtEMail.getText();

            txtAreaEMail.append(eMail + "\n");
            txtEMail.setText("");

            try {
                String personID = idb.fetchSingle("select ID from PERSONER where MAIL = '" + eMail + "';");
                String motesID = idb.fetchSingle("select max(MID) from MOTEN");

                idb.insert("insert into PERSONER_DELTAR values('" + motesID + "', '" + personID + "');");

            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_AddEMailActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        if (Validation.textfieldWithValue(txtTitle)) {
            try {
                String titel = txtTitle.getText();
                String motesID = idb.fetchSingle("select max(MID) from MOTEN");

                idb.update("update MOTEN set TYP_AV_MOTE = '" + titel + "' where MID = " + motesID + ";");

                lblText.setText("The meeting request has been saved.");

            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateFocusGained
        if (dateFocused == false) { // If the field is focused the box is cleared
            txtDate.setText("");
            dateFocused = true;
        }
    }//GEN-LAST:event_txtDateFocusGained

    private void txtStartTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStartTimeFocusGained
        if (startTimeFocused == false) { // If the field is focused the box is cleared
            txtStartTime.setText("");
            startTimeFocused = true;
        }
    }//GEN-LAST:event_txtStartTimeFocusGained

    private void txtEndTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEndTimeFocusGained
        if (endTimeFocused == false) { // If the field is focused the box is cleared
            txtEndTime.setText("");
            endTimeFocused = true;
        }
    }//GEN-LAST:event_txtEndTimeFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEMail;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnaddDateTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblText;
    private javax.swing.JTextArea txtAreaDateTime;
    private javax.swing.JTextArea txtAreaEMail;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEMail;
    private javax.swing.JTextField txtEndTime;
    private javax.swing.JTextField txtStartTime;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
