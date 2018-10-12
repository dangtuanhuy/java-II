package session5_fileHanling;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
public class FileWriter_WriteNewLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("D:\\a.txt");
            writer.write("Mai THị Cẩm Nhung");
            //writer.write(System.lineSeparator());
            writer.write("Mai THị Cẩm Nhung");
            writer.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {

        }
    }

}
