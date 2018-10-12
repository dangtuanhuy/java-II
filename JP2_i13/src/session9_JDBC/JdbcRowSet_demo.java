/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session9_JDBC;

import com.sun.rowset.JdbcRowSetImpl;
import javax.sql.rowset.JdbcRowSet;

/**
 *
 * @author maithicamnhung
 */
public class JdbcRowSet_demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String databaseUrl = "jdbc:sqlserver://localhost;databaseName=SV_HP";
            String username = "sa";
            String password = "sa";
            JdbcRowSet rowSet = null;
            rowSet = new JdbcRowSetImpl();
            rowSet.setUrl(databaseUrl);
            rowSet.setUsername(username);
            rowSet.setPassword(password);
            rowSet.setCommand("select * from STUDENT");
            rowSet.execute();
            rowSet.first();
            System.out.println(rowSet.getRow() + ":" 
                    + rowSet.getString("St_name"));
//            while(rowSet.next())
//                System.out.println(rowSet.getString("Emp_name"));
            
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
