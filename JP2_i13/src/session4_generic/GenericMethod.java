/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session4_generic;

/**
 *
 * @author maithicamnhung
 */
public class GenericMethod<T> {

    public<T> void display(T[] val){
        for(T element : val)
            System.out.println("Value are:"  +  element);
    }
    /**
     * @main
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] intValue = {1,3,2,12};
        String[] intString = {"hello","nhung","hong","lan"};
        GenericMethod<Integer> gene = new GenericMethod<>();
        gene.display(intValue);
        gene.display(intString);
        
    }
}
