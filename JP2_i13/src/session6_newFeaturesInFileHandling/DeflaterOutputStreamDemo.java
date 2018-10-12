/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;

/**
 *
 * @author maithicamnhung
 */
public class DeflaterOutputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            File filein = new File("D:/input.txt");
            FileInputStream fileRead = new FileInputStream(filein);
            File fileout = new File("D:/defalterOut.txt");
            FileOutputStream fileWrite = new FileOutputStream(fileout);
            DeflaterOutputStream deflaterWrite = new DeflaterOutputStream(fileWrite);
            System.out.println("Original file size: " + filein.length());
            int read = 0;
            while((read = fileRead.read()) != -1){
                deflaterWrite.write(read);
            }
            // Closing object
            deflaterWrite.close();
            fileRead.close();
            System.out.println("File size after compress: " + fileout.length());
        }catch(Exception ex){
            
        }
    }
}
