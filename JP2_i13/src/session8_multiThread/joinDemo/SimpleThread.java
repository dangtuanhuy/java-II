/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.joinDemo;

import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.windows.ThemeReader;

/**
 *
 * @author maithicamnhung
 */
public class SimpleThread {

    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + ": " + message);
    }

    private static class MessageLoop implements Runnable {

        @Override
        public void run() {
            String information[] = {
                "Thong tin 1",
                "Thong tin 2",
                "THong tin 3",
                "Thong tin 4"
            };
            for (int i = 0; i < information.length; i++) {
                try {
                    Thread.sleep(4000);
                    threadMessage(information[i]);
                } catch (InterruptedException ex) {
                    threadMessage("I wasn't done.");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        threadMessage("Start MessageLoop thread.");
        Thread r = new Thread(new MessageLoop());
        r.start();
        threadMessage("Waiting for MessageLoop thread to finish.");
        while(r.isAlive()){
            threadMessage("Still Waiting...");
            try {
                r.join(1000);
            } catch (InterruptedException ex) {
                threadMessage("Join is not active");
            }
        }
        threadMessage("Finally");
    }
}
