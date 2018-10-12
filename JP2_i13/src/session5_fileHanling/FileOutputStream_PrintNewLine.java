package session5_fileHanling;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maithicamnhung
 */
public class FileOutputStream_PrintNewLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("D:\\a.txt");
            PrintStream ps = new PrintStream(out);
            ps.print("Hello");
            ps.println();
            ps.print("dong2");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
