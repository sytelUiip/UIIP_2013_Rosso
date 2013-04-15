package com.editoriale.proc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import oracle.jdbc.OracleTypes;

public class Login {
	public static String execute(float price, Connection conn, String username, String password, String user_session)
			throws SQLException {
		String query = "{call LOGIN(?,?,?)}";
		CallableStatement stmt = conn.prepareCall(query);
		stmt.setString(1, username);
		stmt.setString(2, password);
		stmt.registerOutParameter(3, OracleTypes.CURSOR);
		stmt.execute();
		String risultato = "";
		ResultSet rs = (ResultSet)stmt.getObject(3);
		if (rs.next()==false){
			risultato += "Login falito! Credenziali errate!";
		}else
			{
			risultato += "Login effettuato! Benvenuto" + " " +
			rs.getString("NOME") + " "
			+ rs.getString("COGNOME");
			user_session = rs.getString("USERNAME");
		}
		rs.close();
		stmt.close();
		return risultato;
	}
}
