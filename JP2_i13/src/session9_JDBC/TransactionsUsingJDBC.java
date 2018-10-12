/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class TransactionsUsingJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection con = null;
            PreparedStatement preparedStatementInsert;
            PreparedStatement preparedStatementUpdate;
            String username = "sa";
            String pass = "sa";
            String url = "jdbc:sqlserver://localhost;databaseName=SV_HP;";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, username, pass);

            con.setAutoCommit(false); //transaction block start

            String insertTableSQL = "INSERT INTO STUDENT"
                    + "(Rollno,"
                    + " St_name, "
                    + "Gender, "
                    + "Address) VALUES"
                    + "(?,?,?,?)";

            String updateTableSQL = "UPDATE STUDENT SET St_name = ? "
                    + "WHERE Rollno = ?";

            preparedStatementInsert = con.prepareStatement(insertTableSQL);
            preparedStatementInsert.setString(1, "SV20");
            preparedStatementInsert.setString(2, "mkyong101");
            preparedStatementInsert.setInt(3, 1);
            preparedStatementInsert.setString(4, "Can Tho");
            preparedStatementInsert.executeUpdate(); //data IS NOT commit yet

            preparedStatementUpdate = con.prepareStatement(updateTableSQL);
            preparedStatementUpdate.setString(1, "A very very long string caused DATABASE ERROR"
                    + "A very very long string caused DATABASE ERROR"
                    + "A very very long string caused DATABASE ERROR");
            preparedStatementUpdate.setString(2, "SV20");
            preparedStatementUpdate.executeUpdate(); //Error, rollback, including the first insert statement.

            con.commit(); //transaction block end
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
