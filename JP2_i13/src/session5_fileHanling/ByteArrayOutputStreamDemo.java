/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 * @author maithicamnhung
 */
public class ByteArrayOutputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String temp  = "This is a ByteArrayOutputStream";
        byte[] by = temp.getBytes();
        ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
        try {
            byteOutput.write(by);
            System.out.println("ByteArray = " + byteOutput.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
