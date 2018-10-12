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
public class LinkedHashMapBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedHashMap<Integer,String> linkHashMap = new LinkedHashMap<>();
        linkHashMap.put(1, "one");
        linkHashMap.put(0, "zero");
        linkHashMap.put(2, "two");
        System.out.println(linkHashMap);
    }
}
