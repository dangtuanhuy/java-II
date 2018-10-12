/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.LinkedHashSet;

/**
 *
 * @author maithicamnhung
 */
public class LinkedHashSetBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println(lhs);
        System.out.println("LinkedHashSet size: "+lhs.size());
        System.out.println("Is LinkedHashSet emplty? : "+lhs.isEmpty());
    }
}
