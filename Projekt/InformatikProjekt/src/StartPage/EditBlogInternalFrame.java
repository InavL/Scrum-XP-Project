/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import com.jidesoft.swing.AutoCompletion;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellin
 */
public class EditBlogInternalFrame extends javax.swing.JInternalFrame {
    
    private static InfDB idb;
    private MethodService methodService;
    private String blogID;

    /**
     * Creates new form EditBlogInternalFrame
     */
    public EditBlogInternalFrame(InfDB idb) {
        initComponents();
        this.idb = idb;
        methodService = new MethodService(idb);
        blogID = null;
        //Gör listan sökbar.
        AutoCompletion editablePostList = new AutoCompletion(cbPosts);
        //fillListWithPosts();
        mainPanel.setVisible(false);
        //Fyller listan med aktuella inlägg
        fillListWithPosts();
        
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
        categoryPanel1 = new javax.swing.JPanel();
        lblDescription1 = new javax.swing.JLabel();
        lblBranch = new javax.swing.JLabel();
        cbMainCategory1 = new javax.swing.JComboBox<>();
        lblMainCategory1 = new javax.swing.JLabel();
        cbSubcategory1 = new javax.swing.JComboBox<>();
        lblTopic = new javax.swing.JLabel();
        cbSubSubcategory1 = new javax.swing.JComboBox<>();
        btnSave3 = new javax.swing.JButton();
        lblChanges2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblChoosepostToEdit = new javax.swing.JLabel();
        btnChooseThisPost = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        cbPosts.setEditable(true);
        cbPosts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a post" }));
        jPanel1.add(cbPosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 131, 265, -1));

        textPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        textPanel.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, -1, -1));

        lblHeading.setText("Heading");
        textPanel.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 28, -1, -1));

        tfHeading.setColumns(30);
        textPanel.add(tfHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 51, 302, -1));

        taText.setColumns(20);
        taText.setRows(5);
        jScrollPane1.setViewportView(taText);

        textPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 106, 770, 238));

        lblChanges.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChanges.setText("Your changes have been saved!");
        textPanel.add(lblChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        mainPanel.addTab("Edit text", textPanel);

        categoryPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescription1.setText("Choose categories to place your post in another place");
        categoryPanel1.add(lblDescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 41, -1, -1));

        lblBranch.setText("Branch");
        categoryPanel1.add(lblBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 294, -1, -1));

        cbMainCategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a category" }));
        categoryPanel1.add(cbMainCategory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 151, -1, -1));

        lblMainCategory1.setText("Category");
        categoryPanel1.add(lblMainCategory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 128, -1, -1));

        cbSubcategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a topic" }));
        categoryPanel1.add(cbSubcategory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 233, 133, -1));

        lblTopic.setText("Topic");
        categoryPanel1.add(lblTopic, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 210, -1, -1));

        cbSubSubcategory1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a branch" }));
        categoryPanel1.add(cbSubSubcategory1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 317, 133, -1));

        btnSave3.setText("Save");
        categoryPanel1.add(btnSave3, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 367, -1, -1));

        lblChanges2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChanges2.setText("Your changes have been saved!");
        categoryPanel1.add(lblChanges2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 370, -1, -1));

        btnNext.setText("Next");
        categoryPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 367, -1, -1));

        btnBack.setText("Back");
        categoryPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 367, -1, -1));

        mainPanel.addTab("Edit category", categoryPanel1);

        jPanel1.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 181, 870, 470));

        lblChoosepostToEdit.setText("Choose a post to edit");
        jPanel1.add(lblChoosepostToEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 107, -1, -1));

        btnChooseThisPost.setText("Choose this post");
        btnChooseThisPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseThisPostActionPerformed(evt);
            }
        });
        jPanel1.add(btnChooseThisPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ATT GÖRA:
    //1. Fyll comboboxen med inlägg X
    //2. btnCHoose this post Fyll alla fält, comboboxar och areor med värden X
    //3. Save >
    //4. Save
    //5. Back
    //6. Next


private void fillListWithPosts(){
    
    int personID = LoginWindow.getID();
    
    try {
            //Hämtar inläggen som användaren har skrivit
            ArrayList<HashMap<String, String>> posts = idb.fetchRows("SELECT titel FROM blogg WHERE bloggskribent =" + personID + ";");
            //Loopar igenom listan och lägger till alla namn på inläggen till inläggslistanlistan
            if (posts != null) {
            for (int i = 0; i < posts.size(); i++) {
                String postName = posts.get(i).get("TITEL");
                cbPosts.addItem(postName);
            }    
            }
            else {
                JOptionPane.showMessageDialog(null, "You haven't written any posts yet.");
     
            }
        }
        catch (InfException ettUndantag) {
                ettUndantag.getMessage();
                JOptionPane.showMessageDialog(null, "Något gick fel.");
            }
    } 
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Uppdaterar inlägget
        if (Validation.textfieldWithValue(tfHeading) && Validation.textareaWithValue(taText)) {
            //Lägger in värdena i de lokala variablerna
            String heading = tfHeading.getText();
            String text = taText.getText();
            String titel = cbPosts.getSelectedItem().toString();
            
            
            try {
                String bloggID = idb.fetchSingle("SELECT bloggid FROM blogg  WHERE titel = \'" + titel + "\'");
                //Uppdaterar blogginlägget med den nya titeln och texten
                idb.update("UPDATE blogg SET titel = \'" + heading + "\', bloggpost = \'" + text + "\' WHERE bloggid = " + bloggID);
                
                lblChanges.setVisible(true);
                
            } 
            catch (InfException ettUndantag) {
                ettUndantag.getMessage();
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }         
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnChooseThisPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseThisPostActionPerformed
        //Kontrollerar att sökfältet inte är tomt.
        if (Validation.elementSelectedInCombobox(cbPosts, "Choose a post")) {  
            String titel = cbPosts.getSelectedItem().toString();
            try {
             HashMap<String, String> postInfo = idb.fetchRow("SELECT bloggID, bloggpost FROM blogg \n" +
                    "WHERE titel = \'" + titel + "\'");
             
             //Fyller i de hämtade värdena i textrutorna för blogginlägget
            tfHeading.setText(titel);
            taText.setText(postInfo.get("BLOGGPOST"));
            blogID = postInfo.get("bloggID");
            
            //Gör panelen synlig
            mainPanel.setVisible(true);
            //Döljer texterna med att ändringarna har sparats
            lblChanges.setVisible(false);
            lblChanges2.setVisible(false);
            }
            catch (InfException ettUndantag) {
                ettUndantag.getMessage();
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            } 
        }
    }//GEN-LAST:event_btnChooseThisPostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChooseThisPost;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave3;
    private javax.swing.JPanel categoryPanel1;
    private javax.swing.JComboBox<String> cbMainCategory1;
    private javax.swing.JComboBox<String> cbPosts;
    private javax.swing.JComboBox<String> cbSubSubcategory1;
    private javax.swing.JComboBox<String> cbSubcategory1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBranch;
    private javax.swing.JLabel lblChanges;
    private javax.swing.JLabel lblChanges2;
    private javax.swing.JLabel lblChoosepostToEdit;
    private javax.swing.JLabel lblDescription1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblMainCategory1;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JTabbedPane mainPanel;
    private javax.swing.JTextArea taText;
    private javax.swing.JPanel textPanel;
    private javax.swing.JTextField tfHeading;
    // End of variables declaration//GEN-END:variables
}
