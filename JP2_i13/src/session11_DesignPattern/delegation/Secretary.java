/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern.delegation;

/**
 *
 * @author maithicamnhung
 */
public class Secretary implements Employee {

    @Override
    public void sentMail() {
        System.out.println("Secretary sent Mail");
    }
    
}
