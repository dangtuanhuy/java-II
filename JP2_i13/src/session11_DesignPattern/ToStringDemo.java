/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern;

/**
 *
 * @author maithicamnhung
 */
public class ToStringDemo {

    private double num, exp;

    public ToStringDemo(double num, double exp) {
        this.num = num;
        this.exp = exp;
    }
    
    public String toString(){
        return String.format(num + "E+" + exp);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ToStringDemo c1 = new ToStringDemo(15, 10);
        System.out.println(c1.toString());
    }
}
