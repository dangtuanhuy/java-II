/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session1_try_catch.wrapperException;

/**
 *
 * @author maithicamnhung
 */
public class CalculatorException extends Exception{

    public CalculatorException() {
    }
    
    public CalculatorException(Throwable cause){
        super(cause);
    }
    
    public CalculatorException(String message, Throwable cause){
        super(message, cause);
    }
}
