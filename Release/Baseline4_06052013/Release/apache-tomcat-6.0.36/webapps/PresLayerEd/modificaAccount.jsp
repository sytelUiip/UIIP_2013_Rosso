<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
			<h1><s:text name = "modAccount"/></h1>
				
				<div style="margin-top:30px;"><s:actionerror />
				<s:actionmessage/></div>
				<div style="border:1px solid rgb( 153, 153, 153 ); padding:20px 10px 20px 10px; width: 400px; border-radius:15px 15px 15px 15px;">
					<s:form action="updateAccount.action?username=%{#request['utente_modificare'].username}" method="post" validate="true">
						
	    					<s:textfield name="nome" key="label.nome" value="%{#session['utente_modificare'].nome}" size="30" style="margin-top:10px;" />
	    					<s:textfield name="cognome" key="label.cognome" value="%{#session['utente_modificare'].cognome}" size="30" style="margin-top:10px;" />
	    					<s:password name="password" key="label.password" size="30" style="margin-top:10px;" />
	    					<s:textfield name="sigla_redazione" key="label.sigla_redazione" value="%{#session['utente_modificare'].siglaRedazione}" size="30" style="margin-top:10px;" />
	    					<s:textfield name="sigla_giornalista" key="label.sigla_giornalista" value="%{#session['utente_modificare'].siglaGiornalista}" size="30" style="margin-top:10px;" />
	    					<s:hidden name="username_old" value="%{#session['utente_modificare'].username}" />
	    					<s:submit method="execute" key="label.updateAccount" align="center" style="margin-top:20px;" />
    				
<!-- 					<table cellpadding="2">	 -->
<%--     					<tr><td><s:textfield name="nome" key="label.nome" value="%{#session['utente_modificare'].nome}" size="30" /></td></tr> --%>
<%--     					<tr><td><s:textfield name="cognome" key="label.cognome" value="%{#session['utente_modificare'].cognome}" size="30" /></td></tr> --%>
<%--     					<tr><td><s:password name="password" key="label.password" size="30" /></td></tr> --%>
<%--     					<tr><td><s:textfield name="sigla_redazione" key="label.sigla_redazione" value="%{#session['utente_modificare'].siglaRedazione}" size="30" /></td></tr> --%>
<%--     					<tr><td><s:textfield name="sigla_giornalista" key="label.sigla_giornalista" value="%{#session['utente_modificare'].siglaGiornalista}" size="30" /></td></tr> --%>
<%--     					<s:hidden name="username_old" value="%{#session['utente_modificare'].username}" /> --%>
<%--     					<tr><td style="padding-top:25px;"><s:submit method="execute" key="label.updateAccount" align="center" /></td></tr> --%>
<!--     				</table> -->
					</s:form>
					<div align="right" style="margin-right:10px; margin-top:30px;">
						<s:form action="viewListaAccount.action?pag=1" method="post" validate="true">
						<s:submit method="execute" key="label.indietromod" align="center" />
					</s:form>
					</div>
				</div>
	</div>
		
				
					
			
	