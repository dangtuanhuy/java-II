/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.TwoCreateThread;



/**
 *
 * @author maithicamnhung
 */
public class TestDetail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ResourceThread reThread = new ResourceThread();
        reThread.start();
        ClientRunnable clientThread = new ClientRunnable();
        Thread thread = new Thread(clientThread);
        thread.start();
    }
}
