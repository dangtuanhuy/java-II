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
public class PriorityQueueBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<String> prio = new PriorityQueue<>();
        prio.offer("one");
        prio.offer("two");
        prio.offer("three");
        System.out.println(prio);
        prio.poll();
        System.out.println(prio);
        System.out.println( prio.peek());
        System.out.println(prio);
    }
}
