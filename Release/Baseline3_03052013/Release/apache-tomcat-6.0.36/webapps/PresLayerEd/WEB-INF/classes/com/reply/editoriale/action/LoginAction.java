package com.reply.editoriale.action;

import org.apache.log4j.Logger;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.axis2.AxisFault;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreLoginStub.Authentication;
import com.reply.gestoreloginservice.GestoreLoginStub.AuthenticationResponse;


public class LoginAction extends ActionSupport {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(LoginAction.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
 
    public String execute() throws AxisFault{
    	
        GestoreLoginStub gls = null;
		try {
			gls = new GestoreLoginStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	Authentication ath = new Authentication();
    	ath.setUsername(username);
    	ath.setPassword(password);
    	
    	AuthenticationResponse athRes = null;
			try {
				athRes = gls.authentication(ath);
			} catch (AxisFault e){
				addActionError(getText(e.getMessage()));
				if (logger.isInfoEnabled()) {
					logger.info("execute() - L'utente "+username+" non è riuscito ad eseguire il login correttamente.");
				}
				return "error";
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		Map utente_session = ActionContext.getContext().getSession();	
		utente_session.put("utente_loggato", athRes.get_return());
		
		
		boolean isAmministratore = false;
		boolean isGiornalista = false;
		
		for(int i=0; i< athRes.get_return().getGruppiLavoro().length; i++)
		{
			if(athRes.get_return().getGruppiLavoro()[i] != null)
			{
				if(athRes.get_return().getGruppiLavoro()[i].getNome().equals("amministratore"))
				{
					isAmministratore = true;
				}
				if(athRes.get_return().getGruppiLavoro()[i].getNome().equals("giornalista"))
				{
					isGiornalista = true;
				}
			}
		}
		
		String privilegi = null;
		
		if(isAmministratore == true && isGiornalista == true)
		{
			privilegi = "AmGi";
		}
		else if(isAmministratore == true && isGiornalista == false)
		{
			privilegi = "Am";
		}
		else if(isAmministratore == false && isGiornalista == true)
		{
			privilegi = "Gi";
		}
			
		ArrayList<String> funzioniUtente = new ArrayList<String>();
		  
		  for(int i=0; i< athRes.get_return().getGruppiLavoro().length; i++)
		  {
			  if(athRes.get_return().getGruppiLavoro()[i] != null)
			  {
				  for(int j=0; j< athRes.get_return().getGruppiLavoro()[i].getFunzioni().length; j++)
				  {
						  if(athRes.get_return().getGruppiLavoro()[i].getFunzioni()[j] != null)
						  {
							  funzioniUtente.add(athRes.get_return().getGruppiLavoro()[i].getFunzioni()[j].getNome());
						  }  
				  }
			  }
		  }
		  
		 utente_session.put("funzionalita", funzioniUtente);
		 utente_session.put("privilegi", privilegi);

		 if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+username+" ha eseguito il login con successo.");
			}
			  
         return "success";
		
		
//		if (athRes.get_return() != null) {
//		  Map utente_session = ActionContext.getContext().getSession();	
//		  utente_session.put("utente_loggato", athRes.get_return());
//		  ArrayList<String> funzioniUtente = new ArrayList<String>();
//		  
//		  for(int i=0; i< athRes.get_return().getGruppiLavoro().length; i++)
//		  {
//			  if(athRes.get_return().getGruppiLavoro()[i] != null)
//			  {
//				  for(int j=0; j< athRes.get_return().getGruppiLavoro()[i].getFunzioni().length; j++)
//				  {
//						  if(athRes.get_return().getGruppiLavoro()[i].getFunzioni()[j] != null)
//						  {
//							  funzioniUtente.add(athRes.get_return().getGruppiLavoro()[i].getFunzioni()[j].getNome());
//						  }  
//				  }
//			  }
//		  }
//		  
//		  utente_session.put("funzionalita", funzioniUtente);
//
//			if (logger.isInfoEnabled()) {
//				logger.info("execute() - L'utente "+username+" ha eseguito il login con successo.");
//			}
//			  
//          return "success";
//		} else {
//    	  
//      	  addActionError(getText("error.login"));
//
//			if (logger.isInfoEnabled()) {
//				logger.info("execute() - L'utente "+username+" non è riuscito ad eseguire il login correttamente.");
//			}
//
//          return "error";
//      }
        
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

}
