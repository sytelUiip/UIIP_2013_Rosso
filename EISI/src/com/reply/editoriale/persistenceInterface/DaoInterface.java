package com.reply.editoriale.persistenceInterface;

import java.sql.Connection;
import java.sql.SQLException;

public interface DaoInterface {
	
	public String executeLogin(float price, Connection conn, String username, String password, String user_session, String ruolo_session, String nomeCognome_session, String ruolo2_session) throws SQLException;
	public Connection creaConnessione() throws SQLException;
	public void chiudiConnessione(Connection conn) throws SQLException;
	
}
