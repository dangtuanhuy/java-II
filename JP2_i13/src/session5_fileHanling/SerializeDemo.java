/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author maithicamnhung
 */
class Employee{
    String name;
    String address;

    public Employee() {
        this.name = "";
        this.address = "";
    }

    
    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
}
public class SerializeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //chua dc
        Employee emp = new Employee();
        emp.name = "Nhung";
        emp.address = "vinh long";
        Employee e = new Employee();
        try {
            FileOutputStream fos = new FileOutputStream("D:/serialize.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fos);
            System.out.println("Write");
            objectOut.writeObject(emp);
            System.out.println("Close:");
            //objectOut.close();
            //fos.close();
            System.out.println("Serialize da thuc hien");
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("D:/serialize.ser"));
            e = (Employee)objectInput.readObject();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex2){
        } catch (ClassNotFoundException ex3){
        }
        System.out.println("name:" + e.name);
        System.out.println("Address: " + e.address);
        
    }
}
