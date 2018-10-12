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
public class VectorBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<String> vec = new Vector<>();
        // Add elements to end
        vec.add("First");
        vec.add("Second");
        vec.add("Thirst");
        System.out.println(vec);
        vec.add(2, "Radom");
        System.out.println(vec);
        // Getting element by index
        System.out.println("Phan tu o vt 3: " + vec.get(3));
        // Getting first element
        System.out.println(vec.firstElement());
        // Get last element
        System.out.println(vec.lastElement());
    }
}
