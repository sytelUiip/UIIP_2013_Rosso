package com.reply.editoriale.BL;

import java.sql.SQLException;

import com.reply.editoriale.BlInterface.GestoreAccount;
import com.reply.editoriale.entity.Account;
import com.reply.editoriale.persistenceInterface.DaoInterface;
import com.reply.eis.persistence.DaoImpl;

public class GestioreAccountImpl implements GestoreAccount{

		public Account modificaAccount(String user, String password, String nome, String cognome, String siglaRedazione,String siglaGiornalista) throws Exception{
			DaoInterface dao = new DaoImpl();
			Account risultato = null;
			risultato = dao.modificaAccount(user, password, nome, cognome, siglaRedazione, siglaGiornalista);
			return risultato;
		}
		public void AggiungiPrivilegio(String username) throws Exception{
				DaoInterface dao = new DaoImpl();
					dao.AggiungiPrivilegio(username);
			}
		
		public void RimuoviPrivilegio(String username) throws Exception{
				DaoInterface dao = new DaoImpl();
					dao.RimuoviPrivilegio(username);
			}
		
		public Account caricaAccount(String username) throws Exception{
			DaoInterface dao = new DaoImpl();
			Account risultato = null;
			risultato = dao.caricaAccount(username);
			return risultato;
		}
		
		public Account aggiungiNuovoAccount(String nome, String cognome,
				String username, String password, String siglaRedazione,
				String siglaGiornalista) throws Exception{
			// TODO Auto-generated method stub

			DaoInterface dao = new DaoImpl();
			Account nuovoAccount = null;
				
			nuovoAccount = dao.executeInsNuovoAccount(nome, cognome,
								username, password, siglaRedazione, siglaGiornalista);
			return nuovoAccount;
		}	

		
		public boolean controlloAutorizzazioni(String nomeGruppo,
				String funzionalita){
			DaoInterface dao = new DaoImpl();
			boolean risultato = false;
			try{
				risultato = dao.controlloAutorizzazioni(nomeGruppo, funzionalita);
			}catch (Exception e){
				e.printStackTrace();
			}
			return risultato;
		}
		
		public Account eseguiCancellaAccount(String username) throws Exception{
			// TODO Auto-generated method stub
			DaoInterface dao = new DaoImpl();
			Account risultato = null;
			risultato = dao.executeCancellaAccount(username);
			return risultato;
		}
		
		public Account[] listaUtentiRegistrati() throws Exception{
			DaoInterface dao = new DaoImpl();
			Account arrayAccount[] = null;
			arrayAccount = dao.prendiListaAccount();
			return arrayAccount;
		}
}

