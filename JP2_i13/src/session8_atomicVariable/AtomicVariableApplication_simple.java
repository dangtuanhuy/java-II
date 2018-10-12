/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session8_atomicVariable;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author maithicamnhung
 */
public class AtomicVariableApplication_simple {

    private final AtomicInteger value = new AtomicInteger(0);
    
    public int getValue(){
        return value.get();
    }
    
    public int getNextValue(){
        return value.incrementAndGet();
    }
    
    public int getPreviousValue(){
        return value.decrementAndGet();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AtomicVariableApplication_simple demo = new AtomicVariableApplication_simple();
        System.out.println(demo.getValue());
        //System.out.println(demo.getNextValue());  
        System.out.println(demo.getPreviousValue());
    }
    
}
