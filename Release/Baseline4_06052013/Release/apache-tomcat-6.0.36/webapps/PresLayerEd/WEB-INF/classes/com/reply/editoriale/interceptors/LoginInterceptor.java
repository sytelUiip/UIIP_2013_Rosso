package com.reply.editoriale.interceptors;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> sessionAttributes = invocation.getInvocationContext().getSession();
		
		if(sessionAttributes == null || sessionAttributes.get("utente_loggato") == null)
		{
			return "login";
		}else
		{
			if(!(sessionAttributes.get("utente_loggato")).equals(null))
			{
				return invocation.invoke();
			}else
			{
				return "login";
			}
			
		}
		
	}

}
