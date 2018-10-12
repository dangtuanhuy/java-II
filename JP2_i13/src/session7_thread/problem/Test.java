/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session7_thread.problem;

/**
 *
 * @author maithicamnhung
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        First first = new First();
        Second second = new Second();
        
        first.run();
        second.run();
    }
}
