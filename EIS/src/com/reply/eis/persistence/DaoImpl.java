package com.reply.eis.persistence;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.reply.editoriale.persistenceInterface.DaoInterface;


import oracle.jdbc.OracleTypes;

public class DaoImpl implements DaoInterface {
	
	public Connection creaConnessione() throws SQLException
	{
		return DbConnector.getConnection();
	}
	
	public void chiudiConnessione(Connection conn) throws SQLException
	{
		DbConnector.closeConnection(conn);
	}
	
	public String executeLogin(float price, Connection conn, String username, String password, String user_session, String ruolo_session, String nomeCognome_session, String ruolo2_session)
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
			risultato += "error";
		}else
			{
				nomeCognome_session = rs.getString("NOME") + " "+ rs.getString("COGNOME");
				user_session = rs.getString("USERNAME");
				ruolo_session = rs.getString("NOME_GRUPPO");
				while(rs.next())
				{
					ruolo2_session = rs.getString("NOME_GRUPPO");
				}
				
			risultato += "success";	
		}
		rs.close();
		stmt.close();
		return risultato;
	}

}
