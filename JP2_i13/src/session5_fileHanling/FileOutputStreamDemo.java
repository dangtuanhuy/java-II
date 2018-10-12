/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author maithicamnhung
 */
public class FileOutputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String temp = "This is a example";
        byte[] by = temp.getBytes();
        try {
            OutputStream file = new FileOutputStream("D:/nhung.txt");
            file.write(by);
            file.write(65);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex2){
            
        }
    }
}
