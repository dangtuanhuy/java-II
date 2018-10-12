/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session2_java.lang;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author maithicamnhung
 */
public class RegexTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String regex, search;
        boolean found = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap mau:");
        regex = input.nextLine();
        System.out.println("Nhap chuoi can kiem tra:");
        search = input.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher mather = pattern.matcher(search);
        while (mather.find()) {
            System.out.println("Tim thay chuoi " + mather.group()
                    + " bat dau o vi tri " + mather.start()
                    + ", ket thuc o vi tri " + mather.end());
            found = true;
        }
        if(!found)
            System.out.println("Khong tim thay");

    }
}
