/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author maithicamnhung
 */
class FileFilter implements  FilenameFilter{

    String ext;
    public FileFilter(String ext){
        this.ext = "." + ext;
    }
    public boolean accept(File dir, String fName){
        return fName.endsWith(ext);
    }
   
}
public class DirList{
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fileObj = new File("d:");
        FileFilter fileFilter =  new FileFilter("txt");
        String[] fileNam = fileObj.list(fileFilter);
        System.out.println("So file tim thay: " + fileNam.length);
        System.out.println("");
        System.out.println("Ten cua file:");
        System.out.println("-----------------------");
        for(int i = 0; i<fileNam.length; i++){
            System.out.println(fileNam[i]);
        }     
    }
}
