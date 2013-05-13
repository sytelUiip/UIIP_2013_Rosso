<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div style="vertical-align: middle" align="center">
	<h1><s:text name="listaNotizie"></s:text></h1>
	<div><img src="./img/News_image.jpg" style="margin-left:140px; width:250px;"/><img src="./icon/istruzioni.png" style="margin-left:20px; width:250px;"/></div>
	<s:form action="viewListaNotizie.action" method="post" validate="true">
		<s:textfield name="testo_ricerca" size="60" />
		<select name="filtroParametro" id="filtroParametroId" style="float:right; margin-left:-200px; margin-right:170px; margin-top:5px; margin-bottom:10px;">  
     			<option value="all" selected><s:text name = "tutteLeNotizie"/></option>  
     			<option value="autore"><s:text name = "autore"/></option>  
     			<option value="titolo"><s:text name = "titolo"/></option>  
     			<option value="stato"><s:text name = "stato"/></option>   
     	</select>
     	<s:hidden name="pag" value="1" />
	<s:submit method="execute" key="label.CercaNotizia" align="right"/>
	</s:form>
	</div>
	
	<div align="center" style="margin-top:50px; margin-left:20px;">
	<s:actionerror />
	<s:actionmessage/>
	
	<s:if test="#request['lista_notizie'] != null">
	<div style="margin-bottom:30px; margin-top:30px;" id="numeriPagina"><s:text name="elementiTrovati"></s:text><s:property value="%{#request.nNotizie}"/></div>
		<table id="lista_news_autore" cellspacing="0" cellpadding="5px" style="border:1px solid #000; margin-bottom:40px;" >
    		<tr style="background-color: #EEDFE0;">
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "titolo"/></th>
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "autore"/></th>
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "data"/><br> <s:text name = "creazione"/></th>
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "data"/><br> <s:text name = "trasmissione"/></th>
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "stato"/></th>
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); ">Lock</th>
    			<th style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "ultimo"/> <br> <s:text name = "digitatore"/></th>
				<th style="border-bottom: 1px solid rgb(153, 153, 153); "><s:text name = "gestisciNotizie"/></th>
			</tr>
			<s:iterator value="#request['lista_notizie']" var="notizie_autore">
				<tr style="border-bottom: 1px solid rgb(153, 153, 153);">
					<td style="border-bottom: 1px solid rgb(153, 153, 153); border-right:1px solid rgb( 153, 153, 153 ); width: 100px;">
						${notizie_autore.titolo}</td>
					<td style="border-bottom: 1px solid rgb(153, 153, 153); border-right:1px solid rgb( 153, 153, 153 );">
						${notizie_autore.autore}</td>
					<td	style="border-right: 1px solid rgb(153, 153, 153); border-bottom: 1px solid rgb(153, 153, 153);">
						${notizie_autore.dataCreazione}</td>
					<td	style="border-right: 1px solid rgb(153, 153, 153); border-bottom: 1px solid rgb(153, 153, 153);">
						${notizie_autore.dataTrasmissione}</td>
					<td	style="border-right: 1px solid rgb(153, 153, 153); border-bottom: 1px solid rgb(153, 153, 153);">
						<s:if test='#request["notizie_autore"].stato=="S"'><img src="icon/editabile.png" height="25px;" title="Notizia Editabile"/></s:if>
						<s:elseif test='#request["notizie_autore"].stato=="T"'><img src="icon/icon_trasmessa.png" height="25px;" title="Notizia Trasmessa"/></s:elseif>
						<s:elseif test='#request["notizie_autore"].stato=="Q"'><img src="icon/intrasmissione.png" height="25px;" title="Notizia In Trasmissione"/></s:elseif>
						<s:elseif test='#request["notizie_autore"].stato=="C"'><img src="icon/cancellata.png" height="25px;" title="Notizia In Trasmissione"/></s:elseif>
					</td>
					<td	style="border-right: 1px solid rgb(153, 153, 153); border-bottom: 1px solid rgb(153, 153, 153);">
					<s:if test='#request["notizie_autore"].lock=="N"'><img src="icon/icon_unlock.png" height="25px;" title="Notizia Sbloccata"/></s:if>
					<s:elseif test='#request["notizie_autore"].lock=="Y"'><img src="icon/icon_lock.png" height="25px;" title="Notizia Bloccata"/></s:elseif></td>
					<td	style="border-right: 1px solid rgb(153, 153, 153); border-bottom: 1px solid rgb(153, 153, 153);">
						${notizie_autore.ultimoDigitatore}</td>
					<td style="border-right: 1px solid rgb(153, 153, 153); border-bottom: 1px solid rgb(153, 153, 153);">
					<div>
						<s:a href="viewNotizia.action?idNotizia=%{#notizie_autore.id}">
							<img src="icon/icon_dettagli_notizia.png" height="25px;" title="Visualizza i Dettagli della Notizia"/>
						</s:a>		
					<s:if test="#session['privilegi'] == 'Am'">
					</s:if>
					<s:elseif test="#session['privilegi'] == 'Gi'">
						<s:a href="viewUpdateNotizia.action?idNotizia=%{#notizie_autore.id}">
							<img src="icon/icon_mod_notizia.png" height="25px;" title="Modifica la Notizia"/>
						</s:a>
						<s:a href="cancellaNotizia.action?idNotizia=%{#notizie_autore.id}">
							<img src="icon/icon_delete_notizia.png" height="25px;" title="Cancella la Notizia"/>
						</s:a>
						<s:a href="trasmettiNotizia.action?idNotizia=%{#notizie_autore.id}">
							<img src="icon/icon_trasm_notizia.png" height="25px;" title="Trasmetti la Notizia"/>
						</s:a>
					</s:elseif>
			<s:elseif test="#session['privilegi'] == 'AmGi'">
						<s:a href="viewUpdateNotizia.action?idNotizia=%{#notizie_autore.id}">
							<img src="icon/icon_mod_notizia.png" height="25px;" title="Modifica la Notizia"/>
						</s:a>
						<s:a href="cancellaNotizia.action?idNotizia=%{#notizie_autore.id}">
							<img src="icon/icon_delete_notizia.png" height="25px;" title="Cancella la Notizia"/>
						</s:a>
						<s:a href="trasmettiNotizia.action?idNotizia=%{#notizie_autore.id}">
							<img src="icon/icon_trasm_notizia.png" height="25px;" title="Trasmetti la Notizia"/>
						</s:a>
			</s:elseif>
		</div>
					</td>
				</tr>
				</s:iterator>
		</table>
