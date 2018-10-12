/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread;

/**
 *
 * @author maithicamnhung
 */
class MyThread implements Runnable {

    String name;

    @Override
    public void run() {
        int count = 0;
        System.out.println("MyThread");
        while (count < 3) {
            name = Thread.currentThread().getName();
            System.out.println(count + ":" + name);
            count++;
        }
    }
}

public class Thread_Runable {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        System.out.println("Thread main");
        thread.start();
    }
}
