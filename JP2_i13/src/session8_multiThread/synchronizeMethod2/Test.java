/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session8_multiThread.synchronizeMethod2;

/**
 *
 * @author maithicamnhung
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TaiKhoan taikhoan = new TaiKhoan();
        GiaoDichRutTien gd1 = new GiaoDichRutTien(taikhoan, 100);
        gd1.setName("Vo");
        gd1.setPriority(10);
        GiaoDichRutTien gd2 = new GiaoDichRutTien(taikhoan, 50);
        gd2.setName("Chong");
        gd2.setPriority(1);
        
        gd1.start();
        gd2.start();
        
    }
    
}
