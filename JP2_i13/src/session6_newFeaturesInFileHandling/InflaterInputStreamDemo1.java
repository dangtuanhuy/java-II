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
import sun.audio.AudioDataStream;

/**
 *
 * @author maithicamnhung
 */
public class InflaterInputStreamDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File file = new File("D:\\nen.txt");
            FileInputStream fileInput =  new FileInputStream(file);
            InflaterInputStream inflaterInput = new InflaterInputStream(fileInput);
                                               
            System.out.println("Kich thuoc file truoc khi inflater = " + file.length());
            
            File file2 =  new File("D:\\giainen.txt");
            FileOutputStream fileOut = new FileOutputStream(file2);
            int ch;
            while((ch = inflaterInput.read()) != -1)
                fileOut.write(ch);
            fileOut.close();
            inflaterInput.close();
            fileInput.close();
            
            System.out.println("Kich thuoc cua file sau khi inflater = " + file2.length());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
