/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.joinDemo;

/**
 *
 * @author maithicamnhung
 */
public class TestThreadX_noJoin {
    public static void main(String[] args) {
        
        ThreadX t=new ThreadX("Luồng X");
        t.start();
        System.out.println("t đã xong");
    }
}
