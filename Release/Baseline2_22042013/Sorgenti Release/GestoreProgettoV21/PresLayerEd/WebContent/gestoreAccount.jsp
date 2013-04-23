<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1>Gestione ruoli Account</h1>
		<div>
			<s:if test="#request['privilegi'] == 'Am'">
				<div style="font-size:18px;">Utente di tipo Amministratore.</br> <s:a href="aggiungiRuoloAccount.action?username=%{#request.utenteId}">Clicca qui</s:a> per aggiungere all'utente selezionato il ruolo di giornalista.</div>
			</s:if>
			<s:elseif test="#request['privilegi'] == 'Gi'">
				<div style="font-size:18px;">Utente di tipo Giornalista.</br> Questo utente non &egrave abilitato per essere associato ad altri ruoli.</div>
			</s:elseif>
			<s:elseif test="#request['privilegi'] == 'AmGi'">
				<div style="font-size:18px;">Utente di tipo Amministratore e Giornalista.</br> <s:a href="rimuoviRuoloAccount.action?username=%{#request.utenteId}">Clicca qui</s:a> se vuoi rimuovere all'utente selezionato il ruolo di giornalista.</div>
			</s:elseif>
		</div>
				
		
   
 </div>