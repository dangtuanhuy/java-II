/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.joinDemo;

/**
 *
 * @author maithicamnhung
 */
public class TestThreadX_join {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ThreadX t=new ThreadX("Luồng X");
        t.start();
        try {
            t.join(); //---Đợi t làm xong rồi mới làm tiếp
        } catch (InterruptedException e) {}
        System.out.println("t đã xong");
    }

}
