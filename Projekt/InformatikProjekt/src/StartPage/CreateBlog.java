/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author krist
 */
public class CreateBlog extends javax.swing.JFrame {

    private static InfDB idb;
    
    /**
     * Creates new form ColorPage
     */
    public CreateBlog(InfDB idb) {
        
        initComponents();
        this.idb = idb;
<<<<<<< HEAD
        kategori1();
=======

        kategori3();
>>>>>>> 1070d535e668d58e4748df95e32c642885375a0e
        
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
        pnlBlue = new javax.swing.JPanel();
        lblOrebroUniversitet = new javax.swing.JLabel();
        txtHeading = new javax.swing.JTextField();
        lblWrritePost = new javax.swing.JLabel();
        lblavskiljare = new javax.swing.JLabel();
        lblHeadeing = new javax.swing.JLabel();
        cbxInterface = new javax.swing.JComboBox<>();
        cbxSize = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtText = new javax.swing.JTextArea();
        btbAddPicture = new javax.swing.JButton();
        btnAddFile = new javax.swing.JButton();
        btnPublish = new javax.swing.JButton();
        cbxKat1 = new javax.swing.JComboBox<>();
        cbxKat2 = new javax.swing.JComboBox<>();
        cbxKat3 = new javax.swing.JComboBox<>();
        txtNewTag = new javax.swing.JTextField();
        lblTags = new javax.swing.JLabel();
        lblNewTag = new javax.swing.JLabel();
        lblInterface = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        mMenybar = new javax.swing.JMenuBar();
        mMainMenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        mBlog = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlBlue.setBackground(new java.awt.Color(51, 153, 255));

        lblOrebroUniversitet.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblOrebroUniversitet.setText("Örebro universitet");

        javax.swing.GroupLayout pnlBlueLayout = new javax.swing.GroupLayout(pnlBlue);
        pnlBlue.setLayout(pnlBlueLayout);
        pnlBlueLayout.setHorizontalGroup(
            pnlBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrebroUniversitet, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBlueLayout.setVerticalGroup(
            pnlBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBlueLayout.createSequentialGroup()
                .addComponent(lblOrebroUniversitet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        txtHeading.setColumns(15);
        txtHeading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeadingActionPerformed(evt);
            }
        });

        lblWrritePost.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblWrritePost.setText("Write post");

        lblavskiljare.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblavskiljare.setText("-------------------------------------------------------------------------------------------------------------------------------");

        lblHeadeing.setText("Heading");

        cbxInterface.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtText.setColumns(20);
        txtText.setRows(5);
        jScrollPane1.setViewportView(txtText);

        btbAddPicture.setText("Add picture");

        btnAddFile.setText("Add file");

        btnPublish.setBackground(new java.awt.Color(255, 0, 51));
        btnPublish.setText("Publish");
        btnPublish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishActionPerformed(evt);
            }
        });

        cbxKat1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxKat2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxKat3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNewTag.setColumns(8);

        lblTags.setText("Tags");

        lblNewTag.setText("New tag");

        lblInterface.setText("Interface");

        lblSize.setText("Size");

        btnAdd.setText("Add");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeadeing)
                            .addComponent(btnPublish, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxInterface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInterface))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(btbAddPicture)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddFile, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblSize))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxKat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxKat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxKat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTags))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNewTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAdd))
                                    .addComponent(lblNewTag))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtHeading)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblWrritePost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblavskiljare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWrritePost)
                    .addComponent(lblavskiljare))
                .addGap(26, 26, 26)
                .addComponent(lblHeadeing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTags)
                    .addComponent(lblNewTag)
                    .addComponent(lblInterface)
                    .addComponent(lblSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxInterface, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbAddPicture)
                    .addComponent(btnAddFile)
                    .addComponent(cbxKat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxKat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxKat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnPublish, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        mMainMenu.setText("Main menu");

        jMenuItem4.setText("Logg out");
        mMainMenu.add(jMenuItem4);

        jMenuItem5.setText("Exit");
        mMainMenu.add(jMenuItem5);

        mMenybar.add(mMainMenu);

        mBlog.setText("Blog");

        jMenuItem1.setText("Create blog");
        mBlog.add(jMenuItem1);

        jMenuItem2.setText("Edit blog");
        mBlog.add(jMenuItem2);

        jMenuItem3.setText("Remove blog");
        mBlog.add(jMenuItem3);

        mMenybar.add(mBlog);

        setJMenuBar(mMenybar);

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
        private void kategori1()
    {
        //Lägger in alla kategorier från kategori3 och lägger in i första comboboxen.
        try
        {
            String fraga = "select KAT1_NAMN from KAT1;";
            ArrayList<String> allaKategorier1 = idb.fetchColumn(fraga);
            for(String enKat : allaKategorier1)
            {
                cbxKat1.addItem(enKat);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }
             private void kategori2()
    {
        //Efter att man valt kateogri 3 så får man fram alla underliggade kategorier, vilket är kategorier 2.
        try
        {
            String fraga = "select KAT2_NAMN from KAT2;";
            ArrayList<String> allaKategorier2 = idb.fetchColumn(fraga);
            for(String enKat : allaKategorier2)
            {
                cbxKat2.addItem(enKat);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }
                  private void kategori3()
    {
        try
        {
<<<<<<< HEAD
            String fraga = "select KAT3_NAMN from KAT3;";
            ArrayList<String> allaKategorier3 = idb.fetchColumn(fraga);
            for(String enKat : allaKategorier3)
            {
                cbxKat3.addItem(enKat);
            }
=======
                String kat2 = cbxKat2.getSelectedItem().toString();
                String hittaKat2 = "select KAT2_NAMN from KAT1 join KAT2 where KAT3_NAMN = '" + kat2 + "';";
                ArrayList<String> allaKategorier1 = idb.fetchColumn(hittaKat2);
                for(String enKat : allaKategorier1)
                {
                    cbxKat1.addItem(enKat);
                }
>>>>>>> 89e2d43884ee18b064b4a1d8bf9b80ba4a67b71d
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }
    private void txtHeadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeadingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeadingActionPerformed

    private void btnPublishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPublishActionPerformed

<<<<<<< HEAD


=======
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        //String newTag = txtNewTag.getText();
        //String fraga = "update KAT1 set KAT"
        //idn.update()
    }//GEN-LAST:event_btnAddActionPerformed
>>>>>>> 89e2d43884ee18b064b4a1d8bf9b80ba4a67b71d

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbAddPicture;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddFile;
    private javax.swing.JButton btnPublish;
    private javax.swing.JComboBox<String> cbxInterface;
    private javax.swing.JComboBox<String> cbxKat1;
    private javax.swing.JComboBox<String> cbxKat2;
    private javax.swing.JComboBox<String> cbxKat3;
    private javax.swing.JComboBox<String> cbxSize;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeadeing;
    private javax.swing.JLabel lblInterface;
    private javax.swing.JLabel lblNewTag;
    private javax.swing.JLabel lblOrebroUniversitet;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblTags;
    private javax.swing.JLabel lblWrritePost;
    private javax.swing.JLabel lblavskiljare;
    private javax.swing.JMenu mBlog;
    private javax.swing.JMenu mMainMenu;
    private javax.swing.JMenuBar mMenybar;
    private javax.swing.JPanel pnlBlue;
    private javax.swing.JTextField txtHeading;
    private javax.swing.JTextField txtNewTag;
    private javax.swing.JTextArea txtText;
    // End of variables declaration//GEN-END:variables

    //private static class InfExeception {

        //public InfExeception() {
        //}
    //}
}
