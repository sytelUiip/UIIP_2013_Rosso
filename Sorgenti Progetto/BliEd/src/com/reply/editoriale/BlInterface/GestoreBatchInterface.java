package com.reply.editoriale.BlInterface;

import org.apache.axis2.AxisFault;

public interface GestoreBatchInterface {
	
	public void trasmetti() throws AxisFault;
	public void ricevi();

}
