package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.*;
import com.reply.gestoreloginservice.GestoreLoginStub;

public class InsertNewAccountAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger
			.getLogger(InsertNewAccountAction.class);
	
	Map session = ActionContext.getContext().getSession();
	GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
	
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private String sigla_redazione;
	private String sigla_giornalista;
	private String ruolo;
	
	public String execute() throws AxisFault{
		
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		InserisciNuovoAccount ina = new InserisciNuovoAccount();
	     
		ina.setNomeFunzionalita("Crea account");
		ina.setPasswordLogin(a.getPassword());
		ina.setUserLogin(a.getUsername());
		ina.setNome(nome);
		ina.setCognome(cognome);
		ina.setUsername(username);
		ina.setPassword(password);
		ina.setSiglaGiornalista(sigla_giornalista);
		ina.setSiglaRedazione(sigla_redazione);
		ina.setRuolo(ruolo);
	   
		InserisciNuovoAccountResponse inaRes = null;
	    	
			try {
				inaRes = gas.inserisciNuovoAccount(ina);
			} catch (AxisFault e) {
				if (logger.isInfoEnabled()) {
					logger.info("execute() - Inserimento dell'utente "+username+" non è stato eseguito");
				}
				addActionError(getText(e.getMessage()));
				return "error";
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (logger.isInfoEnabled()) {
				logger.info("execute() - Inserimento del nuovo utente "+username+" è stato effettuato con successo");
			}
			addActionMessage(getText("insertAccountSuccess"));
			return "success";
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSigla_redazione() {
		return sigla_redazione;
	}

	public void setSigla_redazione(String sigla_redazione) {
		this.sigla_redazione = sigla_redazione;
	}

	public String getSigla_giornalista() {
		return sigla_giornalista;
	}

	public void setSigla_giornalista(String sigla_giornalista) {
		this.sigla_giornalista = sigla_giornalista;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	
}
