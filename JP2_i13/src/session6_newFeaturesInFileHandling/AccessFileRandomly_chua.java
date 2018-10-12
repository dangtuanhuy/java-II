/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Iterator;

/**
 *
 * @author maithicamnhung
 */
public class AccessFileRandomly_chua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "This is a line";
        byte[] byteArray = str.getBytes();
        ByteBuffer byteBuff = ByteBuffer.wrap(byteArray);
        ByteBuffer bufferCopy = ByteBuffer.allocate(20);
        Path path = Paths.get("D:/output.txt");
        // tao file neu no kh ton tai
        try(FileChannel fcOnject = (FileChannel.open(path , 
                CREATE, READ, WRITE))){
            // doc 20 ky tu tu file
            int nreadChar;
            do{
                nreadChar = fcOnject.read(bufferCopy);
                System.out.println(nreadChar);
            }while(nreadChar != -1 && bufferCopy.hasRemaining());
            // viet chuoi o vi tri bat dau file
            fcOnject.position(0);
            while(byteBuff.hasRemaining()){
                fcOnject.write(byteBuff);
            }
            byteBuff.rewind();
            // di chuyen den cuoi file va copy 20 ky tu vao cuoi file
            long length = fcOnject.size();
            fcOnject.position(length-1);
            // tung buffer va dat vi tri hien tai
            bufferCopy.flip();
            while(bufferCopy.hasRemaining()){
                fcOnject.write(bufferCopy);
            }
            while(byteBuff.hasRemaining()){
                fcOnject.write(byteBuff);
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
