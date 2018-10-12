/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.sleep;

/**
 *
 * @author maithicamnhung
 */
public class TestThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();
        
        first.start();
        second.start();
    }
}
