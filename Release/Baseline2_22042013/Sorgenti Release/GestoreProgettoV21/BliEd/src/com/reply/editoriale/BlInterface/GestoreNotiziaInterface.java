package com.reply.editoriale.BlInterface;

import com.reply.editoriale.entity.Account;
import com.reply.editoriale.entity.Notizia;

public interface GestoreNotiziaInterface {
	
	public Notizia createNotizia(Account autore,String titolo, String sottoTitolo,String testo, int lunghezzaTesto);

}
