package com.reply.gestoreLoginService;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.reply.editoriale.BL.GestioreAccountImpl;
import com.reply.editoriale.BlInterface.GestoreAccount;
import com.reply.editoriale.entity.Account;
import com.reply.eis.persistence.DaoImpl;

public class GestoreAccountServ {
	
	public Account inserisciNuovoAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String nome, String cognome,
			String username, String password, String siglaRedazione,
			String siglaGiornalista, String ruolo) throws AxisFault{
		
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.aggiungiNuovoAccount( nomeFunzionalita, userLogin, passwordLogin, nome,  cognome,
					 username,  password,  siglaRedazione,
					 siglaGiornalista, ruolo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new AxisFault(e.getMessage());
			
		}	
	}
	
	public Account updateAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String user, String password,  String nome, String cognome, 
			String siglaRedazione, String siglaGiornalista) throws AxisFault
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.modificaAccount( nomeFunzionalita, userLogin, passwordLogin, user,  password,   nome,  cognome, 
					 siglaRedazione,  siglaGiornalista);	
		} catch (Exception e) {
			throw new AxisFault(e.getMessage());
		}
			
	}
	
	public Account[] VisualizzaAccountRegistrati(String nomeFunzionalita,String userLogin,String passwordLogin, int min, int max) throws AxisFault
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.listaUtentiRegistrati(nomeFunzionalita, userLogin, passwordLogin, min, max);
		} catch (Exception e) {
			throw new AxisFault(e.getMessage());
		}
		
		
	}
	
	public Account cancellaAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault{
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.eseguiCancellaAccount( nomeFunzionalita, userLogin, passwordLogin, username);	
		} catch (Exception e) {
			throw new AxisFault(e.getMessage());
		}
	       
	 }
	
	public Account ottieniAccount(String username) throws AxisFault
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.caricaAccount(username);	
		} catch (Exception e) {
			throw new AxisFault(e.getMessage());
		}	
	}
	
	public void AggiungiRuoloGiornalista(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try{
			gnai.AggiungiPrivilegio( nomeFunzionalita, userLogin, passwordLogin, username);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
		
	}
	
	public void RimuoviRuoloGiornalista(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try{
			gnai.RimuoviPrivilegio( nomeFunzionalita, userLogin, passwordLogin, username);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
		
	}
	
	public int numeroAccountRegistrati() throws AxisFault{
		GestoreAccount gs = new GestioreAccountImpl();
		try {
			return gs.contaAccount();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new AxisFault(e.getMessage());
		}
	}
	
	
	
}
