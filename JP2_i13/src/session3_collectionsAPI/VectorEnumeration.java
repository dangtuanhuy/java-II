/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author maithicamnhung
 */
public class VectorEnumeration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<String> vec = new Vector<>();
        vec.add("First");
        vec.add("Second");
        vec.add("Thirst");
        Enumeration<String> enumer = vec.elements();
        while(enumer.hasMoreElements()){
            System.out.println(enumer.nextElement());
        }
    }
}
