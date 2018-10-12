/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.wait_notify;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maithicamnhung
 */
public class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b) {
            System.out.println("Waiting for b to complete...");
            try {
                b.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadA.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Total is: " + b.total);
        }
    }
}
