<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1><s:text name = "modNotizia"/></h1>
				<s:actionerror />
				<s:actionmessage/>
					<s:form action="updateNotizia.action" method="post" validate="true">
    					<s:textfield name="titolo" key="label.titolo" size="70"  value="%{#session['notizia_update'].titolo}" />
    					<s:textfield name="sotto_titolo" key="label.sotto_titolo" size="90" value="%{#session['notizia_update'].sottoTitolo}" />
    					<s:textarea name="testo"  key="label.testo" cols="70" rows="10" value="%{#session['notizia_update'].testo}">
    					</s:textarea>
    					<s:hidden name="id_old" value="%{#session['notizia_update'].id}" />
    					<s:submit method="execute" key="label.registraNotizia" align="center" />
   						</s:form>
					<s:form action="annullaNotizia.action" method="post" validate="true">
    				<s:hidden name="idNotizia" value="%{#session['notizia_update'].id}" />
					<s:submit method="execute" key="label.annulla" align="right" />
					</s:form>
					<s:form action="viewListaNotizie.action?pag=1" method="post" validate="true">
					<s:submit method="execute" key="label.indietro" align="right" />
					</s:form>
			</div>