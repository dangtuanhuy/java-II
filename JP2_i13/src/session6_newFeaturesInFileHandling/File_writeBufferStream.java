/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author maithicamnhung
 */
public class File_writeBufferStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("D:\\c.txt");
        Charset charset = Charset.forName("UTF-8");
        
        String str = "CHào các bạn";
        try {
            BufferedWriter buffer = Files.newBufferedWriter(path, charset);
            buffer.write(str, 0, str.length());
            buffer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
