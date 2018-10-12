/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session2_java.lang;

import java.util.Date;

/**
 *
 * @author maithicamnhung
 */
public class SystemClass {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        int arr1[] = {1,4,5, 10};
        int arr2[] = {2,6, 3,7};
        
//        public void getTime(){
//            System.out.println("Current time: " + System.currentTimeMillis());
//             long time = System.currentTimeMillis();
//        Date date = new Date(time);
//        System.out.println("Ngay: " + date.getDate() + "/" + date.getMonth());
//        }
        
        public void copyArray(){
            System.arraycopy(arr1, 0, arr2, 0, 2);
            System.out.println("Copy array: ");
            for(int i = 0; i<arr2.length ; i++){
                System.out.println(arr2[i]);
            }
        }
        
        public void getPath(String variable){
            System.out.println("Path: " + System.getenv(variable));
        }
        
        public static void main(String[] args) {
            SystemClass sc = new SystemClass();
            sc.copyArray();
            sc.getPath("path");
            System.out.println(System.getProperty("java.home"));
            System.out.println(System.getProperty("os.name"));
    }
}
