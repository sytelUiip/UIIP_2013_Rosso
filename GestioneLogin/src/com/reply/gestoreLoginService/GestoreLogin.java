package com.reply.gestoreLoginService;

public class GestoreLogin {
	
	public String authentication(String username, String password)
	{
		if (username.equals("admin") 
                && password.equals("admin123")) {
            return "success";
        } else {
            return "error";
        }
	}

}
