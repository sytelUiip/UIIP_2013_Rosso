<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1><s:text name = "inserisciAccount"/></h1>
				<div style="margin-top:30px;"><s:actionerror />
				<s:actionmessage/></div>
 				<div style="border:1px solid rgb( 153, 153, 153 ); padding:20px 10px 20px 10px; width: 400px; border-radius:15px 15px 15px 15px;"> 
 					<s:form action="insertAccount.action" method="post" validate="true" >
							<s:textfield name="nome" key="label.nome" size="30" style="margin-top:10px;"/> 
    					<s:textfield name="cognome" key="label.cognome" size="30" style="margin-top:10px;"/>
    					<s:textfield name="username" key="label.username" size="30" style="margin-top:10px;" />
    					<s:password name="password" key="label.password" size="30" style="margin-top:10px;" />
    					<s:textfield name="sigla_redazione" key="label.sigla_redazione" size="30" style="margin-top:10px;" />
    					<s:textfield name="sigla_giornalista" key="label.sigla_giornalista" size="30" style="margin-top:10px;" />
    					<s:select name="ruolo" id="ruolo" label="Ruolo" list="{'Amministratore', 'Giornalista'}" style="width:100%; margin-top:10px;"></s:select>
    					
    					<s:submit method="execute" key="label.insertAccount" align="center" style="margin-top:20px;"  />	



<!-- 					<table > -->
<%-- 						<tr><td><s:textfield name="nome" key="label.nome" size="30"/></td></tr> --%>
<%-- 						<tr><td><s:textfield name="cognome" key="label.cognome" size="30" /></td></tr> --%>
<%-- 						<tr><td><s:textfield name="username" key="label.username" size="30" /></td></tr> --%>
<%-- 						<tr><td><s:password name="password" key="label.password" size="30" /></td></tr> --%>
<%-- 						<tr><td><s:textfield name="sigla_redazione" key="label.sigla_redazione" size="30" /></td></tr> --%>
<%-- 						<tr><td><s:textfield name="sigla_giornalista" key="label.sigla_giornalista" size="30" /></td></tr> --%>
<%-- 						<tr><td><s:select name="ruolo" id="ruolo" label="Ruolo" list="{'Amministratore', 'Giornalista'}" style="width:100%"></s:select></td></tr> --%>
<%-- 						<tr><td style="padding-top:25px;"><s:submit method="execute" key="label.insertAccount" align="center" /></td></tr> --%>
<!-- 					</table> -->
				</s:form> 
					<div align="right" style="margin-right:10px; margin-top:30px;">
						<s:form action="viewListaAccount.action?pag=1" method="post" validate="true">
						<s:submit method="execute" key="label.indietromod" align="center" />
					</s:form>
					</div>
<%--     					<s:textfield name="nome" key="label.nome" size="20"/> --%>
<%--     					<s:textfield name="cognome" key="label.cognome" size="20" /> --%>
<%--     					<s:textfield name="username" key="label.username" size="20" /> --%>
<%--     					<s:password name="password" key="label.password" size="20" /> --%>
<%--     					<s:textfield name="sigla_redazione" key="label.sigla_redazione" size="20" /> --%>
<%--     					<s:textfield name="sigla_giornalista" key="label.sigla_giornalista" size="20" /> --%>
<%--     					<s:select name="ruolo" id="ruolo" label="Ruolo" list="{'Amministratore', 'Giornalista'}" style="width:100%"></s:select> --%>
<%--     					<s:submit method="execute" key="label.insertAccount" align="center" /> --%>	
				</div> 
	</div>