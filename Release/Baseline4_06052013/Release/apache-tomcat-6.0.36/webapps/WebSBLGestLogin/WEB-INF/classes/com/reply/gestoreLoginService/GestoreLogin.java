package com.reply.gestoreLoginService;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.reply.editoriale.BL.GestoreLoginImpl;
import com.reply.editoriale.BlInterface.GestoreLoginInterface;
import com.reply.editoriale.entity.Account;

public class GestoreLogin {
	
	public Account authentication(String username, String password) throws AxisFault
	{
		GestoreLoginInterface gli = new GestoreLoginImpl();
		try{
			return gli.eseguiLogin(username, password);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
		
	}
	
//	public boolean validateFunzionalita(String nomeGruppo, String nomeFunzione) throws SQLException
//	{
//		GestoreAccount ga = new GestioreAccountImpl();
//		return ga.controlloAutorizzazioni(nomeGruppo, nomeFunzione);
//		
//	}

}
