package session11_DesignPattern.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeJDBCDAO {

    Connection connection = null;
    PreparedStatement ptmt = null;
    ResultSet resultSet = null;

    public EmployeeJDBCDAO() {
    }

    private Connection getConnection() throws SQLException {
        Connection conn;
        conn = ConnectionModel.getInstance().getConnection();
        return conn;
    }

    public void add(EmployeeBean studentBean) {
        try {
            String queryString = "INSERT INTO Employee VALUES(?,?,?)";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, studentBean.getEmpId());
            ptmt.setString(2, studentBean.getName());
            ptmt.setString(3, studentBean.getEmpAddress());
            ptmt.executeUpdate();
            System.out.println("Data Added Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ptmt != null) {
                    ptmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void update(EmployeeBean studentBean) {

        try {
            String queryString = "UPDATE Employee SET EmployeeName=? WHERE EmployeeId=?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setString(1, studentBean.getName());
            ptmt.setInt(2, studentBean.getEmpId());
            ptmt.executeUpdate();
            System.out.println("Table Updated Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ptmt != null) {
                    ptmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }

    public void delete(int ID) {

        try {
            String queryString = "DELETE FROM Employee WHERE EmployeeId=?";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            ptmt.setInt(1, ID);
            ptmt.executeUpdate();
            System.out.println("Data deleted Successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ptmt != null) {
                    ptmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public void findAll() {
        try {
            String queryString = "SELECT * FROM Employee";
            connection = getConnection();
            ptmt = connection.prepareStatement(queryString);
            resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                System.out.println("Employee Id " + resultSet.getInt("EmployeeId")
                        + ", Name " + resultSet.getString("EmployeeName") + ", Address "
                        + resultSet.getString("EmployeeAddress")) ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (ptmt != null) {
                    ptmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}