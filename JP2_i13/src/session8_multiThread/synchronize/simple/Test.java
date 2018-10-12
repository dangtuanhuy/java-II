/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.synchronize.simple;

/**
 *
 * @author maithicamnhung
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Count count = new Count();
        CounterThread thread1 = new CounterThread(count);
        CounterThread thread2 = new CounterThread(count);
        thread1.start();
        thread2.start();
        
    }
}
