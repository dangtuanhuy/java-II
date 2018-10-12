/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session6_newFeaturesInFileHandling;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 *
 * @author maithicamnhung
 */
public class FindFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PathMatcher matcher = FileSystems.getDefault().
                getPathMatcher("glob:D:/*.{txt,doc}");
        Path fileName = Paths.get("D:/output.txt");
        if(matcher.matches(fileName)){
            System.out.println("Hop le");
        }else{
            System.out.println("Khong hop le");
        }
    }
    
}
