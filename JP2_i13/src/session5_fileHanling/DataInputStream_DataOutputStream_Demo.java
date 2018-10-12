/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author maithicamnhung
 */
public class DataInputStream_DataOutputStream_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            int[] i = {2, 12, 4, 6};
            FileOutputStream fos = new FileOutputStream("D:\\test.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            for (int value : i) {
                dos.writeInt(value);
            }
            dos.flush();
            InputStream is = new FileInputStream("D:\\test.txt");
            DataInputStream dis = new DataInputStream(is);
            int k = 0;
            while (dis.available() > 0) {
                k = dis.readInt();
                System.out.println("Gia tri: " + k);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        //String
//        try {
//            // TODO code application logic here
//            String[] arr = {"one", "two", "three"};
//            FileOutputStream fos = new FileOutputStream("D:\\testString.txt");
//            DataOutputStream dos = new DataOutputStream(fos);
//            for(String value : arr){
//                dos.writeChars(value);
//            }
//            dos.flush();
//            InputStream is = new FileInputStream("D:\\testString.txt");
//            DataInputStream dis = new DataInputStream(is);
//            char k ;
//            while(dis.available() > 0)
//            {
//                   k = dis.readChar(); 
//                   System.out.print(k);
//            }
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IOException ex) {
//                    ex.printStackTrace();
//        }
    }
}
