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
public class DequeBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deque<Integer> de = new ArrayDeque<>();
        de.add(2);
        de.add(12);
        de.add(6);
        de.add(0);
        System.out.println(de);
        de.remove();
        System.out.println(de);
        de.remove();
        System.out.println(de);
        de.add(4);
        System.out.println(de);
    }
}
