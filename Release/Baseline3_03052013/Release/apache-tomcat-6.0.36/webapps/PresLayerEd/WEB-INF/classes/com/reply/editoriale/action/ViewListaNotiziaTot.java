package com.reply.editoriale.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class ViewListaNotiziaTot extends ActionSupport {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public String execute(){
			
			if(ActionContext.getContext().getSession().get("filterParametroAtt") != null && ActionContext.getContext().getSession().get("testoRicercaAttuale") != null)
			{
				ActionContext.getContext().getSession().remove("filterParametroAtt");
				ActionContext.getContext().getSession().remove("testoRicercaAttuale");
			}
			return "success";
			
		}

	}
	

