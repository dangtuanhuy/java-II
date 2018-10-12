/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author maithicamnhung
 */
public class MyCollectionIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String removeElement = "HDJ";
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("HDJ");
        myList.add("BDW");
        
        System.out.println("Truoc khi remove:");
        System.out.println(myList);
        CollectionDisplay collection = new CollectionDisplay();
        collection.displayAll(myList);
        
        System.out.println("Sau khi remove:");
        Iterator<String> itr2 = myList.iterator();
        while(itr2.hasNext()){
            if(removeElement.equals(itr2.next())){
                itr2.remove();
            }
        }
        System.out.println(myList);
    }
}
