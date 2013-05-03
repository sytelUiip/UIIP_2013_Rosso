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


public class DeleteAccountAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger
			.getLogger(DeleteAccountAction.class);
	
	private String username;
	Map session = ActionContext.getContext().getSession();
	GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
	public String execute() throws AxisFault{
		
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		CancellaAccount ca = new CancellaAccount();
	
		ca.setUsername(username);
		ca.setNomeFunzionalita("Cancella account");
		ca.setPasswordLogin(a.getPassword());
		ca.setUserLogin(a.getUsername());
	   
		CancellaAccountResponse caRes = null;
	    	
			try {
				caRes = gas.cancellaAccount(ca);
				if (logger.isInfoEnabled()) {
					logger.info("execute() - L'utente "+username+" è stato rimosso dal sistema");
				}
				addActionMessage(getText("deleteAccountSuccess"));
				
			} catch (AxisFault e) {
				
				if(e.getMessage().equals("COD_11"))
				{
					ActionContext.getContext().getSession().put("cancAccountOk", "deleteAccountSuccess"); 
					return "logout";
				}
				else
				{
					if (logger.isInfoEnabled()) {
						logger.info("execute() - L'eliminazione dell'utente "+username+" non è riuscita");
					}
					ActionContext.getContext().getSession().put("erroreAccount", e.getMessage());
					
					return "error";
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
