/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 *
 * @author maithicamnhung
 */
public class DeflaterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "This is a example";
        try {
            byte[] inputObj = input.getBytes("UTF-8");
            byte[] output = new byte[100];
            Deflater deflater = new Deflater();
            deflater.setInput(inputObj);
            deflater.finish();
            int compressDataLength = deflater.deflate(output);
            System.out.println(input);
            System.out.println(output);
            deflater.end();
            
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}
