<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1><s:text name = "detAccount"/></h1>
				
		<table border="0" cellspacing="5px" cellpadding="5px" style="border:1px solid #000">
   <tr><td>Username</td><td>${utente_cercato.username}</td></tr>
    <tr><td><s:text name = "nome"/></td><td>${utente_cercato.nome}</td></tr>
    <tr><td><s:text name = "cognome"/></td><td>${utente_cercato.cognome}</td></tr>
    <tr><td><s:text name = "sigGiornalista"/></td><td>${utente_cercato.siglaGiornalista}</td></tr>
    <tr><td><s:text name = "sigRedazione"/></td><td>${utente_cercato.siglaRedazione}</td></tr>
   	<tr><td><s:text name = "ruolo"/></td>
   		<td>
   				<s:iterator value="#request['ruoli_utente']" var="ruoli">
   					${ruoli}</br>
   				</s:iterator>
   		</td>
   </tr>
   <s:if test="%{#utente_cercato.stato} == 'C'"><tr><td><s:text name = "statoCancellato"/></td><td></td></tr></s:if>
   <s:else><tr><td><s:text name = "statoAttivo"/></td></tr></s:else>
   </table>
   <s:form action="viewListaAccount.action?pag=1" method="post" validate="true">
					<s:submit method="execute" key="label.indietro" align="right" />
					</s:form>
 </div>