/*
 * To change this template, choose Tools | Templates
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
public class ConnectODBC_Access {
    Connection con = null;
    public ConnectODBC_Access(){
       // String url  = "sun.jdbc.odbc.JdbcOdbcDriver";
        try {
            //Class.forName(url);
            //String dbUrl = "jdbc:odbc:TestABC";
            //JDK 8
            String dbUrl = "jdbc:ucanaccess://D:/Test.accdb";
            con = DriverManager.getConnection(dbUrl);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Lay danh sach mau tin cua bang csdl
     * 
     */
    public ResultSet getResultSet(String tableName) throws SQLException{
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String sql = "select * from " + tableName;
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
    public static void main(String[] args) {
        try{
            ConnectODBC_Access conDSN = new ConnectODBC_Access();
            ResultSet resultSet = conDSN.getResultSet("Employee");
            while(resultSet.next())
                System.out.println("Employee Name : " + resultSet.getString(2));
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
