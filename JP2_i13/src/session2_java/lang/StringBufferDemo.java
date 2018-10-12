/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2_java.lang;

/**
 *
 * @author maithicamnhung
 */
public class StringBufferDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Nhung");
        buffer.append("hello");
        System.out.println(buffer);
        buffer.delete(2, 4);
        System.out.println(buffer);
        System.out.println(buffer.substring(3, 5));
    }

}
