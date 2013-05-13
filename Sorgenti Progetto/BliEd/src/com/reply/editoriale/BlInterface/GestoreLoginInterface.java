package com.reply.editoriale.BlInterface;


import org.apache.axis2.AxisFault;

import com.reply.editoriale.entity.*;

public interface GestoreLoginInterface {
	
	public Account eseguiLogin(String username, String password) throws AxisFault, Exception;

}
