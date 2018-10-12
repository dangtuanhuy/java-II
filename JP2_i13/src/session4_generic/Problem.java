/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session4_generic;

import java.util.ArrayList;

/**
 *
 * @author maithicamnhung
 */
public class Problem {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(new Integer(10));
        array.add("Hello");
        Integer num = (Integer) array.get(1);
    }
    
}
