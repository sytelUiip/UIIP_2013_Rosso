package com.reply.editoriale.action;

import org.apache.log4j.Logger;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.RegistraNotizia;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.RegistraNotiziaResponse;

public class RegistraModificaNotiziaAction extends ActionSupport {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(RegistraModificaNotiziaAction.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titolo;
	private String sotto_titolo;
	private String testo;
	private int id_old;

	public String execute() throws AxisFault{
		
		GestoreNotiziaSStub gns = null;
		try {
			gns = new GestoreNotiziaSStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Map session = ActionContext.getContext().getSession();
		GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
		
		RegistraNotizia rn = new RegistraNotizia();
		
		rn.setUserLogin(a.getUsername());
		rn.setNomeFunzionalita("Registra notizia");
		rn.setPasswordLogin(a.getPassword());
		rn.setId(id_old);
		rn.setTitolo(titolo);
		rn.setSottotitolo(sotto_titolo);
		rn.setTesto(testo);
		
		System.out.println(id_old);
		
		RegistraNotiziaResponse rnr = null;
		
		try {
			rnr = gns.registraNotizia(rn);

			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+a.getUsername()+" ha modificato la notizia selezionata");
			}
		} catch (AxisFault e) {
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+a.getUsername()+" non è riuscito a modificare la notizia selezionata");
			}
			
			ActionContext.getContext().getSession().put("erroreNotizia", e.getMessage()); 
			addActionError(getText(e.getMessage()));
			return "error";
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		addActionMessage(getText("success_updateNews"));
		return "success";
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getSotto_titolo() {
		return sotto_titolo;
	}

	public void setSotto_titolo(String sotto_titolo) {
		this.sotto_titolo = sotto_titolo;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public int getId_old() {
		return id_old;
	}

	public void setId_old(int id_old) {
		this.id_old = id_old;
	}
	
	
}
