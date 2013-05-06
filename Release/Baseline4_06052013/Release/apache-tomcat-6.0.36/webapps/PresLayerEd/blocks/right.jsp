<%@page import="javax.mail.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- <div class="menu"> -->
<!-- 	<table> -->
<%-- 	<s:iterator value="#session['funzionalita']" var="funzioni"> --%>
<!-- 		<tr> -->
<%-- 				<td><s:a><s:property value="%{#funzioni}"/></s:a> --%>
<!-- 		</tr> -->
<%-- 	</s:iterator> --%>
<!-- 	</table> -->
<!-- </div> -->

<script type="text/javascript">
<% 
int var;
int cont = (Integer) session.getAttribute("num_slider");
if(cont<5)
{
	var = cont;
}else
{
	var = 5;
}
 %>
 var myVar = <%=var %>;
$(function() {
	$(".newsticker-jcarousellite").jCarouselLite({
		vertical: true,
		hoverPause:true,
		visible:myVar,
		auto:500,
		speed:1000
	});
});

</script>
<s:if test="%{#session['utente_loggato'] != null}">
<div id="newsticker-demo">    
    <div class="title"><s:text name = "ultimeNews"/></div>
    <br>
    <div class="newsticker-jcarousellite">
    <ul>
    <s:iterator value="#session['notizie_slider']" var="notizie_last">
            <li>
				<div class="thumbnail">
					<img src="images/1.jpg">
				</div>
				<div class="info">
					<a href="viewNotizia.action?idNotizia=${notizie_last.id}">${notizie_last.titolo}</a>
					<span class="cat">${notizie_last.sottoTitolo}</span>
				</div>
				<div class="clear"></div>
			</li>
	</s:iterator>
	</ul>
    
    
    
    
    
    
    
    
<!-- 		<ul> -->
<!--             <li> -->
<!-- 				<div class="thumbnail"> -->
<!-- 					<img src="images/1.jpg"> -->
<!-- 				</div> -->
<!-- 				<div class="info"> -->
<!-- 					<a href="http://www.vladstudio.com/wallpaper/?knight_lady">The Knight and the Lady</a> -->
<%-- 					<span class="cat">Category: Illustrations</span> --%>
<!-- 				</div> -->
<!-- 				<div class="clear"></div> -->
<!-- 			</li> -->
			
