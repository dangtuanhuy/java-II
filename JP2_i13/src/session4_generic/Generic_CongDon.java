/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session4_generic;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maithicamnhung
 */
public class Generic_CongDon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        SimpleGeneric<Integer> b = new SimpleGeneric<>(10);        
        String[] listString = {"one", "two", "three"};
        b.addList(listString);
        
        SimpleGeneric<Integer> inter = new SimpleGeneric<>();
        Integer[] listInt = {1,10,5};
        inter.addList(listInt);
    }
    
}
class SimpleGeneric<T>{
    T objT;

    public SimpleGeneric() {
    }
    
    

    public SimpleGeneric(T objT) {
        this.objT = objT;
    }
    
    public void printObj(){
        System.out.println(objT + ":" + objT.getClass().getSimpleName());
    }
    
    <T> void displayList(T[] list){
         for (T t : list) {
             System.out.println(t);
        }
     }
    
    <T> void addList(T[] list){
        String temp = "";
        int tong = 0;
        for (T t : list) {
            if(t.getClass().getSimpleName().equalsIgnoreCase("String"))
                temp+=t;
            else if(t.getClass().getSimpleName().equalsIgnoreCase("Integer")){
                tong += Integer.parseInt(t.toString());
            }
        }
        System.out.println(temp);
        System.out.println(tong);
    }
}
