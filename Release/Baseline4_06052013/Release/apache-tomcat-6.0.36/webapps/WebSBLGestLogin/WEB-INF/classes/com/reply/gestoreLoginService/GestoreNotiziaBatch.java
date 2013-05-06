package com.reply.gestoreLoginService;

import org.apache.axis2.AxisFault;

import com.reply.editoriale.BL.GestioneNotiziaBatch;
import com.reply.editoriale.BlInterface.GestoreBatchInterface;

public class GestoreNotiziaBatch {
	
public void trasmettiNotizia() throws AxisFault{
		
		GestoreBatchInterface gbi = new GestioneNotiziaBatch();
		gbi.trasmetti();
	}

public void riceviNotizia(){
	GestoreBatchInterface gbi = new GestioneNotiziaBatch();
	gbi.ricevi();
	
}

}
