/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread;

/**
 *
 * @author maithicamnhung
 */
public class TestMultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MultiThread thread = new MultiThread();
        MultiThread thread2 = new MultiThread();
        thread.setName("Thread 1");
        thread2.setName("Thread 2");
        thread.start();
        thread2.start();
        //Join
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Main finish");
    }
}
