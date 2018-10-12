/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.sleep;

/**
 *
 * @author maithicamnhung
 */
public class FirstThread extends Thread{

    public FirstThread() {
        System.out.println("First Thread");
    }
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("Thread 1 : " + i);
            try{
                sleep(100);
            }catch(InterruptedException ex){
                
            }
        }
    }
}
