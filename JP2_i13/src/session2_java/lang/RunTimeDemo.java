/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session2_java.lang;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maithicamnhung
 */
public class RunTimeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Max:"+Runtime.getRuntime().maxMemory());
            System.out.println("Free: " + Runtime.getRuntime().freeMemory());
            System.out.println("Available: " + Runtime.getRuntime().availableProcessors());
            System.out.println("Thuc thi:" + Runtime.getRuntime().exec("explorer") );
        } catch (IOException ex) {
            Logger.getLogger(RunTimeDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
