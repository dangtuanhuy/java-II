/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;

/**
 *
 * @author maithicamnhung
 */
public class DeflaterInputStreamDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("D:\\input.txt");
            FileOutputStream out = new FileOutputStream("D:\\output.txt");
            
            DeflaterInputStream deflater = new DeflaterInputStream(input);
            
            int readCount;
            byte[] data = new byte[1000];
            while((readCount = deflater.read(data, 0, 1000)) != -1){
                out.write(data, 0, readCount);
            }
            System.out.println(data);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException e){
            System.out.println(e.getMessage());
        } 
    }
}
