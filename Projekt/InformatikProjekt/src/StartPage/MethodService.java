/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.awt.Color;
import javax.swing.JTabbedPane;
import oru.inf.InfDB;

/**
 *
 * @author ellin
 */
public class MethodService {
    
    private static InfDB idb;
    
    public MethodService(InfDB idb) {
        this.idb = idb;

    }
    
     public void setDesign(JTabbedPane oneTabbedPane) {
        for (int i = 0; i < oneTabbedPane.getTabCount(); i++) {
            oneTabbedPane.setBackgroundAt(i, Color.WHITE);
            oneTabbedPane.getComponentAt(i).setBackground(Color.WHITE);
        }
    }
    
}
