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
public class ArrayListBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("HDJ");
        al.add("BDW");
        System.out.println(al);
        System.out.println("Phan tu o vi tri 1: " + al.get(1));
        System.out.println("Danh sach co ton tai chuoi HDJ kh?" + al.contains("HDJ"));
        al.add(2, "C++");
        System.out.println(al);
        System.out.println("Danh sach co rong kh?" + al.isEmpty());
        System.out.println("Vi tri cua phan tu BDW=" + al.indexOf("BDW"));
        System.out.println("Vi tri cua phan tu Window 7=" + al.indexOf("Window 7"));
        System.out.println("Kich thuoc cua danh sach:" + al.size());
        
        //Nhan ban mot ArrayList
        ArrayList<String> copy  = (ArrayList<String>)al.clone();
        System.out.println("Ban copy: " + copy);
        
        // How to add all elements of a list to arraylist?
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        al.addAll(list);
        System.out.println("Sau khi copy:" + al);
        
        // How to delete all elements from my arraylist?
        al.clear();
        
        //How to find does arraylist contains all list elements or not?
        System.out.println(copy.containsAll(list));
        
        //How to copy arraylist to array?
        System.out.println("How to copy arraylist to array?");
        String[] array = new String[copy.size()];
        copy.toArray(array);
        for(String a : array)
            System.out.println(a);
        
        // How to get sub list from arraylist
        System.out.println(copy.subList(1, 3));
        
        //Sort
        Collections.sort(copy);
        for(String e:copy){
            System.out.println(e);
        }
        
        System.out.println("--------Reverse--------");
        // Reverse
        Collections.reverse(copy);
        for(String e:copy){
            System.out.println(e);
        }
        
        System.out.println("--------shuffle--------");
        // Bo tri lai ds: shuffle
        Collections.shuffle(copy);
        for(String e:copy){
            System.out.println(e);
        }
        
         System.out.println("--------shuffle--------");
        // Bo tri lai ds: shuffle
        Collections.shuffle(copy);
        for(String e:copy){
            System.out.println(e);
        }
        
         System.out.println("--------swap--------");
        // Hoan doi vi tri: swap
        Collections.swap(copy, 1, 3);
        for(String e:copy){
            System.out.println(e);
        }
    }
}
