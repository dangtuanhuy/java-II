/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;

/**
 *
 * @author maithicamnhung
 */
public class File_copy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path source = Paths.get("D:\\copy.txt");
        Path target = Paths.get("D:\\lan.txt");
        try {
            Files.copy(source, target, REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
