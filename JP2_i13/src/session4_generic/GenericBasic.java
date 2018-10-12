/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session4_generic;

/**
 *
 * @author maithicamnhung
 */
public class GenericBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleGeneric2<String> generic = new SimpleGeneric2<String>("Java2");
        generic.printType();
        
        SimpleGeneric2<Integer> boolGeneric = new SimpleGeneric2<Integer>(10);
        boolGeneric.printType();
        
    }
}
class SimpleGeneric2<T>{
    // declare of object type T
    T objReff;
    
    //constructor to accept type parameter T
    public SimpleGeneric2(T para){
        this.objReff = para;
    }
    
    public<T> void printType(){
        System.out.println("Type: " + objReff.getClass().getName());
    }
    
}
