package com.reply.editoriale.BL;

import java.sql.SQLException;

import org.apache.axis2.AxisFault;

import com.reply.editoriale.BlInterface.GestoreNotiziaInterface;
import com.reply.editoriale.entity.Account;
import com.reply.editoriale.entity.Notizia;
import com.reply.editoriale.persistenceInterface.DaoInterface;
import com.reply.eis.persistence.DaoImpl;

public class GestioneNotiziaImpl implements GestoreNotiziaInterface {
	
	public Notizia createNotizia(String nomeFunzionalita,String userLogin,
			String passwordLogin,String autore,String titolo, String sottoTitolo, String testo) throws AxisFault, Exception{
				
		
		DaoInterface dao = new DaoImpl();
		Notizia newNotizia = null;
		newNotizia = dao.createNotizia( nomeFunzionalita, userLogin,
				 passwordLogin,autore, titolo, sottoTitolo, testo);
		
		
		return newNotizia;
		
	}
	
	public Notizia[] ricercaNotizie(String nomeFunzionalita,String userLogin,
			String passwordLogin,String filterParametro, String parametro,  int min, int max) throws AxisFault, Exception
	{
		DaoInterface dao = new DaoImpl();
		if(filterParametro.equals("autore"))
		{
			return dao.executeVisualizzaNotizieAutore( nomeFunzionalita, userLogin, passwordLogin, parametro, min, max);
		}
		else if(filterParametro.equals("all"))
		{
			return dao.executeListaNotizie(nomeFunzionalita,userLogin, passwordLogin, min, max);
		}
		else if(filterParametro.equals("titolo"))
		{
			return dao.executeListaNotiziaTitolo(nomeFunzionalita, userLogin, passwordLogin,parametro, min, max);
		}
		else if(filterParametro.equals("stato"))
		{
			return dao.executeVisualizzaNotiziaStato(nomeFunzionalita, userLogin, passwordLogin, parametro, min, max);
		}
		else
		{
			return null;
		}
		
	}
	
	public Notizia cercaNotiziaId(String nomeFunzionalita,String userLogin,String passwordLogin,int id)throws AxisFault, Exception{
		
		DaoInterface dao = new DaoImpl();
		Notizia newNotizia = null;
		newNotizia = dao.executeCercaNotiziaId( nomeFunzionalita, userLogin, passwordLogin,id);
		return newNotizia;
	}
	
	public Notizia cancellaNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception{
		DaoInterface dao = new DaoImpl();
		Notizia delNotizia = null;
		delNotizia = dao.executeCancellaNotizia( nomeFunzionalita, userLogin, passwordLogin,id);
		return delNotizia;
	}
	
	public boolean ModNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception{
		DaoInterface dao = new DaoImpl();
		return dao.ModificaNotizia(nomeFunzionalita,userLogin, passwordLogin, id);	
	}
	
	public Notizia registraNotizia(String nomeFunzionalita,String userLogin,String passwordLogin, int id, String titolo,
			String sottotitolo, String testo) throws AxisFault, Exception{
		DaoInterface dao = new DaoImpl();
		return dao.registraNotizia(nomeFunzionalita, userLogin, passwordLogin,  id,  titolo,
				 sottotitolo,  testo);
	}
	
	public boolean annulla(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception{
		DaoInterface dao = new DaoImpl();
		return dao.annulla( nomeFunzionalita, userLogin, passwordLogin, id);
	}
	
	public boolean annullaLista(String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault, Exception{
		DaoInterface dao = new DaoImpl();
		return dao.annullaLista( nomeFunzionalita, userLogin, passwordLogin);
	}
	
	public Notizia trasmettiNotizia(int id,String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault, Exception{
		DaoInterface dao = new DaoImpl();
		return dao.trasmettiNotizia(id, nomeFunzionalita, userLogin, passwordLogin);
	}
	
	public int contaNotizie(String filterParametro, String parametro) throws AxisFault, Exception{
		
		DaoInterface dao = new DaoImpl();
		//return dao.contaNotizie();
		if(filterParametro.equals("all")){
			System.out.println("filter parametro ALL");
			return dao.contaNotizie();
			
		}
		else if(filterParametro.equals("titolo")){
			System.out.println("filter parametro titolo");
			return dao.contaNotizieTitolo(parametro);
		}
		else if(filterParametro.equals("stato")){
			System.out.println("filter parametro stato");
			return dao.contaNotizieStato(parametro);
		}
		else if(filterParametro.equals("autore")){
			System.out.println("filter parametro autore");
			return dao.contaNotizieAutore(parametro);
		}
		else {
			System.out.println("return 00000000000000000");
			return 0;
		}	

	}


}
