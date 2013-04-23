package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreAccountServRemoteExceptionException;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.OttieniAccount;
import com.reply.gestoreloginservice.GestoreAccountServStub.OttieniAccountResponse;

public class ViewUpdateAccountAction extends ActionSupport {
	
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
			
		
		boolean isAmministratore = false;
		boolean isGiornalista = false;
		
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("utente_modificare", oaRes.get_return());
//		Map utente_cercato_sess = ActionContext.getContext().getSession();	
//		utente_cercato_sess.put("utente_modificare", oaRes.get_return());
		
		ArrayList<String> gruppi = new ArrayList<String>();
		
		for(int i=0; i< oaRes.get_return().getGruppiLavoro().length; i++)
		{
			if(oaRes.get_return().getGruppiLavoro()[i] != null)
			{
				gruppi.add(oaRes.get_return().getGruppiLavoro()[i].getNome());
				if(oaRes.get_return().getGruppiLavoro()[i].getNome().equals("amministratore"))
				{
					isAmministratore = true;
					System.out.println("ok");
				}
				if(oaRes.get_return().getGruppiLavoro()[i].getNome().equals("giornalista"))
				{
					isGiornalista = true;
					System.out.println("ko");
				}
			}
			System.out.println("++++++++++++++"+oaRes.get_return().getGruppiLavoro()[i].getNome()+"+++++++++++++++++");
		}
		
		request.put("ruoli_utente_mod", gruppi);
		
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
		
		System.out.println(privilegi);
		
		Map request1 = (Map) ActionContext.getContext().get("request");
		request1.put("privilegi", privilegi);
		
		return "success";
		
//		if(oaRes.get_return() != null)
//		{
//			Map utente_cercato_sess = ActionContext.getContext().getSession();	
//			utente_cercato_sess.put("utente_modificare", oaRes.get_return());
//			ArrayList<String> gruppi = new ArrayList<String>();
//			
//			for(int i=0; i< oaRes.get_return().getGruppiLavoro().length; i++)
//			{
//				if(oaRes.get_return().getGruppiLavoro()[i] != null)
//				{
//					gruppi.add(oaRes.get_return().getGruppiLavoro()[i].getNome());
//					if(oaRes.get_return().getGruppiLavoro()[i].getNome().equals("amministratore"))
//					{
//						isAmministratore = true;
//						System.out.println("ok");
//					}
//					if(oaRes.get_return().getGruppiLavoro()[i].getNome().equals("giornalista"))
//					{
//						isGiornalista = true;
//						System.out.println("ko");
//					}
//				}
//				System.out.println("++++++++++++++"+oaRes.get_return().getGruppiLavoro()[i].getNome()+"+++++++++++++++++");
//			}
//			
//			utente_cercato_sess.put("ruoli_utente_mod", gruppi);
//			
//			String privilegi = null;
//			
//			if(isAmministratore == true && isGiornalista == true)
//			{
//				privilegi = "AmGi";
//			}
//			else if(isAmministratore == true && isGiornalista == false)
//			{
//				privilegi = "Am";
//			}
//			else if(isAmministratore == false && isGiornalista == true)
//			{
//				privilegi = "Gi";
//			}
//			
//			System.out.println(privilegi);
//			
//			Map request = (Map) ActionContext.getContext().get("request");
//			request.put("privilegi", privilegi);
//			
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
