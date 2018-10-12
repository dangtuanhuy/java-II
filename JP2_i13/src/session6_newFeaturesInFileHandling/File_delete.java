/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author maithicamnhung
 */
public class File_delete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Path path = null;
        Path path = Paths.get("D:\\nhung.txt");
        try {
            Files.delete(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
