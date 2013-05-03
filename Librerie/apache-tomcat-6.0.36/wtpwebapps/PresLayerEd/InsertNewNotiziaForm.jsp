<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
	<h1><s:text name = "inserisciNotizia"/></h1>
				<s:actionerror />
				<s:actionmessage/>
					<s:form action="insertNotizia.action" method="post" validate="true">
    					<s:textfield name="titolo" key="label.titolo" size="70" />
    					<s:textfield name="sotto_titolo" key="label.sotto_titolo" size="90" />
    					<s:textarea name="testo"  key="label.testo" cols="70" rows="10">
    					</s:textarea>
    					<s:submit method="execute" key="label.insertNotizia" align="center" />
					</s:form>
	</div>