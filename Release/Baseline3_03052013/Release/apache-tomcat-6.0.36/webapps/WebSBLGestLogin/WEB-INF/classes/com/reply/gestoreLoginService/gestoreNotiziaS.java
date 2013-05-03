package com.reply.gestoreLoginService;

import java.rmi.RemoteException;
import java.sql.SQLException;

import org.apache.axis2.AxisFault;

import com.reply.editoriale.BL.GestioneNotiziaImpl;
import com.reply.editoriale.BlInterface.GestoreNotiziaInterface;
import com.reply.editoriale.entity.Notizia;

public class gestoreNotiziaS {
	
	public Notizia insertNewNotizia(String nomeFunzionalita,String userLogin,
			String passwordLogin,String autore,String titolo, String sottoTitolo, String testo) throws AxisFault
	{
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		try{
			return gni.createNotizia( nomeFunzionalita, userLogin,
					 passwordLogin, autore, titolo,  sottoTitolo,  testo);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}	
	}
	
	public Notizia[] ricercaNotizieService(String nomeFunzionalita,String userLogin,
			String passwordLogin,String filterParametro, String parametro, int min, int max) throws AxisFault
	{
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		try{
			return gni.ricercaNotizie( nomeFunzionalita, userLogin,
					 passwordLogin, filterParametro,  parametro, min, max);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
		
	}
	
	public Notizia visualizzaNotiziaId(String nomeFunzionalita,String userLogin,
			String passwordLogin,int id) throws AxisFault
	{
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		try{
			return gni.cercaNotiziaId( nomeFunzionalita, userLogin,
					 passwordLogin, id);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
	}
	
	public Notizia cancellaNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault
	{
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		try{
			return gni.cancellaNotizia( nomeFunzionalita, userLogin, passwordLogin, id);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
	}
	
	public boolean ModificaNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault{
		
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		try{
			return gni.ModNotizia( nomeFunzionalita, userLogin, passwordLogin, id);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
		
	}
	
	public Notizia registraNotizia(String nomeFunzionalita,String userLogin,String passwordLogin, int id, String titolo,
			String sottotitolo, String testo) throws AxisFault{
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		try{
			return gni.registraNotizia( nomeFunzionalita, userLogin, passwordLogin,  id,  titolo,
					 sottotitolo,  testo);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
	}
	
	public boolean annulla(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault{
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		try{
			return gni.annulla( nomeFunzionalita, userLogin, passwordLogin, id);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
	}
	
	public boolean annullaLista(String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault{
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		try{
			return gni.annullaLista( nomeFunzionalita, userLogin, passwordLogin);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
	}
	
	public Notizia trasmetti(int id,String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault{
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		try{
			return gni.trasmettiNotizia( id, nomeFunzionalita, userLogin, passwordLogin);
		}catch(Exception e)
		{
			throw new AxisFault(e.getMessage());
		}
	}
	
	public int numeroNotizieRicerca(String filterParametro, String parametro) throws AxisFault{
		GestoreNotiziaInterface gni = new GestioneNotiziaImpl();
		
		try {
			return gni.contaNotizie(filterParametro, parametro);
		} catch (Exception e) {
			throw new AxisFault(e.getMessage());
			
		}
	}

}
