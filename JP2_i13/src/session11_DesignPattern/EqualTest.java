/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern;

/**
 *
 * @author maithicamnhung
 */
public class EqualTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strAObj = new String("JOHN");
        String strBObj = new String("JOHN");
        String strCObj = new String("ANNA");
        String strEObj = strAObj;
        System.out.println(strAObj == strBObj);
        System.out.println(strAObj == strCObj);
        System.out.println(strAObj == strEObj);

    }
}
