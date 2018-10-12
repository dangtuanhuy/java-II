/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session5_fileHanling.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author maithicamnhung
 */
public class BranchEmpProcessor {

    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileOutputStream fOut = null;
        ObjectInputStream oIn = null;
        ObjectOutputStream oOut = null;
        try {
            fOut = new FileOutputStream("D:\\NewEmplyee.Ser");
            oOut = new ObjectOutputStream(fOut);
            Employee e = new Employee();
            e.lastName = "Smith";
            e.firstName = "John";
            e.sal = 5000.00;
            oOut.writeObject(e);
            oOut.close();
            fOut.close();
            fIn = new FileInputStream("D:\\NewEmplyee.Ser");
            oIn = new ObjectInputStream(fIn);
            Employee emp = (Employee) oIn.readObject();
            System.out.println("Deserialized -  " + emp.firstName + " " + emp.lastName + "from NewEmployee.ser");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
