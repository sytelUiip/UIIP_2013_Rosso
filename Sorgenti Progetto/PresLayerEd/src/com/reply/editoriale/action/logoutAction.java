package com.reply.editoriale.action;

import javax.servlet.http.HttpSession;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import com.reply.gestoreloginservice.GestoreLoginStub;

import java.util.*;

public class logoutAction extends ActionSupport {
	
	private static final Logger logger = Logger.getLogger(logoutAction.class);
  
	private static final long serialVersionUID = 1L;

	public String execute() throws AxisFault { 
		Map session = ActionContext.getContext().getSession();
		GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
		if (logger.isInfoEnabled()) {
			logger.info("execute() - L'utente "+a.getUsername()+" ha effettuato il logout dal sistema");
		}
			session.remove("utente_loggato"); 
			session.remove("funzionalita");
			
			if(ActionContext.getContext().getSession().get("cancAccountOk") != null)
			{
				addActionMessage(getText((String) ActionContext.getContext().getSession().get("cancAccountOk")));
				ActionContext.getContext().getSession().remove("cancAccountOk");
			}
			return "success";
	}
}