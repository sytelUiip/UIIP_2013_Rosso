<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1><s:text name = "detNotizia"/></h1>
		
		<s:actionerror />
		<s:actionmessage/>		
		<table border="0" cellspacing="5px" cellpadding="5px" style="border:1px solid #000; width:600px; margin-bottom:30px; ">
		     <tr><td><s:text name = "titolo"/></td><td>${notizia_caricata.titolo}</td></tr>
		    <tr><td><s:text name = "sottotitolo"/></td><td>${notizia_caricata.sottoTitolo}</td></tr>
		    <tr><td><s:text name = "autore"/></td><td>${notizia_caricata.autore}</td></tr>
		    <tr><td><s:text name = "data"/>&nbsp;<s:text name = "creazione"/></td><td>${notizia_caricata.dataCreazione}</td></tr>
		    <tr><td><s:text name = "data"/>&nbsp;<s:text name = "trasmissione"/></td><td>${notizia_caricata.dataTrasmissione}</td></tr>
		    <tr><td><s:text name = "stato"/></td><td>${notizia_caricata.stato}</td></tr>
		   	<tr><td>Lock</td><td>${notizia_caricata.lock}</td></tr>
		   	<tr><td><s:text name = "ultimo"/>&nbsp;<s:text name = "digitatore"/></td><td>${notizia_caricata.ultimoDigitatore}</td></tr>
		   	<tr><td><s:text name = "lunghTesto"/></td><td>${notizia_caricata.lunghezzaTesto}</td></tr>
		   	<tr><td><s:text name = "testo"/></td><td>${notizia_caricata.testo}</td></tr>
		</table>
		<s:form action="viewListaNotizie.action?pag=1" method="post" validate="true">
					<s:submit method="execute" key="label.indietro" align="right" />
					</s:form>
 </div>