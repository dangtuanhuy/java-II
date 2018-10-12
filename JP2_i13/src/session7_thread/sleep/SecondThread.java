/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.sleep;

/**
 *
 * @author maithicamnhung
 */
public class SecondThread extends Thread{

    public SecondThread() {
        System.out.println("Second Thread.");
    }
     public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Thread 2 : " + i);
            try{
                sleep(100);
            }catch(InterruptedException ex){
                
            }
        }
    }
}
