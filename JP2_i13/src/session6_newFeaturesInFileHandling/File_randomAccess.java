/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session6_newFeaturesInFileHandling;

import java.util.EnumSet;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.WRITE;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 *
 * @author maithicamnhung
 */
public class File_randomAccess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path path = Paths.get("D:\\a123.txt");
        try {
            SeekableByteChannel sbc = Files.newByteChannel(path, EnumSet.of(CREATE, APPEND, WRITE));
            ByteBuffer buff = ByteBuffer.wrap("Writing text".getBytes());
            System.out.println("Bytes written = " + sbc.write(buff));
            buff.clear();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
