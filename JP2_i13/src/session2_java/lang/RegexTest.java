/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session2_java.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author maithicamnhung
 */
public class RegexTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //lookingAt: tim phu hop giua trinh tu dau vao va chuoi tim kiem
        System.out.println("=========LookingAt==========");
         Pattern pattern1 = Pattern.compile("ab");
        Matcher match = pattern1.matcher("ab");
        if(match.lookingAt())
            System.out.println("Tim Thay");
        else
            System.out.println("Khong tim thay");
        
        if(match.lookingAt()){
            System.out.println("Tim thay: " + match.group() +" bat dau: " + match.start() + 
                            ", ket thuc vi tri: " + match.end());
        }
        
        System.out.println("=========Find==========");
        //find: quet chuoi dau vao va tim chuoi phu hop
            Pattern pattern2 = Pattern.compile("ab");
        Matcher match2 = pattern2.matcher("abaa");
        if(match2.find())
            System.out.println("Tim Thay");
        else
            System.out.println("Khong tim thay");
        
        while(match2.find()){
            System.out.println("Tim thay: " + match.group() +" bat dau: " + match.start() + 
                            ", ket thuc vi tri: " + match.end());
        }
        
        //matches : phu hop toan bo chuoi dau vao
        System.out.println("=========Matches==========");
         Pattern pattern = Pattern.compile("ab");
        Matcher match3 = pattern.matcher("abaa");
        if(match3.matches())
            System.out.println("Tim Thay");
        else
            System.out.println("Khong tim thay");
        
        if(match3.matches()){
            System.out.println("Tim thay: " + match.group() +" bat dau: " + match.start() + 
                            ", ket thuc vi tri: " + match.end());
        }
    }
}
