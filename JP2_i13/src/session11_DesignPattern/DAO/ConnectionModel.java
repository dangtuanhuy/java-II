package session11_DesignPattern.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionModel {
	String driverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String connectionUrl = "jdbc:sqlserver://localhost;databaseName=MyDatabase;";
	String dbUser = "sa";
	String dbPwd = "mtcnhung";

	private static ConnectionModel connectionFactory = null;

	private ConnectionModel() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		return conn;
	}

	public static ConnectionModel getInstance() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionModel();
		}
		return connectionFactory;
	}
}
