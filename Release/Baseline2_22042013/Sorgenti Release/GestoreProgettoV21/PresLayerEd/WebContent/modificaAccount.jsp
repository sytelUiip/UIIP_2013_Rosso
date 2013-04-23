<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1>Modifica Account</h1>
				
				<s:actionerror />
				<s:actionmessage/>
	
					<s:form action="updateAccount.action?username=%{#request['utente_modificare'].username}" method="post" validate="true">
						
    					<s:textfield name="nome" key="label.nome" value="%{#request['utente_modificare'].nome}" size="20" />
    					<s:textfield name="cognome" key="label.cognome" value="%{#request['utente_modificare'].cognome}" size="20" />
    					<s:password name="password" key="label.password" size="20" />
    					<s:textfield name="sigla_redazione" key="label.sigla_redazione" value="%{#request['utente_modificare'].siglaRedazione}" size="20" />
    					<s:textfield name="sigla_giornalista" key="label.sigla_giornalista" value="%{#request['utente_modificare'].siglaGiornalista}" size="20" />
    					<s:hidden name="username_old" value="%{#request['utente_modificare'].username}" />
    					<s:submit method="execute" key="label.updateAccount" align="center" />
					</s:form>
	</div>
		
				
					
			
	