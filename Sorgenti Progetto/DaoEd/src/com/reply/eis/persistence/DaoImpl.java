package com.reply.eis.persistence;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import com.reply.editoriale.entity.*;
import com.reply.editoriale.persistenceInterface.DaoInterface;


import oracle.jdbc.OracleTypes;

public class DaoImpl implements DaoInterface {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(DaoImpl.class);
	
	public Account executeLogin(String username, String password) throws AxisFault, Exception {
		Connection conn = DbConnector.getConnection();
		if(conn == null)
		{
			if (logger.isInfoEnabled()) {
				logger.info("executeLogin(String, String) - La connessione al database per il controllo login non è riuscita.");
			}
			throw new AxisFault("COD_01");
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

			throw new AxisFault("COD_PR1");
		}
		
				ResultSet rs = (ResultSet)stmt.getObject(3);
		
				if (rs.next()==false){
					
					if (logger.isInfoEnabled()) {
						logger.info("executeLogin(String, String) - L'utente "+username+" non è presente nel database.");
					}
					throw new AxisFault("COD_02");
			
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
	
	
	public Account caricaAccount(String username) throws AxisFault, Exception {
	
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
			throw new AxisFault("COD_01");
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
			throw new AxisFault("COD_PR3");
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
			rs.close();
			stmt.close();
			DbConnector.closeConnection(conn);
			return userMod;
		} else {
			
			rs.close();
			stmt.close();
			DbConnector.closeConnection(conn);
			throw new AxisFault("COD_04");
		}
	}
	

	public Account executeInsNuovoAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String nome, String cognome,
			String username, String password, String siglaRedazione,
			String siglaGiornalista, String ruolo) throws AxisFault, Exception {
		boolean b=false;
		b=validazione(nomeFunzionalita, userLogin, passwordLogin);
		Account nuovoUtente;
		if(b==true){
		Connection conn;
		
			try{
				
					conn = DbConnector.getConnection();
					if (logger.isInfoEnabled()) {
						logger.info("executeInsNuovoAccount(String, String, String,String, String, String, String, String, String) - Connessione al DB per modifica account non è andata a buon fine");
					}
			}catch(Exception e)
			{
				if (logger.isInfoEnabled()) {
					logger.info("executeInsNuovoAccount(String, String, String,String, String, String, String, String, String) - Connessione al DB per inserimento nuovo account è andata a buon fine");
				}
				throw new AxisFault("COD_01");
			}
			
			
			try {
				nuovoUtente = caricaAccount(username);
			} catch (Exception e) {
				
				if(e.getMessage().equals("COD_04"))
				{
					nuovoUtente = null;
				}else
				{
					throw new AxisFault(e.getMessage());
				}
				
			}
			
			CallableStatement stmt = null;
			if (nuovoUtente == null) {
				if (logger.isInfoEnabled()) {
					logger.info("executeInsNuovoAccount(String, String, String,String, String, String, String, String, String) - Il nuovo account "+username+" che l'utente intende inserire nel sistema non è già presente nel DB");
				}
				String newpass;
				try{
					String query="";
					if (ruolo.equals("Amministratore")){
						query = "{call CREA_AMMINISTRATORE(?,?,?,?,?,?)}";	
					}
					else if (ruolo.equals("Giornalista"))
					{
						query ="{call CREA_ACCOUNT(?,?,?,?,?,?)}";
					}
					
					stmt = conn.prepareCall(query);
					stmt.setString(1, nome);
					stmt.setString(2, cognome);
					stmt.setString(3, username);
					newpass = MD5(password);
					stmt.setString(4, newpass);
					stmt.setString(5, siglaRedazione);
					stmt.setString(6, siglaGiornalista);
					stmt.execute();
				
				}catch(Exception e)
				{
					if (logger.isInfoEnabled()) {
						logger.info("executeInsNuovoAccount(String, String, String,String, String, String, String, String, String) - La store procedure per l'inserimento di un account non è andata a buon fine.");
					}
					throw new AxisFault("COD_PR2");
				}
				
				nuovoUtente = new Account();
				nuovoUtente.setCognome(cognome);
				nuovoUtente.setNome(nome);
				nuovoUtente.setUsername(username);
				nuovoUtente.setPassword(newpass);
				nuovoUtente.setSiglaRedazione(siglaRedazione);
				nuovoUtente.setSiglaGiornalista(siglaGiornalista);
				nuovoUtente.setStato("A");
				if (logger.isInfoEnabled()) {
					logger.info("executeInsNuovoAccount(String, String, String,String, String, String, String, String, String) - Inserimento dell'account "+username+" nel sistema effettuato");
				}
				return nuovoUtente;				
//				stmt.close();
//				DbConnector.closeConnection(conn);
						
			} else
			{
			if (logger.isInfoEnabled()) {
				logger.info("executeInsNuovoAccount(String, String, String,String, String, String, String, String, String) - L'username dell'utente che si sta inserendo è già presente nel DB.");
			}
				
				DbConnector.closeConnection(conn);
				String message = "COD_03";
				throw new AxisFault(message);
			}
		}else
		{
			throw new AxisFault("COD_07");
		}
		
		
	}

