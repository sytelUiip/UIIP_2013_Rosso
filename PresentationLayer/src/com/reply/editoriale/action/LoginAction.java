<<<<<<< HEAD
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
=======
package com.reply.editoriale.action;

import java.rmi.RemoteException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.axis2.AxisFault;
import org.apache.catalina.connector.Request;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.reply.gestoreloginservice.GestoreLoginSQLExceptionException;
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
 
    public String execute() throws GestoreLoginSQLExceptionException {
 
    	
//        if (this.username.equals("admin") 
//                && this.password.equals("admin123")) {
//            return "success";
//        } else {
//        	addActionError(getText("error.login"));
//            return "error";
//        }
        
    	Map username_session = ActionContext.getContext().getSession();
    	Map ruolo_session = ActionContext.getContext().getSession();
    	Map nomeCognome_session = ActionContext.getContext().getSession();
    	Map ruolo2_session = ActionContext.getContext().getSession();
    	
    	String username_ses = "";
    	String ruolo_ses = "";
    	String nomeCognome_ses = "";
    	String ruolo2_ses = "";
    	
  
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
    	ath.setNomeCognome_session(nomeCognome_ses);
    	ath.setRuolo_session(ruolo_ses);
    	ath.setUser_session(username_ses);
    	ath.setRuolo2_session(ruolo2_ses);
    	
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
>>>>>>> 0c9a5bffbdcb26ad50541f9862c6fa8a75ea64e6
