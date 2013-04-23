package com.reply.eis.persistence;

import java.sql.*;

public class DbConnector {
	
	private static Connection connection;

	public static synchronized Connection getConnection() throws SQLException {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "grupporosso",
					"grupporosso");
		} catch (ClassNotFoundException exc) {
			exc.printStackTrace();
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection conn) throws SQLException {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
		}
	}

}
