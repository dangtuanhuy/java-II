/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session3_collectionsAPI;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author maithicamnhung
 */
public class StackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> sta = new Stack<Integer>();
        sta.add(3);
        sta.add(10);
        sta.add(1);
        
        System.out.println(sta);
        System.out.println(sta.peek());
        sta.add(12);
        System.out.println(sta);
        System.out.println(sta.peek());
    }
    
}
