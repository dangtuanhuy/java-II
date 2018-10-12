/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

/**
 *
 * @author maithicamnhung
 */
public class File_check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("D:\\nhung.txt");
        System.out.println(Files.exists(path));
        System.out.println(Files.isReadable(path));
    }
}
