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
public class RegularExpressionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pattern p = Pattern.compile("a*b");
       Matcher m = p.matcher("aaab");
        boolean a= m.matches();
        
        //boolean a= Pattern.matches("a*b","aaab"); // cach thu hai ngan gon hon
        
       // boolean b = m.lookingAt();
        //boolean c = m.find(4);
        if(a){
            System.out.println("Hop le");
        } 
        else{
            System.out.println("Khong hop le");
        }
    }
}
