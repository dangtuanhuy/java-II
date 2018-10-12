/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session8_multiThread.synchronizeMethod2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maithicamnhung
 */
public class TaiKhoan {
    int soTien = 200;

    public TaiKhoan() {
    }

    
    public TaiKhoan(int soTien) {
        this.soTien = soTien;
    }
    
   synchronized void rutTien(int soTienRut){
        System.out.println("Truoc khi " + Thread.currentThread().getName() + " rut = " + soTien);
        soTien = soTien - soTienRut;
        System.out.println("Sau khi " + Thread.currentThread().getName() + " rut = " + soTien);
    }
}
