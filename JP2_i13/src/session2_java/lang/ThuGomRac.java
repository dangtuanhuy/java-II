/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session2_java.lang;

import java.io.IOException;

/**
 *
 * @author maithicamnhung
 */
class SinhVien{
    String ma, ten;
    int d1,d2,d3;

    public SinhVien(String ma, String ten, int d1, int d2, int d3) {
        this.ma = ma;
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    
    
}
public class ThuGomRac{

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Runtime env = Runtime.getRuntime();
        env.gc(); // gom rac truoc
        System.out.println("Tong kich thuoc bo nho: " + env.totalMemory());
        System.out.println("Bo nho toi da co the cap phat:" + env.freeMemory());
        System.out.println("Cap phat bo nho cho 1000 sinh vien:");
        SinhVien[] sv = new SinhVien[1000];
        for (int j = 0; j < 1000; j++) {
            sv[j] = new SinhVien("101", "A", j, j+1, j+2);
        }
        System.out.println("Bo nho trong sau khi cap phat 1000 sv:" + env.freeMemory());
        env.gc();
        System.out.println("Bo nho trong sau khi thu gom rac:" + env.freeMemory());
    }
    
}
