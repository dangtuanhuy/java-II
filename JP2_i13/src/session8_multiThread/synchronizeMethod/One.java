/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.synchronizeMethod;

/**
 *
 * @author maithicamnhung
 */
public class One {
   synchronized void display(int num){
        num++;
        System.out.print(num + "    ");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            System.out.println("Interrupted");
        }
        System.out.println("Done");
    }
}
