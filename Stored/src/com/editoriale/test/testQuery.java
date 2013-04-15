package com.editoriale.test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

import com.editoriale.connection.dbConnector;
import com.editoriale.proc.ListaAccount;
import com.editoriale.proc.Login;

public class testQuery {
	private static Connection conn;
	private static String user_session = "";

	public static void menu() throws IOException, SQLException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
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
			System.out.print("Inserire lo username: ");
			String username = input1.readLine();
			System.out.println();
			System.out.print("Inserire la password: ");
			String password = input1.readLine();
			String risultato = Login.execute(2, conn, username, password, user_session);
			System.out.println(risultato);
			menu();
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