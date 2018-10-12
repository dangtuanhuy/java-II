/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/**
 *
 * @author maithicamnhung
 */
public class BufferOutputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream("D:\\hong.txt"));
            
            String str = "Hello you";
            buffer.write(str.getBytes(), 0, str.length());
            buffer.flush();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
