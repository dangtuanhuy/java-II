/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session12_internationalization_localization;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author maithicamnhung
 */
public class Internaltionalization_demo {

    void chonNgonNgu(String tenFileTuDien){
        String file =  "session12_internationalization_localization/" + tenFileTuDien;
        String lang = "en" ;
        
        Locale l = new Locale(lang);
        ResourceBundle r = ResourceBundle.getBundle(file, l);
        
        String str1 = r.getString("greeting");
        String str2 = r.getString("farewell");
        String str3 = r.getString("inquiry");
        
        System.out.println("Loi chao = " + str1);
        System.out.println("Chao tam biet = " + str2);
        System.out.println("Cau hoi suc khoe = " + str3);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chon = 1;
        System.out.println("Chon ngon ngu:");
        System.out.println("\t1: Tieng Anh");
        System.out.println("\t2: Tieng Phap");
        System.out.println("\t3: Tieng Viet");
        Scanner input = new Scanner(System.in);
        chon = input.nextInt();
        String tenFile = "";
        switch(chon){
            case 1: 
                tenFile = "TuDien_en";
                break;
            case 2: 
                tenFile = "TuDien_fr";
                break;
            case 3: 
                tenFile = "TuDien_vi";
                break;
        }
        System.out.println("=======Tu Dien=======");
        Internaltionalization_demo demo = new Internaltionalization_demo();
        demo.chonNgonNgu(tenFile);
    }
    
}
