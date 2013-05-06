<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1>Gestione ruoli Account</h1>
		<div>
		<div style="border:1px solid rgb( 153, 153, 153 ); padding:40px 10px 20px 10px; margin-top:50px; width: 600px; border-radius:15px 15px 15px 15px;">
			<s:if test="#request['privilegi'] == 'Am'">
				<div style="font-size:18px;"><s:text name = "utenteDiTipoAmministratore"/></br> <s:a href="aggiungiRuoloAccount.action?username=%{#request.utenteId}"><s:text name = "cliccaQui"/></s:a> <s:text name = "msg4"/></div>
			</s:if>
			<s:elseif test="#request['privilegi'] == 'Gi'">
				<div style="font-size:18px;"><s:text name = "utenteDiTipoGiornalista"/></br><s:text name = "msg2"/></div>
			</s:elseif>
			<s:elseif test="#request['privilegi'] == 'AmGi'">
				<div style="font-size:18px;"><s:text name = "msg3"/></br> <s:a href="rimuoviRuoloAccount.action?username=%{#request.utenteId}"><s:text name = "cliccaQui"/></s:a> <s:text name = "msg5"/></div>
			</s:elseif>
			
			<div align="right" style="margin-right:10px; margin-top:30px;">
						<s:form action="viewListaAccount.action?pag=1" method="post" validate="true">
						<s:submit method="execute" key="label.indietromod" align="center" />
					</s:form>
			</div>
		</div>
		</div>
				
		
   
 </div>