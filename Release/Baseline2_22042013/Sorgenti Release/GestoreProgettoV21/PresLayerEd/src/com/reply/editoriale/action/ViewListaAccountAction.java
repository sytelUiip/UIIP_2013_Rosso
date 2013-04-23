package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.editoriale.entity.Account;
import com.reply.gestoreloginservice.GestoreAccountServRemoteExceptionException;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.VisualizzaAccountRegistrati;
import com.reply.gestoreloginservice.GestoreAccountServStub.VisualizzaAccountRegistratiResponse;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.InserisciNuovoAccount;
import com.reply.gestoreloginservice.GestoreAccountServStub.InserisciNuovoAccountResponse;
import com.reply.gestoreloginservice.GestoreLoginStub.Authentication;
import com.reply.gestoreloginservice.GestoreLoginStub.AuthenticationResponse;

public class ViewListaAccountAction extends ActionSupport {
	
	private static final Logger logger = Logger
			.getLogger(ViewListaAccountAction.class);
	
	public String execute(){
		
		Map session= ActionContext.getContext().getSession();
		GestoreLoginStub.Account g =(GestoreLoginStub.Account)session.get("utente_loggato");
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		VisualizzaAccountRegistrati var = new VisualizzaAccountRegistrati();
	
	   
		VisualizzaAccountRegistratiResponse varRes = null;
	    	
			try {
				varRes = gas.visualizzaAccountRegistrati(var);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (GestoreAccountServRemoteExceptionException e) {
				addActionError(getText(e.getMessage()));
				return "error";
			}
			
		ArrayList<com.reply.gestoreloginservice.GestoreAccountServStub.Account> utenti = new ArrayList<com.reply.gestoreloginservice.GestoreAccountServStub.Account>();
		
		for(int i=0; i< varRes.get_return().length; i++)
		{
			utenti.add(varRes.get_return()[i]);
		}
		
		if(utenti.size()==0)
		{
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+g.getUsername()+" ha visualizzato la lista degli utenti presenti nel sistema, ma la lista è vuota");
			}
			addActionMessage("Non è registrato nessun utente nel Sistema!");
			return "success";
		}
		else
		{
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("lista_utenti", utenti);
			
//			Map lista_utente_session = ActionContext.getContext().getSession();	
//			lista_utente_session.put("lista_utenti", utenti);
			
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+g.getUsername()+" ha visualizzato la lista degli account");
			}
			return "success";
		}
		
		
		 
//		Map utenti_request = ActionContext.getContext().getParameters();	
//		utenti_request.put("lista_utenti", utenti);
		
	}

}
