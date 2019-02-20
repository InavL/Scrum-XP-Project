/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author ellin
 */
public class FeedBlogInternalFrame extends javax.swing.JInternalFrame {

    private Connection con;
    private MethodService methodService;
    private String id;
    private static int bid;

    /**
     * Creates new form EditBlogInternalFrame
     */
    public FeedBlogInternalFrame(Connection con) {
        initComponents();
        this.con = con;
        methodService = new MethodService(con);

        id = null;
        bid = 1;

        fillListWithSienceBlog();
        fillListWithEducationBlog();
        fillListWithInformalBlog();
        educationStart();
        informalStart();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taBlogFeed = new javax.swing.JTextArea();
        btnUpdate = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnlSience = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAllScienceBlog = new javax.swing.JList<>();
        pnlEducation = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JlGetBlogEducation = new javax.swing.JList<>();
        pnlInformal = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JlGetBlogInformal = new javax.swing.JList<>();
        btnDownload = new javax.swing.JButton();
        btnGDPR = new javax.swing.JButton();
        btnComment = new javax.swing.JButton();
        txtImage = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

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

        taBlogFeed.setColumns(20);
        taBlogFeed.setRows(5);
        jScrollPane1.setViewportView(taBlogFeed);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jListAllScienceBlog.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListAllScienceBlog.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListAllScienceBlogValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListAllScienceBlog);

        javax.swing.GroupLayout pnlSienceLayout = new javax.swing.GroupLayout(pnlSience);
        pnlSience.setLayout(pnlSienceLayout);
        pnlSienceLayout.setHorizontalGroup(
            pnlSienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );
        pnlSienceLayout.setVerticalGroup(
            pnlSienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Science", pnlSience);

        JlGetBlogEducation.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JlGetBlogEducation.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JlGetBlogEducationValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(JlGetBlogEducation);

        javax.swing.GroupLayout pnlEducationLayout = new javax.swing.GroupLayout(pnlEducation);
        pnlEducation.setLayout(pnlEducationLayout);
        pnlEducationLayout.setHorizontalGroup(
            pnlEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );
        pnlEducationLayout.setVerticalGroup(
            pnlEducationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Education", pnlEducation);

        JlGetBlogInformal.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JlGetBlogInformal.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                JlGetBlogInformalValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(JlGetBlogInformal);

        javax.swing.GroupLayout pnlInformalLayout = new javax.swing.GroupLayout(pnlInformal);
        pnlInformal.setLayout(pnlInformalLayout);
        pnlInformalLayout.setHorizontalGroup(
            pnlInformalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
        );
        pnlInformalLayout.setVerticalGroup(
            pnlInformalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Informal", pnlInformal);

        btnDownload.setText("Download file");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        btnGDPR.setText("About GDPR");
        btnGDPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGDPRActionPerformed(evt);
            }
        });

