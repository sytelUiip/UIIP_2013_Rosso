<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1>Inserisci Account</h1>
				<s:actionerror />
				<s:actionmessage/>
					<s:form action="insertAccount.action" method="post" validate="true">
    					<s:textfield name="nome" key="label.nome" size="20" />
    					<s:textfield name="cognome" key="label.cognome" size="20" />
    					<s:textfield name="username" key="label.username" size="20" />
    					<s:password name="password" key="label.password" size="20" />
    					<s:textfield name="sigla_redazione" key="label.sigla_redazione" size="20" />
    					<s:textfield name="sigla_giornalista" key="label.sigla_giornalista" size="20" />
    					<s:submit method="execute" key="label.insertAccount" align="center" />
					</s:form>
	</div>