<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div style="vertical-align: middle" align="center">
	<h1>Lista Account Registrati</h1>
	<s:actionerror />
	<s:actionmessage/>
	<s:if test="#request['lista_utenti'] != null">
   <table id="lista_acc" border="0" cellspacing="5px" cellpadding="15px" style="border:1px solid #000; margin-bottom:40px;">
    <tr style="background-color: #EEDFE0;">
    	<th>Nome</th>
   		<th>Cognome</th>
   		<th style="border-right:1px solid rgb( 153, 153, 153 );">Username</th>
   	</tr>
   	
   	<s:iterator value="#request['lista_utenti']" var="utenti_reg">
   	 	<tr style="border-bottom:1px solid rgb( 153, 153, 153 );">
<!--    	 		<td> -->
<%--    	 			<s:property value="%{#funzioni.username}"/> --%>
<!--    	 		</td> -->
<!--    	 		<td> -->
<%--    	 			<s:property value="%{#funzioni.nome}"/> --%>
<!--    	 		</td> -->
<!--    	 		<td> -->
<%--    	 			<s:property value="%{#funzioni.cognome}"/> --%>
<!--    	 		</td> -->
			<td style="border-bottom:1px solid rgb( 153, 153, 153 );">
   	 			${utenti_reg.nome} 
   	 		</td>
   	 		<td style="border-bottom:1px solid rgb( 153, 153, 153 );">
   	 			${utenti_reg.cognome} 
   	 		</td>
   	 		<td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom:1px solid rgb( 153, 153, 153 );">
   	 			${utenti_reg.username} 
   	 		</td>
<!--    	 		<td> -->
<%--    	 			<s:a href="viewDettagliAccount.action?username=${utenti_reg.username}">Dettagli</s:a> --%>
<!--    	 		</td> -->
<!--    	 		<td> -->
<%--    	 			<s:a href="modificaAccount.action?username=${utenti_reg.username}">Modifica</s:a> --%>
<!--    	 		</td> -->
<!--    	 		<td> -->
<%--    	 			<s:a href="cancellaAccount.action?username=${utenti_reg.username}">Cancella</s:a> --%>
<!--    	 		</td> -->
   	 		<td style="border-bottom:1px solid rgb( 153, 153, 153 );">
   	 			<s:a href="viewDettagliAccount.action?username=%{#utenti_reg.username}">Dettagli</s:a>
   	 		</td>
   	 		<td style="border-bottom:1px solid rgb( 153, 153, 153 );">
   	 			<s:a href="viewUpdateAccount.action?username=%{#utenti_reg.username}">Modifica</s:a>
   	 		</td>
   	 		<td style="border-bottom:1px solid rgb( 153, 153, 153 );">
   	 			<s:if test="%{#utenti_reg.stato} == 'C'"><s:a href="cancellaAccount.action?username=%{#utenti_reg.username}" disabled="true">Cancella</s:a></s:if>
   	 			<s:else><s:a href="cancellaAccount.action?username=%{#utenti_reg.username}">Cancella</s:a></s:else>
   	 		</td>
   	 		<td style="border-bottom:1px solid rgb( 153, 153, 153 );">
   	 			<s:a href="gestoreAccount.action?username=%{#utenti_reg.username}">Gestisci Ruoli</s:a>
   	 		</td>
   	 		
   		</tr>
	</s:iterator>
   </table>
   </s:if>
</div>