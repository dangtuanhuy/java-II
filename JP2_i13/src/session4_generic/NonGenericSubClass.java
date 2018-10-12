/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session4_generic;

import java.util.LinkedList;

/**
 *
 * @author maithicamnhung
 */
class TestQueue<U,V>{
    private V num;
    private LinkedList<U> list = new LinkedList<>();

    public TestQueue(V num) {
        this.num = num;
    }
    public void enqueue(U item){
        list.addLast(item);
    }
    public U dequeue(){
        return list.removeLast();
    }
    public void display(){
        System.out.println("Integer:" + num);
        for(U element: list)
            System.out.println("List: " + element);
    }
    
}
public class NonGenericSubClass extends TestQueue<String, Integer> {

    public NonGenericSubClass(Integer num){
        super(num);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NonGenericSubClass nonGeneric = new NonGenericSubClass(new Integer(10));
        nonGeneric.enqueue("Hello");
        nonGeneric.enqueue("java");
        nonGeneric.display();
        System.out.println(nonGeneric.dequeue());
        nonGeneric.display();
    }
}
