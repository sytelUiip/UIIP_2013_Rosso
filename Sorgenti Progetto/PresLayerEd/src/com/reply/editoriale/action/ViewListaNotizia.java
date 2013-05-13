package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.editoriale.entity.Notizia;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.NumeroNotizieRicerca;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.NumeroNotizieRicercaResponse;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.RicercaNotizieService;
import com.reply.gestoreloginservice.GestoreNotiziaSStub.RicercaNotizieServiceResponse;

public class ViewListaNotizia extends ActionSupport {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(ViewListaNotizia.class);
		
		private String filtroParametro;
		private String testo_ricerca;
		private int pag;
			
		Map session = ActionContext.getContext().getSession();
		GestoreLoginStub.Account a= (GestoreLoginStub.Account)session.get("utente_loggato");
		
		public int getPag() {
			return pag;
		}

		public void setPag(int pag) {
			this.pag = pag;
		}
		
		public String getFiltroParametro() {
			return filtroParametro;
		}

		public void setFiltroParametro(String filtroParametro) {
			this.filtroParametro = filtroParametro;
		}

		public String getTesto_ricerca() {
			return testo_ricerca;
		}

		public void setTesto_ricerca(String testo_ricerca) {
			this.testo_ricerca = testo_ricerca;
		}

		public String execute(){
			 int numNotiziePagina = 5;
			 int min=1;
			 int max=1;
			 int numPagine = 0;
			 
			 GestoreNotiziaSStub gnss = null;
			 int numeroNotizie = 0;

				try {
					gnss = new GestoreNotiziaSStub();
					NumeroNotizieRicerca nnr = new NumeroNotizieRicerca();
					
					if(filtroParametro == null && testo_ricerca == null)
					{
						if(ActionContext.getContext().getSession().get("filterParametroAtt") == null && ActionContext.getContext().getSession().get("testoRicercaAttuale") == null)
						{
							nnr.setFilterParametro("all");
							nnr.setParametro("ok");
						}
						else
						{
							nnr.setFilterParametro((String) ActionContext.getContext().getSession().get("filterParametroAtt"));
							nnr.setParametro((String) ActionContext.getContext().getSession().get("testoRicercaAttuale"));
						}
					}
					else if(filtroParametro.equals("titolo"))
					{
						ActionContext.getContext().getSession().put("filterParametroAtt", "titolo");
						ActionContext.getContext().getSession().put("testoRicercaAttuale", testo_ricerca);
						nnr.setFilterParametro("titolo");
						nnr.setParametro(testo_ricerca);
						
					}
					else if(filtroParametro.equals("stato"))
					{
						ActionContext.getContext().getSession().put("filterParametroAtt", "stato");
						ActionContext.getContext().getSession().put("testoRicercaAttuale", testo_ricerca);
						nnr.setFilterParametro("stato");
						nnr.setParametro(testo_ricerca);
						
					}
					else if(filtroParametro.equals("autore"))
					{
						ActionContext.getContext().getSession().put("filterParametroAtt", "autore");
						ActionContext.getContext().getSession().put("testoRicercaAttuale", testo_ricerca);
						nnr.setFilterParametro("autore");
						nnr.setParametro(testo_ricerca);
						
					}
					else if(filtroParametro.equals("all"))
					{
						ActionContext.getContext().getSession().remove("filterParametroAtt");
						ActionContext.getContext().getSession().remove("testoRicercaAttuale");
						nnr.setFilterParametro("all");
						nnr.setParametro("ok");
						
					}
					else
					{
						if(ActionContext.getContext().getSession().get("filterParametroAtt") == null && ActionContext.getContext().getSession().get("testoRicercaAttuale") == null)
						{
							nnr.setFilterParametro("all");
							nnr.setParametro("ok");
						}
						else
						{
							nnr.setFilterParametro((String) ActionContext.getContext().getSession().get("filterParametroAtt"));
							nnr.setParametro((String) ActionContext.getContext().getSession().get("testoRicercaAttuale"));
						}
						
					}
					
					NumeroNotizieRicercaResponse  nnrr= null;
					
					try {
						nnrr = gnss.numeroNotizieRicerca(nnr);
					} catch (AxisFault e) {
						addActionError(getText(e.getMessage()));
						return "error";
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
					 numeroNotizie = nnrr.get_return();
					
					 numPagine = ((numeroNotizie)+(numNotiziePagina-1))/numNotiziePagina;
					 if(pag<1 || pag>numPagine){
						 pag=1;
					 }
					  min = 1+(pag-1)*numNotiziePagina;
					  max = numNotiziePagina*pag;
					 
					 				
				} catch (AxisFault e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Map request = (Map) ActionContext.getContext().get("request");
				ArrayList<Integer> listaPagine = new ArrayList<Integer>();
				for(int i=0; i<numPagine; i++){
					
					listaPagine.add(i+1);
				}
				
				request.put("nNotizie", numeroNotizie+"");
				request.put("pagine", listaPagine);
				request.put("pagina_attuale", getPag());
				request.put("pagina_precedente", getPag()-1);
				request.put("pagina_successiva", getPag()+1);
				request.put("nPagine", numPagine );
				System.out.println("numPagine"+numPagine);
			
			
			try{
				
				gnss = new GestoreNotiziaSStub();
			
			
			RicercaNotizieService vna = new RicercaNotizieService();
			
			if(filtroParametro == null && testo_ricerca == null)
			{
				if(ActionContext.getContext().getSession().get("filterParametroAtt") == null && ActionContext.getContext().getSession().get("testoRicercaAttuale") == null)
				{
					vna.setNomeFunzionalita("Lista notizie");
					vna.setPasswordLogin(a.getPassword());
					vna.setUserLogin(a.getUsername());
					vna.setFilterParametro("all");
					vna.setParametro("ok");
					vna.setMin(min);
					vna.setMax(max);
				}
				else
				{
					vna.setNomeFunzionalita("Lista notizie");
					vna.setPasswordLogin(a.getPassword());
					vna.setUserLogin(a.getUsername());
					vna.setFilterParametro((String) ActionContext.getContext().getSession().get("filterParametroAtt"));
					vna.setParametro((String) ActionContext.getContext().getSession().get("testoRicercaAttuale"));
					vna.setMin(min);
					vna.setMax(max);
				}
			}
			else if(filtroParametro.equals("autore"))
			{
				vna.setNomeFunzionalita("Lista notizie");
				vna.setPasswordLogin(a.getPassword());
				vna.setUserLogin(a.getUsername());
				vna.setFilterParametro("autore");
				vna.setParametro(testo_ricerca);
				vna.setMin(min);
				vna.setMax(max);
			}else if(filtroParametro.equals("stato"))
			{
				vna.setNomeFunzionalita("Lista notizie");
				vna.setPasswordLogin(a.getPassword());
				vna.setUserLogin(a.getUsername());
				vna.setFilterParametro("stato");
				vna.setParametro(testo_ricerca);
				vna.setMin(min);
				vna.setMax(max);
				
			}else if(filtroParametro.equals("titolo"))
			{
				vna.setNomeFunzionalita("Lista notizie");
				vna.setPasswordLogin(a.getPassword());
				vna.setUserLogin(a.getUsername());
				vna.setFilterParametro("titolo");
				vna.setParametro(testo_ricerca);
				vna.setMin(min);
				vna.setMax(max);
			}else if(filtroParametro.equals("all"))
			{
				vna.setNomeFunzionalita("Lista notizie");
				vna.setPasswordLogin(a.getPassword());
				vna.setUserLogin(a.getUsername());
				vna.setFilterParametro("all");
				vna.setParametro("ok");
				vna.setMin(min);
				vna.setMax(max);
			}
			else
			{
				if(ActionContext.getContext().getSession().get("filterParametroAtt") == null && ActionContext.getContext().getSession().get("testoRicercaAttuale") == null)
				{
					vna.setNomeFunzionalita("Lista notizie");
					vna.setPasswordLogin(a.getPassword());
					vna.setUserLogin(a.getUsername());
					vna.setFilterParametro("all");
					vna.setParametro("ok");
					vna.setMin(min);
					vna.setMax(max);
				}
				else
				{
					vna.setNomeFunzionalita("Lista notizie");
					vna.setPasswordLogin(a.getPassword());
					vna.setUserLogin(a.getUsername());
					vna.setFilterParametro((String) ActionContext.getContext().getSession().get("filterParametroAtt"));
					vna.setParametro((String) ActionContext.getContext().getSession().get("testoRicercaAttuale"));
					vna.setMin(min);
					vna.setMax(max);
				}
			}
		
			RicercaNotizieServiceResponse vnares = null;
			try {
				vnares = gnss.ricercaNotizieService(vna);

				if (logger.isInfoEnabled()) {
					logger.info("execute() - L'utente "+a.getUsername()+" ha visualizzato correttamente la lista delle notizie.");
				}
				
			} catch (AxisFault e) {
				addActionError(getText(e.getMessage()));
				if (logger.isInfoEnabled()) {
					logger.info("execute() - L'utente "+a.getUsername()+" non ha visualizzato correttamente la lista delle notizie.");
				}
				return "error";
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ArrayList<com.reply.gestoreloginservice.GestoreNotiziaSStub.Notizia> notizieAutore = new ArrayList<com.reply.gestoreloginservice.GestoreNotiziaSStub.Notizia>();
			ArrayList<com.reply.gestoreloginservice.GestoreNotiziaSStub.Notizia> notizieSlider = new ArrayList<com.reply.gestoreloginservice.GestoreNotiziaSStub.Notizia>();
			
			if(vnares.get_return() != null)
			{
				for(int i=0; i<vnares.get_return().length; i++){
						notizieAutore.add(vnares.get_return()[i]);
						if(i<5)
						{
							notizieSlider.add(vnares.get_return()[i]);
						}
				}
			}
			else
			{
				notizieAutore = null;
			}
			
			if(ActionContext.getContext().getSession().get("erroreNotizia") != null)
			{
				addActionError(getText((String) ActionContext.getContext().getSession().get("erroreNotizia")));
				ActionContext.getContext().getSession().remove("erroreNotizia");
				
			}
			
			
			
			request.put("lista_notizie", notizieAutore);
			
			
			
			
			}catch(Exception e){
				e.printStackTrace();
			}
			return "success";
			
		}

	}
	

