package com.reply.editoriale.BlInterface;

import java.sql.SQLException;

import org.apache.axis2.AxisFault;

import com.reply.editoriale.entity.Account;
import com.reply.editoriale.entity.Notizia;


public interface GestoreNotiziaInterface {
	
	public Notizia createNotizia(String nomeFunzionalita,String userLogin,
			String passwordLogin,String autore,String titolo, String sottoTitolo, String testo) throws AxisFault, Exception;
	public Notizia[] ricercaNotizie(String nomeFunzionalita,String userLogin,
			String passwordLogin,String filterParametro, String parametro,  int min, int max) throws AxisFault, Exception;
	public Notizia cercaNotiziaId(String nomeFunzionalita,String userLogin,
			String passwordLogin,int id)throws AxisFault, Exception;
	public Notizia cancellaNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception;
	public boolean ModNotizia(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception;
	public Notizia registraNotizia(String nomeFunzionalita,String userLogin,String passwordLogin, int id, String titolo,
			String sottotitolo, String testo) throws AxisFault, Exception;
	public boolean annulla(String nomeFunzionalita,String userLogin,String passwordLogin,int id) throws AxisFault, Exception;
	public boolean annullaLista(String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault, Exception;
	public Notizia trasmettiNotizia(int id,String nomeFunzionalita,String userLogin,String passwordLogin) throws AxisFault, Exception;
	public int contaNotizie(String filterParametro, String parametro) throws AxisFault, Exception;

}
