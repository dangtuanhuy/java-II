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
public class CustomException extends Exception{
    String message;

    public CustomException() {
        message = "";
    }    
    
    public CustomException(String message) {
        this.message = message;
    }

    public CustomException(String message, Throwable cause) {
        super(message,cause);
    }
    
    
    
    @Override
    public String getMessage(){
        return message;
    }
}
