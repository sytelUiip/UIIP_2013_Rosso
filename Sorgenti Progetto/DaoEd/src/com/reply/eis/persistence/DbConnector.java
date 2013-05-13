package com.reply.eis.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DbConnector {
	
	private static Connection connection;

	public static synchronized Connection getConnection() throws SQLException, FileNotFoundException, IOException {
		
		try {
			Properties prop = new Properties();
			
//			File f = new File("C:\\eclipseJunoRS2\\LibreriaServer\\apache-tomcat-6.0.36\\conf","config.properties");
			File f = new File("C:\\apache-tomcat-6.0.36\\conf","config.properties");
			prop.load(new FileInputStream(f));
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@"+prop.getProperty("ip")+":"+prop.getProperty("port")+":"+prop.getProperty("db_name"), prop.getProperty("user"),
					prop.getProperty("password"));
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