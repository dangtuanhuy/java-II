/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;

/**
 *
 * @author maithicamnhung
 */
public class CheckedInputStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CheckedInputStream cis;
            cis = new CheckedInputStream(new FileInputStream("D:\\nhung.txt"), new Adler32());

            byte[] tempBuf = new byte[128];
            while (cis.read(tempBuf) >= 0) {
            }
            long checksum = cis.getChecksum().getValue();
            System.out.println(checksum);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();

        }


    }
}
