<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- <div class="menu"> -->
<!-- 	<table> -->
<%-- 	<s:iterator value="#session['funzionalita']" var="funzioni"> --%>
<!-- 		<tr> -->
<%-- 				<td><s:a><s:property value="%{#funzioni}"/></s:a> --%>
<!-- 		</tr> -->
<%-- 	</s:iterator> --%>
<!-- 	</table> -->
<!-- </div> -->


<div id="side-bar">	
	<div>
		<s:if test="%{#session['utente_loggato'] != null}">
		<p class="sideBarTitle" style="padding-left: 20px;">Agenzia Editoriale<p>
		<ul style="margin-top:30px;">
			<s:iterator value="#session['funzionalita']" var="funzioni"> 
	 		<li>
	 			<s:if test="%{#funzioni == 'Crea account'}">
	 				<s:a href="viewInsertAccount.action"><s:property value="%{#funzioni}"/></s:a>
				</s:if>
				<s:elseif test="%{#funzioni == 'Cancella account' or #funzioni == 'Modifica account'}">
					<s:a href="viewListaAccount.action"><s:property value="%{#funzioni}"/></s:a>
				</s:elseif>
				<s:elseif test="%{#funzioni == 'Lista account'}">
					<s:a href="viewListaAccount.action"><s:property value="%{#funzioni}"/></s:a>
				</s:elseif>
				<s:else>
					<s:a href=""><s:property value="%{#funzioni}"/></s:a>
				</s:else>
			</li>
			</s:iterator>
			<li></li>		
		</ul>
		</s:if>
	</div>
</div>
