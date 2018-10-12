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
public class GiaoDichRutTien extends Thread{
    TaiKhoan tk;
    int soTienSeRut;

    public GiaoDichRutTien(TaiKhoan tk) {
        this.tk = tk;
    }

    public GiaoDichRutTien(TaiKhoan tk, int soTienSeRut) {
        this.tk = tk;
        this.soTienSeRut = soTienSeRut;
    }
    
    
    
    public void run(){
            tk.rutTien(soTienSeRut); 
    }
}
