/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session1_try_catch.wrapperException;

/**
 *
 * @author maithicamnhung
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Calculator cal = new Calculator();
            cal.divide(10, 0);
        } catch(CalculatorException ex){
            Throwable t = ex.getCause();
            System.out.println("Loi: " + ex.getMessage());
            System.out.println("Nguyen nhan:" + t);
        }
    }
}
