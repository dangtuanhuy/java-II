/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session1_try_catch;

/**
 *
 * @author maithicamnhung
 */
public class Calculator {

    int result;
    public int divide(int num1, int num2){
        try{
            result =  num1/num2;
            return result;
        }catch(Exception ex){
            System.out.println("So chia phai khac 0" + ex.getMessage());
            return 0;
        }finally{
            System.out.println("Ket thuc phuong thuc");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator cal = new Calculator();
        float rs = cal.divide(2, 0);
        System.out.println("Result= " + rs);
        System.out.println("Ket thuc chuong trinh");
    }
}
