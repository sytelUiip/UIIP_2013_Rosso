<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1>Dettagli Account</h1>
				
		<table border="0" cellspacing="5px" cellpadding="5px" style="border:1px solid #000">
    <tr><td>Username</td><td>${utente_cercato.username}</td></tr>
    <tr><td>Nome</td><td>${utente_cercato.nome}</td></tr>
    <tr><td>Cognome</td><td>${utente_cercato.cognome}</td></tr>
    <tr><td>Sigla giornalista</td><td>${utente_cercato.siglaGiornalista}</td></tr>
    <tr><td>Sigla redazione</td><td>${utente_cercato.siglaRedazione}</td></tr>
   	<tr><td>Ruolo</td>
   		<td>
   				<s:iterator value="#session['ruoli_utente']" var="ruoli">
   					${ruoli}</br>
   				</s:iterator>
   		</td>
   </tr>
   <s:if test="%{#utente_cercato.stato} == 'C'"><tr><td>Stato</td><td>Cancellato</td></tr></s:if>
   <s:else><tr><td>Stato</td><td>Attivo</td></tr></s:else>
   </table>
 </div>