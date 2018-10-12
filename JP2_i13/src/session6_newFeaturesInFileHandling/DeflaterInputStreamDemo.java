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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DeflaterInputStream;

/**
 *
 * @author maithicamnhung
 */
public class DeflaterInputStreamDemo {

    public static byte[] increaseArray(byte[] arrtemp){
        byte[] temp = arrtemp;
        arrtemp = new byte[arrtemp.length + 1];
        // backs up the data
        for(int i = 0 ; i< temp.length ; i++){
            arrtemp[i] = temp[i];
        }
        return arrtemp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        FileOutputStream fous = null;
        try{
            File file = new File("D:/nhung.txt");
            FileInputStream fis = new FileInputStream(file);
            DeflaterInputStream deflater = new DeflaterInputStream(fis);
            // Creating byte array for deflating the data
            byte[] input = new byte[0];
            int index = -1;
            // reads data from file 
            int read = 0;
            while((read = deflater.read()) != -1){
                input = increaseArray(input);
                input[++index]= (byte)read;
            }
            fous = new FileOutputStream("D:/deflaterMain.dfl");
            fous.write(input, 0 , input.length);
            fous.close();           
            System.out.println("File size after compress: " + input.length);
        }catch(FileNotFoundException ex){
            Logger.getLogger(DeflaterInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                fous.close();   
            }catch(IOException ex){
                Logger.getLogger(DeflaterInputStreamDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
