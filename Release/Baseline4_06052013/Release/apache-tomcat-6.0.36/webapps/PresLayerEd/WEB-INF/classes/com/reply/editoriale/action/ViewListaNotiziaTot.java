package com.reply.editoriale.action;


import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.RicercaNotizieService;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.RicercaNotizieServiceResponse;


public class ViewListaNotiziaTot extends ActionSupport {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public String execute(){
			
			if(ActionContext.getContext().getSession().get("filterParametroAtt") != null && ActionContext.getContext().getSession().get("testoRicercaAttuale") != null)
			{
				ActionContext.getContext().getSession().remove("filterParametroAtt");
				ActionContext.getContext().getSession().remove("testoRicercaAttuale");
			}
			
			 GestoreNotiziaSStub gnss = null;
			 
			 Map session = ActionContext.getContext().getSession();
			 GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
			
					
			try {
				gnss = new GestoreNotiziaSStub();
			} catch (AxisFault e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
			RicercaNotizieService vna = new RicercaNotizieService();
				
			vna.setNomeFunzionalita("Lista notizie");
			vna.setPasswordLogin(a.getPassword());
			vna.setUserLogin(a.getUsername());
			vna.setFilterParametro("all");
			vna.setParametro("ok");
			vna.setMin(1);
			vna.setMax(5);
					
			 
				RicercaNotizieServiceResponse vnares = null;
				try {
					vnares = gnss.ricercaNotizieService(vna);
	
				} catch (AxisFault e) {
					addActionError(getText(e.getMessage()));
					return "error";
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				ArrayList<com.reply.gestoreloginservice.GestoreNotiziaSStub.Notizia> notizieSlider = new ArrayList<com.reply.gestoreloginservice.GestoreNotiziaSStub.Notizia>();
				
				int length = 0;
				if(vnares.get_return() != null)
				{
					length = vnares.get_return().length;
					int count = 0;
					if (length < 5 ){
						count = length;
					}else{
						count = 5;
					}
					for(int i=0; i<count; i++){
							notizieSlider.add(vnares.get_return()[i]);
					}
				}
				
				Map notizie_slider = ActionContext.getContext().getSession();	
				notizie_slider.put("notizie_slider", notizieSlider);
				notizie_slider.put("num_slider", length);
				
				
			return "success";
			
		}

	}
	