<!--             <li> -->
<!-- 				<div class="thumbnail"> -->
<!-- 					<img src="images/2.jpg"> -->
<!-- 				</div> -->
<!-- 				<div class="info"> -->
<!-- 					<a href="http://www.vladstudio.com/wallpaper/?family_of_colors">The Family of Colors</a> -->
<%-- 					<span class="cat">Category: Creatures</span> --%>
<!-- 				</div> -->
<!-- 				<div class="clear"></div> -->
<!-- 			</li> -->
<!--             <li> -->
<!-- 				<div class="thumbnail"> -->
<!-- 					<img src="images/3.jpg"> -->
<!-- 				</div> -->
<!-- 				<div class="info"> -->
<!-- 					<a href="http://www.vladstudio.com/wallpaper/?teddybear_mac">Teddy Bear and MacBook</a> -->
<%-- 					<span class="cat">Category: Photos</span> --%>
<!-- 				</div> -->
<!-- 				<div class="clear"></div> -->
<!-- 			</li> -->
<!-- 			<li> -->
<!-- 				<div class="thumbnail"> -->
<!-- 					<img src="images/4.jpg"> -->
<!-- 				</div> -->
<!-- 				<div class="info"> -->
<!-- 					<a href="http://www.vladstudio.com/wallpaper/?rainbow_butterfly">Rainbow Butterfly</a> -->
<%-- 					<span class="cat">Category: Abstract art</span> --%>
<!-- 				</div> -->
<!-- 				<div class="clear"></div> -->
<!-- 			</li> -->
<!-- 			<li> -->
<!-- 				<div class="thumbnail"> -->
<!-- 					<img src="images/5.jpg"> -->
<!-- 				</div> -->
<!-- 				<div class="info"> -->
<!-- 					<a href="http://www.vladstudio.com/wallpaper/?space_travel">Space Travel</a> -->
<%-- 					<span class="cat">Category: Abstract art</span> --%>
<!-- 				</div> -->
<!-- 				<div class="clear"></div> -->
<!-- 			</li> -->
<!-- 			<li> -->
<!-- 				<div class="thumbnail"> -->
<!-- 					<img src="images/6.jpg"> -->
<!-- 				</div> -->
<!-- 				<div class="info"> -->
<!-- 					<a href="http://www.vladstudio.com/wallpaper/?traveling_tree">The Traveling Tree</a> -->
<%-- 					<span class="cat">Category: Creatures</span> --%>
<!-- 				</div> -->
<!-- 				<div class="clear"></div> -->
<!-- 			</li> -->
<!-- 			<li> -->
<!-- 				<div class="thumbnail"> -->
<!-- 					<img src="images/6.jpg"> -->
<!-- 				</div> -->
<!-- 				<div class="info"> -->
<!-- 					<a href="http://www.vladstudio.com/wallpaper/?traveling_tree">The Traveling Tree</a> -->
<%-- 					<span class="cat">Category: Creatures</span> --%>
<!-- 				</div> -->
<!-- 				<div class="clear"></div> -->
<!-- 			</li> -->
<!-- 			<li> -->
<!-- 				<div class="thumbnail"> -->
<!-- 					<img src="images/6.jpg"> -->
<!-- 				</div> -->
<!-- 				<div class="info"> -->
<!-- 					<a href="http://www.vladstudio.com/wallpaper/?traveling_tree">The Traveling Tree</a> -->
<%-- 					<span class="cat">Category: Creatures</span> --%>
<!-- 				</div> -->
<!-- 				<div class="clear"></div> -->
<!-- 			</li> -->
<!--         </ul> -->
    </div>
   
</div>
</s:if>
 <div class="lighterBackground" style="vertical-align: bottom;">
		    <p class="sideBarTitle" style="padding-left: 10px;"><s:text name = "contatti"/></p>
		    <span class="sideBarText" style="padding-top: 10px;">
		    Gruppo Rosso  <br/>
		    UIIP - Reply Academy
		    Ariano Irpino (AV)  <br/>
		    <b><s:text name = "componenti"/></b>:</br>
		    <a href="viewContatto?id=1">Martella Silvio</a></br>
		    <a href="viewContatto?id=2">Caprioli Maurizio</a></br>
		    <a href="viewContatto?id=5">Ferrentino Anna</a></br>
		    <a href="viewContatto?id=4">Aric&ograve Maria Emanuela</a></br>
		    <a href="viewContatto?id=3">Generali Marco</a></br>
		    </span>
		</div>


<!-- <div id="menu-destra">	 -->
<!-- 	<div> -->
<%-- 		<p class="sideBarTitle" style="padding-left: 10px;"><s:if test="%{#session['utente_loggato'] != null}"><s:text name = "ultimeNews"/></s:if><p> --%>
<!-- 		<div class="lighterBackground" style="vertical-align: bottom;"> -->
<%-- 		    <p class="sideBarTitle" style="padding-left: 10px;"><s:text name = "contatti"/></p> --%>
<%-- 		    <span class="sideBarText" style="padding-top: 10px;"> --%>
<!-- 		    Gruppo Rosso  <br/> -->
<!-- 		    UIIP - Reply Academy -->
<!-- 		    Ariano Irpino (AV)  <br/> -->
<%-- 		    <b><s:text name = "componenti"/></b>:</br> --%>
<!-- 		    <a href="">Martella Silvio</a></br> -->
<!-- 		    <a href="">Caprioli Maurizio</a></br> -->
<!-- 		    <a href="">Ferrentino Anna</a></br> -->
<!-- 		    <a href="">Aric&ograve Maria Emanuela</a></br> -->
<!-- 		    <a href="">Generali Marco</a></br> -->
<%-- 		    </span> --%>
<!-- 		</div> -->
<!-- 	</div> -->
<!-- </div> -->
