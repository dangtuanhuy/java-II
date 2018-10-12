/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 *
 * @author maithicamnhung
 */
public class File_DirectorySreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path path = Paths.get("D:/");
        try( DirectoryStream<Path> directory = Files.newDirectoryStream(path, "*.txt")){
            for(Iterator<Path> iter = directory.iterator(); iter.hasNext();){
                Path files = iter.next();
                System.out.println(files.getFileName());
            }
        } catch(IOException | DirectoryIteratorException ex){
            System.out.println("Loi");
        }
    }
}
