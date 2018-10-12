/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

/**
 *
 * @author maithicamnhung
 */
public class DOSFileAttriApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Path pathObj;
        pathObj = Paths.get("D:/output.txt");
        try {
            DosFileAttributes attrObj
                    = Files.readAttributes(pathObj, DosFileAttributes.class);
            System.out.println("Is ReadOnly:" + attrObj.isReadOnly());
            System.out.println("Is Hidden: " + attrObj.isHidden());
            System.out.println("Is Directory: " + attrObj.isDirectory());
            System.out.println("Is RegularFile: " + attrObj.isRegularFile());
            System.out.println("Is System: " + attrObj.isSystem());
        } catch (UnsupportedOperationException ex) {
            System.err.println("DOS file" + " attributes not supported:" + ex);
        }
    }
}
