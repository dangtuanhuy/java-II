/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern;

import java.util.Scanner;

/**
 *
 * @author maithicamnhung
 */
public class Student {

    private int ID;
    public int getID(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value:");
        ID = Integer.parseInt(input.nextLine());
        return ID;
    }
    
    public boolean equals(Object obj){
        if(getID() == ((Student)obj).getID())
            return true;
        else
            return false;
    }
    
    public int hashCode(){
        return ID;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        
        if(s1.equals(s2))
            System.out.println("Hai ID bang nhau");
        else
            System.out.println("Hai ID khong bang nhau");
    }
}
