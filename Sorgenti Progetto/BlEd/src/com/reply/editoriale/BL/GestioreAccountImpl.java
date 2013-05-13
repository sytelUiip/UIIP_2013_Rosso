package com.reply.editoriale.BL;

import java.sql.SQLException;

import com.reply.editoriale.BlInterface.GestoreAccount;
import com.reply.editoriale.entity.Account;
import com.reply.editoriale.persistenceInterface.DaoInterface;
import com.reply.eis.persistence.DaoImpl;

public class GestioreAccountImpl implements GestoreAccount{

		public Account modificaAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String user, String password,  String nome, String cognome, 
				String siglaRedazione, String siglaGiornalista) throws Exception{
			DaoInterface dao = new DaoImpl();
			Account risultato = null;
			risultato = dao.modificaAccount( nomeFunzionalita, userLogin, passwordLogin, user,  password,   nome,  cognome, 
					 siglaRedazione,  siglaGiornalista);
			return risultato;
		}
		public void AggiungiPrivilegio(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws Exception{
				DaoInterface dao = new DaoImpl();
					dao.AggiungiPrivilegio( nomeFunzionalita, userLogin, passwordLogin, username);
			}
		
		public void RimuoviPrivilegio(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws Exception{
				DaoInterface dao = new DaoImpl();
					dao.RimuoviPrivilegio( nomeFunzionalita, userLogin, passwordLogin, username);
			}
		
		public Account caricaAccount(String username) throws Exception{
			DaoInterface dao = new DaoImpl();
			Account risultato = null;
			risultato = dao.caricaAccount(username);
			return risultato;
		}
		
		public Account aggiungiNuovoAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String nome, String cognome,
				String username, String password, String siglaRedazione,
				String siglaGiornalista, String ruolo) throws Exception{
			// TODO Auto-generated method stub

			DaoInterface dao = new DaoImpl();
			Account nuovoAccount = null;
			nuovoAccount = dao.executeInsNuovoAccount( nomeFunzionalita, userLogin, passwordLogin, nome,  cognome,
					 username,  password,  siglaRedazione,
					 siglaGiornalista, ruolo);
			return nuovoAccount;
		}	

		
		public Account eseguiCancellaAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws Exception{
			// TODO Auto-generated method stub
			DaoInterface dao = new DaoImpl();
			Account risultato = null;
			risultato = dao.executeCancellaAccount( nomeFunzionalita, userLogin, passwordLogin, username);
			return risultato;
		}
		
		public Account[] listaUtentiRegistrati(String nomeFunzionalita,String userLogin,String passwordLogin, int min, int max) throws Exception{
			DaoInterface dao = new DaoImpl();
			Account arrayAccount[] = null;
			arrayAccount = dao.prendiListaAccount( nomeFunzionalita, userLogin, passwordLogin, min, max);
			return arrayAccount;
		}
		
		public int contaAccount() throws Exception{
			DaoInterface dao = new DaoImpl();
			return dao.contaAccount();
		}
		
}

