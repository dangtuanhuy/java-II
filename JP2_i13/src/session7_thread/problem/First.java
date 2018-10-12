/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.problem;

/**
 *
 * @author maithicamnhung
 */
public class First {

    public First() {
        System.out.println("First");
    }
    
    public void run(){
        for(int i = 0; i <= 10; i++)
            System.out.println("First : " + i);
    }
}
