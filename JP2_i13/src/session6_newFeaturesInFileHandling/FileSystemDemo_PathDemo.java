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
public class FileSystemDemo_PathDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("D:\\mtcnhung\\Quan ly diem\\quanlydiem.pdf");
        System.out.println(path.getRoot());
        System.out.println(path.getParent());
    }
}
