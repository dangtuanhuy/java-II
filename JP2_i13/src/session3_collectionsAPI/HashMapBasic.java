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
public class HashMapBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "one");
        hash.put(2, "two");
        hash.put(0, "zero");
        System.out.println(hash);
        System.out.println(hash.get(1));
        hash.remove(2);
        System.out.println("Size: " + hash.size());
        System.out.println(hash);
        
        //lap qua tung phan tu cua HashMap
        System.out.println(hash);
        Set<Integer> keys = hash.keySet();
        for(int key : keys)
            System.out.println("Key " + key + ": " + hash.get(key));
        
        //search
        if(hash.containsKey(0))
            System.out.println("Tim thay khoa");
        if(hash.containsValue("one1"))
            System.out.println("tim thay value");
        
    }
}
