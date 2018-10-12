/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session9_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author maithicamnhung
 */
public class BatchUpdate_PreparedStatement {

     Connection con = null;
     public BatchUpdate_PreparedStatement() {
        String username = "sa";
        String pass = "sa";
        String url = "jdbc:sqlserver://localhost;databaseName=SV_HP;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, username, pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
     
     public void batchUpdate() throws Exception{
         // turn off autocommit
         con.setAutoCommit(false);
         
         //Tao the hien PrepareStatement
         PreparedStatement pre = con.prepareStatement("insert into STUDENT values(?,?,?, ?)");
        
         pre.setString(1, "SV30");
         pre.setString(2, "Linh2");
         pre.setInt(3, 1);
         pre.setString(4, "CT");
         pre.addBatch();
         
          pre.setString(1, "SV31");
         pre.setString(2, "Truong2");
         pre.setInt(3, 0);
         pre.setString(4, "CT");
         pre.addBatch();
         
         pre.executeBatch();
         con.commit();
         
         //pre.executeUpdate();
         System.out.println("Them 2 dong thanh cong");
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BatchUpdate_PreparedStatement update = new BatchUpdate_PreparedStatement();
        try {
            update.batchUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
