/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import com.jidesoft.swing.AutoCompletion;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author ellin
 */
public class EditBlogInternalFrame extends javax.swing.JInternalFrame {

    private static Connection con;
    private MethodService methodService;
    private String blogID;

    /**
     * Creates new form EditBlogInternalFrame
     */
    public EditBlogInternalFrame(Connection con) {
        initComponents();
        this.con = con;
        methodService = new MethodService(con);
        blogID = null;
        //Gör listan sökbar.
        AutoCompletion editablePostList = new AutoCompletion(cbPosts);
        //fillListWithPosts();
        mainPanel.setVisible(false);
        //Fyller listan med aktuella inlägg
        fillListWithYourPosts();
        
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
        cbPosts = new javax.swing.JComboBox<>();
        mainPanel = new javax.swing.JTabbedPane();
        textPanel = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        lblHeading = new javax.swing.JLabel();
        tfHeading = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taText = new javax.swing.JTextArea();
        lblChanges = new javax.swing.JLabel();
        lblChoosepostToEdit = new javax.swing.JLabel();
        btnChooseThisPost = new javax.swing.JButton();

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

        cbPosts.setEditable(true);
        cbPosts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a post" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblHeading.setText("Heading");

        tfHeading.setColumns(30);

        taText.setColumns(20);
        taText.setRows(5);
        jScrollPane1.setViewportView(taText);

        lblChanges.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChanges.setText("Your changes have been saved!");

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblHeading))
            .addGroup(textPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(tfHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(textPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(textPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblChanges)
                .addGap(504, 504, 504)
                .addComponent(btnSave))
        );
        textPanelLayout.setVerticalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHeading)
                .addGap(7, 7, 7)
                .addComponent(tfHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblChanges))
                    .addComponent(btnSave))
                .addGap(27, 27, 27))
        );

        mainPanel.addTab("Edit text", textPanel);

        lblChoosepostToEdit.setText("Choose a post to edit");

        btnChooseThisPost.setText("Choose this post");
        btnChooseThisPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseThisPostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChoosepostToEdit)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbPosts, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnChooseThisPost))
                    .addComponent(mainPanel))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblChoosepostToEdit)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cbPosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnChooseThisPost))
                .addGap(19, 19, 19)
                .addComponent(mainPanel)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


private void fillListWithYourPosts(){
    
    int personID = LoggedUser.getID();
    
    try {
        Statement stmt = con.createStatement();
        
            //Hämtar inläggen som användaren har skrivit
            ResultSet rs = stmt.executeQuery("SELECT titel FROM blogg WHERE bloggskribent =" + personID + ";");
            //Loopar igenom listan och lägger till alla namn på inläggen till inläggslistanlistan
            if (rs != null) {
            while (rs.next()) {
                String postName = rs.getString("TITEL");
                cbPosts.addItem(postName);
            }    
            }
            else {
                JOptionPane.showMessageDialog(null, "You haven't written any posts yet.");
     
            }
        }
        catch (SQLException oneException) {
                oneException.getMessage();
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
    } 
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Uppdaterar inlägget
        if (Validation.textfieldWithValue(tfHeading) && Validation.textareaWithValueTA(taText)) {
            //Lägger in värdena i de lokala variablerna
            String heading = tfHeading.getText();
            String text = taText.getText();
            String titel = cbPosts.getSelectedItem().toString();
            
            
            
            try {
                /*PreparedStatement ps = con.prepareStatement("SELECT ? FROM blogg  WHERE titel = ?");
                
                ps.setString(1, "bloggid");
                ps.setString(2, titel);
                
                ResultSet rs = ps.executeQuery();
                rs.next();
                String bloggid = rs.getString("bloggid");
                */
                
            
                //Uppdaterar blogginlägget med den nya titeln och texten
                Statement stmt = con.createStatement();
                String fraga = "UPDATE blogg SET titel = \'" + heading + "\', bloggpost = \'" + text + "\' WHERE bloggid = " + blogID;
                stmt.executeUpdate(fraga);
                
                lblChanges.setVisible(true);
                
            } 
            catch (SQLException oneException) {
                oneException.getMessage();
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }         
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnChooseThisPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseThisPostActionPerformed
        //Kontrollerar att sökfältet inte är tomt.
        if (Validation.elementSelectedInCombobox(cbPosts, "Choose a post")) {  
            String titel = cbPosts.getSelectedItem().toString();
            
            try {
                PreparedStatement ps = con.prepareStatement("SELECT ?, ? FROM blogg WHERE titel = ?");
               ps.setString(1, "bloggid");
               ps.setString(2, "bloggpost");
               ps.setString(3, titel);
               
               ResultSet rs = ps.executeQuery();
               
               String bloggpost = "";
              while(rs.next()){
                  blogID = rs.getString("bloggid");
                  bloggpost = rs.getString("bloggpost");
              }
                       
             
             //Fyller i de hämtade värdena i textrutorna för blogginlägget
            tfHeading.setText(titel);
            taText.setText(bloggpost);

            
            //Gör panelen synlig
            mainPanel.setVisible(true);
            //Döljer texterna med att ändringarna har sparats
            lblChanges.setVisible(false);

            }
            catch (SQLException ettUndantag) {
                ettUndantag.getMessage();
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            } 
        }
    }//GEN-LAST:event_btnChooseThisPostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseThisPost;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbPosts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChanges;
    private javax.swing.JLabel lblChoosepostToEdit;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTabbedPane mainPanel;
    private javax.swing.JTextArea taText;
    private javax.swing.JPanel textPanel;
    private javax.swing.JTextField tfHeading;
    // End of variables declaration//GEN-END:variables
}
