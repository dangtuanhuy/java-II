/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author maithicamnhung
 */
public class TreeMapBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(2, "two");
        tree.put(1, "one");
        tree.put(0, "zero");
        System.out.println(tree);
        
        Set set = tree.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry m = (Map.Entry) iterator.next();
            System.out.println("Key:" + m.getKey() + ", value:" + m.getValue());
        }
    }
}
