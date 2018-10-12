/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread;

/**
 *
 * @author maithicamnhung
 */
public class ThreadBasic extends Thread{

    String name;
    public void run(){
        // luu tru so luong Thread
        int count = 0;
        while(count <= 3){
            System.out.println(Thread.activeCount());
            name = Thread.currentThread().getName();
            count++;
            System.out.println(count + ":" + name);
            if(name.equals("Thread1"))
                System.out.println("Marimba");
            else
                System.out.println("Jini");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadBasic thread = new ThreadBasic();
        thread.setName("Thread1");
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(thread.isAlive());
    }
}
