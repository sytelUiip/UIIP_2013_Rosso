package com.reply.editoriale.BlInterface;


import com.reply.editoriale.entity.*;

public interface GestoreLoginInterface {
	
	public Account eseguiLogin(String username, String password) throws Exception;

}
