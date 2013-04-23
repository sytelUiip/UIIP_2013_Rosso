package com.reply.editoriale.BL;

import java.sql.SQLException;

import com.reply.editoriale.BlInterface.GestoreNotiziaInterface;
import com.reply.editoriale.entity.Account;
import com.reply.editoriale.entity.Notizia;
import com.reply.editoriale.persistenceInterface.DaoInterface;
import com.reply.eis.persistence.DaoImpl;

public class GestioneNotiziaImpl implements GestoreNotiziaInterface {
	
	public Notizia createNotizia(Account autore,
			 String titolo, String sottoTitolo,
			String testo, int lunghezzaTesto){
				
		
		DaoInterface dao = new DaoImpl();
		Notizia newNotizia = null;
		try {
			newNotizia = dao.createNotizia(autore, titolo, sottoTitolo, testo, lunghezzaTesto);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newNotizia;
		
	}

}
