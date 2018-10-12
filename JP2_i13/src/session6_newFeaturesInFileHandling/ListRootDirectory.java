/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 *
 * @author maithicamnhung
 */
public class ListRootDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for (Path name : dirs) {
            System.err.println(name);
        }
    }
}
