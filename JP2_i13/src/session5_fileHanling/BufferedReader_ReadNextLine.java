package session5_fileHanling;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Scanner;
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
public class BufferedReader_ReadNextLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input: file co 3 dong va chuoi co dau
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\a.txt")));
            String newLine = "";
            while((newLine = buffer.readLine()) != null){
                System.out.println(newLine);
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex){
        }
        
    }

}
