package com.reply.editoriale.persistenceInterface;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.axis2.AxisFault;

import com.reply.editoriale.entity.*;

public interface DaoInterface {
	public Account caricaAccount(String username) throws AxisFault, Exception;
	public Account executeLogin(String username, String password) throws AxisFault, Exception;
	public Account executeInsNuovoAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String nome, String cognome,
			String username, String password, String siglaRedazione,
			String siglaGiornalista, String ruolo) throws AxisFault, Exception;
	public Account modificaAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String user, String password,  String nome, String cognome, 
			String siglaRedazione, String siglaGiornalista) throws AxisFault,Exception;
	public void AggiungiPrivilegio(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault, Exception;
	public void RimuoviPrivilegio(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault, Exception;
	public Account executeCancellaAccount(String nomeFunzionalita,String userLogin,String passwordLogin,String username) throws AxisFault, Exception;
	public Account[] prendiListaAccount(String nomeFunzionalita,String userLogin,String passwordLogin, int min, int max) throws AxisFault, Exception;
	public Notizia createNotizia(String nomeFunzionalita,String userLogin,
			String passwordLogin,String autore,String titolo, String sottoTitolo, String testo) throws AxisFault, Exception;
	public Notizia[] executeVisualizzaNotizieAutore(String nomeFunzionalita,String userLogin,String passwordLogin,String username, int min, int max)throws AxisFault, Exception;
	public Notizia[] executeListaNotizie(String nomeFunzionalita,String userLogin,String passwordLogin, int min, int max) throws AxisFault, Exception;
	public Notizia[] executeListaNotiziaTitolo(String nomeFunzionalita,String userLogin,String passwordLogin,String titolo, int min, int max) throws AxisFault, Exception;
	public Notizia[] executeVisualizzaNotiziaStato(String nomeFunzionalita,String userLogin,String passwordLogin,String stato, int min, int max) throws AxisFault, Exception;
	public Notizia executeCercaNotiziaId(String nomeFunzionalita,String userLogin,String passwordLogin,int id)throws AxisFault, Exception;
	public Notizia executeCancellaNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception;
	public boolean ModificaNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id)
			throws AxisFault, Exception;
	public Notizia registraNotizia(String nomeFunzionalita,String userLogin,String passwordLogin, int id, String titolo,
			String sottotitolo, String testo) throws AxisFault, Exception;
	public void setLock(int id, String username) throws AxisFault, Exception;
	public boolean annulla(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception;
	public boolean annullaLista(String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault, Exception;
	public Notizia trasmettiNotizia(int id,String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault, Exception;
	public Notizia[] executePrendiNotiziaTrasmitter() throws AxisFault, Exception;
	
	public void setNotiziaTrasmessa(int id) throws AxisFault, Exception;
	public void inserisciNotiziaEsterna(Notizia news) throws AxisFault, Exception;
	public boolean validazione(String nomeFunzionalita, String user,String password)throws AxisFault, Exception;
	public boolean verificaAccount(String username, String password) throws AxisFault, Exception; 
	public int contaAccount() throws AxisFault, Exception;
	public int contaNotizieAutore(String autore) throws AxisFault, Exception;
	public int contaNotizieStato(String stato) throws AxisFault, Exception;
	public int contaNotizieTitolo(String titolo) throws AxisFault, Exception;
	public int contaNotizie() throws AxisFault, Exception;
	
	
}
