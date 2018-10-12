/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author maithicamnhung
 */
public class CollectionDisplay {
    
    public void displayAll(Collection col){
        Iterator itr = col.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }
        System.out.println();
    }
}
