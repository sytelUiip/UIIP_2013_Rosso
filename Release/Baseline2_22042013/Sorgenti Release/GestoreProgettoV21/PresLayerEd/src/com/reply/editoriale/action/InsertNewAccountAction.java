package com.reply.editoriale.action;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.*;
import com.reply.gestoreloginservice.GestoreAccountServRemoteExceptionException;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreLoginStub.Authentication;
import com.reply.gestoreloginservice.GestoreLoginStub.AuthenticationResponse;

public class InsertNewAccountAction extends ActionSupport {
	
	private static final Logger logger = Logger
			.getLogger(InsertNewAccountAction.class);
	
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private String sigla_redazione;
	private String sigla_giornalista;
	
	public String execute(){
		
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		InserisciNuovoAccount ina = new InserisciNuovoAccount();
	
		ina.setNome(nome);
		ina.setCognome(cognome);
		ina.setUsername(username);
		ina.setPassword(password);
		ina.setSiglaGiornalista(sigla_giornalista);
		ina.setSiglaRedazione(sigla_redazione);
	   
		InserisciNuovoAccountResponse inaRes = null;
	    	
			try {
				inaRes = gas.inserisciNuovoAccount(ina);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (GestoreAccountServRemoteExceptionException e) {
				if (logger.isInfoEnabled()) {
					logger.info("execute() - Inserimento dell'utente "+username+" non è stato eseguito");
				}
				addActionError(getText(e.getMessage()));
				return "error";
			}
			
			if (logger.isInfoEnabled()) {
				logger.info("execute() - Inserimento del nuovo utente "+username+" è stato effettuato con successo");
			}
			addActionMessage("Risultato eseguito con successo. Prova ancora.");
			return "success";
		
//		if(inaRes.get_return() != null)
//		{
//			addActionMessage("Risultato eseguito con successo. Prova ancora.");
//			return "success";
//		}
//		else
//		{
//			addActionError(getText("error.insertAccount"));
//			return "error";
//		}
		
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

}
