/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session8_multiThread.synchronize;

/**
 *
 * @author maithicamnhung
 */
public class DepositAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account account = new Account();
        Transaction transac1 = new Transaction(account, 500);
        Transaction transac2 = new Transaction(account, 200);
    }
}
