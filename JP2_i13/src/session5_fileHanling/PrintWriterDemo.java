/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;
import java.io.*;

/**
 *
 * @author maithicamnhung
 */
public class PrintWriterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "Chào bạn Nhung";
        
        PrintWriter pw;
        try {
            pw = new PrintWriter("D:/hong.txt");
            pw.print(text);
            pw.println();
            pw.print("Lan");
            pw.flush();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
}
