<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div style="vertical-align: middle;" align= center>
<h1>Esegui Login</h1>
<div style="margin-top:40px;">
<s:actionerror />
<s:form action="login.action" method="post" validate="true">
    <s:textfield name="username" key="label.username" size="40" />
    <s:password name="password" key="label.password" size="40" />
    <s:submit method="execute" key="label.login" align="center" />
</s:form>
</div>
</div>