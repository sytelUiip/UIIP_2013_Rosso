package com.reply.gestoreLoginService;

import java.rmi.RemoteException;

import com.reply.editoriale.BL.GestioreAccountImpl;
import com.reply.editoriale.BlInterface.GestoreAccount;
import com.reply.editoriale.entity.Account;
import com.reply.eis.persistence.DaoImpl;

public class GestoreAccountServ {
	
	public Account inserisciNuovoAccount(String nome, String cognome, String username, String password, String siglaRedazione, String siglaGiornalista) throws RemoteException{
		
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.aggiungiNuovoAccount(nome, cognome, username, password, siglaRedazione, siglaGiornalista);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RemoteException(e.getMessage());
		}	
	}
	
	public Account updateAccount(String user, String password, String nome, String cognome, String siglaRedazione,String siglaGiornalista) throws RemoteException
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.modificaAccount(user, password, nome, cognome, siglaRedazione, siglaGiornalista);	
		} catch (Exception e) {
			throw new RemoteException(e.getMessage());
		}
			
	}
	
	public Account[] VisualizzaAccountRegistrati() throws RemoteException
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.listaUtentiRegistrati();
		} catch (Exception e) {
			throw new RemoteException(e.getMessage());
		}
		
		
	}
	
	public Account cancellaAccount(String username) throws RemoteException{
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.eseguiCancellaAccount(username);	
		} catch (Exception e) {
			throw new RemoteException(e.getMessage());
		}
	       
	 }
	
	public Account ottieniAccount(String username) throws RemoteException
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try {
			return gnai.caricaAccount(username);	
		} catch (Exception e) {
			throw new RemoteException(e.getMessage());
		}	
	}
	
	public void AggiungiRuoloGiornalista(String username) throws RemoteException
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try{
			gnai.AggiungiPrivilegio(username);
		}catch(Exception e)
		{
			throw new RemoteException(e.getMessage());
		}
		
	}
	
	public void RimuoviRuoloGiornalista(String username) throws RemoteException
	{
		GestoreAccount gnai = new GestioreAccountImpl();
		try{
			gnai.RimuoviPrivilegio(username);
		}catch(Exception e)
		{
			throw new RemoteException(e.getMessage());
		}
		
	}
	
	
	
}
