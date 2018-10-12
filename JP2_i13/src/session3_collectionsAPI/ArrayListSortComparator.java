/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author maithicamnhung
 */
public class ArrayListSortComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Empl> list = new ArrayList<Empl>();
        list.add(new Empl("Nhung", 20000));
        list.add(new Empl("Hong", 30000));
        list.add(new Empl("Lan", 40000));
        list.add(new Empl("Thu", 10000));
        Collections.sort(list, new MySalaryComp());
        System.out.println("Sau khi sort:");
        for(Empl e : list){
            System.out.println(e.toString());
        }
    }
}

class MySalaryComp implements Comparator<Empl> {
    public int compare(Empl e1, Empl e2){
        if(e1.getSalary() < e2.getSalary()){
            return 1;
        }else{
            return -1;
        }
    }
}
class Empl{
    private String name;
    private int salary;

    public Empl(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getSalary(){
        return salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public String toString(){
        return "Name: " + this.name + "----Salary: " + this.salary;
    }
}
