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

public class DeleteAccountAction extends ActionSupport {
	
	private static final Logger logger = Logger
			.getLogger(DeleteAccountAction.class);
	
	private String username;
	
	public String execute(){
		
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		CancellaAccount ca = new CancellaAccount();
	
		ca.setUsername(username);
	   
		CancellaAccountResponse caRes = null;
	    	
			try {
				caRes = gas.cancellaAccount(ca);
				if (logger.isInfoEnabled()) {
					logger.info("execute() - L'utente "+username+" è stato rimosso dal sistema");
				}
				addActionMessage("L'utente selezionato è stato cancellato correttamente. Prova ancora.");
				
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (GestoreAccountServRemoteExceptionException e) {
				if (logger.isInfoEnabled()) {
					logger.info("execute() - L'eliminazione dell'utente "+username+" non è riuscita");
				}
				addActionError(getText(e.getMessage()));
				return "error";
			}
			
			return "success";
		
//		if(caRes.get_return() != null)
//		{
//			addActionMessage("L'utente selezionato è stato cancellato correttamente. Prova ancora.");
//			return "success";
//		}
//		else
//		{
//			addActionError(getText("error.deleteAccount"));
//			return "error";
//		}
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
