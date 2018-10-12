/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern;

/**
 *
 * @author maithicamnhung
 */
public class LogicalEqualTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strAObj = new String("JOHN");
        String strBObj = new String("JOHN");
        String strCObj = new String("ANNA");
        
        String strEObj = strAObj;
        
        System.out.println("=============================");
        System.out.println("Logical or Value Equality");
        System.out.println("=============================");
        
        System.out.println(strAObj.equals(strBObj));
        System.out.println(strAObj.equals(strCObj));
        System.out.println(strAObj.equals(strEObj));
        
        System.out.println("Dia chi: " + strAObj.hashCode());

    }
}
