<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
			<h1><s:text name = "modAccount"/></h1>
				
				<s:actionerror />
				<s:actionmessage/>
	
					<s:form action="updateAccount.action?username=%{#request['utente_modificare'].username}" method="post" validate="true">
						
    					<s:textfield name="nome" key="label.nome" value="%{#session['utente_modificare'].nome}" size="20" />
    					<s:textfield name="cognome" key="label.cognome" value="%{#session['utente_modificare'].cognome}" size="20" />
    					<s:password name="password" key="label.password" size="20" />
    					<s:textfield name="sigla_redazione" key="label.sigla_redazione" value="%{#session['utente_modificare'].siglaRedazione}" size="20" />
    					<s:textfield name="sigla_giornalista" key="label.sigla_giornalista" value="%{#session['utente_modificare'].siglaGiornalista}" size="20" />
    					<s:hidden name="username_old" value="%{#session['utente_modificare'].username}" />
    					<s:submit method="execute" key="label.updateAccount" align="center" />
					</s:form>
					<s:form action="viewListaAccount.action?pag=1" method="post" validate="true">
					<s:submit method="execute" key="label.indietromod" align="center" />
					</s:form>
	</div>
		
				
					
			
	