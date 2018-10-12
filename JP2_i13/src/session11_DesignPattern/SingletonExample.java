/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern;

/**
 *
 * @author maithicamnhung
 */
public class SingletonExample {
    private static SingletonExample singletonExample = null;
    private SingletonExample(){
        
    }
    
    public static SingletonExample getInstance(){
        if(singletonExample == null)
            singletonExample = new SingletonExample();
        return singletonExample;
    }
    
    public void display(){
        System.out.println("Welcome to Singleton Design Pattern.");
    }
}
