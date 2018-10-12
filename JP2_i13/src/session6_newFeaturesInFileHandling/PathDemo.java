/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author maithicamnhung
 */
public class PathDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("D:\\mtcnhung\\Quan ly diem\\quanlydiem.pdf");
        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        System.out.println(path.getParent().getFileName());
        System.out.println("Name count : " + path.getNameCount());
        System.out.println("Is absolute : " + path.isAbsolute());
    }
}
