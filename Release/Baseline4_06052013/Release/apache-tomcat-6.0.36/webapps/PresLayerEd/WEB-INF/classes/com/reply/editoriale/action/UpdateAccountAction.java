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

public class UpdateAccountAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger
			.getLogger(UpdateAccountAction.class);
	
Map session = ActionContext.getContext().getSession();	
GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");

	private String nome;
	private String cognome;
	private String password;
	private String sigla_redazione;
	private String sigla_giornalista;
	private String username_old;
	
	public String execute() throws AxisFault{
		
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		UpdateAccount ua = new UpdateAccount();
	
		
		ua.setNomeFunzionalita("Modifica account");
		ua.setPasswordLogin(a.getPassword() );
		ua.setUserLogin(a.getUsername());
		ua.setCognome(cognome);
		ua.setNome(nome);
		ua.setPassword(password);
		ua.setSiglaGiornalista(sigla_giornalista);
		ua.setSiglaRedazione(sigla_redazione);
		ua.setUser(username_old);
	   
		UpdateAccountResponse uaRes = null;
	    	
			try {
				uaRes = gas.updateAccount(ua);
			} catch (AxisFault e) {
				if (logger.isInfoEnabled()) {
					logger.info("execute() - La modifica dell'utente "+username_old+" non è riuscita");
				}
				addActionError(getText(e.getMessage()));
				return "error";
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (logger.isInfoEnabled()) {
				logger.info("execute() - La modifica dell'utente "+username_old+" è andata a buon fine");
			}
			
			addActionMessage(getText("modificaAccountSuccess"));
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
	
	public String getUsername_old() {
		return username_old;
	}

	public void setUsername_old(String username_old) {
		this.username_old = username_old;
	}

}
