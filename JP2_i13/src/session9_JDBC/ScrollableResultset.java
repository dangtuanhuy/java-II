/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session9_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maithicamnhung
 */
public class ScrollableResultset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //mo ket noi
            String username = "sa";
            String pass = "sa";
            String url = "jdbc:sqlserver://localhost;databaseName=SV_HP;";
            Connection con = DriverManager.getConnection(url, username, pass);
            //sql
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from STUDENT");
            System.out.println("Con tro hien tai: " + rs.getRow());
            rs.absolute(2);
            System.out.println("Con tro sau khi di chuyen : " + rs.getRow() 
                               + ":" + rs.getString("St_name"));
            rs.previous();
            System.out.println("Sau khi quay lai 1 vi tri: " + rs.getRow() 
                                + ":" + rs.getString("St_name"));            
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
