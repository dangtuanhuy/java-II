package session8_atomicVariable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author maithicamnhung
 */
public class ThreadPoolDemo {
    
    int sotien = 200;

    public ThreadPoolDemo() {
    }

    public ThreadPoolDemo(int sotien) {
        this.sotien = sotien;
    }
    
    public void rutTien(int soTienRut){
        System.out.println("Tien truoc khi " + Thread.currentThread().getName() + " rut la = " + sotien);
        sotien = sotien - soTienRut;
        System.out.println("Tien truoc khi " + Thread.currentThread().getName() + " rut la = " + sotien);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final ThreadPoolDemo t = new ThreadPoolDemo();
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                Thread.currentThread().setName("nhung");
               t.rutTien(100);
            }
        }).start();
        
         Executor exec = Executors.newFixedThreadPool(1);
         exec.execute(new Runnable() {

            @Override
            public void run() {
                Thread.currentThread().setName("hong");
               t.rutTien(50);
            }
        });
    }
    
}
