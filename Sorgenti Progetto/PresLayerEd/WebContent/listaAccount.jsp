<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div style="vertical-align: middle" align="center">
	<h1><s:text name = "listaAccountRegistrati"/></h1>
	<div style="margin-top:30px;"><s:actionerror />
	<s:actionmessage/></div>
	<s:if test="#request['lista_utenti'] != null">
	
		<table cellspacing="0" cellpadding="5px" style="border:1px solid #000; margin-bottom:40px; margin-top:30px; width: 600px;" >
    		<tr style="background-color: #EEDFE0;">
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "nome"/></th>
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "cognome"/></th>
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "username"/><br></th>
				<th style="border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "gestisciAccount"/></th>
			</tr>
			<s:iterator value="#request['lista_utenti']" var="utenti_reg">
				<tr style="border-bottom: 1px solid rgb(153, 153, 153);">
					<td style="border-bottom: 1px solid rgb(153, 153, 153); border-right:1px solid rgb( 153, 153, 153 ); width: 100px;">
						${utenti_reg.nome} </td>
					<td style="border-bottom: 1px solid rgb(153, 153, 153); border-right:1px solid rgb( 153, 153, 153 );">
						${utenti_reg.cognome} </td>
					<td	style="border-right: 1px solid rgb(153, 153, 153); border-bottom: 1px solid rgb(153, 153, 153);">
						${utenti_reg.username}</td>
					<td style="border-right: 1px solid rgb(153, 153, 153); border-bottom: 1px solid rgb(153, 153, 153); width: 115px;">
						<s:a href="viewDettagliAccount.action?username=%{#utenti_reg.username}">
							<img src="icon/icon_dettagli_notizia.png" height="25px;" title="Visualizza i Dettagli dell''Account"/>
						</s:a>
						<s:a href="viewUpdateAccount.action?username=%{#utenti_reg.username}">
							<img src="icon/icon_mod_notizia.png" height="25px;" title="Modifica l''Account"/>
						</s:a>
						<s:if test="%{#utenti_reg.stato} == 'C'"><s:a href="cancellaAccount.action?username=%{#utenti_reg.username}" disabled="true"><img src="icon/icon_delete_notizia.png" height="25px;" title="Cancella l''Account"/></s:a></s:if>
   	 					<s:else><s:a href="cancellaAccount.action?username=%{#utenti_reg.username}"><img src="icon/icon_delete_notizia.png" height="25px;" title="Cancella l''Account"/></s:a></s:else>
						<s:a href="gestoreAccount.action?username=%{#utenti_reg.username}">
							<img src="icon/admin.png" height="25px;" title="Gestione Ruoli"/>
						</s:a>
					</td>
				</tr>
				</s:iterator>
		</table>
   <div style="margin-bottom:30px;" id="numeriPagina">
			Pagina <s:property value="#request['pagina_attuale']"/> di <s:property value="#request['nPagine']"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<s:if test="#request['pagina_attuale'] == 1">
				<s:a href=""> Prev - </s:a>
			</s:if>
			<s:else>
				<s:a href="viewListaAccount.action?pag=%{#request['pagina_precedente']}">Prev - </s:a>
			</s:else>
			<s:iterator value="#request['pagine']" var="pag">
				<s:a href="viewListaAccount.action?pag=%{#pag}"><s:property value="%{#pag}"/> - </s:a>
			</s:iterator>
			<s:if test="#request['pagina_attuale'] == #request['nPagine']">
				<s:a href=""> Next  </s:a>
			</s:if>
			<s:else>
				<s:a href="viewListaAccount.action?pag=%{#request['pagina_successiva']}">Next </s:a>
			</s:else>
	</div>
   </s:if>
</div>
<br>
<br>