        btnComment.setText("Comment");
        btnComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGDPR, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnComment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDownload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jTabbedPane1))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGDPR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnComment))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate)
                        .addComponent(btnDownload)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Uppdaterar flödet ifall ändringar har gjorts sedan man öppnade fönstret
        fillListWithSienceBlog();
        fillListWithEducationBlog();
        fillListWithInformalBlog();

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jListAllScienceBlogValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListAllScienceBlogValueChanged

        try {

            String sienceBlogInfo = jListAllScienceBlog.getSelectedValue();
            String id = sienceBlogInfo.substring(0, 2);

            bid = Integer.parseInt(id.trim());

            String fraga = "SELECT BLOGGPOST FROM BLOGG where BLOGGID =" + id;

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(fraga);

            System.out.println(rs);

            while (rs.next()) {
                String post = rs.getString("BLOGGPOST");
                taBlogFeed.setText(post);

                String hasPic = "select filtyp from blogg_har_filer where blogg_id =" + bid;

                rs = stmt.executeQuery(hasPic);
                rs.next();
                String filtyp = rs.getString("filtyp");
                System.out.println(filtyp);

                if (".jpeg".equals(filtyp) || ".jpg".equals(filtyp) || ".png".equals(filtyp)) {

                    ImageHandling.showImage("files\\" + bid + filtyp, txtImage, jPanel1, 1000, 700);

                }

            }

        } catch (SQLException e) {
            txtImage.setVisible(false);
            //JOptionPane.showMessageDialog(null, "Something went wrong!");
            System.out.println("Internt felmeddelande: " + e.getMessage());
        }
    }//GEN-LAST:event_jListAllScienceBlogValueChanged

    private void JlGetBlogEducationValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JlGetBlogEducationValueChanged

        try {

            String sienceBlogInfo = JlGetBlogEducation.getSelectedValue();
            String id = sienceBlogInfo.substring(0, 2);

            bid = Integer.parseInt(id.trim());

            String fraga = "SELECT BLOGGPOST FROM BLOGG where BLOGGID =" + id;

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(fraga);

            while (rs.next()) {
                String post = rs.getString("BLOGGPOST");
                taBlogFeed.setText(post);

                String hasPic = "select filtyp from blogg_har_filer where blogg_id =" + bid;

                rs = stmt.executeQuery(hasPic);
                rs.next();
                String filtyp = rs.getString("filtyp");

                if (".jpeg".equals(filtyp) || ".jpg".equals(filtyp) || ".png".equals(filtyp)) {

                    ImageHandling.showImage("files\\" + bid + filtyp, txtImage, jPanel1, 1000, 700);

                }
            }

        } catch (SQLException e) {
            txtImage.setVisible(false);
            //JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: " + e.getMessage());
        }
    }//GEN-LAST:event_JlGetBlogEducationValueChanged

    private void JlGetBlogInformalValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_JlGetBlogInformalValueChanged

        try {

            String sienceBlogInfo = JlGetBlogInformal.getSelectedValue();
            String id = sienceBlogInfo.substring(0, 2);

            bid = Integer.parseInt(id.trim());

            String fraga = "SELECT BLOGGPOST FROM BLOGG where BLOGGID =" + bid;

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(fraga);

            while (rs.next()) {
                String post = rs.getString("BLOGGPOST");
                taBlogFeed.setText(post);

                String hasPic = "select filtyp from blogg_har_filer where blogg_id =" + bid;

                rs = stmt.executeQuery(hasPic);
                rs.next();
                String filtyp = rs.getString("filtyp");
                System.out.println(filtyp);

                if (".jpeg".equals(filtyp) || ".jpg".equals(filtyp) || ".png".equals(filtyp)) {

                    ImageHandling.showImage("files\\" + bid + filtyp, txtImage, jPanel1, 1000, 700);

                }

            }

        } catch (SQLException e) {
            txtImage.setVisible(false);
            //JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: " + e.getMessage());
        }
    }//GEN-LAST:event_JlGetBlogInformalValueChanged

    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
        try {
            String newID = id.trim();
            Statement stmt = null;
            String typeQuestion = "select FILTYP from BLOGG_HAR_FILER where BLOGG_ID ='" + newID + "'";
            ResultSet typeSet = stmt.executeQuery(typeQuestion);
            typeSet.next();
            String type = typeSet.getString("filtyp");

            File file = new File("files\\" + newID + type);

            File saveAt = new File("C:\\FilesFromBlogpost\\" + newID + type);

            FileUtils.copyFile(file, saveAt);
            JOptionPane.showMessageDialog(null, "You have downloaded the file and it is saved in C:/FilesFromBlogpost");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "This post don't have an attached file!");
        } catch (SQLException ex) {
            Logger.getLogger(FeedBlogInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDownloadActionPerformed

    private void btnGDPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGDPRActionPerformed
        // TODO add your handling code here:
        try {
            String url = "https://www.oru.se/english/about-us/processing-of-personal-data-at-orebro-university/";

            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        } catch (IOException ex) {
            Logger.getLogger(FeedBlogInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnGDPRActionPerformed

    private void btnCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommentActionPerformed
        Comment comment = new Comment(con);
        comment.setVisible(true);

    }//GEN-LAST:event_btnCommentActionPerformed

    private void educationStart() {

        int behorighet = LoggedUser.getBehorighet();
        if (behorighet == 3) {

            jTabbedPane1.setSelectedIndex(1);
        }
    }

    private void informalStart() {

        int behorighet = LoggedUser.getBehorighet();
        if (behorighet == 1 || behorighet == 4 || behorighet == 5) {

            jTabbedPane1.setSelectedIndex(2);
        }
    }

    private void fillListWithSienceBlog() {

        try {

            String fraga = "SELECT BLOGGID, TITEL, DATUM FROM BLOGG"
                    + " join KAT3 on BLOGG.KAT3_ID = KAT3.KAT3_ID"
                    + " join KAT2 on KAT3.KAT2_ID = KAT2.KAT2_ID"
                    + " join KAT1 on KAT2.KAT1_ID = KAT1.KAT1_ID"
                    + " where KAT1.KAT1_ID ='1'"
                    + " ORDER BY bloggid DESC";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(fraga);

            DefaultListModel allScienceBlog = new DefaultListModel();

            while (rs.next()) {
                String id = rs.getString("BLOGGID");
                String titel = rs.getString("TITEL");
                String datum = rs.getString("DATUM");
                String scienceBlog = (id + " " + titel + " " + datum + "\n");
                allScienceBlog.addElement(scienceBlog);
            }

            jListAllScienceBlog.setModel(allScienceBlog);

        } catch (SQLException oneException) {
            oneException.getMessage();
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }

    private void fillListWithEducationBlog() {

        try {

            String fraga = "SELECT BLOGGID, TITEL, DATUM FROM BLOGG"
                    + " join KAT3 on BLOGG.KAT3_ID = KAT3.KAT3_ID"
                    + " join KAT2 on KAT3.KAT2_ID = KAT2.KAT2_ID"
                    + " join KAT1 on KAT2.KAT1_ID = KAT1.KAT1_ID"
                    + " where KAT1.KAT1_ID ='2'"
                    + " ORDER BY bloggid DESC";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(fraga);

            DefaultListModel allScienceBlog = new DefaultListModel();

            while (rs.next()) {
                String id = rs.getString("BLOGGID");
                String titel = rs.getString("TITEL");
                String datum = rs.getString("DATUM");
                String scienceBlog = (id + " " + titel + " " + datum + "\n");
                allScienceBlog.addElement(scienceBlog);
            }

            JlGetBlogEducation.setModel(allScienceBlog);

        } catch (SQLException oneException) {
            oneException.getMessage();
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }

    private void fillListWithInformalBlog() {

        try {

            String fraga = "SELECT BLOGGID, TITEL, DATUM FROM BLOGG"
                    + " join KAT3 on BLOGG.KAT3_ID = KAT3.KAT3_ID"
                    + " join KAT2 on KAT3.KAT2_ID = KAT2.KAT2_ID"
                    + " join KAT1 on KAT2.KAT1_ID = KAT1.KAT1_ID"
                    + " where KAT1.KAT1_ID ='3'"
                    + " ORDER BY bloggid DESC";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(fraga);

            DefaultListModel allScienceBlog = new DefaultListModel();

            while (rs.next()) {
                String id = rs.getString("BLOGGID");
                String titel = rs.getString("TITEL");
                String datum = rs.getString("DATUM");
                String scienceBlog = (id + " " + titel + " " + datum + "\n");
                allScienceBlog.addElement(scienceBlog);
            }

            JlGetBlogInformal.setModel(allScienceBlog);

        } catch (SQLException oneException) {
            oneException.getMessage();
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }

    private void showImages() {

        try {

            //String type = idb.fetchSingle("Select filtyp from blogg_har_filer where blogg_id =" + bid);
            Statement stmt = null;
            String typeQuestion = "Select filtyp from blogg_har_filer where blogg_id =" + bid;
            ResultSet typeSet = stmt.executeQuery(typeQuestion);
            typeSet.next();
            String type = typeSet.getString("filtyp");

            txtImage.setVisible(false);

            if (type.equals(".png")) {

                ImageHandling.showImage("files\\" + bid + ".png", txtImage, jPanel1, 480, 470);
                txtImage.setVisible(true);
            }

            if (type.equals(".jpeg")) {

                ImageHandling.showImage("files\\" + bid + ".jpeg", txtImage, jPanel1, 480, 470);
                txtImage.setVisible(true);
            }

        } catch (SQLException oneException) {
            oneException.getMessage();
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }

    }

    public static int getBID() {
        return bid;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlGetBlogEducation;
    private javax.swing.JList<String> JlGetBlogInformal;
    private javax.swing.JButton btnComment;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnGDPR;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListAllScienceBlog;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlEducation;
    private javax.swing.JPanel pnlInformal;
    private javax.swing.JPanel pnlSience;
    private javax.swing.JTextArea taBlogFeed;
    private javax.swing.JLabel txtImage;
    // End of variables declaration//GEN-END:variables
}
