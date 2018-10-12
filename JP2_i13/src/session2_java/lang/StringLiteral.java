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
public class StringLiteral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pattern pattern = Pattern.compile(".abat ", Pattern.DOTALL);
        Matcher match = pattern.matcher(" abat");
        while(match.find()){
            System.out.println("Tim thay chuoi '" + match.group() + "'"
                    + " tai vi tri: " + match.start()
                    + " ket thuc o vi tri: " + match.end());
        }
        System.out.println("group: " + match.groupCount());
        
        // Matches
        if(Pattern.matches("\\d", "abcd")){
            System.out.println("True");
        }
    }
}
