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
public class Solve {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(new Integer(10));
       //code error
        //array.add("Hello");
        Integer num = (Integer) array.get(0);
    }
}
