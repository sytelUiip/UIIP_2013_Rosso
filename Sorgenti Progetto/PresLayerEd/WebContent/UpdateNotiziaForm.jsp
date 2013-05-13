<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1><s:text name = "modNotizia"/></h1>
		<div style="border:1px solid rgb( 153, 153, 153 ); padding:40px 20px 40px 10px; width: 700px; border-radius:15px 15px 15px 15px; margin-bottom:30px;padding-right:30px;">
				<s:actionerror />
				<s:actionmessage/>
					<s:form action="updateNotizia.action" method="post" validate="true">
						
    					<s:textfield name="titolo" key="label.titolo" size="94"  value="%{#session['notizia_update'].titolo}" style="margin-top:10px;"/>
    					<s:textfield name="sotto_titolo" key="label.sotto_titolo" size="94" value="%{#session['notizia_update'].sottoTitolo}" style="margin-top:10px;"/>
    					<s:textarea name="testo"  key="label.testo" cols="70" rows="10" value="%{#session['notizia_update'].testo}" style="margin-top:10px;">
    					</s:textarea>
    					<s:hidden name="id_old" value="%{#session['notizia_update'].id}" />
    					<s:submit method="execute" key="label.registraNotizia" align="center" style="margin-top:20px;" />
<!-- 					<table cellpadding="2"> -->
<%--     					<tr><td><s:textfield name="titolo" key="label.titolo" size="94"  value="%{#session['notizia_update'].titolo}" /></td></tr> --%>
<%--     					<tr><td><s:textfield name="sotto_titolo" key="label.sotto_titolo" size="94" value="%{#session['notizia_update'].sottoTitolo}" /></td></tr> --%>
<%--     					<tr><td><s:textarea name="testo"  key="label.testo" cols="70" rows="10" value="%{#session['notizia_update'].testo}"> --%>
<%--     					</s:textarea></td></tr> --%>
<%--     					<s:hidden name="id_old" value="%{#session['notizia_update'].id}" /> --%>
<%--     					<tr><td style="padding-top:30px;"><s:submit method="execute" key="label.registraNotizia" align="center" /></td></tr> --%>
<!--     				</table> -->
   					</s:form>
   					<div style="margin-top:-31px; margin-right:190px;" align="right">
					<s:form action="annullaNotizia.action" method="post" validate="true">
    				<s:hidden name="idNotizia" value="%{#session['notizia_update'].id}" />
					<s:submit method="execute" key="label.annulla" align="right" />
					</s:form>
					</div>
					<div align="right" style="margin-right:10px; margin-top:30px; margin-bottom:-20px;">
					<s:form action="viewListaNotizie.action?pag=1" method="post" validate="true">
					<s:submit method="execute" key="label.indietro" align="right" />
					</s:form>
					</div>
			</div>
			</div>