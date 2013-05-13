package com.reply.editoriale.action;

import java.util.Map;

import org.apache.axis2.AxisFault;

import com.opensymphony.xwork2.ActionContext;

public class contattiAction {
	
	private int id;
	
	public String execute() throws AxisFault{
		
		Map request = (Map) ActionContext.getContext().get("request");
		if(id<1 || id>5)
		{
			id=1;
		}
		
		request.put("contatto", id);
		
		return "success";
		
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
