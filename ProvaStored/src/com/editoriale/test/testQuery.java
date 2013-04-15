package com.editoriale.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.editoriale.connection.dbConnector;
import com.editoriale.proc.ListaAccount;

public class testQuery {
	private static Connection conn;
	public static void main(String[] args) throws SQLException {
		conn = dbConnector.getConnection();
		String stampars;
		stampars = ListaAccount.execute(5, conn);
		System.out.println(stampars);
		conn.close();
	}	
}
	
