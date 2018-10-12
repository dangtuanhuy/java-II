/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/**
 *
 * @author maithicamnhung
 */
public class FilterInputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FilterInputStream filterInput = null;
        byte[] bufferInput = new byte[15];
        int i = 0;
        char c;
        try {
            filterInput = new BufferedInputStream(new FileInputStream("D:/nhung.txt"));
            //so byte doc tu file
            i = filterInput.read(bufferInput);
            System.out.println("So byte da doc: " + i);
            for (byte b : bufferInput) {
                System.out.println("Ky tu:" + (char) b);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
