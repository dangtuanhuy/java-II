/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author maithicamnhung
 */
public class VectorIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<String> vec = new Vector<String>();
        vec.add("First");
        vec.add("Second");
        vec.add("Thirst");
        Iterator<String> iterator = vec.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
