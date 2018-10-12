/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author maithicamnhung
 */
public class FileContent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path dir = Paths.get("D:\\");
        try {
            DirectoryStream<Path> directory = Files.newDirectoryStream(dir, "*.txt");
            for(Path file : directory)
                System.out.println(file.getFileName());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
