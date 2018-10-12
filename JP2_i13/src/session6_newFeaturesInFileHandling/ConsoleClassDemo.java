/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.Console;

/**
 *
 * @author maithicamnhung
 */
public class ConsoleClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Console console = null;
        String name = "";
        try{
        console = System.console();
        if(console != null){
            name = console.readLine("Nhap ten: ");
            System.out.println("Name:" + name);
        }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
