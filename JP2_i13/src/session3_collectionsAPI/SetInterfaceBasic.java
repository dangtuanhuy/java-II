/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author maithicamnhung
 */
public class SetInterfaceBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<Integer> setIn = new HashSet<Integer>();
        setIn.add(2);
        setIn.add(12);
        setIn.add(6);
        System.out.println(setIn);
        setIn.add(2);
        System.out.println(setIn);
        System.out.println(setIn.contains(3));
        setIn.remove(2);
        System.out.println(setIn);
        setIn.add(3);
        System.out.println(setIn);
        setIn.removeAll(setIn);
        System.out.println(setIn);
    }
}
