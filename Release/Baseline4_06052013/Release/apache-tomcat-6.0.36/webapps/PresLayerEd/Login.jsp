<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div style="vertical-align: middle;" align= center>
<h1> <s:text name = "eseguiLogin"/></h1>
<div style="margin-top:40px;">
<s:actionerror />
<s:actionmessage/>
<s:form action="login.action" method="post" validate="true">
    <s:textfield name="username" key="label.username" size="40" style="margin-top:10px;"/>
    <s:password name="password" key="label.password" size="40" style="margin-top:10px;" />
    <s:submit method="execute" key="label.login" align="center" style="margin-top:10px;"/>
</s:form>
	<s:url id="localeEN" namespace="/" action="locale" >
   					<s:param name="request_locale">en</s:param>
   					</s:url> 
				<s:a href="%{localeEN}" >English</s:a>
				
				 <s:url id="localeIT" namespace="/" action="locale" >
   					<s:param name="request_locale">it</s:param>
				</s:url>
				<s:a href="%{localeIT}" >Italiano</s:a>
</div>
</div>