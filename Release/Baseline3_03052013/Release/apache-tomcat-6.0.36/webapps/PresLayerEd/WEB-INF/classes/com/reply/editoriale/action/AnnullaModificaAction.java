package com.reply.editoriale.action;

import org.apache.log4j.Logger;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.axis2.AxisFault;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.Annulla;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.AnnullaResponse;


public class AnnullaModificaAction extends ActionSupport {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(AnnullaModificaAction.class);
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int idNotizia;
	
	public String execute() throws AxisFault{
		
		GestoreNotiziaSStub gns = null;
		try {
			gns = new GestoreNotiziaSStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Map session = ActionContext.getContext().getSession();
		GestoreLoginStub.Account g= (GestoreLoginStub.Account)session.get("utente_loggato");
		Annulla am = new Annulla();
		
		am.setId(idNotizia);
		am.setNomeFunzionalita("Annulla");
		am.setPasswordLogin(g.getPassword());
		am.setUserLogin(g.getUsername());
		
		AnnullaResponse amr = null;
    	
		try {
			amr = gns.annulla(am);

			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+g.getUsername()+" ha annullato la modifica della notizia selezionata.");
			}
		} catch (AxisFault e) {
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+g.getUsername()+" ha tentato di annullare la modifica della notizia selezionata, ma l'operazione non è andata a buon fine.");
			}
			ActionContext.getContext().getSession().put("erroreNotizia", e.getMessage()); 
			addActionError(getText(e.getMessage()));
			return "error";
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(amr.get_return() == true)
		{
			addActionMessage(getText("annullaSuccess"));
		}
		return "success";
	}

	public int getIdNotizia() {
		return idNotizia;
	}

	public void setIdNotizia(int idNotizia) {
		this.idNotizia = idNotizia;
	}

}
