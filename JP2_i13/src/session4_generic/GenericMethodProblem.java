/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session4_generic;

/**
 *
 * @author maithicamnhung
 */
public class GenericMethodProblem {

    public void display(Integer[] a){
        for(Integer element : a)
            System.out.println("Value:" + element);
    }
    // Phai khai bao them 1 phuong thuc overload
    public void display(String[] a){
        for(String element : a)
            System.out.println("Value:" + element);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] intValue = {1,3,2,12};
        String[] intString = {"hello","nhung","hong","lan"};
        GenericMethodProblem gene = new GenericMethodProblem();
        gene.display(intString); // bao loi do kh dung kieu dinh dang
        gene.display(intValue);
    }
}
