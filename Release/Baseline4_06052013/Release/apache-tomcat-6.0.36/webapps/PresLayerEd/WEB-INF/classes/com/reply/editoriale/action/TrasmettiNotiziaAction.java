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
import com.reply.gestoreloginservice.GestoreNotiziaSStub.Trasmetti;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.TrasmettiResponse;

public class TrasmettiNotiziaAction extends ActionSupport{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(TrasmettiNotiziaAction.class);
	
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
				
				Trasmetti t = new Trasmetti();
				t.setId(idNotizia);
				t.setUserLogin(a.getUsername());
				t.setNomeFunzionalita("Trasmetti notizia");
				t.setPasswordLogin(a.getPassword());
				
				TrasmettiResponse amr = null;
		    	
				try {
					amr = gns.trasmetti(t);
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+a.getUsername()+" ha eseguito correttamente la trasmissione della notizia selezionata");
			}
				} catch (AxisFault e) {
					
					if (logger.isInfoEnabled()) {
						logger.info("execute() - L'utente "+a.getUsername()+" non ha eseguito correttamente la trasmissione della notizia selezionata");
					}
					ActionContext.getContext().getSession().put("erroreNotizia", e.getMessage()); 
//					addActionMessage(getText(e.getMessage()));
					return "error";
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(amr.get_return() != null)
				{
					addActionMessage(getText("trasmetti_success"));
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
