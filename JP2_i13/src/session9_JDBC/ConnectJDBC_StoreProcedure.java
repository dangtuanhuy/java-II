/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session9_JDBC;

import java.sql.CallableStatement;
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
public class ConnectJDBC_StoreProcedure {

    Connection con = null;

    public ConnectJDBC_StoreProcedure() {
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

    public void createStorePro() throws SQLException {
        String sql = "create PROCEDURE getName "
                + "AS "
                + "SELECT St_name "
                + "FROM STUDENT "
                + "WHERE RollNo = 'SV02';"
                ;
        
        String sql2 = "create PROCEDURE getRollNoById "
                + "@id varchar(5) "
                + "AS "
                + "SELECT St_name "
                + "FROM STUDENT "
                + "WHERE RollNo = @id;"
                ;
        
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        st.executeUpdate(sql2);
    }

    public void getStorPro() throws Exception {
        CallableStatement cst = con.prepareCall("{call getName()}");
        ResultSet rs = cst.executeQuery();
        while (rs.next()) {
            System.out.println("Name:" + rs.getString(1));
        }
    }
    
    public void getStoreProById() throws Exception{
        CallableStatement cst = con.prepareCall("{call getRollNoById(?)}");
        cst.setString(1, "SV16");
        ResultSet rs = cst.executeQuery();
        while (rs.next()) {
            System.out.println("Name:" + rs.getString(1));
        }
    }

    public static void main(String[] args) {
        ConnectJDBC_StoreProcedure con = new ConnectJDBC_StoreProcedure();
        try {
          // con.createStorePro();
            System.out.println("------Get Name-----");
            con.getStorPro();
             System.out.println("------Get Name By Id-----");
            con.getStoreProById();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
