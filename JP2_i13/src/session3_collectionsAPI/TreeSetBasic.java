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
public class TreeSetBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("two");
        tree.add("three");
        System.out.println("Tree: " + tree);
        System.out.println("Is empty? " + tree.isEmpty());
        
        //create treeset with a list
        System.out.println("========create treeset with a list========");
        List<String> list = new ArrayList<>();
        list.add("Mon");
        list.add("Tus");
        list.add("Wed");
        list.add("Sun");
        TreeSet<String> ts = new TreeSet<>(list);
        System.out.println(ts);
        
        // remove duplicate entries from an array
        System.out.println("====remove duplicate entries from an array=====");
        String[] array = {"one", "two", "three", "four", "four", "five"};
        List<String> tmpList = Arrays.asList(array);
        System.out.println("Tmp List:" + tmpList);
        TreeSet<String> unique = new TreeSet<>(tmpList);
        System.out.println("Tree List: " + unique);
        
        // find duplicate value from an array
        System.out.println("====find duplicate value from an array===");
        String[] array2 = {"one", "one", "two", "three", "four", "four", "five"};
        TreeSet<String> ts2 = new TreeSet<>();
        for(String arr : array2){
            if(!ts2.add(arr))
                System.out.println("Duplicate values:" + arr);
        }
        
        //create TreeSet with Comparator
        System.out.println("====create TreeSet with Comparator====");
        TreeSet<String> ts3 =  new TreeSet<>(new MyCompa());
        ts3.add("one");
        ts3.add("ten");
        ts3.add("four");
        System.out.println(ts3);
    }
}
class MyCompa implements Comparator<String>{

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
    
}
