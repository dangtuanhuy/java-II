/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session9_JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;


/**
 *
 * @author maithicamnhung
 */
public class DatabaseMetaDataDemo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;
        String username = "sa";
        String pass = "sa";
        String url = "jdbc:sqlserver://localhost;databaseName=Northwind;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, username, pass);
            
            DatabaseMetaData databaseMetaData = con.getMetaData();
            System.out.println("Product Name : " + databaseMetaData.getDatabaseProductName());
            System.out.println("Username : " + databaseMetaData.getUserName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
