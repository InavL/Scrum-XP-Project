/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

/**
 *
 * @author atb19
 */
public class LoggedUser {
    
    public static String Namn;
    public static int ID;
    public static int Behorighet;
    
    public static void setNamn(String nyttNamn) {
        Namn = nyttNamn;
    }
    
    public static void setID(int nyttID) {
        ID = nyttID;
    }
    
    public static void setBehorighet(int nyttBehorighet) {
        Behorighet = nyttBehorighet;
    }
    
    public static String getNamn() {
        return Namn;
    }
    
    public static int getID() {
        return ID;
    }
    
    public static int getBehorighet() {
        return Behorighet;
    }
}
