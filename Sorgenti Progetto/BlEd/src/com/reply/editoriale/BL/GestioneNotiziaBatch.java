package com.reply.editoriale.BL;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.axis2.AxisFault;

import com.reply.editoriale.BlInterface.GestoreBatchInterface;
import com.reply.editoriale.Transmitter.XmlTrasmitter;
import com.reply.editoriale.receiver.Receiver;

public class GestioneNotiziaBatch implements GestoreBatchInterface{

	@Override
	public void trasmetti(){
		// TODO Auto-generated method stub
		
		XmlTrasmitter xt = new XmlTrasmitter();
		try {
			xt.transmitterNews();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void ricevi() {
		// TODO Auto-generated method stub
		
		Receiver r = new Receiver();
		try {
			r.validateReadXml();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
