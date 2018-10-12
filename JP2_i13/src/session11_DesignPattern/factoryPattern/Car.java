/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern.factoryPattern;

/**
 *
 * @author maithicamnhung
 */
public class Car implements Vehicle {

    @Override
    public void move() {
        System.out.println("Inside Car::move() method");
    }
    
}
