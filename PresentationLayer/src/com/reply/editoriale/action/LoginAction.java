package com.reply.editoriale.action;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginStub;
import com.reply.gestoreloginservice.GestoreLoginStub.Authentication;
import com.reply.gestoreloginservice.GestoreLoginStub.AuthenticationResponse;


public class LoginAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
    private String password;
 
    public String execute() {
 
    	
//        if (this.username.equals("admin") 
//                && this.password.equals("admin123")) {
//            return "success";
//        } else {
//        	addActionError(getText("error.login"));
//            return "error";
//        }
        
        
        GestoreLoginStub gls = null;
		try {
			gls = new GestoreLoginStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	Authentication ath = new Authentication();
    	ath.setUsername(username);
    	ath.setPassword(password);
    	AuthenticationResponse athRes = null;
		try {
			athRes = gls.authentication(ath);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	if (athRes.get_return().equals("error")) {
    		 addActionError(getText("error.login"));
    	}
    	return athRes.get_return();
        
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

}
