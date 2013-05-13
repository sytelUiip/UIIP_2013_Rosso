<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
	<h1><s:text name = "inserisciNotizia"/></h1>
	<div style="border:1px solid rgb( 153, 153, 153 ); padding:40px 20px 40px 10px; width: 700px; border-radius:15px 15px 15px 15px; margin-bottom:30px;">
				<s:actionerror />
				<s:actionmessage/>
					<s:form action="insertNotizia.action" method="post" validate="true">
						
    					<s:textfield name="titolo" key="label.titolo" size="94" style="margin-top:10px;" />
    					<s:textfield name="sotto_titolo" key="label.sotto_titolo" size="94" style="margin-top:10px;" />
    					<s:textarea name="testo"  key="label.testo" cols="70" rows="10" style="margin-top:10px;">
    					</s:textarea>
    					<s:submit method="execute" key="label.insertNotizia" align="center" style="margin-top:20px;"/>
    				
<!-- 					<table cellpadding="2"> -->
<%--     					<tr><td><s:textfield name="titolo" key="label.titolo" size="94" /></td></tr> --%>
<%--     					<tr><td><s:textfield name="sotto_titolo" key="label.sotto_titolo" size="94" /></td></tr> --%>
<%--     					<tr><td><s:textarea name="testo"  key="label.testo" cols="70" rows="10"> --%>
<%--     					</s:textarea></td></tr> --%>
<%--     					<tr><td style="padding-top:30px;"><s:submit method="execute" key="label.insertNotizia" align="center" /></td></tr> --%>
<!--     				</table> -->
					</s:form>
					<div align="right" style="margin-right:10px; margin-top:30px; margin-bottom:-20px;">
						<s:form action="viewListaNotizie.action?pag=1" method="post" validate="true">
						<s:submit method="execute" key="label.indietromod" align="center" />
					</s:form>
					</div>
	</div>
</div>