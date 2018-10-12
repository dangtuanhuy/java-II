/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session3_collectionsAPI;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maithicamnhung
 */
public class ArrayListToCsvString {

    public String getListAsCsvString(List<String> list){
        StringBuilder strb = new StringBuilder();
        for(String sl : list){
            if(strb.length() != 0){
                strb.append(",");
            }
            strb.append(sl);
        }
        return strb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>(){
            {
                this.add("HDJ");
                this.add("BDW");
                this.add("Java");
            }
        };        
        ArrayListToCsvString csv = new ArrayListToCsvString();
        System.out.println(csv.getListAsCsvString(list));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\nhunglan.txt"));
        bw.write(csv.getListAsCsvString(list), 0, csv.getListAsCsvString(list).length());
        bw.flush();//phai co
        
        List<String> list2 = new ArrayList<String>(){
            {
                this.add("HDJ2");
                this.add("BDW2");
                this.add("Java2");
            }
        };
        System.out.println(csv.getListAsCsvString(list2));
        bw.newLine();
        bw.write(csv.getListAsCsvString(list2), 0, csv.getListAsCsvString(list2).length());
        bw.flush();
    }
}
