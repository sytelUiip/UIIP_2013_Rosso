package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.InsertNewNotizia;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.InsertNewNotiziaResponse;

public class InsertNewNotiziaAction extends ActionSupport {
	
	private static final Logger logger = Logger
			.getLogger(InsertNewNotiziaAction.class);
	
	private String titolo;
	private String sotto_titolo;
	private String testo;
	
	
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
		
		InsertNewNotizia inna = new InsertNewNotizia();
		inna.setTitolo(titolo);
		inna.setSottoTitolo(sotto_titolo);
		inna.setAutore(a.getUsername());
		inna.setTesto(testo);
		inna.setNomeFunzionalita("Creazione notizia");
		inna.setPasswordLogin(a.getPassword());
		inna.setUserLogin(a.getUsername());
		
		InsertNewNotiziaResponse innr = null;
		try {
			innr = gns.insertNewNotizia(inna);

			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+a.getUsername()+" ha inserito una nuova notizia nel sistema.");
			}
		} catch (AxisFault e) {
			addActionError(getText(e.getMessage()));
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+a.getUsername()+" non ha inserito correttamente una notizia nel sistema.");
			}
			return "error";
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Map request = (Map) ActionContext.getContext().get("request");
		request.put("notizia_caricata", innr.get_return());
		
		addActionMessage(getText("success_insertNews"));
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
	
}
