/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.beans.PropertyVetoException;
import oru.inf.InfDB;
import org.seamless.swing.ClosableTabbedPane;

/**
 *
 * @author Java Grupp 1
 */
public class MainPage extends javax.swing.JFrame {
    
    private static InfDB idb;
    private MethodService methodService;
    private ClosableTabbedPane paneMainPageTabs;
    //private nyInloggning nyInloggning;
    private CreateBlogInternalFrame createBlogInternalFrame;
    private EditBlogInternalFrame editBlogInternalFrame;
    private ShowBlogInternalFrame removeBlogInternalFrame;
    

    /**
     * Creates new form MainPage
     */
    public MainPage(InfDB idb) {
        initComponents();
        this.setSize(1000, 800);
        this.idb = idb;
        //Instansierar ett nytt methodServiceobjekt
        methodService = new MethodService(idb);
        paneMainPageTabs = new ClosableTabbedPane();
        getContentPane().add(paneMainPageTabs);
        methodService.setDesign(paneMainPageTabs);
        
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
        superMenyBar = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        logOutMnuItm = new javax.swing.JMenuItem();
        closeWindowsMnuItm = new javax.swing.JMenuItem();
        exitMnuItm = new javax.swing.JMenuItem();
        blog = new javax.swing.JMenu();
        createBlogMnuItm = new javax.swing.JMenuItem();
        editBlogMnuItm = new javax.swing.JMenuItem();
        removeBlogMnuItm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addContainerGap(749, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 674, Short.MAX_VALUE))
        );

        mainMenu.setText("Main menu");

        logOutMnuItm.setText("Log out");
        logOutMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutMnuItmActionPerformed(evt);
            }
        });
        mainMenu.add(logOutMnuItm);

        closeWindowsMnuItm.setText("Close all windows");
        closeWindowsMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWindowsMnuItmActionPerformed(evt);
            }
        });
        mainMenu.add(closeWindowsMnuItm);

        exitMnuItm.setText("Exit");
        exitMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMnuItmActionPerformed(evt);
            }
        });
        mainMenu.add(exitMnuItm);

        superMenyBar.add(mainMenu);

        blog.setText("Blog");

        createBlogMnuItm.setText("Create blog");
        createBlogMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBlogMnuItmActionPerformed(evt);
            }
        });
        blog.add(createBlogMnuItm);

        editBlogMnuItm.setText("Edit blog");
        editBlogMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBlogMnuItmActionPerformed(evt);
            }
        });
        blog.add(editBlogMnuItm);

        removeBlogMnuItm.setText("Remove blog");
        removeBlogMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBlogMnuItmActionPerformed(evt);
            }
        });
        blog.add(removeBlogMnuItm);

        superMenyBar.add(blog);

        setJMenuBar(superMenyBar);

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

    private void openTab(javax.swing.JInternalFrame oneTab, String tabName) {
        // Metoden hjälper till att öppna en flik och kan göra detta utifrån basklassen.       
        paneMainPageTabs.addTab(tabName, oneTab);
        paneMainPageTabs.setSelectedIndex(paneMainPageTabs.getTabCount()-1);
            // Maximerar fliken.
            try { 
                oneTab.setMaximum(true);
            }catch (PropertyVetoException ettUndantag) {
                System.out.println(ettUndantag.getMessage());
            }
            
            // Tar bort ramen och huvudet från fönstret.
            oneTab.setBorder(null);
            ((javax.swing.plaf.basic.BasicInternalFrameUI)oneTab.getUI()).setNorthPane(null); 
        }
    
    private void moveFocusToTab(String flikTitel) {
        //Flyttar fokus till fliken
        int tabCount = paneMainPageTabs.getTabCount();
        for (int i=0; i < tabCount; i++) 
        {
            String tabTitle = paneMainPageTabs.getTitleAt(i);
            if (tabTitle.equals(flikTitel)){ 
                paneMainPageTabs.setSelectedIndex(i);
            }
        }
    }
    
    private boolean tabExists(String flikTitel) {
        boolean tabExists = false;
                int tabCount = paneMainPageTabs.getTabCount();
        for (int i=0; i < tabCount; i++) 
        {
            String tabTitle = paneMainPageTabs.getTitleAt(i);
            if (tabTitle.equals(flikTitel)){ 
                tabExists = true;
            }
        }
        return tabExists;
    }
    
    private void exitMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMnuItmActionPerformed
        //Avslutar applikationen
        System.exit(1);
    }//GEN-LAST:event_exitMnuItmActionPerformed

    private void createBlogMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBlogMnuItmActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Create blog")) {
            createBlogInternalFrame = new CreateBlogInternalFrame(idb);
            openTab(createBlogInternalFrame, "Create blog");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Create blog");
        }
    }//GEN-LAST:event_createBlogMnuItmActionPerformed

    private void editBlogMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBlogMnuItmActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Edit blog")) {
            editBlogInternalFrame = new EditBlogInternalFrame(idb);
            openTab(editBlogInternalFrame, "Edit blog");
        }  
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Edit blog");
        }
    }//GEN-LAST:event_editBlogMnuItmActionPerformed

    private void removeBlogMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBlogMnuItmActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Remove blog")) {
            removeBlogInternalFrame = new ShowBlogInternalFrame(idb);
            openTab(removeBlogInternalFrame, "Remove blog");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Remove blog");
        }
    }//GEN-LAST:event_removeBlogMnuItmActionPerformed

    private void closeWindowsMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindowsMnuItmActionPerformed
        //Stänger alla fönster i applikationen förutom MainPage
        paneMainPageTabs.removeAll();
    }//GEN-LAST:event_closeWindowsMnuItmActionPerformed

    private void logOutMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutMnuItmActionPerformed
        //Stänger applikationen och öppnar inloggningsfönstret
        System.exit(1);
        //Alternativt nästa kodrad
        //mainPage.setVisible(false);
        //nyInloggning.setVisible(true);
        
    }//GEN-LAST:event_logOutMnuItmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu blog;
    private javax.swing.JMenuItem closeWindowsMnuItm;
    private javax.swing.JMenuItem createBlogMnuItm;
    private javax.swing.JMenuItem editBlogMnuItm;
    private javax.swing.JMenuItem exitMnuItm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem logOutMnuItm;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JMenuItem removeBlogMnuItm;
    private javax.swing.JMenuBar superMenyBar;
    // End of variables declaration//GEN-END:variables
}
