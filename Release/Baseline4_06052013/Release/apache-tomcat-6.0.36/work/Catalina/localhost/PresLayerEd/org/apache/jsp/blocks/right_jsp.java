package org.apache.jsp.blocks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.mail.Session;

public final class right_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <div class=\"menu\"> -->\r\n");
      out.write("<!-- \t<table> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t<tr> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t</tr> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t</table> -->\r\n");
      out.write("<!-- </div> -->\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
 
int var;
int cont = (Integer) session.getAttribute("num_slider");
if(cont<5)
{
	var = cont;
}else
{
	var = 5;
}
 
      out.write("\r\n");
      out.write(" var myVar = ");
      out.print(var );
      out.write(";\r\n");
      out.write("$(function() {\r\n");
      out.write("\t$(\".newsticker-jcarousellite\").jCarouselLite({\r\n");
      out.write("\t\tvertical: true,\r\n");
      out.write("\t\thoverPause:true,\r\n");
      out.write("\t\tvisible:myVar,\r\n");
      out.write("\t\tauto:500,\r\n");
      out.write("\t\tspeed:1000\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" <div class=\"lighterBackground\" style=\"vertical-align: bottom;\">\r\n");
      out.write("\t\t    <p class=\"sideBarTitle\" style=\"padding-left: 10px;\">");
      if (_jspx_meth_s_005ftext_005f1(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("\t\t    <span class=\"sideBarText\" style=\"padding-top: 10px;\">\r\n");
      out.write("\t\t    Gruppo Rosso  <br/>\r\n");
      out.write("\t\t    UIIP - Reply Academy\r\n");
      out.write("\t\t    Ariano Irpino (AV)  <br/>\r\n");
      out.write("\t\t    <b>");
      if (_jspx_meth_s_005ftext_005f2(_jspx_page_context))
        return;
      out.write("</b>:</br>\r\n");
      out.write("\t\t    <a href=\"viewContatto?id=1\">Martella Silvio</a></br>\r\n");
      out.write("\t\t    <a href=\"viewContatto?id=2\">Caprioli Maurizio</a></br>\r\n");
      out.write("\t\t    <a href=\"viewContatto?id=5\">Ferrentino Anna</a></br>\r\n");
      out.write("\t\t    <a href=\"viewContatto?id=4\">Aric&ograve Maria Emanuela</a></br>\r\n");
      out.write("\t\t    <a href=\"viewContatto?id=3\">Generali Marco</a></br>\r\n");
      out.write("\t\t    </span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- <div id=\"menu-destra\">\t -->\r\n");
      out.write("<!-- \t<div> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t<div class=\"lighterBackground\" style=\"vertical-align: bottom;\"> -->\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!-- \t\t    Gruppo Rosso  <br/> -->\r\n");
      out.write("<!-- \t\t    UIIP - Reply Academy -->\r\n");
      out.write("<!-- \t\t    Ariano Irpino (AV)  <br/> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t    <a href=\"\">Martella Silvio</a></br> -->\r\n");
      out.write("<!-- \t\t    <a href=\"\">Caprioli Maurizio</a></br> -->\r\n");
      out.write("<!-- \t\t    <a href=\"\">Ferrentino Anna</a></br> -->\r\n");
      out.write("<!-- \t\t    <a href=\"\">Aric&ograve Maria Emanuela</a></br> -->\r\n");
      out.write("<!-- \t\t    <a href=\"\">Generali Marco</a></br> -->\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t</div> -->\r\n");
      out.write("<!-- \t</div> -->\r\n");
      out.write("<!-- </div> -->\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /blocks/right.jsp(40,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("%{#session['utente_loggato'] != null}");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("<div id=\"newsticker-demo\">    \r\n");
        out.write("    <div class=\"title\">");
        if (_jspx_meth_s_005ftext_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        out.write("    <br>\r\n");
        out.write("    <div class=\"newsticker-jcarousellite\">\r\n");
        out.write("    <ul>\r\n");
        out.write("    ");
        if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t</ul>\r\n");
        out.write("    \r\n");
        out.write("    \r\n");
        out.write("    \r\n");
        out.write("    \r\n");
        out.write("    \r\n");
        out.write("    \r\n");
        out.write("    \r\n");
        out.write("    \r\n");
        out.write("<!-- \t\t<ul> -->\r\n");
        out.write("<!--             <li> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"thumbnail\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<img src=\"images/1.jpg\"> -->\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"info\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<a href=\"http://www.vladstudio.com/wallpaper/?knight_lady\">The Knight and the Lady</a> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"clear\"></div> -->\r\n");
        out.write("<!-- \t\t\t</li> -->\r\n");
        out.write("\t\t\t\r\n");
        out.write("<!--             <li> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"thumbnail\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<img src=\"images/2.jpg\"> -->\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"info\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<a href=\"http://www.vladstudio.com/wallpaper/?family_of_colors\">The Family of Colors</a> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"clear\"></div> -->\r\n");
        out.write("<!-- \t\t\t</li> -->\r\n");
        out.write("<!--             <li> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"thumbnail\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<img src=\"images/3.jpg\"> -->\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"info\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<a href=\"http://www.vladstudio.com/wallpaper/?teddybear_mac\">Teddy Bear and MacBook</a> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"clear\"></div> -->\r\n");
        out.write("<!-- \t\t\t</li> -->\r\n");
        out.write("<!-- \t\t\t<li> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"thumbnail\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<img src=\"images/4.jpg\"> -->\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"info\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<a href=\"http://www.vladstudio.com/wallpaper/?rainbow_butterfly\">Rainbow Butterfly</a> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"clear\"></div> -->\r\n");
        out.write("<!-- \t\t\t</li> -->\r\n");
        out.write("<!-- \t\t\t<li> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"thumbnail\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<img src=\"images/5.jpg\"> -->\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"info\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<a href=\"http://www.vladstudio.com/wallpaper/?space_travel\">Space Travel</a> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"clear\"></div> -->\r\n");
        out.write("<!-- \t\t\t</li> -->\r\n");
        out.write("<!-- \t\t\t<li> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"thumbnail\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<img src=\"images/6.jpg\"> -->\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"info\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<a href=\"http://www.vladstudio.com/wallpaper/?traveling_tree\">The Traveling Tree</a> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"clear\"></div> -->\r\n");
        out.write("<!-- \t\t\t</li> -->\r\n");
        out.write("<!-- \t\t\t<li> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"thumbnail\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<img src=\"images/6.jpg\"> -->\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"info\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<a href=\"http://www.vladstudio.com/wallpaper/?traveling_tree\">The Traveling Tree</a> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"clear\"></div> -->\r\n");
        out.write("<!-- \t\t\t</li> -->\r\n");
        out.write("<!-- \t\t\t<li> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"thumbnail\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<img src=\"images/6.jpg\"> -->\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"info\"> -->\r\n");
        out.write("<!-- \t\t\t\t\t<a href=\"http://www.vladstudio.com/wallpaper/?traveling_tree\">The Traveling Tree</a> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t\t\t\t</div> -->\r\n");
        out.write("<!-- \t\t\t\t<div class=\"clear\"></div> -->\r\n");
        out.write("<!-- \t\t\t</li> -->\r\n");
        out.write("<!--         </ul> -->\r\n");
        out.write("    </div>\r\n");
        out.write("   \r\n");
        out.write("</div>\r\n");
        int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f0 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /blocks/right.jsp(42,23) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("ultimeNews");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fiterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /blocks/right.jsp(46,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("#session['notizie_slider']");
    // /blocks/right.jsp(46,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setVar("notizie_last");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            <li>\r\n");
        out.write("\t\t\t\t<div class=\"thumbnail\">\r\n");
        out.write("\t\t\t\t\t<img src=\"images/1.jpg\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"info\">\r\n");
        out.write("\t\t\t\t\t<a href=\"viewNotizia.action?idNotizia=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notizie_last.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notizie_last.titolo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>\r\n");
        out.write("\t\t\t\t\t<span class=\"cat\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${notizie_last.sottoTitolo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</span>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
        out.write("\t\t\t</li>\r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_s_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.reuse(_jspx_th_s_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.reuse(_jspx_th_s_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f1 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f1.setParent(null);
    // /blocks/right.jsp(155,58) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f1.setName("contatti");
    int _jspx_eval_s_005ftext_005f1 = _jspx_th_s_005ftext_005f1.doStartTag();
    if (_jspx_th_s_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f2 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f2.setParent(null);
    // /blocks/right.jsp(160,9) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f2.setName("componenti");
    int _jspx_eval_s_005ftext_005f2 = _jspx_th_s_005ftext_005f2.doStartTag();
    if (_jspx_th_s_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
    return false;
  }
}
