/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author maithicamnhung
 */
public class SortedSetBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortedSet set = new TreeSet();
        set.add(2);
        set.add(1);
        set.add(12);
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
        System.out.println(set.first());
        System.out.println(set.last());
        // phan tu cuoi cung -> lay day so truoc phan tu cuoi cung
        System.out.println(set.headSet(1));
        System.out.println(set.headSet(2));
        System.out.println(set.headSet(12));
        System.out.println(set.headSet(24));
        //subSet: lay chuoi con tu phan tu nho nhat va nho hon phan tu lon nhat
        System.out.println(set.subSet(1, 4));
        System.out.println(set.subSet(1, 13));
        //tainSet: lay phan tu lon hon hoac bang
        System.out.println(set.tailSet(1));
        
    }
}
