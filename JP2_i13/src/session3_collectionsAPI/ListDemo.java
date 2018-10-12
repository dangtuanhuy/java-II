/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;
import java.util.*;

/**
 *
 * @author maithicamnhung
 */
public class ListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> list = new ArrayList<Integer>();
        int[] so = {1,2,6,12,7,3};
        for(int i : so){
            list.add(i);
        }
        CollectionDisplay collection = new CollectionDisplay();
        collection.displayAll(list);
        
        list.add(0, 0);
        collection.displayAll(list);
        
        System.out.println(list.get(3));
        list.remove(3);
        
        System.out.println(list);
    }
}
