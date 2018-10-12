/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.synchronize;

/**
 *
 * @author maithicamnhung
 */
public class Transaction implements Runnable{
    double amount;
    Account account;
    Thread t;

    public Transaction(Account account,double amount) {
        this.amount = amount;
        this.account = account;
        t = new Thread(this);
        t.start();
    }
    
    // Synchronized
    @Override
    public void run() {
       //synchronized(account){
            account.deposit(amount);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                
            }
            account.displayBalance();
      // }
    }
    
}
