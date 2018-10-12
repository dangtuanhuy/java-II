/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author maithicamnhung
 */
public class File_readBufferStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("D:\\input.txt");
        Charset charset = Charset.forName("UTF-8");
        try {
            BufferedReader buffer = Files.newBufferedReader(path, charset);
            String line = null;
            while((line = buffer.readLine()) != null)
                System.out.println(line);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
