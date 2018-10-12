/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session2_java.lang;

import java.lang.reflect.Method;

/**
 *
 * @author maithicamnhung
 */
public class ClassClass {

    int a;

    public ClassClass() {
    }

    public ClassClass(int a) {
        this.a = a;
    }

    // Phuong thuc phai la Public moi thay duoc tu getMethods
    public void getA() {
        System.out.println("A = " + a);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class t = Class.forName("session2_java.lang.ClassClass");

            System.out.println("=====Thong tin chung =====");
            System.out.println("Tim thay Class:" + t.getClass());
            System.out.println("Package: " + t.getPackage());
            System.out.println("So field: " + t.getFields().length);
            System.out.println("So phuong thuc: " + t.getMethods().length);
            Method m[] = t.getMethods();
            System.out.println("=====Cac phuong thuc====");
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i]);
            }

            System.out.println("=====Tao doi tuong:=====");
            ClassClass classA = (ClassClass) t.newInstance();
            classA.a = 10;
            classA.getA();
        } catch (ClassNotFoundException ex) {
            System.out.println("Khong hieu");
        } catch (Exception ex) {

        }

    }
}
