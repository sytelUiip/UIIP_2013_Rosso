package com.reply.editoriale.action;

import org.apache.log4j.Logger;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.CancellaNotizia;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.CancellaNotiziaResponse;


public class DeleteNotiziaAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(DeleteNotiziaAction.class);
	
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
			GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
			
			CancellaNotizia cn = new CancellaNotizia();
			cn.setId(idNotizia);
			cn.setNomeFunzionalita("Cancellazione notizia");
			cn.setPasswordLogin(a.getPassword());
			cn.setUserLogin(a.getUsername());
			
			CancellaNotiziaResponse cnr = null;
		
			try {
				cnr = gns.cancellaNotizia(cn);

			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+a.getUsername()+" ha eseguito correttamente la cancellazione di una notizia.");
			}
			} catch (AxisFault e) {
				if (logger.isInfoEnabled()) {
					logger.info("execute() - L'utente "+a.getUsername()+" non ha eseguito correttamente la cancellazione di una notizia.");
				}
				ActionContext.getContext().getSession().put("erroreNotizia", e.getMessage()); 
				return "error";
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			addActionMessage(getText("success_deleteNews"));
			return "success";
		}
	

	public int getIdNotizia() {
		return idNotizia;
	}

	public void setIdNotizia(int idNotizia) {
		this.idNotizia = idNotizia;
	}
	
	

}
