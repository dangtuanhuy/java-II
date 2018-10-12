/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session11_DesignPattern;

import java.util.Scanner;

class Employee {

    int empId;
    String name;
    int bonus;
}

class Manager extends Employee {

    String name;
    int mgrid;
}

public class TestInstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee:");
        emp1.name = sc.nextLine();
        Manager m1 = new Manager();
        System.out.println("Enter Manager:");
        m1.name = sc.nextLine();
        if (emp1 instanceof Employee) {
            emp1.bonus = 7000;
            System.out.println("1 " + emp1.name + " is an employee and has bonus " 
                                + emp1.bonus);
        }
        if (emp1 instanceof Manager) {
            emp1.bonus = 12000;
            System.out.println("2 " + emp1.name + " is a manager and has bonus " 
                                + emp1.bonus);
        }
        if (m1 instanceof Employee) {
            m1.bonus = 7000;
            System.out.println("3 " +m1.name + " is an employee and has bonus " 
                                + m1.bonus);
        }
        if (m1 instanceof Manager) {
            m1.bonus = 12000;
            System.out.println("4 " + m1.name + " is a manager and has bonus "
                                + m1.bonus);
        }

    }
}
