/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session1_try_catch.custionException;

/**
 *
 * @author maithicamnhung
 */
public class TestCustomException {

    int number;
    public void setNumber(int num) throws CustomException{
        if(num < 0) throw new CustomException("Phai la so duong !");
        number = num;
        System.out.println("Num = " + number);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            TestCustomException test = new TestCustomException();
            test.setNumber(-2);
        } catch(CustomException ex){
            System.err.println( ex.getMessage());
        }
    }
    
}
