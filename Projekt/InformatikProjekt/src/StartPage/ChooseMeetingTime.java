/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellin
 */
public class ChooseMeetingTime extends javax.swing.JInternalFrame {

    private static InfDB idb;
    private MethodService methodService;

    /**
     * Creates new form EditBlogInternalFrame
     */
    public ChooseMeetingTime(InfDB idb) {
        initComponents();
        this.idb = idb;
        fillComboBox();
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
        cbxOption = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnChoose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaChoose = new javax.swing.JTextArea();
        lbChoose = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAccepterat = new javax.swing.JTextArea();
        lblParcipant = new javax.swing.JLabel();

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
                .addContainerGap(733, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        cbxOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one option" }));

        jLabel2.setText("Date:");

        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        txtAreaChoose.setColumns(20);
        txtAreaChoose.setRows(5);
        jScrollPane1.setViewportView(txtAreaChoose);

        lbChoose.setText("Choosen dates:");

        txtAreaAccepterat.setColumns(20);
        txtAreaAccepterat.setRows(5);
        jScrollPane2.setViewportView(txtAreaAccepterat);

        lblParcipant.setText("Participant:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(cbxOption, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChoose)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbChoose)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblParcipant)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbChoose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(btnChoose))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblParcipant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(81, 81, 81))
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

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        if (Validation.elementSelectedInCombobox(cbxOption, "Choose an element from the combobox.")) {
            try {
                String tid = cbxOption.getSelectedItem().toString();
                int userID = LoggedUser.getID();
                String motesID = idb.fetchSingle("Select MID from PERSONER_DELTAR where ID = " + userID + ";");
                txtAreaChoose.setText(tid); //Lägger in den valda tiden i textArean.

                String[] user = cbxOption.getSelectedItem().toString().trim().split(" till "); //delar upp varje item i comboboxen i start och sluttid.
                String start = user[0];
                String end = user[1];

                //Hämtar FORSLAGS_ID, kollar så att slut och starttiden för ett möte är olika,
                //i och med att det inte ska finnas två exakt samma förslagtider för ett möte
                String fraga = "select FORSLAGS_ID from MOTES_FORSLAG where START_TID = '" + start + "' and SLUT_TID = '" + end + "' and MID = '" + motesID + "';";
                String forslagsID = idb.fetchSingle(fraga);

                String roster = idb.fetchSingle("select MAX(ROSTER) from MOTES_FORSLAG where FORSLAGS_ID = '" + forslagsID + "';");
                int maxRosterInt = Integer.parseInt(roster);
                int maxInt = maxRosterInt + 1;

                idb.update("update MOTES_FORSLAG set ROSTER = " + maxInt + " where FORSLAGS_ID = '" + forslagsID + "';");

                idb.insert("insert into PERSON_ACCEPTERAT values('" + forslagsID + "', " + userID + ");");

                String fraga2 = "select FNAMN,ENAMN,START_TID,SLUT_TID from PERSONER"
                        + " join PERSON_ACCEPTERAT on PERSONER.ID = PERSON_ACCEPTERAT.ID"
                        + " join MOTES_FORSLAG on PERSON_ACCEPTERAT.FORSLAGS_ID = MOTES_FORSLAG.FORSLAGS_ID"
                        + " where PERSON_ACCEPTERAT.FORSLAGS_ID = " + forslagsID + ";";
                System.out.println(fraga2);
                ArrayList<HashMap<String, String>> iDLista = idb.fetchRows(fraga2);

                String lista = "";

                for (HashMap rad : iDLista) {
                    lista += rad.get("FNAMN");
                    lista += " ";
                    lista += rad.get("ENAMN");
                    lista += " ";
                    lista += rad.get("START_TID");
                    lista += " ";
                    lista += rad.get("SLUT_TID");
                    lista += "\n";

                }
                txtAreaAccepterat.setText(lista);

            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void fillComboBox() {

        try {
            int id = LoggedUser.getID();

            String motesID = idb.fetchSingle("Select MID from PERSONER_DELTAR where ID = " + id + ";");

            String fraga1 = "Select START_TID, SLUT_TID from MOTES_FORSLAG where MID = '" + motesID + "';";
            ArrayList<HashMap<String, String>> forslagslista = idb.fetchRows(fraga1);
            for (int i = 0; i < forslagslista.size(); i++) {
                String start = forslagslista.get(i).get("START_TID");
                String slut = forslagslista.get(i).get("SLUT_TID");
                cbxOption.addItem(start + " till " + slut);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoose;
    private javax.swing.JComboBox<String> cbxOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbChoose;
    private javax.swing.JLabel lblParcipant;
    private javax.swing.JTextArea txtAreaAccepterat;
    private javax.swing.JTextArea txtAreaChoose;
    // End of variables declaration//GEN-END:variables
}
