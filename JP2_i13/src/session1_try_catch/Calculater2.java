/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session1_try_catch;

/**
 *
 * @author maithicamnhung
 */
public class Calculater2 {

    public void divide(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException();
        int result = a/b;
        System.out.println("Result: " + result);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Calculater2 cal = new Calculater2();
            cal.divide(2, 1);
            int mark[] = {2, 5, 7};
            int tong = 0;
            for(int i = 0; i< 3; i++)
                tong = tong+mark[i];
            System.out.println("Tong = " + tong);
        } catch(ArithmeticException|IndexOutOfBoundsException ex){
            System.out.println("b phai khac 0");
        }
    }
}
