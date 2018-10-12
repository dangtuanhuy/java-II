package session8_atomicVariable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author maithicamnhung
 */
public class AtomicVariableSimple {
    private AtomicInteger c = new AtomicInteger(0);
    
    public void increment(){
        c.incrementAndGet();
    }
    
    public void decrement(){
        c.decrementAndGet();
    }
    
    public int value(){
        return c.get();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final AtomicVariableSimple atomic = new AtomicVariableSimple();
        
        new Thread(new Runnable() {

            @Override
            public void run() {
               atomic.increment();
               System.out.println("Value = " + atomic.value());
            }
        }).start();
        
        new Thread(new Runnable() {

            @Override
            public void run() {
               atomic.increment();
               System.out.println("Value = " + atomic.value());
            }
        }).start();
    }
    
}
