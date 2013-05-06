<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

	
	
	
	<div class="main">
	<div class="autenticazione">
	<s:if test="utenteTuorial == empity">
	
		<s:form action="autenticazione_login" method="post">
			Username: <s:textfield name="username" label="Username" /><br/>
			Password: <s:password name="password" label="Password" /><br/>
			<s:submit name="submit" value="Login"/>
		</s:form>
	
	</s:if>
	<s:else>
		<s:form action="autenticazione_logout" method="post">
			Ciao <strong></strong><s:property value="utenteTuorial"/></strong>
			<s:submit name="submit" value="Logout"/>
		</s:form>
	</s:else>
	</div>
	<br/>
	<br/>
	<a href="concatena_input.action">Prova la Concatena Action</a>
	<br/><br/>
	<a href="testvalidazione_input.action">Prova la Action di Validazione</a>
	<br/>
	<br/>
	<br/>
	<br/>
	
	<br/>
	<br/>
	<br/>
	<br/>
	</div>
	