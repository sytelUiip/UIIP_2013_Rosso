<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/intro.css" media="all">
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
<!-- <table border="1" cellpadding="2" cellspacing="2" align="center"> -->
<!--     <tr> -->
<%--         <td colspan="2"><tiles:insertAttribute name="header" /> --%>
<!--         </td> -->
<!--     </tr> -->
<!--     <tr> -->
<%--         <td><tiles:insertAttribute name="menu" /></td> --%>
<%--         <td style="vertical-align:top"><div class="content"><tiles:insertAttribute name="body" /></div></td> --%>
<!--     </tr> -->
<!--     <tr> -->
<%--         <td colspan="2"><tiles:insertAttribute name="footer" /> --%>
<!--         </td> -->
<!--     </tr> -->
<!-- </table> -->
<!-- 	<table> -->
<%-- 	<tr colspan="3"><td><tiles:insertAttribute name="header" /></td></tr> --%>
<!-- 	<tr -->
	
<!-- 	</table> -->
	 <tiles:insertAttribute name="header" />
	 <div style="float:left; background-color: #fff5f5;">
	 	<tiles:insertAttribute name="menu" />
	 </div>
	 <div style="float:left; width:63%; background-color: #fff5f5;">
	 		<tiles:insertAttribute name="body" />		
	 </div>
	 <div style="float:right; width:20%; background-color: #fff5f5;">
	 <tiles:insertAttribute name="right"/>
	 </div>
	 <tiles:insertAttribute name="footer" />
</body>
</html>