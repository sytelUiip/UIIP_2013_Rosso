package com.reply.editoriale.action;

import org.apache.log4j.Logger;

import java.rmi.RemoteException;

import java.util.Map;

import org.apache.axis2.AxisFault;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.*;
import com.reply.gestoreloginservice.GestoreLoginStub;


public class RuoliAccountAction extends ActionSupport {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(RuoliAccountAction.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	
	public String rimuoviRuoloGiornalista() throws AxisFault{
		
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Map session= ActionContext.getContext().getSession();
		GestoreLoginStub.Account g =(GestoreLoginStub.Account)session.get("utente_loggato");
	
		RimuoviRuoloGiornalista oa = new RimuoviRuoloGiornalista();
	
		oa.setUsername(username);
	    oa.setNomeFunzionalita("Lista account");	
	    oa.setUserLogin(g.getUsername());
	    oa.setPasswordLogin(g.getPassword());
	       
			try {
					gas.rimuoviRuoloGiornalista(oa);
			} catch (AxisFault e) {
				addActionError(getText(e.getMessage()));
				if (logger.isInfoEnabled()) {
					logger.info("rimuoviRuoloGiornalista() - L'utente "+g.getUsername()+" ha cercato di cancellare il ruolo di giornalista all'account "+username+", ma si è verificato un problema.");
				}
				return "error";
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		if (logger.isInfoEnabled()) {
			logger.info("rimuoviRuoloGiornalista() - L'utente "+g.getUsername()+" ha cancellato il ruolo di giornalista all'account "+username+".");
		}
		
			addActionMessage(getText("rimuoviPrivilegiSuccess"));
			return "success";
		
	}
	
	public String aggiungiRuoloGiornalista() throws AxisFault{
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Map session= ActionContext.getContext().getSession();
		GestoreLoginStub.Account a =(GestoreLoginStub.Account)session.get("utente_loggato");
		AggiungiRuoloGiornalista arg = new AggiungiRuoloGiornalista();
		
		arg.setUsername(username);	
		arg.setNomeFunzionalita("Lista account");
		arg.setPasswordLogin(a.getPassword());
		arg.setUserLogin(a.getUsername());
		
		try {
			gas.aggiungiRuoloGiornalista(arg);
		} catch (AxisFault e) {
			addActionError(getText(e.getMessage()));

	if (logger.isInfoEnabled()) {
	logger.info("aggiungiRuoloGiornalista() - L'utente "+a.getUsername()+" ha cercato di aggiungere il ruolo di giornalista all'account "+username+", ma si è verificato un problema.");
	}
			return "error";
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	if (logger.isInfoEnabled()) {
	logger.info("aggiungiRuoloGiornalista() - L'utente "+a.getUsername()+" ha aggiunto il ruolo di giornalista all'account "+username+".");
	}

		addActionMessage(getText("aggiungiPrivilegiSuccess"));
		return "success";
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
