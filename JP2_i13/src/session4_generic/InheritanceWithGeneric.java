/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session4_generic;

class Month<T>{
    T monthObj;

    public Month(T monthObj) {
        this.monthObj = monthObj;
    }
    // Return monthObject
    public T getMonth(){
        return monthObj;
    }
}
class MonthArray<T,V> extends Month<T>{
    V valObj;

    public MonthArray(T monthObj, V vObj) {
        super(monthObj);
        valObj = vObj;
    }
    V getVObject(){
        return valObj;
    }
}
/**
 *
 * @author maithicamnhung
 */
public class InheritanceWithGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MonthArray<String, Integer> month =  new MonthArray<>("Value is:", 99);
        System.out.println(month.getMonth());
        System.out.println(month.getVObject());
        
    }
}
