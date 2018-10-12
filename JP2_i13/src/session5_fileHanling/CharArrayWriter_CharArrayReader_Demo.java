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
public class CharArrayWriter_CharArrayReader_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("---CharArrayWriter-----");
        String str = "Chào bạn Nhung";
        CharArrayWriter chWriter;
        chWriter = new CharArrayWriter();
        System.out.println("----String----");
        chWriter.write(str, 4, 9);
        System.out.println(chWriter);
        
        System.out.println("---CharArrayReader------");
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        CharArrayReader reader = new CharArrayReader(ch);
        int i;
        while((i = reader.read()) != -1)
            System.out.print((char)i + "\t");
    }
}
