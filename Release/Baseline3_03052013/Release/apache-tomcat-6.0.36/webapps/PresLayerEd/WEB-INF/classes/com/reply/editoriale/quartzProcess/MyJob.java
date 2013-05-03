package com.reply.editoriale.quartzProcess;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.reply.gestoreloginservice.GestoreNotiziaBatchStub;
import com.reply.gestoreloginservice.GestoreNotiziaBatchStub.RiceviNotizia;
import com.reply.gestoreloginservice.GestoreNotiziaBatchStub.TrasmettiNotizia;

public class MyJob implements Job {

	@Override
	public void execute(JobExecutionContext jec) throws JobExecutionException {
//		System.out.println("Sono il processo: " + jec.getJobDetail().getKey() + " sono stato eseguito");
		
		//System.out.println("Sono il processo: " + jec.getJobDetail().getKey() + " sono stato eseguito");
//		TestTrasmitter tt = new TestTrasmitter();
//		tt.transmitterNews();
		GestoreNotiziaBatchStub gnbs = null;
		
		try {
			gnbs = new GestoreNotiziaBatchStub();	
		} catch (AxisFault e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		TrasmettiNotizia tn = new TrasmettiNotizia();
		try {
			gnbs.trasmettiNotizia(tn);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RiceviNotizia rn = new RiceviNotizia();
		try {
			gnbs.riceviNotizia(rn);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		InsertProva ip = new InsertProva();
//		try {
//			ip.provaIns();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		TestTrasmitter tt = new TestTrasmitter();
//		tt.transmitterNews();
//		GestoreNotiziaBatchStub gnbs = null;
//		
//		try {
//			gnbs = new GestoreNotiziaBatchStub();
//		} catch (AxisFault e2) {
//			// TODO Auto-generated catch block
//			e2.printStackTrace();
//		}
//		
//		
//		TrasmettiNotizia tn = new TrasmettiNotizia();
//		try {
//			gnbs.trasmettiNotizia(tn);
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		InsertProva ip = new InsertProva();
//		try {
//			ip.provaIns();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
