/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maithicamnhung
 */
public class FileDescriptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
            throws FileNotFoundException,
            IOException {
        File f = new File("D:/abc.txt");
        FileOutputStream out = new FileOutputStream(f);
        System.out.println(out.getFD());
        out.write(67);
        FileOutputStream out2 = new FileOutputStream(out.getFD());
        //System.out.println(out.getFD());
        out2.write(68);
        FileInputStream input = new FileInputStream(f);
        while (input.available() > 0) {
            System.out.println((char) input.read());
        }
        System.out.println(out2.getFD().valid());
    }
}
