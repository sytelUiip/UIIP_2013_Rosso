<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- <div class="header"> -->
<!-- 	<h1>Sistema Editoriale</h1> -->
	
<!--   <p>   -->
<%-- 	<s:if test="%{#session['utente_loggato'] != null}"> --%>
<%-- 		<h3 style="vertical-align: bottom; text-align: right;">Benvenuto ${utente_loggato.nome} ${utente_loggato.cognome} </h3> --%>
<%-- 		<s:a href="logout.action">Logout</s:a> --%>
<%-- 	</s:if> --%>
<!--   </p> -->
<!-- 	<!-- <p><s:a href="logout">Logout</s:a></p> -->
<!-- </div> -->

<div id="header">
    <div class="midHeader">
        <h1 class="headerTitle"><IMG src="img/logo.png" ALIGN="bottom"></h1>
    </div>

    <div class="subHeader">
    		<s:if test="%{#session['utente_loggato'] != null}"> 
 				<h3 style="vertical-align: bottom; text-align: left;"><s:text name = "benvenuto"/> ${utente_loggato.nome} ${utente_loggato.cognome}! (<s:a href="logout.action">Logout</s:a>)</h3>		
 			</s:if>
    </div>
</div>
