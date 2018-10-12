/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;
import java.io.ByteArrayInputStream;

/**
 *
 * @author maithicamnhung
 */
public class ByteArrayInputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte[] buf = {65,66,67};
        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
        int b = 0;
        while((b = bais.read()) != -1){
            char c = (char)b;
            System.out.println("Byte: " + b + "; Char: " + c);
        }
        
    }
}
