/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.synchronizeMethod;

/**
 *
 * @author maithicamnhung
 */
public class Two extends Thread {

    int number;
    One objOne;

    public Two(int number, One objOne) {
        this.number = number;
        this.objOne = objOne;
    }

    public void run() {
        synchronized (objOne) {
            objOne.display(number);
        }
    }
}
