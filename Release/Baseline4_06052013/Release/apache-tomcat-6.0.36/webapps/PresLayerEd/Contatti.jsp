<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
		
	<div style="vertical-align: middle" align="center">
		<h1><s:text name = "detAccount"/></h1>
		<div style="border:1px solid rgb( 153, 153, 153 ); padding:40px 10px 40px 10px; width: 500px; border-radius:15px 15px 15px 15px;">		
		<table border="0" cellspacing="5px" cellpadding="5px" style="border:1px solid #000; width: 400px; margin-bottom:30px;" >
		<s:if test="#request['contatto'] == 1">
		<tr><td colspan="2" align="center"><img src="./img/silvio.jpg"/></td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "nome"/></td><td style="background-color: #ffd4d4;">Silvio</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "cognome"/></td><td>Martella</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "email"/></td><td style="background-color: #ffd4d4;">silviomartella@gmail.com</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "dataNascita"/></td><td>29-07-1986</td></tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "luogoNascita"/></td><td style="background-color: #ffd4d4;">Tricase (LE)</td>
   </tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "laurea"/></td><td>Ingegneria Elettronica</td>
   </tr>
   </s:if>
   <s:elseif test="#request['contatto'] == 2">
		<tr><td colspan="2" align="center"><img src="./img/Maurizio.jpg" width="200px"/></td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "nome"/></td><td style="background-color: #ffd4d4;">Maurizio</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "cognome"/></td><td>Caprioli</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "email"/></td><td style="background-color: #ffd4d4;">mauriziocaprioli6@gmail.com</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "dataNascita"/></td><td>28-05-1986</td></tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "luogoNascita"/></td><td style="background-color: #ffd4d4;">Melfi (PZ)</td>
   </tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "laurea"/></td><td>Informatica</td>
   </tr>
   </s:elseif>
    <s:elseif test="#request['contatto'] == 3">
		<tr><td colspan="2" align="center"><img src="./img/Marco.jpg" width="200px"/></td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "nome"/></td><td style="background-color: #ffd4d4;">Marco</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "cognome"/></td><td>Generali</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "email"/></td><td style="background-color: #ffd4d4;">marco.generali_1407@yahoo.it</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "dataNascita"/></td><td>14-07-1984</td></tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "luogoNascita"/></td><td style="background-color: #ffd4d4;">Viterbo</td>
   </tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "laurea"/></td><td>Ingegneria Telecomunicazioni</td>
   </tr>
   </s:elseif>
    <s:elseif test="#request['contatto'] == 4">
		<tr><td colspan="2" align="center"><img src="./img/Emanuela.jpg" width="200px"/></td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "nome"/></td><td style="background-color: #ffd4d4;">Maria Emanuela</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "cognome"/></td><td>Aric&ograve</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "email"/></td><td style="background-color: #ffd4d4;">emanuela.arico@gmail.com</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "dataNascita"/></td><td>04-06-1990</td></tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "luogoNascita"/></td><td style="background-color: #ffd4d4;">Messina</td>
   </tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "laurea"/></td><td>Informatica</td>
   </tr>
   </s:elseif>
   <s:elseif test="#request['contatto'] == 5">
		<tr><td colspan="2" align="center"><img src="./img/Anna.jpg" width="200px"/></td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "nome"/></td><td style="background-color: #ffd4d4;">Anna</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "cognome"/></td><td>Ferrentino</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "email"/></td><td style="background-color: #ffd4d4;">anna.ferrentino@gmail.com</td></tr>
    	<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "dataNascita"/></td><td>03-03-1984</td></tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "luogoNascita"/></td><td style="background-color: #ffd4d4;">Nocera Inferiore (SA)</td>
   </tr>
   		<tr><td style="border-right:1px solid rgb( 153, 153, 153 ); border-bottom: 1px solid rgb(153, 153, 153); background-color: #EEDFE0;" width="30%"><s:text name = "laurea"/></td><td>Ingegneria Elettronica</td>
   </tr>
   </s:elseif>
   </table>
   <s:form action="viewListaAccount.action?pag=1" method="post" validate="true">
					<s:submit method="execute" key="label.indietro" align="right" />
					</s:form>
		</div>
 </div>