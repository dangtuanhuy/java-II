/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterOutputStream;

/**
 *
 * @author maithicamnhung
 */
public class InflaterOutputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File fInput = new File("D:/defalterOut.txt");
            FileInputStream finRead = new FileInputStream(fInput);
            
            File fout = new File("D:/inflaterOutputStream.txt");
            FileOutputStream foutWrite = new FileOutputStream(fout);
            InflaterOutputStream inflaterWrite = new InflaterOutputStream(foutWrite);
            System.out.println("Original file size: " + fInput.length());
            int read = 0;
            while((read = finRead.read()) != -1){
                inflaterWrite.write(read);
            }
            System.out.println("File size after inflation: " + fout.length());
         } catch (FileNotFoundException ex) {
            ex.printStackTrace();
         } catch(IOException ex2){
             
         }
    }
}
