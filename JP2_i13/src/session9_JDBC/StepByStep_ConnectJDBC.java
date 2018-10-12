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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maithicamnhung
 */
public class StepByStep_ConnectJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //mo ket noi
            String username = "sa";
            String pass = "sa";
            String url = "jdbc:sqlserver://localhost;databaseName=SV_HP;";
            Connection con = DriverManager.getConnection(url, username, pass);
            //sql
            Statement st = con.createStatement();
            //lay resultset
            ResultSet re = st.executeQuery("select * from STUDENT");
            while (re.next()) {
                System.out.println(re.getString("St_name"));
            }
            //dong ket noi
            re.close();
            st.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StepByStep_ConnectJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {

        }

    }

}
