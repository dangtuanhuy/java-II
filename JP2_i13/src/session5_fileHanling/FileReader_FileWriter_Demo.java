/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;
import java.io.*;

/**
 *
 * @author maithicamnhung
 */
public class FileReader_FileWriter_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader intObjStream = null;
        FileWriter outObjStream = null;
        try {
            // TODO code application logic here
            intObjStream = new FileReader("D:/hong.txt");
            int ch;
            while((ch = intObjStream.read()) != -1){
                System.out.printf("%c", ch);
            }
            outObjStream = new FileWriter("D:/lan.txt");
            outObjStream.write("Hello you");
            outObjStream.flush();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex2){
            
        }
                
    }
}
