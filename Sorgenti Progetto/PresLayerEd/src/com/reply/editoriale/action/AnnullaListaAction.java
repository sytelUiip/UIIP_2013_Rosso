package com.reply.editoriale.action;

import org.apache.log4j.Logger;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.AnnullaLista;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.AnnullaListaResponse;


public class AnnullaListaAction extends ActionSupport{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(AnnullaListaAction.class);
	
public String execute() throws AxisFault{
		
		GestoreNotiziaSStub gns = null;
		try {
			gns = new GestoreNotiziaSStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		AnnullaLista al = new AnnullaLista();
		Map session = ActionContext.getContext().getSession();
		GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
		al.setUserLogin(a.getUsername());
		al.setPasswordLogin(a.getPassword());
		al.setNomeFunzionalita("Annulla");
		
		AnnullaListaResponse alr = null;
		
		try {
			alr = gns.annullaLista(al);

			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+a.getUsername()+" ha annullato tutte le modifiche sulle notizie precedentemente prese in carico.");
			}
		} catch (AxisFault e) {
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+a.getUsername()+" non è riuscito ad annullare tutte le modifiche sulle notizie precedentemente prese in carico.");
			}
			ActionContext.getContext().getSession().put("erroreNotizia", e.getMessage()); 
//			addActionMessage(getText(e.getMessage()));
			return "error";	
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(alr.get_return() == true)
		{
			addActionMessage(getText("annullaLista_success"));
			return "success";
		}else
			return "error";

	}
}
