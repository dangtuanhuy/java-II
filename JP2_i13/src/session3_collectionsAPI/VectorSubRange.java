/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author maithicamnhung
 */
public class VectorSubRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<String> vec = new Vector<>();
        vec.add("First");
        vec.add("Second");
        vec.add("Thirst");
        System.out.println(vec);
        List<String> list = vec.subList(1, 3);
        System.out.println("List: " + list);
    }
}
