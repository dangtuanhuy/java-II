/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maithicamnhung
 */
public class File_readFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("D:\\a.txt");
        try {
            byte[] by = Files.readAllBytes(path);
            for(byte b : by)
                System.out.println((char)b);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
//        try {
//            List<String> listString = Files.readAllLines(path);
//            for (String string : listString) {
//                System.out.println(string);
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(File_readFiles.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
