package com.reply.editoriale.BL;

import com.reply.editoriale.BlInterface.GestoreLoginInterface;
import com.reply.editoriale.entity.*;
import com.reply.eis.persistence.DaoImpl;

public class GestoreLoginImpl implements GestoreLoginInterface {

	@Override
	public Account eseguiLogin(String username, String password) throws Exception{
		
		DaoImpl dao = new DaoImpl();
		Account risultato = null;
		risultato = dao.executeLogin(username, password);
		return risultato;
	}

}
