/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.DaemonThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maithicamnhung
 */
public class TestDaemonThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BackgroundService service = new BackgroundService();
        System.out.println("Main");
        System.out.println("I want to say...");
        System.out.println("Hello !!!");
        try {
            service.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestDaemonThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
