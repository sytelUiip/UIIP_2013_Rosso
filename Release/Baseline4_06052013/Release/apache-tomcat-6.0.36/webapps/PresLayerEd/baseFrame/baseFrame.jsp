<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/intro.css" media="all">
<script src="./js/jquery-latest.pack.js" type="text/javascript"></script>
<script src="./js/jcarousellite_1.0.1c4.js" type="text/javascript"></script>
<title><tiles:insertAttribute name="title" ignore="true" /></title>

</head>
<body>

<%-- 	 <tiles:insertAttribute name="header" /> --%>
<!-- 	 <div style="float:left; background-color: #fff5f5;"> -->
<%-- 	 	<tiles:insertAttribute name="menu" /> --%>
<!-- 	 </div> -->
<!-- 	 <div style="float:left; width:63%; background-color: #fff5f5;"> -->
<%-- 	 		<tiles:insertAttribute name="body" />		 --%>
<!-- 	 </div> -->
<!-- 	 <div style="float:right; width:20%; background-color: #fff5f5;"> -->
<%-- 	 <tiles:insertAttribute name="right"/> --%>
<!-- 	 </div> -->
<%-- 	 <tiles:insertAttribute name="footer" /> --%>

 <tiles:insertAttribute name="header" />
<!--  <div style="float:left; background-color: #fff5f5;"> -->
<%--  <tiles:insertAttribute name="menu" /> --%>
<!--  </div> -->
<!--  <div style="float:left; width:63%; background-color: #fff5f5;"> -->
<%--  <tiles:insertAttribute name="body" /> --%>
<!--  </div> -->
<!--  <div style="float:right; width:20%; background-color: #fff5f5;"> -->
<%--  <tiles:insertAttribute name="right"/> --%>
<!--  </div> -->
<%--  <tiles:insertAttribute name="footer" /> --%>
 
<!--  <div id='container'> -->
<!--             <div id="sx" style="display: inline"> -->
<%--                 <tiles:insertAttribute name="menu" /> --%>
<!--             </div> -->
<!--             <div id="bod"> -->
<%--             	<tiles:insertAttribute name="body" /> --%>
<!--             </div> -->
<!--           	<div id="dx"> -->
<%--               	<tiles:insertAttribute name="right"/> --%>
<!--             </div> -->
<%--            <div id="fot"><tiles:insertAttribute name="footer" /></div> --%>
<!--         </div> -->

<!-- <div style="min-height: 650px; height: auto !important; height: 650px;background-color: yellow;"> -->
<%-- 		<div style="height: auto !important; height: 100%; background-color: #fff5f5;"><tiles:insertAttribute name="menu" /> --%>
<!-- 		</div> -->
<!-- </div> -->
<table width="100%" height="100%" style="min-height: 450px; height: auto !important; height: 450px;">
	<tr style="height: 450px; vertical-align: top; border:1px solid #000; "><td style="width: 190px; background-color: #ffd4d4;"><tiles:insertAttribute name="menu" /></td>
	<td><tiles:insertAttribute name="body" /></td>
	<td style="background-color: #ffd4d4; width: 200px;"><tiles:insertAttribute name="right"/></td>
	</tr>
	<tr><td colspan="3"><tiles:insertAttribute name="footer" /></td></tr>
</table>

</body>
</html>