<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1><s:text name = "detNotizia"/></h1>
		
		<div style="margin-top:30px;"><s:actionerror />
		<s:actionmessage/></div>
		<div style="border:1px solid rgb( 153, 153, 153 ); padding:40px 10px 40px 10px; margin-bottom:40px; width: 700px; border-radius:15px 15px 15px 15px;">	
		<table border="0" cellspacing="5px" cellpadding="5px" style="border:1px solid #000; width:600px; margin-bottom:30px; margin-left:17px;">
		     <tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b><s:text name = "titolo"/></b></td><td style="background-color: #ffd4d4;">${notizia_caricata.titolo}</td></tr>
		     <tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b><s:text name = "sottotitolo"/></b></td><td>${notizia_caricata.sottoTitolo}</td></tr>
		    <tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b><s:text name = "autore"/></b></td><td style="background-color: #ffd4d4;">${notizia_caricata.autore}</td></tr>
		    <tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b><s:text name = "data"/>&nbsp;<s:text name = "creazione"/></b></td><td>${notizia_caricata.dataCreazione}</td></tr>
		    <tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b><s:text name = "data"/>&nbsp;<s:text name = "trasmissione"/></b></td><td style="background-color: #ffd4d4;">${notizia_caricata.dataTrasmissione}</td></tr>
		    <tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b><s:text name = "stato"/></b></td><td>${notizia_caricata.stato}</td></tr>
		   	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b>Lock</b></td><td style="background-color: #ffd4d4;">${notizia_caricata.lock}</td></tr>
		   	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b><s:text name = "ultimo"/>&nbsp;<s:text name = "digitatore"/></b></td><td>${notizia_caricata.ultimoDigitatore}</td></tr>
		   	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b><s:text name = "lunghTesto"/></b></td><td style="background-color: #ffd4d4;">${notizia_caricata.lunghezzaTesto}</td></tr>
		   	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="20%"><b><s:text name = "testo"/></b></td><td>${notizia_caricata.testo}</td></tr>
		</table>
		<s:form action="viewListaNotizie.action?pag=1" method="post" validate="true">
					<s:submit method="execute" key="label.indietro" align="right" />
					</s:form>
		</div>
 </div>