<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="block" style="height: auto !important; height: 100%">
    <div class="section">
    	<s:if test="%{#session['utente_loggato'] != null}">
    	<p class="sideBarTitle" style="padding-left: 20px;"><s:text name = "agenziaEditoriale"/><p>
    		<s:if test="#session['privilegi'] == 'Am'">
    			<p><a href="viewInsertAccount.action" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "creaAccount"/></span></a></p>
    			<p><a href="viewListaAccount.action?pag=1" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "listaAccount"/></span></a></p>
    			<p><a href="viewListaAccount.action?pag=1" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "gestioneAccount"/></span></a></p>
    			<p><a href="viewListaNotiziaTot.action" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "listaNotizie"/></span></a></p>
    		</s:if>
    		<s:elseif test="#session['privilegi'] == 'Gi'">
    			<p><a href="viewinsertNotizia.action" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "inserisciNotizia"/></span></a></p>
    			<p><a href="viewListaNotiziaTot.action" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "listaNotizie"/></span></a></p>
    			<p><a href="viewListaNotiziaTot.action" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "gestioneNotizie"/></span></a></p>
    		</s:elseif>
    		<s:elseif test="#session['privilegi'] == 'AmGi'">
    			<p><a href="viewInsertAccount.action" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "creaAccount"/></span></a></p>
    			<p><a href="viewListaAccount.action?pag=1" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "listaAccount"/></span></a></p>
    			<p><a href="viewListaAccount.action?pag=1" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "gestioneAccount"/></span></a></p>
    			<div class="section green">
    				<p><a href="viewinsertNotizia.action" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "inserisciNotizia"/></span></a></p>
    				<p><a href="viewListaNotiziaTot.action" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "listaNotizie"/></span></a></p>
    				<p><a href="viewListaNotiziaTot.action" class="btn btn_fix_width_120 btn_icon_inbox"><span><s:text name = "gestioneNotizie"/></span></a></p> 
    			</div>
    		</s:elseif>
    </s:if>
	</div>
</div>

