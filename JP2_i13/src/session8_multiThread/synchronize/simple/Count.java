/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.synchronize.simple;

/**
 *
 * @author maithicamnhung
 */
public class Count {
    int count = 0;

    public void add(int value){
        count += value;
    }
    public void display(){
        System.out.println("Count = " + count);
    }
}
