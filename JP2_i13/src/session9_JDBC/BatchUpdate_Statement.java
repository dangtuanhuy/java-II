/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session9_JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author maithicamnhung
 */
public class BatchUpdate_Statement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection cn = null;
            String username = "sa";
            String pass = "sa";
            String url = "jdbc:sqlserver://localhost;databaseName=MyDatabase;";
            cn = DriverManager.getConnection(url, username, pass);

            cn.setAutoCommit(false);

            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            st.addBatch("INSERT INTO Employee VALUES(11, 'emp11, 'Can Tho')");
            st.addBatch("INSERT INTO Employee VALUES(12, 'emp12', 'Can Tho')");

            st.executeBatch();

            cn.commit();
            cn.setAutoCommit(true);

            st.clearBatch();
        } catch (Exception ex) {
        }

    }
}
