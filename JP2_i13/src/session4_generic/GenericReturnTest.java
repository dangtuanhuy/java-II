/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session4_generic;

/**
 *
 * @author maithicamnhung
 */
public class GenericReturnTest {

    public static <T extends Comparable<T>> T maxValueDisplay(T val1, T val2, T val3) {
        T maxValue = val1;
        if (val2.compareTo(val1) > 0) {
            maxValue = val2;
        }
        if (val3.compareTo(maxValue) > 0) {
            maxValue = val3;
        }
        return maxValue;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(maxValueDisplay(23, 42, 1));
        System.out.println(maxValueDisplay("apples", "oranges", "pineapple"));
    }
}
