
package StartPage;

/**
 *
 * @author Sadeer
 */
// metod som leta efter bokstäverna a-z, A-Z och åäö / ÅÄÖ, inga andra tecken tillåts.
public class Validation {
    
   
        public boolean one(String one){
        String check = "[a-öA-Ö0-9 ]+";
        boolean b = one.matches(check);
        return b;
        
    }
   
    public boolean two(String two){
        String check = "[0-9_.]+";
        boolean b = two.matches(check);
        return b;
        
    }
   
    
    public boolean three(String three){
        String check = "-?[0-9]+";
        boolean b = three.matches(check);
        return b;
        
    }
   
    public boolean four(String four){
        String check = "[a-öA-Ö]+";
        boolean b = four.matches(check);
        return b;
        
    }
    
    public boolean five(String five){
        String check = "[a-öA-Ö0-9]+";
        boolean b = five.matches(check);
        return b;
        
    }
      
  
}
    
