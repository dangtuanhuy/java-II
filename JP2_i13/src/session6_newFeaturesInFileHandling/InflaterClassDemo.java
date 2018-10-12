/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 *
 * @author maithicamnhung
 */
public class InflaterClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "This is a example";
        try {
            //Deflater
            byte[] input = str.getBytes("UTF-8");
            byte[] output = new byte[100];
            Deflater deflater = new Deflater();
            deflater.setInput(input);
            deflater.finish();
            int compressDataLength = deflater.deflate(output);
            System.out.println("Compress data = " + compressDataLength);
            
            //Inflater
            Inflater inflater = new Inflater();
            inflater.setInput(output, 0, output.length);
            byte[] result = new byte[100];
            int resultLenght = inflater.inflate(result);
            inflater.end();
            System.out.println("Decompress data = " + resultLenght);
            String strOut = new String(result, 0, resultLenght, "UTF-8");
            System.out.println("Recover string = " + strOut);
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch(DataFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
}
