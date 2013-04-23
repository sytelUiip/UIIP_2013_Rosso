package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.apache.commons.lang3.text.translate.AggregateTranslator;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.*;
import com.reply.gestoreloginservice.GestoreAccountServRemoteExceptionException;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreLoginStub.Authentication;
import com.reply.gestoreloginservice.GestoreLoginStub.AuthenticationResponse;

public class DettagliAccountAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	
	public String execute(){
		
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		OttieniAccount oa = new OttieniAccount();
	
		oa.setUsername(username);
	   
		OttieniAccountResponse oaRes = null;
	    	
			try {
				oaRes = gas.ottieniAccount(oa);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (GestoreAccountServRemoteExceptionException e) {
				addActionError(getText(e.getMessage()));
				return "error";
			}
			
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("utente_cercato", oaRes.get_return());
		
//			Map utente_cercato_sess = ActionContext.getContext().getSession();	
//			utente_cercato_sess.put("utente_cercato", oaRes.get_return());
			ArrayList<String> gruppi = new ArrayList<String>();
			
			for(int i=0; i< oaRes.get_return().getGruppiLavoro().length; i++)
			{
				if(oaRes.get_return().getGruppiLavoro()[i] != null)
				{
					gruppi.add(oaRes.get_return().getGruppiLavoro()[i].getNome());
					System.out.println(oaRes.get_return().getGruppiLavoro()[i].getNome());
				}
			}
			
			request.put("ruoli_utente", gruppi);
			
//			utente_cercato_sess.put("ruoli_utente", gruppi);
			return "success";
		
//		if(oaRes.get_return() != null)
//		{
//			Map utente_cercato_sess = ActionContext.getContext().getSession();	
//			utente_cercato_sess.put("utente_cercato", oaRes.get_return());
//			ArrayList<String> gruppi = new ArrayList<String>();
//			
//			for(int i=0; i< oaRes.get_return().getGruppiLavoro().length; i++)
//			{
//				if(oaRes.get_return().getGruppiLavoro()[i] != null)
//				{
//					gruppi.add(oaRes.get_return().getGruppiLavoro()[i].getNome());
//					System.out.println(oaRes.get_return().getGruppiLavoro()[i].getNome());
//				}
//			}
//			
//			utente_cercato_sess.put("ruoli_utente", gruppi);
//			return "success";
//		}
//		else
//		{
//			addActionError(getText("error.ottieniAccount"));
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
