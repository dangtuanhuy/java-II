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
import java.util.zip.InflaterInputStream;

/**
 *
 * @author maithicamnhung
 */
public class InflaterInputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fileOut = new File("D:/inflaterMain.dfl");
        try {
            FileOutputStream foutWrite = new FileOutputStream(fileOut);
            File fileInput = new File("D:/defalterOut.txt");
            FileInputStream finRead = new FileInputStream(fileInput);
            InflaterInputStream defRead = new InflaterInputStream(finRead);
            System.out.println("File zize before inflation: " + fileInput.length());
            
            // Inflating the file to original size
            int read = 0;
            while((read = defRead.read()) != -1){
                foutWrite.write(read);
            }
            foutWrite.close();
            System.out.println("File size after inflation: " + fileOut.length());
        } catch (FileNotFoundException ex) {
            File fileInput = new File("D:/InflaterMain.java");ex.printStackTrace();
        } catch(IOException ex2){
            
        }
    }
}
