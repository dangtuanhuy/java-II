/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.Vector;

/**
 *
 * @author maithicamnhung
 */
public class VectorClone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<String> vec = new Vector<>();
        vec.add("First");
        vec.add("Second");
        vec.add("Thirst");
        System.out.println("Actual vector: "+ vec);
        Vector<String> copy = (Vector<String>)vec.clone();
        System.out.println("Cloned vector: " + copy);
    }
}
