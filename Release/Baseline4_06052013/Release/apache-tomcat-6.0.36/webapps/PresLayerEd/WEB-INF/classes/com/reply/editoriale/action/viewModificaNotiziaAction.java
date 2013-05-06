package com.reply.editoriale.action;

import org.apache.log4j.Logger;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.ModificaNotizia;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.ModificaNotiziaResponse;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.VisualizzaNotiziaId;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.VisualizzaNotiziaIdResponse;

public class viewModificaNotiziaAction extends ActionSupport {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(viewModificaNotiziaAction.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idNotizia;
	
	public String execute(){
		
		GestoreNotiziaSStub gns = null;
		try {
			gns = new GestoreNotiziaSStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ModificaNotizia mn = new ModificaNotizia();
		
		Map session = ActionContext.getContext().getSession();
		GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
		
		System.out.println(idNotizia);
		System.out.println(a.getUsername());
		
		mn.setId(idNotizia);
		mn.setUserLogin(a.getUsername());
		mn.setPasswordLogin(a.getPassword());
		mn.setNomeFunzionalita("Creazione notizia");
		
		System.out.println(a.getPassword());
		System.out.println(a.getUsername());
		
		ModificaNotiziaResponse mnr = null;
    	
		try {
			mnr = gns.modificaNotizia(mn);
				
			if(mnr.get_return() == true)
			{
				VisualizzaNotiziaId inna = new VisualizzaNotiziaId();
		
				inna.setId(idNotizia);
				inna.setNomeFunzionalita("Creazione notizia");
				inna.setPasswordLogin(a.getPassword());
				inna.setUserLogin(a.getUsername());
				VisualizzaNotiziaIdResponse inir = null;
				
				try {
					inir = gns.visualizzaNotiziaId(inna);
				} catch (AxisFault e) {
					ActionContext.getContext().getSession().put("erroreNotizia", e.getMessage()); 
					return "error";
				} catch (RemoteException e) {
					e.printStackTrace();
				}
				
				Map notizia_modifica = ActionContext.getContext().getSession();	
				notizia_modifica.put("notizia_update", inir.get_return());
				
				if (logger.isInfoEnabled()) {
					logger.info("execute() - L'utente "+a.getUsername()+" ha bloccato la notizia selezionata.");
				}
				
			}else
			{
				if (logger.isInfoEnabled()) {
					logger.info("execute() - L'utente "+a.getUsername()+" ha tentato di modificare una notizia non editabile o bloccata da un altro utente.");
				}
				ActionContext.getContext().getSession().put("erroreNotizia", "error.notauthtomod"); 
				return "error";
			}
		} catch (AxisFault e) {
			
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+a.getUsername()+" ha tentato di modificare una notizia ma l'operazione non è andata a buon fine.");
			}
			ActionContext.getContext().getSession().put("erroreNotizia", e.getMessage()); 
			return "error";		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
