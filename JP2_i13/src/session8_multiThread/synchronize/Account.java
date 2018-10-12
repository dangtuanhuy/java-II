/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.synchronize;

/**
 *
 * @author maithicamnhung
 */
public class Account {
    double balance = 200.0;
    public void deposit(double account){
        balance = balance + account;
    }
    
    public void displayBalance(){
        System.out.println("Thread:" + Thread.currentThread().getName());
        System.out.println("Balance is:" + balance);
    }
    
}
