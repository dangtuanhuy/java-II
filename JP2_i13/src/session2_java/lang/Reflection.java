/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session2_java.lang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/**
 *
 * @author maithicamnhung
 */
public final class Reflection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
       // Lấy ra đối tượng 'Class' mô tả class ShowClassInfo
       Class<Reflection> aClass = Reflection.class;
 
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
       
        System.out.println("---------------------");
        System.out.println("-----Constructor-----");
        //Khoi tao doi tuong theo cach thong thuong
        Cat c1 = new Cat("mimi", 5);
        
        //Khoi tao doi tuong theo reflection
        Class<Cat> aClass2 = Cat.class;
        Constructor<?> constructor = aClass2.getConstructor(String.class, int.class);
       Cat c2 = (Cat)constructor.newInstance("Lyly", 3);
        System.out.println(c2.getName());
        System.out.println("---------Lay field----");
        Field f = aClass2.getField("age");
        //lay gia tri
        Integer tuoi =(Integer)f.get(c2);
        System.out.println("Age = " + tuoi);
        
        f.set(c2, 5);
        System.out.println("Name = " + c2.getName() + ",Age = " + c2.getAge());
        Field[] fields = aClass2.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        
        Field f_ms = aClass2.getDeclaredField("ms");
        f_ms.setAccessible(true); // thiet lap cho phep truy cap vao field la private
        f_ms.set(c2, "101");
        System.out.println(f_ms.get(c2));
        
        System.out.println("-------Truy cap phuong thuc private-----");
        Method m = aClass2.getDeclaredMethod("changeName", String.class);
        m.setAccessible(true);
        m.invoke(c2, "New Name");
        System.out.println(c2.getName());
    }
    
}
