/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session1_try_catch;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author maithicamnhung
 */
public class MultipleCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int a, b;
            System.out.println("Nhap a=");
            Scanner input = new Scanner(System.in);
            a = Integer.parseInt(input.nextLine());
            System.out.println("Nhap b = ");
            b = Integer.parseInt(input.nextLine());
            System.out.println("a/b = " + (a/b));
        }catch(InputMismatchException|ArithmeticException|NumberFormatException ex){
            System.err.println(ex + ":" + ex.getMessage());
            Throwable t = ex.getCause();
            System.out.println("Nguyen nhan : " + t);
        }
    }
    
}
