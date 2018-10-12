/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session9_JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maithicamnhung
 */
public class ResultSet_updateResultSet {

    Connection con = null;

    public ResultSet_updateResultSet() {
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

    public void updateResultSet() throws Exception {
        ResultSet rs;
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE
                                        , ResultSet.CONCUR_UPDATABLE);
        String sql = "select * from  STUDENT";
        rs = st.executeQuery(sql);
        rs.first(); // moves the cursor to the fifth row of rs
        rs.updateString("St_name", "Truong"); 
        rs.updateRow(); // updates the row in the data source
    }
    
    public void insertResultSet() throws Exception{
        ResultSet rs;
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE
                                        , ResultSet.CONCUR_UPDATABLE);
        String sql = "select * from  STUDENT";
        rs = st.executeQuery(sql);
       
        //rs.last();
        rs.moveToInsertRow();
        //set value for new row
        rs.updateString(1, "SV30");
        rs.updateString(2, "ABC");
        rs.updateInt(3, 1);
        rs.updateString(4, "Vinh Long123");
        rs.insertRow();
    }

    public void deleteResultSet() throws Exception{
        ResultSet rs;
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "select * from  STUDENT";
        rs = st.executeQuery(sql);
        rs.absolute(12);
        rs.deleteRow();
    }
    public static void main(String[] args) {
        try {
            ResultSet_updateResultSet conDSN = new ResultSet_updateResultSet();
            conDSN.deleteResultSet();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
