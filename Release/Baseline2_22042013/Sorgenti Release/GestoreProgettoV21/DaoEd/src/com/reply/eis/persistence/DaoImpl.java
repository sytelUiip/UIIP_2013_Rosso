package com.reply.eis.persistence;

import org.apache.log4j.Logger;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.reply.editoriale.entity.*;
import com.reply.editoriale.persistenceInterface.DaoInterface;


import oracle.jdbc.OracleTypes;

public class DaoImpl implements DaoInterface {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(DaoImpl.class);
	
	public Account executeLogin(String username, String password) throws Exception {
		Connection conn = DbConnector.getConnection();
		if(conn == null)
		{
			if (logger.isInfoEnabled()) {
				logger.info("executeLogin(String, String) - La connessione al database per il controllo login non è riuscita.");
			}
			throw new Exception("COD_01");
		}
		else
		{
			if (logger.isInfoEnabled()) {
				logger.info("executeLogin(String, String) - La connessione al database per il controllo login è riuscita.");
			}

		}
		
		Account utenteRisultato = null;
		CallableStatement stmt;
		
		try{
		
				String query = "{call LOGIN(?,?,?)}";
				stmt = conn.prepareCall(query);
				stmt.setString(1, username);
				String newpass = MD5(password);
				stmt.setString(2, newpass);
				stmt.registerOutParameter(3, OracleTypes.CURSOR);
				stmt.execute();
				
		}catch(Exception e)
		{
			if (logger.isInfoEnabled()) {
				logger.info("executeLogin(String, String) - La store procedure per il login non è andata a buon fine.");
			}

			throw new Exception("COD_PR1");
		}
		
				ResultSet rs = (ResultSet)stmt.getObject(3);
		
				if (rs.next()==false){
					
					if (logger.isInfoEnabled()) {
						logger.info("executeLogin(String, String) - L'utente "+username+" non è presente nel database.");
					}
					throw new Exception("COD_02");
			
				}else
				{
					if (logger.isInfoEnabled()) {
						logger.info("executeLogin(String, String) - L'utente "+username+" è presente nel database e può effettuare il login.");
					}

						utenteRisultato = new Account();
						utenteRisultato.setNome(rs.getString("NOME"));
						utenteRisultato.setCognome(rs.getString("COGNOME"));
						utenteRisultato.setUsername(rs.getString("USERNAME"));
						utenteRisultato.setPassword(rs.getString("PASSWORD"));
						utenteRisultato.setSiglaRedazione(rs.getString("SIGLA_REDAZIONE"));
						utenteRisultato.setSiglaGiornalista(rs.getString("SIGLA_GIORNALISTA"));
						utenteRisultato.setStato(rs.getString("STATO"));
						Gruppo gruppomy = new Gruppo();
						gruppomy.setNome(rs.getString("NOME_GRUPPO"));
						
						ArrayList<Gruppo> g = new ArrayList<Gruppo>();
						g.add(gruppomy);
		
						while(rs.next())
						{
							Gruppo gruppomy2 = new Gruppo();
							gruppomy2.setNome(rs.getString("NOME_GRUPPO"));
							
							g.add(gruppomy2);
							
						}
						
						Gruppo[] gArray= new Gruppo[g.size()];
						
						gArray = g.toArray(gArray);
						
						utenteRisultato.setGruppiLavoro(gArray);
						
						for(int i=0; i< utenteRisultato.getGruppiLavoro().length; i++)
						{
							if(utenteRisultato.getGruppiLavoro()[i] != null)
							{
								String query1 = "{call CARICA_FUNZIONALITA(?,?)}";
								CallableStatement stmt1 = conn.prepareCall(query1);
								stmt1.setString(1, utenteRisultato.getGruppiLavoro()[i].getNome());
								stmt1.registerOutParameter(2, OracleTypes.CURSOR);
								stmt1.execute();
								ResultSet rs1 = (ResultSet)stmt1.getObject(2);
								ArrayList<Funzionalita> funz = new ArrayList<Funzionalita>();
								
								while(rs1.next())
								{
									Funzionalita f = new Funzionalita();
									f.setNome(rs1.getString("NOME_FUNZIONALITA"));
									f.setSigla(rs1.getString("SIGLA_FUNZIONALITA"));
									funz.add(f);
								}
								
								Funzionalita[] funzArray = new Funzionalita[funz.size()];
								funzArray = funz.toArray(funzArray);
								utenteRisultato.getGruppiLavoro()[i].setFunzioni(funzArray);
							}
						}
							
				}
				
				rs.close();
				stmt.close();
				DbConnector.closeConnection(conn);
				
	

		if (logger.isInfoEnabled()) {
			logger.info("executeLogin(String, String) - La connessione al Database per il login è stata chiusa con successo.");
		}

		return utenteRisultato;
	}
	
	
	public Account caricaAccount(String username) throws Exception {
		Connection conn;
		try{
		 conn = DbConnector.getConnection();
		 if (logger.isInfoEnabled()) {
				logger.info("caricaAccount(String) - La connessione al DB per la ricerca dell'account "+username+" è andata a buon fine");
			}
		}catch(Exception e){
			if (logger.isInfoEnabled()) {
				logger.info("caricaAccount(String) - La connessione al DB per la ricerca dell'account "+username+" non è andata a buon fine");
			}
			throw new Exception("COD_01");
		}
		
		CallableStatement stmt;
		
		try{
			String query = "{call STAMPA_ACCOUNT(?,?)}";
			stmt = conn.prepareCall(query);
			stmt.setString(1, username);
			stmt.registerOutParameter(2, OracleTypes.CURSOR);
			stmt.execute();
		}catch(Exception e)
		{
			throw new Exception("COD_PR3");
		}
		
		ResultSet rs = (ResultSet) stmt.getObject(2);
		Account userMod = new Account();
		if (rs.next()) {
			userMod.setUsername(rs.getString("USERNAME"));
			userMod.setNome(rs.getString("NOME"));
			userMod.setCognome(rs.getString("COGNOME"));
			userMod.setPassword(rs.getString("PASSWORD"));
			userMod.setSiglaGiornalista(rs.getString("SIGLA_GIORNALISTA"));
			userMod.setSiglaRedazione(rs.getString("SIGLA_REDAZIONE"));
			userMod.setStato(rs.getString("STATO"));
			Gruppo gruppoM = new Gruppo();
			gruppoM.setNome(rs.getString("NOME_GRUPPO"));
			
			ArrayList<Gruppo> g = new ArrayList<Gruppo>();
			g.add(gruppoM);
		
			while (rs.next()) {
				Gruppo gruppoM2 = new Gruppo();
				gruppoM2.setNome(rs.getString("NOME_GRUPPO"));
				g.add(gruppoM2);
			}
			
			Gruppo[] gArray= new Gruppo[g.size()];
			gArray = g.toArray(gArray);
			
			userMod.setGruppiLavoro(gArray);
			DbConnector.closeConnection(conn);
			return userMod;
		} else {
			
			DbConnector.closeConnection(conn);
//			throw new Exception("COD_04");
			
		return null;
		}
	}


