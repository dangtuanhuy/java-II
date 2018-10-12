/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author maithicamnhung
 */
public class ObjectInputStream_ObjectOutputStream_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1567;
        try {
            FileOutputStream fos = new FileOutputStream("D:/test.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(fos);
            objectOut.writeInt(i);
            objectOut.writeInt(23);
            
            objectOut.close();
            
            ObjectInputStream objectInt = new ObjectInputStream(new FileInputStream("D:/test.txt"));
            System.out.println("Input:");
            System.out.println(objectInt.readInt());
            System.out.println(objectInt.readInt());
            // kh co doi tuong de in
            System.out.println(objectInt.readInt()); 
            objectInt.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Khong tim thay file");
        } catch (IOException ex2){
            
        }
        
    }
}
