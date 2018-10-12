/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session9_JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author maithicamnhung
 */
public class ResultSetMetaDataDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;
        String username = "sa";
        String pass = "sa";
        String url = "jdbc:sqlserver://localhost;databaseName=SV_HP;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, username, pass);
            
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String sql = "select * from Student";
        rs = stmt.executeQuery(sql);
        ResultSetMetaData rmd = rs.getMetaData(); 
            System.out.println("Column Count = " + rmd.getColumnCount());
            System.out.println("Column 2 Name = " + rmd.getColumnName(2));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
