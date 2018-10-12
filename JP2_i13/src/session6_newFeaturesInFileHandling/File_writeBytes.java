/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author maithicamnhung
 */
public class File_writeBytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("D:\\b.txt");
        String str = "This is a example";
        byte[] by = str.getBytes();
        try {
            Files.write(path, by);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
