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
public class HashTableBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable<Integer, String> hash = new Hashtable<>();
        hash.put(1, "one");
        hash.put(2, "two");
        hash.put(0, "zero");
        System.out.println(hash);
        System.out.println(hash.isEmpty());
    }
}
