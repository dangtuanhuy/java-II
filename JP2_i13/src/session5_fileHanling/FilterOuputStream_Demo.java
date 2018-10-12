/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;
import java.io.*;
import javax.print.DocFlavor.BYTE_ARRAY;

/**
 *
 * @author maithicamnhung
 */
public class FilterOuputStream_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileOutputStream fout = null;
        FilterOutputStream filterOut = null;
        
        byte[] buffer = {65,66,67,68,69};
        int i = 0;
        char c;
        try{
             fout = new FileOutputStream("D:/nhung.txt");
             filterOut = new FilterOutputStream(fout);
             filterOut.write(buffer);
             //filterOut.flush();
        }catch(IOException ex){
           
        }
    }
}
