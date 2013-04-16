package com.reply.gestoreLoginService;

import java.sql.Connection;
import java.sql.SQLException;

import com.reply.editoriale.persistenceInterface.DaoInterface;
import com.reply.eis.persistence.DaoImpl;

public class GestoreLogin {
	
	public String authentication(String username, String password, String user_session, String ruolo_session, String nomeCognome_session, String ruolo2_session) throws SQLException
	{
		DaoInterface dao = new DaoImpl();
	
		System.out.println("**********************Preparazione connessione****************\n");
		Connection conn = dao.creaConnessione();
		System.out.println("**********************Connessione Avvenuta****************\n");
		
		String result = dao.executeLogin(5, conn, username, password, user_session, ruolo_session, nomeCognome_session, ruolo2_session);
		System.out.println("+++++++++++++++++++++++++++++RisultatoLogin "+result+"++++++++++++++++++++++++++++");
		dao.chiudiConnessione(conn);
		System.out.println("**********************Connessione chiusa****************\n");
		return result;
		
	}

}
