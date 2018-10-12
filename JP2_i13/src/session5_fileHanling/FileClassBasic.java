/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.File;

/**
 *
 * @author maithicamnhung
 */
public class FileClassBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            File file = new File("D:/nhung.txt");
            // true: khi da co file va co the doc duoc
            System.out.println(file.canRead());
            System.out.println(file.isFile());
            System.out.println(file.exists());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getPath());
            System.out.println(file.toURI());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
