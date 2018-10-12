/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern;

/**
 *
 * @author maithicamnhung
 */
public class SingletonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        singletonExample.display();
        
        SingletonExample sing2 = SingletonExample.getInstance();
        sing2.display();
    }
}
