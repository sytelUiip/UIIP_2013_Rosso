package com.reply.editoriale.persistenceInterface;
import java.sql.SQLException;
import java.util.ArrayList;

import com.reply.editoriale.entity.*;

public interface DaoInterface {
	
	public Account executeLogin(String username, String password) throws Exception;
	public Account caricaAccount(String username)
			throws SQLException, Exception;
	public Account executeInsNuovoAccount(String nome, String cognome,
			String username, String password, String siglaRedazione,
			String siglaGiornalista) throws Exception;
	public Account modificaAccount(String user, String password, String nome, String cognome,
			String siglaRedazione, String siglaGiornalista) throws SQLException, Exception;
	public void AggiungiPrivilegio(String username) throws SQLException, Exception;
	public void RimuoviPrivilegio(String username) throws SQLException, Exception;
	public boolean controlloAutorizzazioni(String nomeGruppo,
			String funzionalita) throws SQLException;
	public Account executeCancellaAccount(String username) throws SQLException, Exception;
	public Account[] prendiListaAccount() throws SQLException, Exception;
	public Notizia createNotizia(Account autore,
			 String titolo, String sottoTitolo,
			String testo, int lunghezzaTesto) throws SQLException;
	
}
