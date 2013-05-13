package com.reply.editoriale.BlInterface;

import java.sql.SQLException;

import org.apache.axis2.AxisFault;

import com.reply.editoriale.entity.Account;

public interface GestoreAccount {
	public abstract Account caricaAccount(String username) throws AxisFault, Exception;
	public abstract Account modificaAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String user, String password,  String nome, String cognome, 
			String siglaRedazione, String siglaGiornalista) throws AxisFault, Exception;
	public void AggiungiPrivilegio(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault, Exception;
	public void RimuoviPrivilegio(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault, Exception;
	public Account aggiungiNuovoAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String nome, String cognome,
			String username, String password, String siglaRedazione,
			String siglaGiornalista, String ruolo) throws AxisFault, Exception;
	public Account eseguiCancellaAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault, Exception;
	public Account[] listaUtentiRegistrati(String nomeFunzionalita,String userLogin,String passwordLogin, int min, int max) throws Exception;
	public int contaAccount() throws Exception;
}
