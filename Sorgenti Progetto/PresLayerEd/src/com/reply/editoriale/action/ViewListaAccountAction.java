package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.editoriale.entity.Account;
import com.reply.gestoreloginservice.GestoreAccountServStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.NumeroAccountRegistrati;
import com.reply.gestoreloginservice.GestoreAccountServStub.NumeroAccountRegistratiResponse;
import com.reply.gestoreloginservice.GestoreAccountServStub.VisualizzaAccountRegistrati;
import com.reply.gestoreloginservice.GestoreAccountServStub.VisualizzaAccountRegistratiResponse;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreAccountServStub.InserisciNuovoAccount;
import com.reply.gestoreloginservice.GestoreAccountServStub.InserisciNuovoAccountResponse;
import com.reply.gestoreloginservice.GestoreLoginStub.Authentication;
import com.reply.gestoreloginservice.GestoreLoginStub.AuthenticationResponse;

public class ViewListaAccountAction extends ActionSupport {
	
	private static final Logger logger = Logger
			.getLogger(ViewListaAccountAction.class);
	private int pag;
	
	public String execute() throws AxisFault{
		
		int numNotiziePagina = 5;
		int min = 1;
		int max = 1;
		int numPagine = 0;
		
		Map session= ActionContext.getContext().getSession();
		GestoreLoginStub.Account g =(GestoreLoginStub.Account)session.get("utente_loggato");
		
		GestoreAccountServStub gas = null;
		try {
			gas = new GestoreAccountServStub();

			NumeroAccountRegistrati nar = new NumeroAccountRegistrati();
			NumeroAccountRegistratiResponse narres = null;

			try {
				narres = gas.numeroAccountRegistrati(nar);
			}catch (AxisFault e) {
				addActionError(getText(e.getMessage()));
				return "error";
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			int numeroAccount = narres.get_return();
			System.out.println("NUMERO account DB: " + numeroAccount);
			numPagine = (((numeroAccount)+(numNotiziePagina-1))/numNotiziePagina);
			if (pag < 1 || pag > numPagine) {
				pag = 1;
			}
			
			min = 1 + (pag - 1) * numNotiziePagina;
			max = numNotiziePagina * pag;

		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Map request = (Map) ActionContext.getContext().get("request");
		ArrayList<Integer> listaPagine = new ArrayList<Integer>();
		for (int i = 0; i < numPagine; i++) {

			listaPagine.add(i + 1);
		}

		request.put("pagine", listaPagine);
		request.put("pagina_attuale", getPag());
		request.put("pagina_precedente", getPag() - 1);
		request.put("pagina_successiva", getPag() + 1);
		request.put("nPagine", numPagine);
		System.out.println("numPagine" + numPagine);
		
		try {
			gas = new GestoreAccountServStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		VisualizzaAccountRegistrati var = new VisualizzaAccountRegistrati();
		var.setMin(min);
		var.setMax(max);
		var.setNomeFunzionalita("Lista account");
	    var.setPasswordLogin(g.getPassword());
	    var.setUserLogin(g.getUsername());
	   
	   
		VisualizzaAccountRegistratiResponse varRes = null;
	    	
			try {
				varRes = gas.visualizzaAccountRegistrati(var);
			} catch (AxisFault e) {
				addActionError(getText(e.getMessage()));
				return "error";
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		ArrayList<com.reply.gestoreloginservice.GestoreAccountServStub.Account> utenti = new ArrayList<com.reply.gestoreloginservice.GestoreAccountServStub.Account>();
		
		for(int i=0; i< varRes.get_return().length; i++)
		{
			utenti.add(varRes.get_return()[i]);
		}
		
		if(ActionContext.getContext().getSession().get("erroreAccount") != null)
		{
			addActionError(getText((String) ActionContext.getContext().getSession().get("erroreAccount")));
			ActionContext.getContext().getSession().remove("erroreAccount");
			
		}
		
		if(utenti.size()==0)
		{
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+g.getUsername()+" ha visualizzato la lista degli utenti presenti nel sistema, ma la lista è vuota");
			}
			addActionMessage("Non è registrato nessun utente nel Sistema!");
			return "success";
		}
		else
		{
			request.put("lista_utenti", utenti);
			
			if (logger.isInfoEnabled()) {
				logger.info("execute() - L'utente "+g.getUsername()+" ha visualizzato la lista degli account");
			}
			return "success";
		}
		
	}
	

	public int getPag() {
		return pag;
	}

	public void setPag(int pag) {
		this.pag = pag;
	}

}
