/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import com.jidesoft.swing.AutoCompletion;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellin
 */
public class CreateBlogInternalFrame extends javax.swing.JInternalFrame {
    
    private static InfDB idb;
    private MethodService methodService;

    /**
     * Creates new form EditBlogInternalFrame
     */
    public CreateBlogInternalFrame(InfDB idb) {
        initComponents();
        this.idb = idb;
        methodService = new MethodService(idb);
        //pnlMainPanel.setVisible(false);
        methodService.fillComboboxBranch(cbBranch);
        methodService.fillComboboxBranchKat1(cbxKat1);
        
        //Gör listan sökbar.
        AutoCompletion editableBranchList = new AutoCompletion(cbBranch);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlMainPanel = new javax.swing.JPanel();
        btnPublish = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        tfHeading = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taText = new javax.swing.JTextArea();
        cbBranch = new javax.swing.JComboBox<>();
        lblChoosePlace = new javax.swing.JLabel();
        cbxKat2 = new javax.swing.JComboBox<>();
        cbxKat1 = new javax.swing.JComboBox<>();
        btnSave2 = new javax.swing.JButton();
        btnSave1 = new javax.swing.JButton();
        txtAdd = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        btnPublish.setText("Publish");
        btnPublish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishActionPerformed(evt);
            }
        });

        lblHeading.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHeading.setText("Heading");

        tfHeading.setColumns(30);

        taText.setColumns(20);
        taText.setRows(5);
        jScrollPane1.setViewportView(taText);

        cbBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose branch" }));
        cbBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBranchActionPerformed(evt);
            }
        });

        lblChoosePlace.setText("Choose the place to store the post:");

        cbxKat2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose topic" }));

        cbxKat1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose category" }));

        btnSave2.setText("Save");
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });

        btnSave1.setText("Save");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainPanelLayout = new javax.swing.GroupLayout(pnlMainPanel);
        pnlMainPanel.setLayout(pnlMainPanelLayout);
        pnlMainPanelLayout.setHorizontalGroup(
            pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addComponent(btnPublish)
                        .addGap(50, 50, 50))
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHeading))
                                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                                        .addGap(249, 249, 249)
                                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbxKat2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSave2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                                        .addGap(250, 250, 250)
                                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblChoosePlace)
                                            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                                                .addComponent(cbxKat1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSave1)))))))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );
        pnlMainPanelLayout.setVerticalGroup(
            pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPanelLayout.createSequentialGroup()
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblChoosePlace)
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxKat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSave2)
                            .addComponent(cbxKat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblHeading)))
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tfHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPublish)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Write post");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setText("-------------------------------------------------------------------------------------------------------------------------");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(pnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(pnlMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPublishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishActionPerformed
        //Kontrollerar att användaren har skrivit någoi i textfälten
        if (Validation.textfieldWithValue(tfHeading) && Validation.textareaWithValueTA(taText) && Validation.elementSelectedInCombobox(cbBranch, "Branch is not choosen, please select an option.")) {
            String titel = tfHeading.getText();
            String bloggpost = taText.getText();
            int personID = LoggedUser.getID();
            String namn = cbBranch.getSelectedItem().toString();
            
            Date datum=  new Date();
             int dag = datum.getDate();
             int manad = datum.getMonth();
             int rattManad = manad + 1;
             
             int ar = datum.getYear();
             int rattAr = ar + 1900;
             
             String dagen = Integer.toString(dag);
             String manaden = Integer.toString(rattManad);
             String aret = Integer.toString(rattAr);
             
             String datumet = (aret + "-" + manaden + "-" + dagen);
             
             

            
            try {
            String kat3 = idb.fetchSingle("SELECT kat3_ID FROM Kat3 WHERE Kat3_Namn = \'" + namn + "\'");
            
            //Hämtar ett nytt oanvänt bloggID
            String bloggID = idb.getAutoIncrement("blogg", "bloggid");
            
            //Lägger till inlägget i bloggtabellen med de valda värdena
                idb.insert("INSERT INTO blogg (bloggid, bloggpost, titel, datum, kat3_ID, bloggskribent) \n" +
                "VALUES (" + bloggID + ", \'" + bloggpost + "\', \'" + titel + "\', \'" + datumet + "\', \'" + kat3 + "\', " + personID + ")");
                
                tfHeading.setText("");
                taText.setText("");
                //pnlMainPanel.setVisible(false);
            
            }
            catch (InfException oneException) {
                oneException.getMessage();
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            } 
            
        }
    }//GEN-LAST:event_btnPublishActionPerformed

    private void cbBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBranchActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        if(Validation.elementSelectedInCombobox(cbxKat1, "Choose category."))
        {
            String index = cbxKat2.getItemAt(0);
            cbxKat2.removeAllItems();
            cbxKat2.addItem(index);
            
            String kat1 = cbxKat1.getSelectedItem().toString();
            
            try{
            
            String hittaKat2 = "select KAT2_NAMN from KAT2 join KAT1 on KAT2.KAT1_ID = KAT1.KAT1_ID where KAT1_NAMN = '" + kat1 + "';";
            
            ArrayList<HashMap<String, String>> kategorier2 = idb.fetchRows(hittaKat2);
            
            for(int i = 0; i < kategorier2.size(); i ++)
            {
                String oneCat = kategorier2.get(i).get("KAT2_NAMN");
                cbxKat2.addItem(oneCat);
            }
            }
            catch(InfException ex)
            {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed
         if(Validation.elementSelectedInCombobox(cbxKat2, "Choose category."))
        {
            String index = cbBranch.getItemAt(0);
            cbBranch.removeAllItems();
            cbBranch.addItem(index);
            
            
            String kat2 = cbxKat2.getSelectedItem().toString();
            
            try{
            
            String hittaKat3 = "select KAT3_NAMN from KAT3 join KAT2 on KAT3.KAT2_ID = KAT2.KAT2_ID where KAT2_NAMN = '" + kat2 + "';";
            
            ArrayList<HashMap<String, String>> kategorier3 = idb.fetchRows(hittaKat3);
            
            for(int i = 0; i < kategorier3.size(); i ++)
            {
                String oneCat = kategorier3.get(i).get("KAT3_NAMN");
                cbBranch.addItem(oneCat);
            }
            }
            catch(InfException ex)
            {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_btnSave2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(Validation.textfieldWithValue(txtAdd) && Validation.elementSelectedInCombobox(cbxKat2, "Choose topic."))
        {
            try
            {
                String nyBranch = txtAdd.getText();
                String kat2 = cbxKat2.getSelectedItem().toString();
                
                String idKat2 = idb.fetchSingle("select KAT2_ID from KAT2 where Kat2_NAMN = '" + kat2 + "';");
                
                
                String kat3ID = idb.getAutoIncrement("KAT3", "KAT3_ID");
                
                idb.insert("insert into KAT3 values('" + kat3ID + "', '" + idKat2 + "', '" + nyBranch + "');");
                
                JOptionPane.showMessageDialog(null, "The new branch has now been saved.");
                
                txtAdd.setText("");
                
                String index = cbBranch.getItemAt(0);
            cbBranch.removeAllItems();
            cbBranch.addItem(index);
            
            String hittaKat3 = "select KAT3_NAMN from KAT3 join KAT2 on KAT3.KAT2_ID = KAT2.KAT2_ID where KAT2_NAMN = '" + kat2 + "';";
            
            ArrayList<HashMap<String, String>> kategorier3 = idb.fetchRows(hittaKat3);
            
            for(int i = 0; i < kategorier3.size(); i ++)
            {
                String oneCat = kategorier3.get(i).get("KAT3_NAMN");
                cbBranch.addItem(oneCat);
            
            }
            }
            
            catch(InfException ex)
            {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPublish;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnSave2;
    private javax.swing.JComboBox<String> cbBranch;
    private javax.swing.JComboBox<String> cbxKat1;
    private javax.swing.JComboBox<String> cbxKat2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChoosePlace;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JPanel pnlMainPanel;
    private javax.swing.JTextArea taText;
    private javax.swing.JTextField tfHeading;
    private javax.swing.JTextField txtAdd;
    // End of variables declaration//GEN-END:variables
}