<!-- 			<s:iterator value="#request['lista_notizie']" var="notizie_autore">
				<table id="lista_acc" cellspacing="0" cellpadding="5" align="center" style="margin-bottom:30px; margin-top:30px; margin-left:45px; margin-right:45px; border:1px dotted #CCC; width: 550px;">
					<tr><td align="left" width="15%" style="background-color:#e93939; padding-left:10px;"><b>Titolo:</b></td><td align="left" style="padding-left:10px; background-color:#ffd4d4;"><b>${notizie_autore.titolo}</b><td width="10%"><s:a href="viewNotizia.action?idNotizia=%{#notizie_autore.id}"><img src="icon/icon_dettagli_notizia.png" height="10%" alt="dettagli notizia"/>
</s:a></td></tr>
					<tr style="border:1px dotted #CCC;"><td align="left" valign="top" style="background-color:#e93939; padding-left:10px;"><b> Autore: </b></td><td align="left" style="border:1px dotted #CCC; padding-left:10px;"><div>${notizie_autore.autore}</div></td><td><s:a href="viewUpdateNotizia.action?idNotizia=%{#notizie_autore.id}"><img src="icon/icon_mod_notizia.png" height="10%" alt="modifica notizia"/></s:a></td></tr>
					<tr><td align="left" style="background-color:#e93939; padding-left:10px;"><b> Stato:</b></td><td align="left" style="border:1px dotted #CCC; padding-left:10px; background-color:#ffd4d4;">${notizie_autore.stato}</td><td><s:a href="cancellaNotizia.action?idNotizia=%{#notizie_autore.id}"><img src="icon/icon_delete_notizia.png" height="10%" alt="cancella notizia"/></s:a></td></tr>
					<tr><td align="left" style="background-color:#e93939; padding-left:10px;"><b> Lock notizia:</b></td><td align="left" style="border:1px dotted #CCC; padding-left:10px;">${notizie_autore.lock}</td><td><s:a href="trasmettiNotizia.action?idNotizia=%{#notizie_autore.id}"><img src="icon/icon_trasm_notizia.png" height="10%" alt="trasmetti notizia"/></s:a></td></tr>
					<tr><td align="left" style="background-color:#e93939; padding-left:10px;"><b> Ultimo digitatore:</b></td><td align="left" style="border:1px dotted #CCC; padding-left:10px; background-color:#ffd4d4;">${notizie_autore.ultimoDigitatore}</td></tr>
 					<tr style="border:1px dotted #CCC;"><td align="left" valign="top" style="background-color:#e93939; padding-left:10px;"><b> Data Creazione:</b></td><td align="left" style="border:1px dotted #CCC; padding-left:10px;">${notizie_autore.dataCreazione}</td></tr> 
					<tr><td align="left" style="background-color:#e93939; padding-left:10px;"><b> Data Trasmissione:</b></td><td align="left" style="border:1px dotted #CCC; padding-left:10px; background-color:#ffd4d4;">${notizie_autore.dataTrasmissione}</td></tr>
				</table>
			
			</s:iterator>-->
			
			<div style="margin-bottom:30px; margin-top:30px;" id="numeriPagina">
			Pagina <s:property value="#request['pagina_attuale']"/> di <s:property value="#request['nPagine']"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<s:if test="#request['pagina_attuale'] == 1">
				<s:a href=""> Prev - </s:a>
			</s:if>
			<s:else>
				<s:a href="viewListaNotizie.action?pag=%{#request['pagina_precedente']}">Prev - </s:a>
			</s:else>
			<s:iterator value="#request['pagine']" var="pag">
				<s:a href="viewListaNotizie.action?pag=%{#pag}"><s:property value="%{#pag}"/> - </s:a>
			</s:iterator>
			<s:if test="#request['pagina_attuale'] == #request['nPagine']">
				<s:a href=""> Next  </s:a>
			</s:if>
			<s:else>
				<s:a href="viewListaNotizie.action?pag=%{#request['pagina_successiva']}">Next </s:a>
			</s:else>
			</div>
			<div style="margin-bottom:30px;">
			<s:if test="#session['privilegi'] == 'Gi' || #session['privilegi'] == 'AmGi'">
			<s:form action="annullaListaNotizia.action" method="post" validate="true">
			<s:submit method="execute" key="sbloccaNotizie" align="center" />
			</s:form>
			</s:if>
			</div>
	</s:if>
	<s:else><h2><s:text name = "msg1"/></h2>
	</s:else>
	</div>