package com.reply.editoriale.action;

import org.apache.log4j.Logger;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.apache.commons.lang3.text.translate.AggregateTranslator;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.*;
import com.reply.gestoreloginservice.GestoreAccountServRemoteExceptionException;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreLoginStub.Authentication;
import com.reply.gestoreloginservice.GestoreLoginStub.AuthenticationResponse;

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
	
	public String rimuoviRuoloGiornalista(){
		
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		RimuoviRuoloGiornalista oa = new RimuoviRuoloGiornalista();
	
		oa.setUsername(username);
		Map session= ActionContext.getContext().getSession();
		GestoreLoginStub.Account g =(GestoreLoginStub.Account)session.get("utente_loggato");
	    	
			try {
					gas.rimuoviRuoloGiornalista(oa);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (GestoreAccountServRemoteExceptionException e) {
				addActionError(getText(e.getMessage()));
				if (logger.isInfoEnabled()) {
					logger.info("rimuoviRuoloGiornalista() - L'utente "+g.getUsername()+" ha cercato di cancellare il ruolo di giornalista all'account "+username+", ma si è verificato un problema.");
				}
				return "error";
			}
			
			
		if (logger.isInfoEnabled()) {
			logger.info("rimuoviRuoloGiornalista() - L'utente "+g.getUsername()+" ha cancellato il ruolo di giornalista all'account "+username+".");
		}
			
			return "success";
		
	}
	
	public String aggiungiRuoloGiornalista(){
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		AggiungiRuoloGiornalista arg = new AggiungiRuoloGiornalista();
		arg.setUsername(username);
		Map session= ActionContext.getContext().getSession();
		GestoreLoginStub.Account g =(GestoreLoginStub.Account)session.get("utente_loggato");
		
		try {
			gas.aggiungiRuoloGiornalista(arg);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GestoreAccountServRemoteExceptionException e) {
			addActionError(getText(e.getMessage()));

	if (logger.isInfoEnabled()) {
	logger.info("aggiungiRuoloGiornalista() - L'utente "+g.getUsername()+" ha cercato di aggiungere il ruolo di giornalista all'account "+username+", ma si è verificato un problema.");
	}
			return "error";
		}
		
	if (logger.isInfoEnabled()) {
	logger.info("aggiungiRuoloGiornalista() - L'utente "+g.getUsername()+" ha aggiunto il ruolo di giornalista all'account "+username+".");
	}

		return "success";
		
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
