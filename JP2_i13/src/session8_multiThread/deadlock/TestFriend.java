/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.deadlock;

/**
 *
 * @author maithicamnhung
 */
public class TestFriend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Friend lan = new Friend("Lan");
        final Friend hong = new Friend("Hong");
        new Thread(new Runnable() {

            public void run() {
                lan.bow(hong);
            }
        }).start();
        new Thread(new Runnable() {

            public void run() {
                hong.bow(lan);
            }
        }).start();
    }
}
