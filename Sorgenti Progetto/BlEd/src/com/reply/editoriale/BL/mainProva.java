package com.reply.editoriale.BL;

import com.reply.editoriale.entity.Notizia;
import com.reply.editoriale.persistenceInterface.DaoInterface;
import com.reply.eis.persistence.DaoImpl;

public class mainProva {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaoInterface dao = new DaoImpl();
		Notizia[] a = new Notizia[20];
		try {
//			a = dao.executeListaNotiziaTitolo("Cavani alla Juventus");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i].getAutore()+"\n");
		}
	
	}

}
