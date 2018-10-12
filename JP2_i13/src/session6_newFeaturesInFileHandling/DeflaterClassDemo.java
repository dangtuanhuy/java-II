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
public class DeflaterClassDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "This is a deflater helllo";
        try {
            byte[] inputObject = input.getBytes("UTF-8");
            byte[] outputObject = new byte[100];
            Deflater compress = new Deflater();
            compress.setInput(inputObject);
            compress.finish();
            int compressDataLength = compress.deflate(outputObject);
            System.out.println("Compress data length:" + compressDataLength);
            compress.end();
            
            //Decompress the bytes
            Inflater decompress = new Inflater();
            decompress.setInput(outputObject, 0, compressDataLength);
            byte[] result = new byte[100];
            int resultLength = decompress.inflate(result);
            System.out.println("DeCompress data length:" + resultLength);
            decompress.end();
            
            //Decode the bytes into a string
            String strOutput = new String(result, 0 , resultLength, "UTF-8");
            System.out.println("Recovered string is: " + strOutput);
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        } catch (DataFormatException ex2){
            
        }
        
    }
}
