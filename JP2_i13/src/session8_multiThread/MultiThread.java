/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread;

/**
 *
 * @author maithicamnhung
 */
public class MultiThread extends Thread{
    String name;
    public void run(){
        int count  =1;
        while(count <=10){
            name = Thread.currentThread().getName();
            System.out.println(name + ":" + count);
            count++;
            try{
                Thread.sleep(500);
            }catch(InterruptedException ex){
                break;
            }
        }
    }
}
