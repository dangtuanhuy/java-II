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
public class ReadFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path path = Paths.get("d:/a.txt");
        Path pathWrite = Paths.get("d:/copy.txt");
        byte[] fileArray;
        try {
            fileArray = Files.readAllBytes(path);
            for(byte b:fileArray){
                System.out.printf("%c", b);
            }
            Files.write(pathWrite, fileArray);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
