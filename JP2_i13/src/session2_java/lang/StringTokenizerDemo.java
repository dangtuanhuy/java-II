/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session2_java.lang;

import java.util.StringTokenizer;

/**
 *
 * @author maithicamnhung
 */
public class StringTokenizerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        StringTokenizer tokenDemo = new StringTokenizer("Hello cac ban");
        while (tokenDemo.hasMoreTokens()) {
            System.out.print(tokenDemo.nextToken() + "\t");
        }
        System.out.println();
        for (StringTokenizer stringTokenizer = new StringTokenizer("chao,cac,ban", ",");
                stringTokenizer.hasMoreTokens();) {
            String token = stringTokenizer.nextToken();
            System.out.println(token);
        }
    }

}
