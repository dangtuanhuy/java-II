/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session4_generic;

/**
 *
 * @author maithicamnhung
 */
public class GenericTwoPara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleGen<String,Integer> sg = new SimpleGen<String, Integer>("hello", 100);
        sg.printType();
        
    }
}
class SimpleGen<U,V>{
    private U objU;
    private V objV;
    public SimpleGen(U Uobj, V Vobj){
        objU = Uobj;
        objV = Vobj;
    }
    
    public void printType(){
        System.out.println("U type: " + objU.getClass().getName());
        System.out.println("V type: " + objV.getClass().getName());
    }
}
