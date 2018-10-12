/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session2_java.lang;

/**
 *
 * @author maithicamnhung
 */
public class ObjectClass {

    Integer num;
    public ObjectClass(){
        
    }
    
    public ObjectClass(Integer num1){
        this.num = num1;
    }
    
    public void getStringForm(){
        System.out.println("String form of num is: " + num.toString());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ObjectClass obj1 = new ObjectClass(1234);
        ObjectClass obj2 = new ObjectClass(1234);
        obj1.getStringForm();
        System.out.println("-------==------");
        if(obj1==obj2)
               System.out.println("2 object are equal");
        else
            System.out.println("not equal");
        System.out.println("-------equals------");
        if(obj1.equals(obj2))
               System.out.println("2 object are equal");
        else
            System.out.println("not equal");
        System.out.println("-----------------");
        obj1 = obj2;
         if(obj1.equals(obj2))
               System.out.println("2 object are equal");
        else
            System.out.println("not equal");
         if(obj1.num.equals(obj2.num))
               System.out.println("2 object are equal");
        else
            System.out.println("not equal");
         
         System.out.println(obj1.getClass().getName());
    }
}
