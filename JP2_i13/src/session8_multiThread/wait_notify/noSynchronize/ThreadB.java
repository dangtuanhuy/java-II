/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.wait_notify.noSynchronize;

/**
 *
 * @author maithicamnhung
 */
public class ThreadB extends Thread {

    int total;

    public void run() {
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        System.out.println("Tong = " + total);
        
    }
}
