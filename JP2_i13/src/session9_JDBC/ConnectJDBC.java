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
public class ConnectJDBC {

    Connection con = null;

    public ConnectJDBC() {
        String username = "sa";
        String pass = "sa";
        String url = "jdbc:sqlserver://localhost;databaseName=Northwind;";
        try {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, username, pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Lay danh sach mau tin cua bang csdl
     * 
     */
    public ResultSet getResultSet(String tableName) throws SQLException {
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String sql = "select * from " + tableName;
        rs = stmt.executeQuery(sql);
        return rs;
    }

    public void updateEmployee(String sql) throws SQLException {
        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql);

        System.out.println("Table updated.");
    }

    public void updatePrepareStatement() throws SQLException {
        // Create PreparedStatement object 
        String sqlStmt = "update Employee set Emp_name= ? where Emp_id= ? ";
        PreparedStatement pStmt = con.prepareStatement(sqlStmt);

        // Passing parameters
        pStmt.setString(1, "Lan");
        pStmt.setInt(2, 1);
        

        // Executes the executeUpdate() method
        pStmt.executeUpdate();

    }

    public static void main(String[] args) {
        try {
            ConnectJDBC conDSN = new ConnectJDBC();
//            ResultSet resultSet = conDSN.getResultSet("Employee");
//            while (resultSet.next()) {
//                System.out.println("Employee Name : " + resultSet.getString("Emp_name"));
//            }
//            conDSN.updatePrepareStatement();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
