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
public class ReadingFileBufferedStreamIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path path = Paths.get("d:/copy.txt");
        Charset charset  = Charset.forName("US-ASCII");
        
        try( BufferedReader buffer =  Files.newBufferedReader(path, charset)){
            String line = null;
            while((line = buffer.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException ex){
            
        }
    }
}
