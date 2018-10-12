/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session1;

/**
 *
 * @author maithicamnhung
 */
public class AssertionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        int a = -2;
        assert a>0: "a khong duoc am";
        System.out.println("a = " + a);
        }catch(AssertionError a){
            System.out.println(a.getMessage());
        }
    }
    
}
