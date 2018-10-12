/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.wait_notify.noSynchronize;

/**
 *
 * @author maithicamnhung
 */
public class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();
        System.out.println("Total is: " + b.total);

    }
}
