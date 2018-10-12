/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.TwoCreateThread;

/**
 *
 * @author maithicamnhung
 */
public class ClientRunnable implements Runnable{

    public ClientRunnable(){
        
    }
    
    @Override
    public void run() {
        System.out.println("Client ABC resource.");
    }
    
}
