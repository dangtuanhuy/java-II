/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.TwoCreateThread;

/**
 *
 * @author maithicamnhung
 */
public class ResourceThread extends Thread{
    public ResourceThread(){
        
    }
    
    @Override
    public void run(){
        System.out.println("ABC resource");
    }
}
