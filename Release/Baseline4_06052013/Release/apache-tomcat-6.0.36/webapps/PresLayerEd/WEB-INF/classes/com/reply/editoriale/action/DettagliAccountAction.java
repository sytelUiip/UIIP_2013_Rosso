package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.*;
public class DettagliAccountAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	
	public String execute() throws AxisFault{
		
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
			} catch (AxisFault e) {
				ActionContext.getContext().getSession().put("erroreAccount", e.getMessage());
				return "error";
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("utente_cercato", oaRes.get_return());
		
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
			
			return "success";
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