	public Account modificaAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String user, String password,  String nome, String cognome, 
			String siglaRedazione, String siglaGiornalista) throws AxisFault, Exception {
		

		boolean b=false;
		b=validazione(nomeFunzionalita, userLogin, passwordLogin);
		if(b==true){
			Connection conn;
			try{
				conn = DbConnector.getConnection();
				if (logger.isInfoEnabled()) {
					logger.info("modificaAccount(String, String, String,String, String, String, String, String, String) - Connessione alDB per modifica account non è andata a buon fine");
				}
			}catch(Exception e)
			{
				if (logger.isInfoEnabled()) {
					logger.info("modificaAccount(String, String, String,String, String, String, String, String, String) - Connessione al DB per modifica account è andata a buon fine ");
				}
				throw new AxisFault("COD_01");
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
						logger.info("modificaAccount(String, String, String,String, String, String, String, String, String) - La stored procedure per la modifica dell'account non è andata a buon fine.");
					}
					throw new AxisFault("COD_PR4");
				}	
					
				stmt.close();
				DbConnector.closeConnection(conn);
				if (logger.isInfoEnabled()) {
					logger.info("modificaAccount(String, String, String,String, String, String, String, String, String) -  Chiusura connessione DB per modifica account "+user+" riuscita");
				}
				Account userNew;
				try{
						userNew = caricaAccount(user);
				}catch(Exception e)
				{
					throw new AxisFault(e.getMessage());
				}
				
				if(userNew != null)
				{
					if (logger.isInfoEnabled()) {
						logger.info("modificaAccount(String, String, String,String, String, String, String, String, String) - Modifica account "+user+" effettuata con successo");
					}
					return userNew;
				}
				else
				{
					if (logger.isInfoEnabled()) {
						logger.info("modificaAccount(String, String, String,String, String, String, String, String, String) - L'utente che si sta modificando non è presente nel DB.");
					}
					throw new AxisFault("COD_02");
				}
		}else
	    {
	    	throw new AxisFault("COD_07");
	    }
	}
	
	public void AggiungiPrivilegio(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault, Exception{
		boolean b=false;
		b=validazione(nomeFunzionalita, userLogin, passwordLogin);
		if(b==true){
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

			throw new AxisFault("COD_01");
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

			throw new AxisFault("COD_PR5");
		}
		stmt.close();
		DbConnector.closeConnection(conn);

		if (logger.isInfoEnabled()) {
			logger.info("AggiungiPrivilegio(String) - La connessione al DB per l'aggiunta di privilegi è stata chiusa correttamente");
		}
		}else
	    {
	    	throw new AxisFault("COD_07");
	    }
	}
	
	
	public void RimuoviPrivilegio(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault, Exception{
		
		boolean b=false;
		b=validazione(nomeFunzionalita, userLogin, passwordLogin);
		if(b==true){
		Connection conn;
		
		System.out.println("fffffffffffffffffffffffffffffffffffffffffffhhhhhhhhhhhhhhhh");
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

			throw new AxisFault("COD_01");
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

			throw new AxisFault("COD_PR6");
		}
		
		stmt.close();
		DbConnector.closeConnection(conn);

		if (logger.isInfoEnabled()) {
			logger.info("RimuoviPrivilegio(String) - La connessione al DB per la rimozione dei privilegi è stata chiusa correttamente");
		}
		}else
	      {
	    	  throw new AxisFault("COD_07");
	      }
	}

	public Account executeCancellaAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault, Exception {
		
		boolean b=false;
		b=validazione(nomeFunzionalita, userLogin, passwordLogin);
		if(b==true){
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
			throw new AxisFault("COD_01");
		}
		
		Account utente;
		try{
			utente = caricaAccount(username);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
		
		if(utente != null)
		{

			if(!utente.getUsername().equals("admin@aa.a")){
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
					throw new AxisFault("COD_PR7");
				}
						stmt2.close();
						DbConnector.closeConnection(conn);
						if (logger.isInfoEnabled()) {
							logger.info("executeCancellaAccount(String) - La chiusura del DB per cancellare account è andata a buon fine.\nUtente "+username+" è stato eleminato dal DB");
						}
						
						if(userLogin.equals(username))
						{
							throw new AxisFault("COD_11");
						}
						
					return utente;
			}else{
				if (logger.isInfoEnabled()) {
					logger.info("executeCancellaAccount(String) - Utente "+username+" cercato per effettuare cancellazione non è eliminabile.");
				}
				throw new AxisFault("COD_06");
			}
		}else
		{
			if (logger.isInfoEnabled()) {
				logger.info("executeCancellaAccount(String) - Utente "+username+" cercato per effettuare cancellazione non è presente nel DB");
			}
			throw new AxisFault("COD_02");
		}
	    	}else
	         {
	    	   throw new AxisFault("COD_07");
	         }
		
	}
	
	public Account[] prendiListaAccount(String nomeFunzionalita,String userLogin,String passwordLogin, int min, int max) throws AxisFault, Exception{
		boolean b=false;
		b=validazione(nomeFunzionalita, userLogin, passwordLogin);
		if(b==true){
		Connection conn;
		try{
			conn = DbConnector.getConnection();
			if (logger.isInfoEnabled()) {
				logger.info("prendiListaAccount(String,String,String) - Connessione al DB per visualizzare la lista account è andata a buon fine");
			}
		}catch(Exception e)
		{
			if (logger.isInfoEnabled()) {
				logger.info("prendiListaAccount(String,String,String) - Connessione al DB per caricare la lista account non è andata a buon fine");
			}
			throw new AxisFault("COD_01");
		}
		
		CallableStatement stmt;
		try{
			String query = "{call LISTA_ACCOUNT_2(?,?,?)}";
			stmt = conn.prepareCall(query);
			stmt.setInt(1, min);
			stmt.setInt(2, max);
			stmt.registerOutParameter(3, OracleTypes.CURSOR);
			stmt.execute();
		}catch(Exception e)
		{
			throw new Exception("COD_PR8");
		}
		ResultSet rs = (ResultSet)stmt.getObject(3);
		
		ArrayList<Account> listaAccount = new ArrayList<Account>();
		
		while(rs.next()){
			

			Account utenteRisultato = new Account();
			utenteRisultato.setCognome(rs.getString("COGNOME"));
			utenteRisultato.setNome(rs.getString("NOME"));
			utenteRisultato.setUsername(rs.getString("USERNAME"));
			listaAccount.add(utenteRisultato);

		}
		
		int lunghezza = listaAccount.size();
		Account arrayAccount[] = new Account[lunghezza];
		
		//inseriemento degli elementi dell'arrayList in arrayAccount
		arrayAccount=(Account[]) listaAccount.toArray(arrayAccount);
		stmt.close();
		DbConnector.closeConnection(conn);
		return arrayAccount;
		}else
        {
 	     throw new AxisFault("COD_07");
        }
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
	
	public Notizia createNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,String autore,String titolo, String sottoTitolo, String testo) throws AxisFault, Exception{
		boolean b=false;
		b=validazione(nomeFunzionalita, userLogin, passwordLogin);
		if(b==true){
		
		Connection conn;
		try{
			conn = DbConnector.getConnection();
		}catch(Exception e){
			throw new AxisFault("COD_01");
		}
		
		CallableStatement stmt = null;
		int lung_testo = 0;
		
		try{
		String query = "{call CREAZIONE_NOTIZIA(?,?,?,?,?)}";
		stmt = conn.prepareCall(query);
		stmt.setString(1, titolo);
		stmt.setString(2, sottoTitolo);
		stmt.setString(3, autore);
		lung_testo = testo.length();
		stmt.setInt(4, lung_testo);
		stmt.setString(5, testo);
		stmt.execute();

				if (logger.isInfoEnabled()) {
					logger.info("createNotizia(String, String, String, String, String, String, String) - La procedura di creazione di una notizia è andata a buon fine.");
				}
		}catch(Exception e){
			
			if (logger.isInfoEnabled()) {
				logger.info("createNotizia(String, String, String, String, String, String, String) - La procedura di creazione di una notizia non è andata a buon fine.");
			}
			throw new AxisFault("COD_PR10");
		}
		
		stmt.close();

		Notizia newNotizia = new Notizia();
		newNotizia.setTesto(testo);
		newNotizia.setAutore(autore);
		newNotizia.setLunghezzaTesto(lung_testo);
		newNotizia.setSottoTitolo(sottoTitolo);
		newNotizia.setTitolo(titolo);
		newNotizia.setStato("S");
		newNotizia.setLock("N");
	
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		formato.setCalendar(GregorianCalendar.getInstance());
		String dataFormattata = formato.format(GregorianCalendar.getInstance().getTime());
		newNotizia.setDataCreazione(dataFormattata);
		DbConnector.closeConnection(conn);
		return newNotizia;
		}else
        {
			if (logger.isInfoEnabled()) {
				logger.info("createNotizia(String, String, String, String, String, String, String) - La procedura di creazione di una nuova notizia non può essere eseguita poichè l'utente non ha i diritti per farlo.");
			}

 	     throw new AxisFault("COD_07");
        }
	}
	
	
	public Notizia[] executeVisualizzaNotizieAutore(String nomeFunzionalita,String userLogin,String passwordLogin,String username, int min, int max)throws AxisFault, Exception {
		boolean b=false;
		b=validazione(nomeFunzionalita, userLogin, passwordLogin);
		if(b==true){
		Connection conn;
		try {
			conn = DbConnector.getConnection();
			if (logger.isInfoEnabled()) {
				logger.info("executeVisualizzaNotiziaAutore(String ) - Connessione al DB per visualizzare la lista delle notizie in base all'autore è andata a buon fine");
			}
		} catch (Exception e) {
			if (logger.isInfoEnabled()) {
				logger.info("executeVisualizzaNotiziaAutore(String) - Connessione al DB per visualizzare la lista delle notizie non è andata a buon fine");
			}
			throw new AxisFault("COD_01");
		}

		CallableStatement stmt;
		try {
			String query = "{call CERCA_NOTIZIA_AUTORE(?,?,?,?)}";
			stmt = conn.prepareCall(query);
			stmt.setString(1, username);
			stmt.setInt(2, min);
			stmt.setInt(3, max);
			stmt.registerOutParameter(4, OracleTypes.CURSOR);
			stmt.execute();

				if (logger.isInfoEnabled()) {
					logger.info("executeVisualizzaNotizieAutore(String, String, String, String, int, int) - La procedura per la ricerca delle notizie per autore è andata a buon fine.");
				}
		} catch (Exception e) {
			
			if (logger.isInfoEnabled()) {
				logger.info("executeVisualizzaNotizieAutore(String, String, String, String, int, int) - La procedura per la ricerca delle notizie per autore non è andata a buon fine.");
			}
			throw new AxisFault("COD_PR9");
		}

		
		ArrayList<Notizia> listaNotizie = new ArrayList<Notizia>();
		ResultSet rs = (ResultSet) stmt.getObject(4);
		Notizia[] arrayNotizie;
		

		while (rs.next()) {
			Notizia notizia = new Notizia();
			notizia.setId(rs.getInt("ID"));
			notizia.setAutore(rs.getString("AUTORE"));
			notizia.setTitolo(rs.getString("TITOLO"));
			notizia.setLock(rs.getString("LOCK_N"));
			notizia.setStato(rs.getString("STATO"));
			notizia.setUltimoDigitatore(rs.getString("ULTIMO_DIGITATORE"));
				
			listaNotizie.add(notizia);
			
			SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
			String dataCreazioneFormattata = formato.format(rs.getDate("DATA_CREAZIONE"));
			notizia.setDataCreazione(dataCreazioneFormattata);
			
			if(rs.getDate("DATA_TRASMISSIONE") != null)
			{
				String dataTrasmissioneFormattata = formato.format(rs.getDate("DATA_TRASMISSIONE"));
				notizia.setDataTrasmissione(dataTrasmissioneFormattata);
			}
	
		}

			arrayNotizie = new Notizia[listaNotizie.size()];
			arrayNotizie = listaNotizie.toArray(arrayNotizie);

			stmt.close();
			DbConnector.closeConnection(conn);
			if (logger.isInfoEnabled()) {
				logger.info("visualizzaNotizieAutore(String) - La chiusura del DB per visualizzare le notizie di "
						+ username + "è andata a buon fine.\n");
			}
			
		return arrayNotizie;
		}else
        {
			if (logger.isInfoEnabled()) {
				logger.info("executeVisualizzaNotizieAutore(String, String, String, String, int, int) - L'utente non ha i diritti necessari per l'esecuzione della procedura per la ricerca delle notizie per autore ");
			}

 	     throw new AxisFault("COD_07");
        }
	}
	
	
		public Notizia[] executeListaNotizie(String nomeFunzionalita,String userLogin,String passwordLogin, int min, int max) throws AxisFault, Exception{
			
			boolean b=false;
			b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			if(b==true){
				Connection conn;
				CallableStatement stmt;
				Notizia n=null;
				try{
					conn = DbConnector.getConnection();
			     }catch(Exception e)
			     {
				throw new AxisFault("COD_01");
			    }
				
		         try{
		        	 String query = "{call LISTA_NOTIZIA(?,?,?)}";
						stmt = conn.prepareCall(query);
						stmt.setInt(1, min);
						stmt.setInt(2, max);
						stmt.registerOutParameter(3, OracleTypes.CURSOR);
						stmt.execute();

				if (logger.isInfoEnabled()) {
					logger.info("executeListaNotizie(String, String, String, int, int) - La procedura associata alla visualizzazione della lista di notizie è andata a buon fine.");
				}
		         }catch(Exception e)
		 		{
		        	 if (logger.isInfoEnabled()) {
							logger.info("executeListaNotizie(String, String, String, int, int) - La procedura associata alla visualizzazione della lista di notizie non è andata a buon fine.");
						}
		 			throw new AxisFault("COD_PR13");
		 		}
		         
				ResultSet rs = (ResultSet)stmt.getObject(3);
				
				ArrayList<Notizia> listaNotizie = new ArrayList<Notizia>();
			
				while(rs.next()){
					
					Notizia notizia = new Notizia();
					notizia.setId(rs.getInt("ID"));
					notizia.setAutore(rs.getString("AUTORE"));
					notizia.setTitolo(rs.getString("TITOLO"));
					notizia.setSottoTitolo(rs.getString("SOTTOTITOLO"));
					notizia.setLock(rs.getString("LOCK_N"));
					notizia.setStato(rs.getString("STATO"));
					notizia.setUltimoDigitatore(rs.getString("ULTIMO_DIGITATORE"));
					
					SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
					String dataCreazioneFormattata = formato.format(rs.getDate("DATA_CREAZIONE"));
					notizia.setDataCreazione(dataCreazioneFormattata);
					
					if(rs.getDate("DATA_TRASMISSIONE") != null)
					{
						String dataTrasmissioneFormattata = formato.format(rs.getDate("DATA_TRASMISSIONE"));
						notizia.setDataTrasmissione(dataTrasmissioneFormattata);
					}
					
					listaNotizie.add(notizia);
		
				}
				int lunghezza = listaNotizie.size();
				Notizia[] array = new Notizia[lunghezza];
				
				//inseriemento degli elementi dell'arrayList in arrayAccount
				array=(Notizia[]) listaNotizie.toArray(array);
				
				stmt.close();
				DbConnector.closeConnection(conn);
				
				return array;
			}else
	        {

				if (logger.isInfoEnabled()) {
					logger.info("executeListaNotizie(String, String, String, String, int, int) - L'utente non ha i diritti necessari per l'esecuzione della procedura per la visualizzazione della lista delle notizie");
				}
	 	     throw new AxisFault("COD_07");
	        }
						
			}
		
		public Notizia[] executeListaNotiziaTitolo(String nomeFunzionalita,String userLogin,String passwordLogin,String titolo, int min, int max) throws AxisFault, Exception{
			
			boolean b=false;
			b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			if(b==true){
			ArrayList <Notizia> listaNotiziaTitolo = new ArrayList <Notizia>();
			Notizia[] listaNotiziaTitoloArray = null;
			
			Connection conn;
			try {
				conn = DbConnector.getConnection();
			} catch (Exception e) {
				throw new AxisFault("COD_01");
			}
			CallableStatement stmt;
			
			try {
				String query = "{call CERCA_NOTIZIA_TITOLO(?,?,?,?)}";
				stmt = conn.prepareCall(query);
				stmt.setString(1, titolo);
				stmt.setInt(2, min);
				stmt.setInt(3, max);
				stmt.registerOutParameter(4, OracleTypes.CURSOR);
				stmt.execute();

				if (logger.isInfoEnabled()) {
					logger.info("executeListaNotiziaTitolo(String, String, String, String, int, int) - La procedura associata alla ricerca delle notizie per titolo è andata a buon fine.");
				}
			
			} catch (Exception e) {
				
				if (logger.isInfoEnabled()) {
					logger.info("executeListaNotiziaTitolo(String, String, String, String, int, int) - La procedura associata alla ricerca delle notizie per titolo non è andata a buon fine.");
				}
				throw new AxisFault("COD_PR16");
			}
			ResultSet rs = (ResultSet) stmt.getObject(4);	
			
			ArrayList<Notizia> listaNotizie = new ArrayList<Notizia>();
					
				while (rs.next()) {
					Notizia notizia = new Notizia();
					notizia.setId(rs.getInt("ID"));
					notizia.setAutore(rs.getString("AUTORE"));
					notizia.setTitolo(rs.getString("TITOLO"));
					notizia.setLock(rs.getString("LOCK_N"));
					notizia.setStato(rs.getString("STATO"));
					notizia.setUltimoDigitatore(rs.getString("ULTIMO_DIGITATORE"));
					
					SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
					String dataCreazioneFormattata = formato.format(rs.getDate("DATA_CREAZIONE"));
					notizia.setDataCreazione(dataCreazioneFormattata);
					
					if(rs.getDate("DATA_TRASMISSIONE") != null)
					{
						String dataTrasmissioneFormattata = formato.format(rs.getDate("DATA_TRASMISSIONE"));
						notizia.setDataTrasmissione(dataTrasmissioneFormattata);
					}
					
					listaNotizie.add(notizia);
					
				}
				
				int lunghezza = listaNotizie.size();
				Notizia[] array = new Notizia[lunghezza];
				
				//inseriemento degli elementi dell'arrayList in arrayAccount
				array=(Notizia[]) listaNotizie.toArray(array);
				
				stmt.close();
				DbConnector.closeConnection(conn);
				return array;
			}else
	        {
			
			if (logger.isInfoEnabled()) {
				logger.info("executeListaNotiziaTitolo(String, String, String, String, int, int) - L'utente non ha i diritti necessari per l'esecuzione della procedura relativa alla ricerca delle notizie per titolo.");
			}

	 	     throw new AxisFault("COD_07");
	        }
		}
		
		public Notizia[] executeVisualizzaNotiziaStato(String nomeFunzionalita,String userLogin,String passwordLogin,String stato, int min, int max) throws AxisFault, Exception{
		
			
			boolean b=false;
			b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			if(b==true){
			Connection conn;
			try {
				conn = DbConnector.getConnection();
			} catch (Exception e) {
				throw new AxisFault("COD_01");
			}
			CallableStatement stmt;
			
			try {
				String query = "{call CERCA_NOTIZIA_STATO(?,?,?,?)}";
				stmt = conn.prepareCall(query);
				stmt.setString(1, stato);
				stmt.setInt(2, min);
				stmt.setInt(3, max);
				stmt.registerOutParameter(4, OracleTypes.CURSOR);
				stmt.execute();
				
				if (logger.isInfoEnabled()) {
					logger.info("executeVisualizzaNotiziaStato(String, String, String, String, int, int) - La procedura associata alla ricerca delle notizie per titolo è stata eseguita correttamente");
				}
			
			} catch (Exception e) {
				
				if (logger.isInfoEnabled()) {
					logger.info("executeVisualizzaNotiziaStato(String, String, String, String, int, int) - La procedura associata alla ricerca delle notizie per titolo non è stata eseguita correttamente");
				}
				throw new AxisFault("COD_PR11");
			}
			ResultSet rs = (ResultSet) stmt.getObject(4);	
			
			ArrayList<Notizia> listaNotizie = new ArrayList<Notizia>();
					
				while (rs.next()) {
					Notizia notizia = new Notizia();
					notizia.setId(rs.getInt("ID"));
					notizia.setAutore(rs.getString("AUTORE"));
					notizia.setTitolo(rs.getString("TITOLO"));
					notizia.setLock(rs.getString("LOCK_N"));
					notizia.setStato(rs.getString("STATO"));
					notizia.setUltimoDigitatore(rs.getString("ULTIMO_DIGITATORE"));
					
					SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
					String dataCreazioneFormattata = formato.format(rs.getDate("DATA_CREAZIONE"));
					notizia.setDataCreazione(dataCreazioneFormattata);
					
					if(rs.getDate("DATA_TRASMISSIONE") != null)
					{
						String dataTrasmissioneFormattata = formato.format(rs.getDate("DATA_TRASMISSIONE"));
						notizia.setDataTrasmissione(dataTrasmissioneFormattata);
					}
					
					listaNotizie.add(notizia);
					
				}
				
				int lunghezza = listaNotizie.size();
				Notizia[] array = new Notizia[lunghezza];
				
				//inseriemento degli elementi dell'arrayList in arrayAccount
				array=(Notizia[]) listaNotizie.toArray(array);
				
				stmt.close();
				DbConnector.closeConnection(conn);
				return array;
			}else
	        {
				if (logger.isInfoEnabled()) {
					logger.info("executeVisualizzaNotiziaStato(String, String, String, String, int, int) - L'utente non ha i diritti per l'esecuzione della procedura associata alla ricerca delle notizie per stato");
				}
	 	     throw new AxisFault("COD_07");
	        }
		}
		
		public Notizia executeCercaNotiziaId(String nomeFunzionalita,String userLogin,String passwordLogin,int id)throws Exception{
			
			boolean b=false;
			b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			if(b==true){
			Connection conn=null;
				try{
				 conn=DbConnector.getConnection();
				}catch(Exception e)
				{
					throw new AxisFault("COD_01");
				}
				
				CallableStatement stmt;
				
				try{
					String query = "{call CERCA_NOTIZIA_ID(?,?)}";
					stmt = conn.prepareCall(query);
					stmt.setLong(1, id);
					stmt.registerOutParameter(2, OracleTypes.CURSOR);
					stmt.execute();

				if (logger.isInfoEnabled()) {
					logger.info("executeCercaNotiziaId(String, String, String, int) - La procedura per la ricerca della notizia per id è stata eseguita correttamente.");
				}
				}catch(Exception e)
				{
					if (logger.isInfoEnabled()) {
						logger.info("executeCercaNotiziaId(String, String, String, int) - La procedura per la ricerca della notizia per id non è stata eseguita correttamente.");
					}
					throw new AxisFault("COD_PR14");
				}
				
				ResultSet rs = (ResultSet) stmt.getObject(2);
				
				if (rs.next()) 
				{
					Notizia notizia = new Notizia();
					notizia.setId(rs.getInt("ID"));
					notizia.setLunghezzaTesto(rs.getInt("LUNGHEZZA_TESTO"));
					notizia.setTesto(rs.getString("TESTO"));
					notizia.setSottoTitolo(rs.getString("SOTTOTITOLO"));
					notizia.setAutore(rs.getString("AUTORE"));
					notizia.setTitolo(rs.getString("TITOLO"));
					notizia.setLock(rs.getString("LOCK_N"));
					notizia.setStato(rs.getString("STATO"));
					notizia.setUltimoDigitatore(rs.getString("ULTIMO_DIGITATORE"));
					
					SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
					String dataCreazioneFormattata = formato.format(rs.getDate("DATA_CREAZIONE"));
					notizia.setDataCreazione(dataCreazioneFormattata);
					
					if(rs.getDate("DATA_TRASMISSIONE") != null)
					{
						String dataTrasmissioneFormattata = formato.format(rs.getDate("DATA_TRASMISSIONE"));
						notizia.setDataTrasmissione(dataTrasmissioneFormattata);
					}
				
					
						DbConnector.closeConnection(conn);
					return notizia;
				}else
				{
						return null;
				}
			}else
	        {
				if (logger.isInfoEnabled()) {
					logger.info("executeCercaNotiziaId(String, String, String, int) - L'utente non ha i diritti per eseguire la procedura per la ricerca della notizia per id");
				}
	 	     throw new AxisFault("COD_07");
	        }
		}
		
		public Notizia executeVerficaModifica(int id, String user) throws AxisFault, Exception{
			
			Connection conn=null;
			try{
			 conn=DbConnector.getConnection();
			}catch(Exception e)
			{
				throw new AxisFault("COD_01");
			}
			
			CallableStatement stmt;
			
			try{
				String query = "{call VERIFICA_MODIFICA_NOTIZIA(?,?,?)}";
				stmt = conn.prepareCall(query);
				stmt.setLong(1, id);
				stmt.setString(2, user);
				stmt.registerOutParameter(3, OracleTypes.CURSOR);
				stmt.execute();
			}catch(Exception e)
			{
					if (logger.isInfoEnabled()) {
						logger.info("executeVerficaModifica(int, String) - La stored procedure per verificare i permessi per poter editare una notizia non è andata a buon fine ");
					}

				throw new AxisFault("COD_PR14");
				
			}
			
			ResultSet rs = (ResultSet) stmt.getObject(3);
			
			Notizia n= new Notizia();
			if (rs.next()) 
			{
				n.setTitolo(rs.getString("TITOLO"));
				n.setAutore(rs.getString("AUTORE"));

				SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
				String dataCreazioneFormattata = formato.format(rs.getDate("DATA_CREAZIONE"));
				n.setDataCreazione(dataCreazioneFormattata);
				
				if(rs.getDate("DATA_TRASMISSIONE") != null)
				{
					String dataTrasmissioneFormattata = formato.format(rs.getDate("DATA_TRASMISSIONE"));
					n.setDataTrasmissione(dataTrasmissioneFormattata);
				}

				n.setStato(rs.getString("STATO"));
				n.setLock(rs.getString("LOCK_N"));
				n.setUltimoDigitatore("ULTIMO_DIGITATORE");
				n.setTesto(rs.getString("TESTO"));
				n.setLunghezzaTesto(rs.getInt("LUNGHEZZA_TESTO"));
			
				try {
					DbConnector.closeConnection(conn);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

					if (logger.isInfoEnabled()) {
						logger.info("executeVerficaModifica(int, String) - Sono stati accordati i permessi per cancellare la notizia con id: ' "+id+" ' all'utente "+user+".");
					}
					
					return n;
			}
				else{
					if (logger.isInfoEnabled()) {
						logger.info("executeVerficaModifica(int, String) - Non sono stati concessi all'utente "+user+" i permessi per cancellare la notizia con id: ' "+id+" '.");
					}
					return null;
				}
		}
		
		public Notizia executeCancellaNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception 
		{
        	  boolean b=false;
			 b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			 if(b==true){
				Connection conn = null;
				Notizia n = null;

				try {
					conn = DbConnector.getConnection();
				} catch (Exception e) {
					

					throw new AxisFault("COD_01");
				}
				
				if(conn == null)
				{
					if (logger.isInfoEnabled()) {
						logger.info("executeCancellaNotizia(int, String) - La connessione al DB per cancellare una notizia non è andata a buon fine");
					}
					throw new AxisFault("COD_01");
				}
				else
				{
					if (logger.isInfoEnabled()) {
						logger.info("executeCancellaNotizia(int, String) - La connessione al DB per cancellare una notizia è andata a buon fine");
					}

				}
				
				try {
					n = executeVerficaModifica(id, userLogin);
				} catch (Exception e) {
					throw new AxisFault(e.getMessage());
				}
				
				if (n != null) {
					if (logger.isInfoEnabled()) {
						logger.info("executeCancellaNotizia(int, String) - La notizia con id: ' "
								+ id
								+ " ' che l'utente "
								+ userLogin
								+ " intende cancellare ha i requisiti necesseri per effettuare tale operazione.");
					}

					CallableStatement stmt1;
					try {
						String query1 = "{call CANCELLAZIONE_NOTIZIA(?)}";
						stmt1 = conn.prepareCall(query1);
						stmt1.setLong(1, id);
						stmt1.execute();
						
						if (logger.isInfoEnabled()) {
							logger.info("executeCancellaNotizia(int, String) - La procedura per cancellare la notizia con id ' "
									+ id
									+ " ' da parte dell'utente "
									+ userLogin
									+ " è andata a buon fine");
						}

					} catch (Exception e) {
						if (logger.isInfoEnabled()) {
							logger.info("executeCancellaNotizia(int, String) - La procedura per cancellare la notizia con id ' "
									+ id
									+ " ' da parte dell'utente "
									+ userLogin
									+ " non è andata a buon fine");
						}
						throw new AxisFault("COD_PR7");
					}
					stmt1.close();

					try {
						n = executeCercaNotiziaId( nomeFunzionalita, userLogin, passwordLogin,id);
					} catch (Exception e) {
						throw new AxisFault(e.getMessage());
					}

				} else {
					
						if (logger.isInfoEnabled()) {
							logger.info("executeCancellaNotizia(int, String) - La notizia con id: ' "
									+ id
									+ " ' che l'utente "
									+ userLogin
									+ " intende cancellare non ha i requisiti necesseri per effettuare tale operazione.");
						}

						throw new AxisFault("COD_05");
					}
			
					try {
						DbConnector.closeConnection(conn);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						

					}
					
					return n;
			 }else
		        {
				 
				 if (logger.isInfoEnabled()) {
						logger.info("executeCancellaNotizia(int, String) - L'utenete non ha i diritti per eseguire l'operazione di cancellazione di una notizia.");
					}
		 	     throw new AxisFault("COD_07");
		        }
		}
		
		
		
		public boolean ModificaNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id)
				throws AxisFault, Exception {
			
			boolean b=false;
			 b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			 if(b==true){
			Connection conn = null;
			try {
				conn = DbConnector.getConnection();
			} catch (SQLException e) {
				throw new AxisFault("COD_01");
			}
			CallableStatement stmt = null;
			try {
				String query = "{call VERIFICA_MODIFICA_NOTIZIA(?,?,?)}";
				stmt = conn.prepareCall(query);
				stmt.setInt(1, id);
				stmt.setString(2, userLogin);
				stmt.registerOutParameter(3, OracleTypes.CURSOR);
				stmt.execute();
			} catch (Exception e) {
				throw new AxisFault("COD_PR15");
			}
			ResultSet rs = (ResultSet) stmt.getObject(3);
			if (rs.next()) {
				setLock(id, userLogin);

				if (logger.isInfoEnabled()) {
					logger.info("ModificaNotizia(String, String, String, int) - La procedura di bloccaggio della notizia selezionata è andata a buon fine.");
				}

				return true;
			} else {
				if (logger.isInfoEnabled()) {
					logger.info("ModificaNotizia(String, String, String, int) - La procedura di bloccaggio della notizia selezionata non è andata a buon fine poichè la notizia è gia bloccata o non editabile.");
				}
				return false;
			}
			 }else
		        {
				 if (logger.isInfoEnabled()) {
						logger.info("ModificaNotizia(String, String, String, int) - L'utente non ha i diritti per eseguire la procedura di bloccaggio della notizia selezionata.");
					}
		 	     throw new AxisFault("COD_07");
		        }
		}

		public void setLock(int id, String username) throws Exception {
			Connection conn = null;
			try {
				conn = DbConnector.getConnection();
			} catch (SQLException e) {
				throw new AxisFault("COD_01");
			}
			CallableStatement stmt = null;
			try {
				String query = "{call SET_MODIFICA(?,?)}";
				stmt = conn.prepareCall(query);
				stmt.setInt(1, id);
				stmt.setString(2, username);
				stmt.execute();
			} catch (Exception e) {
				throw new AxisFault("COD_PR17");
			}
		}

		public Notizia registraNotizia(String nomeFunzionalita,String userLogin,String passwordLogin, int id, String titolo,
				String sottotitolo, String testo) throws AxisFault, Exception {
			boolean b=false;
			 b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			 if(b==true){
			Notizia news = null;
			Connection conn = null;
			try {
				conn = DbConnector.getConnection();
			} catch (SQLException e) {
				throw new AxisFault("COD_01");
			}
			if (executeVerficaModifica(id, userLogin) != null) {
				CallableStatement stmt = null;
				try {
					String query = "{call REGISTRA_NOTIZIE(?,?,?,?,?)}";
					stmt = conn.prepareCall(query);
					stmt.setInt(1, id);
					stmt.setString(2, titolo);
					stmt.setString(3, sottotitolo);
					stmt.setInt(4, testo.length());
					stmt.setString(5, testo);
					stmt.execute();

					if (logger.isInfoEnabled()) {
						logger.info("registraNotizia(String, String, String, int, String, String, String) - La procedura di modifica della notizia è avvenuta correttamente.");
					}
				} catch (Exception e) {
					if (logger.isInfoEnabled()) {
						logger.info("registraNotizia(String, String, String, int, String, String, String) - La procedura di modifica della notizia non è avvenuta correttamente.");
					}
					throw new AxisFault("COD_PR18");
				}
				
				try{
					news = executeCercaNotiziaId(nomeFunzionalita,userLogin, passwordLogin,id);
				}catch(Exception e)
				{
					throw new AxisFault(e.getMessage());
				}
				
			} else {
				throw new AxisFault("error.notauthtomod");
			}
			return news;
			 }else
		        {
			if (logger.isInfoEnabled()) {
				logger.info("registraNotizia(String, String, String, int, String, String, String) - L'utente non ha i diritti per l'esecuzione della procedura di modifica di una notizia");
			}

		 	     throw new AxisFault("COD_07");
		        }
		}
		
		public boolean annulla(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception{
			
			boolean b=false;
			 b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			 if(b==true){
			Connection conn = null;
			try {
				conn = DbConnector.getConnection();
			} catch (SQLException e) {
				throw new AxisFault("COD_01");
			}
			CallableStatement stmt = null;
			try {
				String query = "{call ANNULLA(?)}";
				stmt = conn.prepareCall(query);
				stmt.setInt(1, id);
				stmt.execute();

				if (logger.isInfoEnabled()) {
					logger.info("annulla(String, String, String, int) - La procedura di annulla è stata eseguita correttamente");
				}
				
			} catch (Exception e) {
				if (logger.isInfoEnabled()) {
					logger.info("annulla(String, String, String, int) - La procedura di annulla non è stata eseguita correttamente");
				}
				throw new AxisFault("COD_PR19");
			}
			return true;
			 }else
		        {
				 if (logger.isInfoEnabled()) {
						logger.info("annulla(String, String, String, int) - L'utente non ha i diritti per eseguire la procedura di annulla delle modifiche di una notizia");
					}
		 	     throw new AxisFault("COD_07");
		        }
		}
		
		public boolean annullaLista(String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault, Exception{
			
			boolean b=false;
			 b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			 if(b==true){
			Connection conn = null;
			boolean risultato = false;
			try {
				conn = DbConnector.getConnection();
			} catch (SQLException e) {
				throw new AxisFault("COD_01");
			}
			CallableStatement stmt = null;
			try {
				String query = "{call ANNULLA_LISTA(?)}";
				stmt = conn.prepareCall(query);
				stmt.setString(1, userLogin);
				stmt.execute();
				risultato = true;

				if (logger.isInfoEnabled()) {
					logger.info("annullaLista(String, String, String) - La procedura di annullamento delle modifiche prese in carico dall'utente è stata eseguita correttamente");
				}
			} catch (Exception e) {
				if (logger.isInfoEnabled()) {
					logger.info("annullaLista(String, String, String) - La procedura di annullamento delle modifiche prese in carico dall'utente non è stata eseguita correttamente");
				}
				throw new AxisFault("COD_PR20");
				
			}
			return risultato;
			 }else
		        {
				 if (logger.isInfoEnabled()) {
						logger.info("annullaLista(String, String, String) - L'utente non ha i diritti per l'esecuzione della procedura di annullamento delle modifiche prese in carico dall'utente");
					}
		 	     throw new AxisFault("COD_07");
		        }
		}
		
		public Notizia trasmettiNotizia(int id,String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault, Exception 
		{
			boolean b=false;
			 b=validazione(nomeFunzionalita, userLogin, passwordLogin);
			 if(b==true){

				Connection conn = null;
				Notizia n = null;

				try {
					conn = DbConnector.getConnection();
				} catch (Exception e) {
					

					throw new AxisFault("COD_01");
				}
				
				try {
					n = executeVerficaModifica(id, userLogin);
				} catch (Exception e) {
					throw new AxisFault(e.getMessage());
				}
				
				if (n != null) {
		
					CallableStatement stmt1;
					try {
						String query1 = "{call TRASMETTI_NOTIZIA(?)}";
						stmt1 = conn.prepareCall(query1);
						stmt1.setLong(1, id);
						stmt1.execute();

					if (logger.isInfoEnabled()) {
						logger.info("trasmettiNotizia(int, String, String, String) - La procedura di trasmissione della notizia è stata eseguita correttamente");
					}

					} catch (Exception e) {
						if (logger.isInfoEnabled()) {
							logger.info("trasmettiNotizia(int, String, String, String) - La procedura di trasmissione della notizia non è stata eseguita correttamente");
						}
						throw new AxisFault("COD_PR21");
					}
					stmt1.close();

					try {
						n = executeCercaNotiziaId(nomeFunzionalita, userLogin, passwordLogin,id);
					} catch (Exception e) {
						throw new AxisFault(e.getMessage());
					}

				} else {
						throw new AxisFault("COD010");
					}
			
					try {
						DbConnector.closeConnection(conn);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						

					}
					
					return n;
			 }else
		        {
				 if (logger.isInfoEnabled()) {
						logger.info("trasmettiNotizia(int, String, String, String) - L'utente non ha i diritti per l'esecuzione della procedura di trasmissione della notizia");
					}
		 	     throw new AxisFault("COD_07");
		        }
		}
		
			public Notizia[] executePrendiNotiziaTrasmitter() throws AxisFault, Exception{


			Connection conn;
			try {
				conn = DbConnector.getConnection();
			} catch (Exception e) {
				throw new AxisFault("COD_01");
			}
			CallableStatement stmt;
			
			try {
			String query = "{call PRENDI_NOTIZIA(?)}";
			System.out.println("Entra in procedura!!!!");
			stmt = conn.prepareCall(query);
			stmt.registerOutParameter(1, OracleTypes.CURSOR);
			stmt.execute();
			
			
			} catch (Exception e) {
				throw new AxisFault("COD_PR22");
			}
			ResultSet rs = (ResultSet) stmt.getObject(1);	
			
			ArrayList<Notizia> listaNotizieTrasmitter = new ArrayList<Notizia>();
			int i=0;
			while (rs.next()) {
				i++;
				System.out.println("entraaaaaaaaaaaaaaaaa");
				Notizia notizia = new Notizia();
				notizia.setId(rs.getInt("ID"));
				notizia.setAutore(rs.getString("AUTORE"));
				notizia.setTitolo(rs.getString("TITOLO"));
				notizia.setSottoTitolo(rs.getString("SOTTOTITOLO"));
				notizia.setTesto(rs.getString("TESTO"));
				notizia.setUltimoDigitatore(rs.getString("ULTIMO_DIGITATORE"));
				
				//SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
				SimpleDateFormat formato = new SimpleDateFormat("yyyyMMddHHmmss");
				String dataCreazioneFormattata = formato.format(rs.getTimestamp("DATA_CREAZIONE").getTime());
				notizia.setDataCreazione(dataCreazioneFormattata);
				System.out.println("DATA FORMATTATA " + dataCreazioneFormattata);
				
				if(rs.getDate("DATA_TRASMISSIONE") != null)
				{
					String dataTrasmissioneFormattata = formato.format(rs.getDate("DATA_TRASMISSIONE"));
					notizia.setDataTrasmissione(dataTrasmissioneFormattata);
				}
				listaNotizieTrasmitter.add(notizia);	
			}
			
			System.out.println("Indice: " + i);
			Notizia notizieTrasmitter [] = new Notizia[listaNotizieTrasmitter.size()];
			System.out.println("Linghezza ArrayList: " + listaNotizieTrasmitter.size());
			notizieTrasmitter = listaNotizieTrasmitter.toArray(notizieTrasmitter);
			System.out.println("*************************************************");
			System.out.println("Lunghezza notizia: " + notizieTrasmitter.length);
			
			return notizieTrasmitter;
			
		}

		public void setNotiziaTrasmessa(int id) throws AxisFault, Exception{
			
			Connection conn;
			try {
				conn = DbConnector.getConnection();
			} catch (Exception e) {
				throw new AxisFault("COD_01");
			}
			CallableStatement stmt;
			try {
				String query = "{call NOTIZIA_TRASMESSA(?)}";
				System.out.println("Entra in procedura!!!!");
				stmt = conn.prepareCall(query);
				stmt.setLong(1, id);
				stmt.execute();
				} catch (Exception e) {
					throw new AxisFault("COD_PR23");
				}
			
			stmt.close();
			DbConnector.closeConnection(conn);
			
		}
		
		public void inserisciNotiziaEsterna(Notizia news) throws AxisFault, Exception{
			Connection conn;
			try{
				conn = DbConnector.getConnection();
			}catch(Exception e){
				throw new AxisFault("COD_01");
			}
			
			CallableStatement stmt = null;
			int lung_testo = 0;
			
			try{
			String query = "{call INSERISCI_NOTIZIA_ESTERNA(?,?,?,?,?,?)}";
			stmt = conn.prepareCall(query);
			stmt.setString(1, news.getTitolo());
			stmt.setString(2, news.getSottoTitolo());
			stmt.setString(3, news.getAutore());
//			stmt.setString(4, autore);
			String testo = news.getTesto();
			lung_testo = testo.length();
			stmt.setInt(4, lung_testo);
			
			stmt.setString(5, testo);
			//System.out.println("Qui Arriva!!!t");
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date date = format.parse(news.getDataCreazione());
		//	System.out.println("Data date: " + date);
			//SimpleDateFormat format2 = new SimpleDateFormat("dd-MM-yyyy");
			
			java.sql.Date sqldata = new java.sql.Date(date.getTime());
			//System.out.println("SQLDATA: " + sqldata);
			stmt.setDate(6, sqldata);			
			stmt.execute();

			if (logger.isInfoEnabled()) {
				logger.info("inserisciNotiziaEsterna(Notizia) - La ricezione di una nuova notizia è avvenuta correttamente");
			}
			}catch(Exception e){
				if (logger.isInfoEnabled()) {
					logger.info("inserisciNotiziaEsterna(Notizia) - La ricezione di una nuova notizia non è avvenuta correttamente");
				}
				throw new AxisFault("COD_PR24");
			}
			
			stmt.close();
			DbConnector.closeConnection(conn);
			
		}
		
		public boolean validazione(String nomeFunzionalita, String user,String password)throws AxisFault, Exception{
			 Connection conn = null;
			 ResultSet rs2=null;
			 Funzionalita f=null;
			 boolean n=false;
			 boolean b=false;
			 Account a=null;
			 CallableStatement stmt = null;
			 
			try {
				conn = DbConnector.getConnection();
			} catch (Exception e) {
				throw new AxisFault("COD_01");
			}
		
				b=verificaAccount(user, password);
				System.out.println("bbbbbbbbbbbbb:"+b);
				
				if(b==true){
	             a=caricaAccount(user);
	             System.out.println("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
				for (int i = 0; i < a.getGruppiLavoro().length; i++) {
					try {
						String query = "{call CONTROLLO_FUNZIONALITA(?,?,?)}";
						stmt = conn.prepareCall(query);
						stmt.setString(1, a.getGruppiLavoro()[i].getNome());
						stmt.setString(2, nomeFunzionalita);
						stmt.registerOutParameter(3, OracleTypes.CURSOR);
						stmt.execute();

					} catch (Exception e) {
						throw new AxisFault("COD_PR20");
					}
					ResultSet rs = (ResultSet) stmt.getObject(3);
					if (rs.next()) {
						n = true;
					}
				}}

			System.out.println("llllllllllllllllllllllllllllllll"+n);
			 return n;
			 
			 
		 }
		
		public boolean verificaAccount(String username, String password) throws AxisFault, Exception {
			Connection conn = DbConnector.getConnection();
			try {
				conn = DbConnector.getConnection();
			} catch (Exception e) {
				throw new AxisFault("COD_01");
			}

			boolean b=false;
			CallableStatement stmt;

			try {

				String query = "{call LOGIN(?,?,?)}";
				stmt = conn.prepareCall(query);
				stmt.setString(1, username);
				stmt.setString(2, password);
				stmt.registerOutParameter(3, OracleTypes.CURSOR);
				stmt.execute();

			} catch (Exception e) {
				System.out.println("ffffffffffffffffffffffffffffffffffffffffff");
				throw new AxisFault("COD_PR1");
			}
			ResultSet rs = (ResultSet) stmt.getObject(3);

			if (rs.next()) {
				b=true;
			
				}

			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
			rs.close();
			stmt.close();
			DbConnector.closeConnection(conn);

			return b;
		}
		
		
		public int contaNotizie() throws AxisFault, Exception{
			
			Connection conn;
			CallableStatement stmt;
			
			try{
				conn = DbConnector.getConnection();
		     }catch(Exception e)
		     {
			throw new AxisFault("COD_01");
		    }
	         try{
	        	 System.out.println("**********************************");
				String query = "{call CONTA_NOTIZIE(?)}";
				stmt = conn.prepareCall(query);
				stmt.registerOutParameter(1, OracleTypes.NUMBER);
				stmt.execute();
	         }catch(Exception e)
	 		{
	 			throw new AxisFault("COD_PR25");
	 		}
			
			int numeroNotizie=stmt.getInt(1);
			stmt.close();
			DbConnector.closeConnection(conn);
			
			return numeroNotizie;
		}
		
		public int contaNotizieTitolo(String titolo) throws AxisFault, Exception {

		Connection conn;
		CallableStatement stmt;
		
		try {
			conn = DbConnector.getConnection();
		} catch (Exception e) {
			throw new AxisFault("COD_01");
		}
		try {
			System.out.println("**********************************");
			String query = "{call CONTA_NOTIZIE_TITOLO(?,?)}";
			stmt = conn.prepareCall(query);
			stmt.setString(1, titolo);
			stmt.registerOutParameter(2, OracleTypes.NUMBER);
			stmt.execute();
		} catch (Exception e) {
			throw new AxisFault("COD_PR26");
		}

		int numeroNotizieTitolo = stmt.getInt(2);
		stmt.close();
		DbConnector.closeConnection(conn);
		return numeroNotizieTitolo;
	}
	
		public int contaNotizieStato(String stato) throws AxisFault, Exception {

			Connection conn;
			CallableStatement stmt;
			
			try {
				conn = DbConnector.getConnection();
			} catch (Exception e) {
				throw new AxisFault("COD_01");
			}
			try {
				System.out.println("**********************************");
				String query = "{call CONTA_NOTIZIE_STATO(?,?)}";
				stmt = conn.prepareCall(query);
				stmt.setString(1, stato);
				stmt.registerOutParameter(2, OracleTypes.NUMBER);
				stmt.execute();
			} catch (Exception e) {
				throw new AxisFault("COD_PR27");
			}

			int numeroNotizieStato = stmt.getInt(2);
			stmt.close();
			DbConnector.closeConnection(conn);
			return numeroNotizieStato;
		}
		
		
		public int contaNotizieAutore(String autore) throws AxisFault, Exception {

			Connection conn;
			CallableStatement stmt;
			
			try {
				conn = DbConnector.getConnection();
			} catch (Exception e) {
				throw new AxisFault("COD_01");
			}
			try {
				System.out.println("**********************************");
				String query = "{call CONTA_NOTIZIE_AUTORE(?,?)}";
				stmt = conn.prepareCall(query);
				stmt.setString(1, autore);
				stmt.registerOutParameter(2, OracleTypes.NUMBER);
				stmt.execute();
			} catch (Exception e) {
				throw new AxisFault("COD_PR28");
			}

			int numeroNotizieAutore = stmt.getInt(2);
			stmt.close();
			DbConnector.closeConnection(conn);
			return numeroNotizieAutore;
		}
		
		
		public int contaAccount() throws AxisFault, Exception {

			Connection conn;
			CallableStatement stmt;
			
			try {
				conn = DbConnector.getConnection();
			} catch (Exception e) {
				throw new AxisFault("COD_01");
			}
			try {
				System.out.println("**********************************");
				String query = "{call CONTA_ACCOUNT(?)}";
				stmt = conn.prepareCall(query);
				stmt.registerOutParameter(1, OracleTypes.NUMBER);
				stmt.execute();
			} catch (Exception e) {
				throw new AxisFault("COD_PR29");
			}

			int numeroAccount = stmt.getInt(1);
			stmt.close();
			DbConnector.closeConnection(conn);
			return numeroAccount;
		}
}




	

