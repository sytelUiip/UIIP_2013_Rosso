package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.Map;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.InsertNewNotizia;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.InsertNewNotiziaResponse;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.VisualizzaNotiziaId;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.VisualizzaNotiziaIdResponse;

public class ViewNotiziaAction extends ActionSupport{
	
	private int idNotizia;
	
	public String execute() throws AxisFault{
		Map session = ActionContext.getContext().getSession();
		GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
		GestoreNotiziaSStub gns = null;
		try {
			gns = new GestoreNotiziaSStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(idNotizia);
		VisualizzaNotiziaId inna = new VisualizzaNotiziaId();
		
//		int id = Integer.parseInt(idNotizia);
		inna.setNomeFunzionalita("Visualizza notizia");
		inna.setPasswordLogin(a.getPassword());
		inna.setUserLogin(a.getUsername());
		inna.setId(idNotizia);
		VisualizzaNotiziaIdResponse inir = null;
		
		try {
			inir = gns.visualizzaNotiziaId(inna);
		} catch (AxisFault e) {
			System.out.println("okkkkkkkkkkkkkkkklllllllllllllllll");
			System.out.println(e.getMessage());
			addActionError(getText(e.getMessage()));
			return "error";
		} catch (RemoteException e) {
			System.out.println("kkkkkkkkkkkkkkkaaaaaaaa");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Map request = (Map) ActionContext.getContext().get("request");
		request.put("notizia_caricata", inir.get_return());
		System.out.println("okkkkkkkkkkkkkkk");
		return "success";
		
	}

	public int getIdNotizia() {
		return idNotizia;
	}

	public void setIdNotizia(int idNotizia) {
		this.idNotizia = idNotizia;
	}

	
}
