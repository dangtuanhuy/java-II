/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author maithicamnhung
 */
public class FileInputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        FileInputStream input = new FileInputStream("D:/nhung.txt");
        int ch;
        try {
            while((ch = input.read()) > -1){
                System.out.printf("%c ", ch);
            }
        } catch (IOException ex) {
            System.out.println("Khong tim thay file");
        }
    }
}
