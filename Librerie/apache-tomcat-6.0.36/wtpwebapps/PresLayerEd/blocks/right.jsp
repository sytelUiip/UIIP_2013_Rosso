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


<div id="menu-destra">	
	<div>
		
		<p class="sideBarTitle" style="padding-left: 10px;"><s:if test="%{#session['utente_loggato'] != null}">Ultime News</s:if><p>
	</div>
	
<div class="lighterBackground">
    <p class="sideBarTitle" style="padding-left: 10px;">Contatti</p>
    <span class="sideBarText" style="padding-top: 10px;">
    Gruppo Rosso  <br/>
    UIIP - Reply Academy
    Ariano Irpino (AV)  <br/>
    <b>Componenti</b>:</br>
    <a href="">Martella Silvio</a></br>
    <a href="">Caprioli Maurizio</a></br>
    <a href="">Ferrentino Anna</a></br>
    <a href="">Aric&ograve Maria Emanuela</a></br>
    <a href="">Generali Marco</a></br>
    
   
    </span>
</div>
</div>
