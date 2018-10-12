/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session2_java.lang;

import java.lang.reflect.Modifier;

/**
 *
 * @author maithicamnhung
 */
public class ClassObjDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lấy ra đối tượng 'Class' mô tả class ShowClassInfo
       Class aClass = ClassObjDemo.class;
 
       // Ghi ra tên class, bao gồm cả tên package.
       System.out.println("Class Name= " + aClass.getName());
 
       // Ghi ra tên đơn giản của Class
       System.out.println("Simple Class Name= " + aClass.getSimpleName());
 
       // Thông tin Package.
       Package pkg = aClass.getPackage();
       System.out.println("Package Name = " + pkg.getName());
 
       // Modifier
       int modifiers = aClass.getModifiers();
 
       boolean isPublic = Modifier.isPublic(modifiers);
       boolean isInterface = Modifier.isInterface(modifiers);
       boolean isAbstract = Modifier.isAbstract(modifiers);
       boolean isFinal = Modifier.isFinal(modifiers);
 
       // true
       System.out.println("Is Public? " + isPublic);
       // true
       System.out.println("Is Final? " + isFinal);
       // false
       System.out.println("Is Interface? " + isInterface);
       // false
       System.out.println("Is Abstract? " + isAbstract);
    }
    
}
