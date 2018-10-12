/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread;

/**
 *
 * @author maithicamnhung
 */
public class ThreadDemo implements Runnable {

    String name;
    Thread objThread;

    public ThreadDemo(String name) {
        this.name = name;
        objThread = new Thread(this, name);
        System.out.println("New Thread are starting: " + objThread);
        objThread.start();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadDemo thread1 = new ThreadDemo("one");
        ThreadDemo thread2 = new ThreadDemo("two");
        ThreadDemo thread3 = new ThreadDemo("three");
        System.out.println("First thread is alive ?" + thread1.objThread.isAlive());
        System.out.println("Second thread is alive ?" + thread2.objThread.isAlive());
        System.out.println("Three thread is alive ?" + thread3.objThread.isAlive());
        try{
            System.out.println("In the main method, waiting for the threads to finish.");
            thread1.objThread.join();
            thread2.objThread.join();
            thread3.objThread.join();
            System.out.println("Main exit.");
        }catch(InterruptedException ex){
            System.out.println("Main thread is interrupted.");
            System.out.println("First thread is alive: " + thread1.objThread.isAlive());
            System.out.println("Second thread is alive: " + thread2.objThread.isAlive());
            System.out.println("Three thread is alive: " + thread3.objThread.isAlive());
        }
    }

    @Override
    public void run() {
        try {
            for (int count = 0; count < 2; count++) {
                System.out.println(name + ":" + count);
                objThread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            System.out.println(name + ":Interrupt");
        }
        System.out.println( name + ":exitting");
    }
}
