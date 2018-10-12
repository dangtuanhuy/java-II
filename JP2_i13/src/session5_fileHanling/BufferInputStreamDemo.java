/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author maithicamnhung
 */
public class BufferInputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("D:\\nhung.txt");
            BufferedInputStream buffer = new BufferedInputStream(fileInput);
            
            int read;
            while((read = buffer.read()) != -1)
                System.out.println((char) read);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        
    }
}
