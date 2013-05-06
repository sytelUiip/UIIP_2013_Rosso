<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/intro.css" media="all">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	 <div id="header">
	    <div class="midHeader">
	        <h1 class="headerTitle"><IMG src="img/logo.png" ALIGN="bottom"></h1>
	    </div>

	    <div class="subHeader">
	    </div>
	 </div>
	 <div style="float:left; background-color: #fff5f5;">
	 	<div id="side-bar">	
			<div>
			</div>
		</div>
	 </div>
	 <div style="float:left; width:63%; background-color: #fff5f5;">
	 		<div style="vertical-align: middle;" align= center>
				<h1><s:text name = "eseguiLogin"/></h1>
				<div style="margin-top:40px;">
				<s:actionerror />
				<s:form action="login.action" method="post" validate="true">
				    <s:textfield name="username" key="label.username" size="40" style="margin-top:10px;" />
				    <s:password name="password" key="label.password" size="40" style="margin-top:10px;"/>
				    <s:submit method="execute" key="label.login" align="center" style="margin-top:10px;"/>
				</s:form>
				 <s:url id="localeEN" namespace="/" action="locale" >
   					<s:param name="request_locale">en</s:param>
				</s:url>
				 <s:url id="localeIT" namespace="/" action="locale" >
   					<s:param name="request_locale">it</s:param>
				</s:url>
				<s:a href="%{localeEN}" >English</s:a>
				<s:a href="%{localeIT}" >Italiano</s:a>
				</div>
			</div>		
	 </div>
	 <div style="float:right; width:20%; background-color: #fff5f5;">
	 <div id="menu-destra">	
		<div>
			<p class="sideBarTitle" style="padding-left: 10px;"><p>
		</div>
	
		<div class="lighterBackground">
		   <p class="sideBarTitle" style="padding-left: 10px;"> <s:text name = "contatti"/></p>
		    <span class="sideBarText" style="padding-top: 10px;">
		    Gruppo Rosso  <br/>
		    UIIP - Reply Academy
		    Ariano Irpino (AV)  <br/>
		   <b><s:text name = "componenti"/></b>:</br>
		    <a href="">Martella Silvio</a></br>
		    <a href="">Caprioli Maurizio</a></br>
		    <a href="">Ferrentino Anna</a></br>
		    <a href="">Aric&ograve Maria Emanuela</a></br>
		    <a href="">Generali Marco</a></br>
    		</span>
		</div>
	 </div>
	 </div>
	 <div id="footer">
    	<div class="left">
        	Sistema Editoriale Gruppo Rosso. Copyright 2013 Gruppo Rosso. Tutti i contenuti e i marchi presenti nell'applicazione sono di propriet&agrave; di Gruppo Rosso Editoriale e non possono essere copiati.<br/>
    	</div>
	</div>
</body>
</html>