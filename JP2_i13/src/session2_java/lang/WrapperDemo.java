/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session2_java.lang;

/**
 *
 * @author maithicamnhung
 */
public class WrapperDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer intObj1 = new Integer(25);
        Integer intObj2 = new Integer("34");
        Integer intObj3 = new Integer(23);
        
        System.out.println("So sanh 1 va 2: " + intObj1.compareTo(intObj2));
        System.out.println("So sanh 1 va 2: " + intObj1.compareTo(intObj3));
        
        System.out.println("1 bang 2: " + intObj1.equals(intObj2));
        System.out.println("1 bang 3: " + intObj1.equals(intObj3));
        
        int x = intObj1 + intObj2;
        System.out.println("x = " + x);
        
        int y = intObj1.intValue() + intObj2.intValue();
        System.out.println("y = " + y);
        
        Integer z = intObj1.intValue() + intObj2;
        System.out.println("z = " + z);
    }
}
