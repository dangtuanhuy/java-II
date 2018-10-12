/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.synchronizeMethod;

/**
 *
 * @author maithicamnhung
 */
public class SynchMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        One one = new  One();
        int digit = 10;
        // Create 3 thread
        Two objThread1 = new Two(digit, one);
        Two objThread2 = new Two(digit, one);
        Two objThread3 = new Two(digit, one);
        objThread1.start();
        objThread2.start();
        objThread3.start();
    }
}
