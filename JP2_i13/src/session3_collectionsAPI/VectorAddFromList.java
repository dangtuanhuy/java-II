/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author maithicamnhung
 */
public class VectorAddFromList {

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
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        System.out.println("Does vector contains all list elements?" + vec.containsAll(list));
        vec.addAll(list);
        System.out.println(vec);
        System.out.println("Does vector contains all list elements?" + vec.containsAll(list));
        
        vec.clear();
        System.out.println(vec);
    }
}
