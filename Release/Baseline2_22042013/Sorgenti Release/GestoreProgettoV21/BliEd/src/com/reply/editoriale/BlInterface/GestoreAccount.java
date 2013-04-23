package com.reply.editoriale.BlInterface;

import java.sql.SQLException;

import com.reply.editoriale.entity.Account;

public interface GestoreAccount {
	public abstract Account caricaAccount(String username) throws Exception;
	public abstract Account modificaAccount(String user, String password, String nome, String cognome, String siglaRedazione,String siglaGiornalista) throws Exception;
	public void AggiungiPrivilegio(String username) throws Exception;
	public void RimuoviPrivilegio(String username) throws Exception;
	public abstract boolean controlloAutorizzazioni(String nomeGruppo, String funzionalita) throws SQLException;
	public Account aggiungiNuovoAccount(String nome, String cognome,
			String username, String password, String siglaRedazione,
			String siglaGiornalista) throws Exception;
	public Account eseguiCancellaAccount(String username) throws Exception;
	public Account[] listaUtentiRegistrati() throws Exception;
}
