/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.DaemonThread;

/**
 *
 * @author maithicamnhung
 */
public class BackgroundService extends Thread {

    private int count;

    public BackgroundService() {
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("#" + count++);
            //yield();
        }
    }
}
