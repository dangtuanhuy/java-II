/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.synchronize.simple;

/**
 *
 * @author maithicamnhung
 */
public class CounterThread extends Thread {

    Count count;

    public CounterThread(Count count) {
        this.count = count;
    }

    public void run() {
        synchronized (count) {
            try {
                count.add(10);
                sleep(1000);
                count.display();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