	public Account executeInsNuovoAccount(String nome, String cognome,
			String username, String password, String siglaRedazione,
			String siglaGiornalista) throws Exception {
		
		Connection conn;
		
			try{
				
					conn = DbConnector.getConnection();
					if (logger.isInfoEnabled()) {
						logger.info("executeInsNuovoAccount(String, String, String, String, String, String) - Connessione al DB per modifica account non è andata a buon fine");
					}
			}catch(Exception e)
			{
				if (logger.isInfoEnabled()) {
					logger.info("executeInsNuovoAccount(String, String, String, String, String, String) - Connessione al DB per inserimento nuovo account è andata a buon fine");
				}
				throw new Exception("COD_01");
			}
			
			Account nuovoUtente;
			try {
				nuovoUtente = caricaAccount(username);
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
			
			CallableStatement stmt;
			if (nuovoUtente == null) {
				if (logger.isInfoEnabled()) {
					logger.info("executeInsNuovoAccount(String, String, String, String, String, String) - Il nuovo account "+username+" che l'utente intende inserire nel sistema non è già presente nel DB");
				}
				try{
						String query = "{call CREA_ACCOUNT(?,?,?,?,?,?)}";
						stmt = conn.prepareCall(query);
						stmt.setString(1, nome);
						stmt.setString(2, cognome);
						stmt.setString(3, username);
						String newpass = MD5(password);
						stmt.setString(4, newpass);
						stmt.setString(5, siglaRedazione);
						stmt.setString(6, siglaGiornalista);
						stmt.execute();
						if (logger.isInfoEnabled()) {
							logger.info("executeInsNuovoAccount(String, String, String, String, String, String) - Inserimento dell'account "+username+" nel sistema effettuato");
						}
						
				}catch(Exception e)
				{
					if (logger.isInfoEnabled()) {
						logger.info("executeInsNuovoAccount(String, String, String, String, String, String) - La store procedure per l'inserimento di un account non è andata a buon fine.");
					}
					throw new Exception("COD_PR2");
				}
						stmt.close();
						nuovoUtente = caricaAccount(username);
						DbConnector.closeConnection(conn);
						return nuovoUtente;
			} else
			{
			if (logger.isInfoEnabled()) {
				logger.info("executeInsNuovoAccount(String, String, String, String, String, String) - L'username dell'utente che si sta inserendo è già presente nel DB.");
			}

				throw new Exception("COD_03");
			}
	}
//			return null;	}

	public Account modificaAccount(String user, String password,  String nome, String cognome, 
			String siglaRedazione, String siglaGiornalista) throws Exception {
			Connection conn;
			try{
				conn = DbConnector.getConnection();
				if (logger.isInfoEnabled()) {
					logger.info("modificaAccount(String, String, String, String, String, String) - Connessione alDB per modifica account non è andata a buon fine");
				}
			}catch(Exception e)
			{
				if (logger.isInfoEnabled()) {
					logger.info("modificaAccount(String, String, String, String, String, String) - Connessione al DB per modifica account è andata a buon fine ");
				}
				throw new Exception("COD_01");
			}
		
			String query = "{call MODIFICA_ACCOUNT(?,?,?,?,?,?)}";
			CallableStatement stmt = conn.prepareCall(query);
			try {
					stmt.setString(1, user);
					String newpass = MD5(password);
					stmt.setString(2, newpass);
					stmt.setString(3, nome);
					stmt.setString(4, cognome);
					stmt.setString(5, siglaRedazione);
					stmt.setString(6, siglaGiornalista);
					stmt.execute();
				} catch (Exception exc) {
					if (logger.isInfoEnabled()) {
						logger.info("modificaAccount(String, String, String, String, String, String) - La stored procedure per la modifica dell'account non è andata a buon fine.");
					}
					throw new Exception("COD_PR4");
				}	
					
				stmt.close();
				DbConnector.closeConnection(conn);
				if (logger.isInfoEnabled()) {
					logger.info("executeInsNuovoAccount(String, String, String, String, String, String) -  Chiusura connessione DB per modifica account "+user+" riuscita");
				}
				Account userNew;
				try{
						userNew = caricaAccount(user);
				}catch(Exception e)
				{
					throw new Exception(e.getMessage());
				}
				
				if(userNew != null)
				{
					if (logger.isInfoEnabled()) {
						logger.info("modificaAccount(String, String, String, String, String, String) - Modifica account "+user+" effettuata con successo");
					}
					return userNew;
				}
				else
				{
					if (logger.isInfoEnabled()) {
						logger.info("modificaAccount(String, String, String, String, String, String) - L'utente che si sta modificando non è presente nel DB.");
					}
					throw new Exception("COD_02");
				}
		}
	
	public void AggiungiPrivilegio(String username) throws Exception{
		Connection conn;
		try{
			if (logger.isInfoEnabled()) {
				logger.info("AggiungiPrivilegio(String) - La connessione al DB per l'aggiunta privilegi è avvenuta con successo.");
			}

			conn = DbConnector.getConnection();
		}catch(Exception e)
		{
			if (logger.isInfoEnabled()) {
				logger.info("AggiungiPrivilegio(String) - La connessione al DB per l'aggiunta privilegi non è avvenuta correttamente.");
			}

			throw new Exception("COD_01");
		}
		
		CallableStatement stmt;
		
		try{
			String query = "{call AGGIUNGI_PRIVILEGI(?)}";
			stmt = conn.prepareCall(query);
			stmt.setString(1, username);
			stmt.execute();

			if (logger.isInfoEnabled()) {
				logger.info("AggiungiPrivilegio(String) - La stored procedure per l'aggiunta dei privilegi all'utente è andata a buon fine");
			}
		}catch(Exception e)
		{
			if (logger.isInfoEnabled()) {
				logger.info("AggiungiPrivilegio(String) - La stored procedure per l'aggiunta privilegi non è andata a buon fine.");
			}

			throw new Exception("COD_PR5");
		}
		stmt.close();
		DbConnector.closeConnection(conn);

		if (logger.isInfoEnabled()) {
			logger.info("AggiungiPrivilegio(String) - La connessione al DB per l'aggiunta di privilegi è stata chiusa correttamente");
		}
	}
	
	public void RimuoviPrivilegio(String username) throws Exception{
		Connection conn;
		try{
			conn = DbConnector.getConnection();

			if (logger.isInfoEnabled()) {
				logger.info("RimuoviPrivilegio(String) - La connessione al DB per la rimozione di privilegi è avvenuta con successo");
			}
		}catch(Exception e)
		{
			if (logger.isInfoEnabled()) {
				logger.info("RimuoviPrivilegio(String) - La connessione al DB per la rimozione di privilegi non è avvenuta con successo");
			}

			throw new Exception("COD_01");
		}
		
		CallableStatement stmt;
		try {
			String query = "{call RIMUOVI_PRIVILEGI(?)}";
			stmt = conn.prepareCall(query);
			stmt.setString(1, username);
			stmt.execute();
			
			if (logger.isInfoEnabled()) {
				logger.info("RimuoviPrivilegio(String) - La stored procedure per la rimozione privilegi è stata eseguita correttamente");
			}
		} catch (Exception e) {
			if (logger.isInfoEnabled()) {
				logger.info("RimuoviPrivilegio(String) - La stored procedure per la rimozione di privilegi non è andata a buon fine");
			}

			throw new Exception("COD_PR6");
		}
		
		stmt.close();
		DbConnector.closeConnection(conn);

		if (logger.isInfoEnabled()) {
			logger.info("RimuoviPrivilegio(String) - La connessione al DB per la rimozione dei privilegi è stata chiusa correttamente");
		}
	}

	public boolean controlloAutorizzazioni(String nomeGruppo,
			String funzionalita) throws SQLException {
		Connection conn = DbConnector.getConnection();
		if (conn==null){
			if (logger.isInfoEnabled()) {
				logger.info("controlloAutorizzazioni(String, String) - La connessione al DB per il controllo autorizzazioni non è avvenuta con successo");
			}
			} else
					{
	
			if (logger.isInfoEnabled()) {
				logger.info("controlloAutorizzazioni(String, String) - La connessione al DB per il controllo autorizzazioni è avvenuta con successo");
			}
		}
		
		String query = "{call CONTROLLO_FUNZIONALITA(?,?,?)}";
		CallableStatement stmt = conn.prepareCall(query);
		stmt.setString(1, nomeGruppo);
		stmt.setString(2, funzionalita);
		stmt.registerOutParameter(3, OracleTypes.CURSOR);
		stmt.execute();

		if (logger.isInfoEnabled()) {
			logger.info("controlloAutorizzazioni(String, String) - La stored procedure per il controllo autorizzazioni è andata a buon fine");
		}
		
		ResultSet rs = (ResultSet) stmt.getObject(3);
		DbConnector.closeConnection(conn);
		
		if (rs.next() == true)
		{
			if (logger.isInfoEnabled()) {
				logger.info("controlloAutorizzazioni(String, String) - Il controllo delle autorizzazioni ha dato esito positivo");
			}
			return true;
		}
		else
		{
			if (logger.isInfoEnabled()) {
				logger.info("controlloAutorizzazioni(String, String) - Il controllo delle autorizzazioni ha dato esito negativo");
			}
			return false;
		}
			
	}
	
	public Account executeCancellaAccount(String username) throws Exception {
		Connection conn;
		try{
			conn = DbConnector.getConnection();
			if (logger.isInfoEnabled()) {
				logger.info("executeCancellaAccount(String) - Connessione al DB per cancellare account non è andata a buon fine");
			}
		}catch(Exception e)
		{
			if (logger.isInfoEnabled()) {
				logger.info("executeCancellaAccount(String) - Connessione al DB per cancellare account è andata a buon fine");
			}
			throw new Exception("COD_01");
		}
		
		Account utente;
		try{
			utente = caricaAccount(username);
		}catch(Exception e)
		{
			throw new Exception(e.getMessage());
		}
		
		if(utente != null)
		{
			if (logger.isInfoEnabled()) {
				logger.info("executeCancellaAccount(String) - Utente "+username+" cercato per effettuare cancellazione è presente nel DB");
			}
			CallableStatement stmt2;
			try{
					String query2 = "{call CANCELLA_ACCOUNT(?)}";
					stmt2 = conn.prepareCall(query2);
					stmt2.setString(1, username);
					stmt2.execute();
			}catch(Exception e)
			{
				throw new Exception("COD_PR7");
			}
					stmt2.close();
					DbConnector.closeConnection(conn);
					if (logger.isInfoEnabled()) {
						logger.info("executeCancellaAccount(String) - La chiusura del DB per cancellare account è andata a buon fine.\nUtente "+username+" è stato eleminato dal DB");
					}
					return utente;
		}else
		{
			if (logger.isInfoEnabled()) {
				logger.info("executeCancellaAccount(String) - Utente "+username+" cercato per effettuare cancellazione non è presente nel DB");
			}
			throw new Exception("COD_02");
		}
		
	}
	
	public Account[] prendiListaAccount() throws Exception{
		
		Connection conn;
		try{
			conn = DbConnector.getConnection();
			if (logger.isInfoEnabled()) {
				logger.info("prendiListaAccount() - Connessione al DB per visualizzare la lista account è andata a buon fine");
			}
		}catch(Exception e)
		{
			if (logger.isInfoEnabled()) {
				logger.info("executeCancellaAccount(String) - Connessione al DB per cancellare account è andata a buon fine");
			}
			throw new Exception("COD_01");
		}
		
		CallableStatement stmt;
		try{
			String query = "{call LISTA_ACCOUNT(?)}";
			stmt = conn.prepareCall(query);
			stmt.registerOutParameter(1, OracleTypes.CURSOR);
			stmt.execute();
		}catch(Exception e)
		{
			throw new Exception("COD_PR8");
		}
		ResultSet rs = (ResultSet)stmt.getObject(1);
		
		ArrayList<Account> listaAccount = new ArrayList<Account>();
		
		Account userPrecedente = null;
		while(rs.next()){
			
			if(userPrecedente == null)
			{
				Account utenteRisultato = new Account();
				Gruppo[] gruppiLavoro = new Gruppo[2];
				utenteRisultato.setCognome(rs.getString("COGNOME"));
				utenteRisultato.setNome(rs.getString("NOME"));
				utenteRisultato.setCognome(rs.getString("COGNOME"));
				utenteRisultato.setUsername(rs.getString("USERNAME"));
				utenteRisultato.setPassword(rs.getString("PASSWORD"));
				utenteRisultato.setSiglaRedazione(rs.getString("SIGLA_REDAZIONE"));
				utenteRisultato.setSiglaGiornalista(rs.getString("SIGLA_GIORNALISTA"));
				utenteRisultato.setStato(rs.getString("STATO"));
				Gruppo gruppomy = new Gruppo();
				gruppomy.setNome(rs.getString("NOME_GRUPPO"));
				gruppiLavoro[0] = gruppomy;
				utenteRisultato.setGruppiLavoro(gruppiLavoro);	
				listaAccount.add(utenteRisultato);
				userPrecedente = utenteRisultato;
			}
			else if(rs.getString("USERNAME").equals(userPrecedente.getUsername()))
			{
				Gruppo gruppomy2 = new Gruppo();
				gruppomy2.setNome(rs.getString("NOME_GRUPPO"));
				userPrecedente.getGruppiLavoro()[1] = gruppomy2;
			}
			else
			{
				Account utenteRisultato = new Account();
				Gruppo[] gruppiLavoro = new Gruppo[2];
				utenteRisultato.setCognome(rs.getString("COGNOME"));
				utenteRisultato.setNome(rs.getString("NOME"));
				utenteRisultato.setCognome(rs.getString("COGNOME"));
				utenteRisultato.setUsername(rs.getString("USERNAME"));
				utenteRisultato.setPassword(rs.getString("PASSWORD"));
				utenteRisultato.setSiglaRedazione(rs.getString("SIGLA_REDAZIONE"));
				utenteRisultato.setSiglaGiornalista(rs.getString("SIGLA_GIORNALISTA"));
				utenteRisultato.setStato(rs.getString("STATO"));
				Gruppo gruppomy = new Gruppo();
				gruppomy.setNome(rs.getString("NOME_GRUPPO"));
				gruppiLavoro[0] = gruppomy;
				utenteRisultato.setGruppiLavoro(gruppiLavoro);	
				listaAccount.add(utenteRisultato);
				userPrecedente = utenteRisultato;
						
			}
			
		}
		
		int lunghezza = listaAccount.size();
		Account arrayAccount[] = new Account[lunghezza];
		
		//inseriemento degli elementi dell'arrayList in arrayAccount
		arrayAccount=(Account[]) listaAccount.toArray(arrayAccount);
		
		return arrayAccount;
		
	}
	
	public static String MD5(String md5) {
		   try {
		        java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(md5.getBytes());
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) {
		          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		       }
		        return sb.toString();
		    } catch (java.security.NoSuchAlgorithmException e) {
		    }
		    return null;
	}
	
	public Notizia createNotizia(Account autore,
			 String titolo, String sottoTitolo,
			String testo, int lunghezzaTesto) throws SQLException{
		
		Connection conn = DbConnector.getConnection();
		String query = "{call CREAZIONE_NOTIZIA(?,?,?,?,?)}";
		CallableStatement stmt = conn.prepareCall(query);
		
		
		stmt.setString(1, titolo);
		stmt.setString(2, sottoTitolo);
		stmt.setString(3, autore.getSiglaGiornalista());
		stmt.setInt(4, lunghezzaTesto);
		stmt.setString(5, testo);
		
		stmt.execute();
		stmt.close();

		Notizia newNotizia = new Notizia();
		newNotizia.setTesto(testo);
		newNotizia.setAutore(autore);
		newNotizia.setLunghezzaTesto(lunghezzaTesto);
		newNotizia.setSottoTitolo(sottoTitolo);
		newNotizia.setTitolo(titolo);
				
		
		return newNotizia;
		
	}


}
