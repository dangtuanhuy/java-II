/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session1_try_catch.wrapperException;

/**
 *
 * @author maithicamnhung
 */
public class Calculator {
    public void divide(int a, int b) throws CalculatorException{
        try{
            int result = a/b;
            System.out.println("Ket qua:" + result);
        } catch(ArithmeticException ex){
            throw new CalculatorException("Mau phai khac 0", ex);
        }
    }
}
