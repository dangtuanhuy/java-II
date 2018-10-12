/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session9_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maithicamnhung
 */
public class ConnectODBC_MSN {
    Connection con = null;
    public ConnectODBC_MSN(){
        String url  = "sun.jdbc.odbc.JdbcOdbcDriver";
        try {
            Class.forName(url);
            String dbUrl = "jdbc:odbc:MySQL";
            con = DriverManager.getConnection(dbUrl, "sa" , "mtcnhung");
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
    
    public void updateEmployee() throws SQLException{
        String sqlUpdate = "update Employee set EmployeeName = 'user3' where EmployeeId = 1";
        Statement st = con.createStatement();
        st.executeUpdate(sqlUpdate);
        System.out.println("Update thanh cong");
    }
    
    public void updatePrepate() throws SQLException{
        String update = "update Employee set EmployeeName = ? where EmployeeId = ?";
        PreparedStatement stpr = con.prepareStatement(update);
        stpr.setString(1, "user4");
        stpr.setInt(2, 2);
        stpr.executeUpdate();
        System.out.println("Cap nhat thanh cong");
    }
    
    public static void main(String[] args) {
        try{
            ConnectODBC_MSN conDSN = new ConnectODBC_MSN();
            ResultSet resultSet = conDSN.getResultSet("Employee");
            while(resultSet.next())
                System.out.println("Employee Name : " + resultSet.getString("EmployeeName"));
            
            //update
            conDSN.updatePrepate();
            resultSet = conDSN.getResultSet("Employee");
            while(resultSet.next())
                System.out.println("Employee Name : " + resultSet.getString("EmployeeName"));
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
