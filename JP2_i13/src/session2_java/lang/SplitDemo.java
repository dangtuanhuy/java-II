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
public class SplitDemo {

     private static final String REGEX = "\\d";
      private static final String DAY = "Sun1Mon2Tue:Wed:Thu:Fri:Sat";
  
    public static void main(String[] args) {
        // TODO code application logic here
       Pattern pattern  = Pattern.compile(REGEX);
       String[] days = pattern.split(DAY);
       for(String s: days)
            System.out.println(s);
  
        
    }
}
