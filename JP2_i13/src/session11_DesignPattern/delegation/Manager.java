/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern.delegation;

/**
 *
 * @author maithicamnhung
 */
public class Manager implements Employee {

    private Secretary secretary;
    public Manager(){
        secretary = new Secretary();
    }
    @Override
    public void sentMail() {
        secretary.sentMail();
    }
    
}
