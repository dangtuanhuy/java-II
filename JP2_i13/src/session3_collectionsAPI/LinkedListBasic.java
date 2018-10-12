/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author maithicamnhung
 */
public class LinkedListBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Orange");
        ll.add("Apple");
        ll.add("Grape");
        ll.add("Banana");
        System.out.println(ll);
        System.out.println("Size: " + ll.size());
        System.out.println("Is empty?" + ll.isEmpty());
        System.out.println("Contain?" + ll.contains("Grape"));
        
        // Read all elements in linkedList by iterator
        Iterator<String> iter = ll.iterator();
        while(iter.hasNext())
            System.out.println(iter.next());
        System.out.println("====Iterator descending=====");
        Iterator<String> iter2 = ll.descendingIterator();
        while(iter2.hasNext())
            System.out.println(iter2.next());
        
        // add from list
        System.out.println("========add from list==========");
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        ll.addAll(list);
        System.out.println(ll);
        ll.addAll(2, list);
        System.out.println(ll);
        
        //copy to array
        System.out.println("========Copy to array==========");
        String[] arr = new String[ll.size()];
        ll.toArray(arr);
        for(String a : arr)
            System.out.print(a + "\t");
        System.out.println();
        
        //sort using Comparator
        System.out.println("========sort using Comparator==========");
        Collections.sort(ll);
        System.out.println(ll);
        Collections.sort(ll, Collections.reverseOrder());
        System.out.println(ll);
        
        //Shuffle LinkedList
        System.out.println("========Shuffle LinkedList==========");
        Collections.shuffle(ll);
        System.out.println(ll);
        Collections.shuffle(ll);
        System.out.println(ll);
        
        //swap two elements in a linkedList
        System.out.println("========swap two elements in a linkedList==========");
        System.out.println(ll);
        Collections.swap(ll, 2, 5);
        System.out.println(ll);
        
        // add element at first position
        System.out.println("========add element at first position==========");
        System.out.println(ll);
        ll.addFirst("I'm a first");
        System.out.println(ll);
        ll.offerFirst("I am first -2");
        System.out.println(ll);
        ll.offerLast("I am last");
        System.out.println(ll);
        ll.addLast("I am last -2");
        System.out.println(ll);
        
        // Push, pop
        System.out.println("========Push, pop========");
        System.out.println(ll);
        ll.push("push");
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
    }
}
