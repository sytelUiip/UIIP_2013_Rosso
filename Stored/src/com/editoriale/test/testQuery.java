package com.editoriale.test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

import com.editoriale.connection.dbConnector;
import com.editoriale.proc.ListaAccount;

public class testQuery {
	private static Connection conn;
	
	public static void menu() throws IOException, SQLException{
		InputStreamReader input = new InputStreamReader(System.in);
		System.out.println("Selezionare la funzione da utilizzare:");
		System.out.println("1 - Stampa Lista Account");
		System.out.println("2 - Login");
		System.out.println("0 - Exit");
		int scelta = input.read();
		switch (scelta) {
		case '1':
			String stampars;
			stampars = ListaAccount.execute(5, conn);
			System.out.println(stampars);
			menu();
		case '2':
			break;
		case '0':
			System.exit(0);
			break;
		default:
			System.out.println("Selezionare un opzione valida.");
			menu();
		}
	}
	public static void main(String[] args) throws SQLException, IOException {
		conn = dbConnector.getConnection();
		String stampars;
		menu();
		stampars = ListaAccount.execute(5, conn);
		System.out.println(stampars);
		conn.close();
	}	
}