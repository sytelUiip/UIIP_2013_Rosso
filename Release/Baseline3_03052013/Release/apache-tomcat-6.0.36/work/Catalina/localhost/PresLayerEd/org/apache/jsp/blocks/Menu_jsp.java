package org.apache.jsp.blocks;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fa_0026_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.release();
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<div id=\"side-bar\">\t\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
    // /blocks/Menu.jsp(18,2) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
        out.write("\t\t<p class=\"sideBarTitle\" style=\"padding-left: 20px;\">");
        if (_jspx_meth_s_005ftext_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("<p>\r\n");
        out.write("\t\t\t<ul style=\"margin-top:30px;\">\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fif_005f1(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felseif_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005felseif_005f1(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</ul>\r\n");
        out.write("\t\t\t\t\t\r\n");
        out.write("<!-- \t\t<ul style=\"margin-top:30px;\"> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t \t\t<li> -->\r\n");
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("<!-- \t\t\t</li> -->\r\n");
        out.write("\r\n");
        out.write("<!-- \t\t\t<li></li>\t\t -->\r\n");
        out.write("<!-- \t\t</ul> -->\r\n");
        out.write("\t\t");
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
    // /blocks/Menu.jsp(19,54) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("agenziaEditoriale");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /blocks/Menu.jsp(21,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("#session['privilegi'] == 'Am'");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f0(_jspx_th_s_005fif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f1(_jspx_th_s_005fif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f2(_jspx_th_s_005fif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f3(_jspx_th_s_005fif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /blocks/Menu.jsp(22,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f0.setHref("viewInsertAccount.action");
    int _jspx_eval_s_005fa_005f0 = _jspx_th_s_005fa_005f0.doStartTag();
    if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f0.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f1(_jspx_th_s_005fa_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f1 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f0);
    // /blocks/Menu.jsp(22,46) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f1.setName("creaAccount");
    int _jspx_eval_s_005ftext_005f1 = _jspx_th_s_005ftext_005f1.doStartTag();
    if (_jspx_th_s_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /blocks/Menu.jsp(23,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f1.setHref("viewListaAccount.action?pag=1");
    int _jspx_eval_s_005fa_005f1 = _jspx_th_s_005fa_005f1.doStartTag();
    if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f1.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f2(_jspx_th_s_005fa_005f1, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f2 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f1);
    // /blocks/Menu.jsp(23,51) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f2.setName("listaAccount");
    int _jspx_eval_s_005ftext_005f2 = _jspx_th_s_005ftext_005f2.doStartTag();
    if (_jspx_th_s_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f2 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /blocks/Menu.jsp(24,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f2.setHref("viewListaAccount.action?pag=1");
    int _jspx_eval_s_005fa_005f2 = _jspx_th_s_005fa_005f2.doStartTag();
    if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f2.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f3(_jspx_th_s_005fa_005f2, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f3 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f2);
    // /blocks/Menu.jsp(24,51) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f3.setName("gestioneAccount");
    int _jspx_eval_s_005ftext_005f3 = _jspx_th_s_005ftext_005f3.doStartTag();
    if (_jspx_th_s_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f3 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /blocks/Menu.jsp(25,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f3.setHref("viewListaNotiziaTot.action");
    int _jspx_eval_s_005fa_005f3 = _jspx_th_s_005fa_005f3.doStartTag();
    if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f3.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f4(_jspx_th_s_005fa_005f3, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f3);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f4 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f3);
    // /blocks/Menu.jsp(25,48) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f4.setName("listaNotizie");
    int _jspx_eval_s_005ftext_005f4 = _jspx_th_s_005ftext_005f4.doStartTag();
    if (_jspx_th_s_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f0 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /blocks/Menu.jsp(27,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f0.setTest("#session['privilegi'] == 'Gi'");
    int _jspx_eval_s_005felseif_005f0 = _jspx_th_s_005felseif_005f0.doStartTag();
    if (_jspx_eval_s_005felseif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f4(_jspx_th_s_005felseif_005f0, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f5(_jspx_th_s_005felseif_005f0, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f6(_jspx_th_s_005felseif_005f0, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f4 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f0);
    // /blocks/Menu.jsp(28,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f4.setHref("viewinsertNotizia.action");
    int _jspx_eval_s_005fa_005f4 = _jspx_th_s_005fa_005f4.doStartTag();
    if (_jspx_eval_s_005fa_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f4.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f5(_jspx_th_s_005fa_005f4, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f4);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f5 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f4);
    // /blocks/Menu.jsp(28,46) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f5.setName("inserisciNotizia");
    int _jspx_eval_s_005ftext_005f5 = _jspx_th_s_005ftext_005f5.doStartTag();
    if (_jspx_th_s_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f5 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f5.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f0);
    // /blocks/Menu.jsp(29,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f5.setHref("viewListaNotiziaTot.action");
    int _jspx_eval_s_005fa_005f5 = _jspx_th_s_005fa_005f5.doStartTag();
    if (_jspx_eval_s_005fa_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f5.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f6(_jspx_th_s_005fa_005f5, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f5);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f6 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f5);
    // /blocks/Menu.jsp(29,48) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f6.setName("listaNotizie");
    int _jspx_eval_s_005ftext_005f6 = _jspx_th_s_005ftext_005f6.doStartTag();
    if (_jspx_th_s_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f6 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f6.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f0);
    // /blocks/Menu.jsp(30,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f6.setHref("viewListaNotiziaTot.action");
    int _jspx_eval_s_005fa_005f6 = _jspx_th_s_005fa_005f6.doStartTag();
    if (_jspx_eval_s_005fa_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f6.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f7(_jspx_th_s_005fa_005f6, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f6);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f7 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f6);
    // /blocks/Menu.jsp(30,48) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f7.setName("gestioneNotizie");
    int _jspx_eval_s_005ftext_005f7 = _jspx_th_s_005ftext_005f7.doStartTag();
    if (_jspx_th_s_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005felseif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:elseif
    org.apache.struts2.views.jsp.ElseIfTag _jspx_th_s_005felseif_005f1 = (org.apache.struts2.views.jsp.ElseIfTag) _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.get(org.apache.struts2.views.jsp.ElseIfTag.class);
    _jspx_th_s_005felseif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005felseif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /blocks/Menu.jsp(32,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005felseif_005f1.setTest("#session['privilegi'] == 'AmGi'");
    int _jspx_eval_s_005felseif_005f1 = _jspx_th_s_005felseif_005f1.doStartTag();
    if (_jspx_eval_s_005felseif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felseif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felseif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felseif_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f7(_jspx_th_s_005felseif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f8(_jspx_th_s_005felseif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f9(_jspx_th_s_005felseif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f10(_jspx_th_s_005felseif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f11(_jspx_th_s_005felseif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t\t<li>");
        if (_jspx_meth_s_005fa_005f12(_jspx_th_s_005felseif_005f1, _jspx_page_context))
          return true;
        out.write("</li>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005felseif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felseif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felseif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felseif_0026_005ftest.reuse(_jspx_th_s_005felseif_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f7 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f7.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f1);
    // /blocks/Menu.jsp(33,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f7.setHref("viewInsertAccount.action");
    int _jspx_eval_s_005fa_005f7 = _jspx_th_s_005fa_005f7.doStartTag();
    if (_jspx_eval_s_005fa_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f7.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f8(_jspx_th_s_005fa_005f7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f7);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f8 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f7);
    // /blocks/Menu.jsp(33,46) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f8.setName("creaAccount");
    int _jspx_eval_s_005ftext_005f8 = _jspx_th_s_005ftext_005f8.doStartTag();
    if (_jspx_th_s_005ftext_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f8 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f8.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f1);
    // /blocks/Menu.jsp(34,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f8.setHref("viewListaAccount.action?pag=1");
    int _jspx_eval_s_005fa_005f8 = _jspx_th_s_005fa_005f8.doStartTag();
    if (_jspx_eval_s_005fa_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f8.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f9(_jspx_th_s_005fa_005f8, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f8);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f9 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f8);
    // /blocks/Menu.jsp(34,51) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f9.setName("listaAccount");
    int _jspx_eval_s_005ftext_005f9 = _jspx_th_s_005ftext_005f9.doStartTag();
    if (_jspx_th_s_005ftext_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f9 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f9.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f1);
    // /blocks/Menu.jsp(35,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f9.setHref("viewListaAccount.action?pag=1");
    int _jspx_eval_s_005fa_005f9 = _jspx_th_s_005fa_005f9.doStartTag();
    if (_jspx_eval_s_005fa_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f9.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f10(_jspx_th_s_005fa_005f9, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f9);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f10 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f9);
    // /blocks/Menu.jsp(35,51) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f10.setName("gestioneAccount");
    int _jspx_eval_s_005ftext_005f10 = _jspx_th_s_005ftext_005f10.doStartTag();
    if (_jspx_th_s_005ftext_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f10 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f10.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f1);
    // /blocks/Menu.jsp(36,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f10.setHref("viewListaNotiziaTot.action");
    int _jspx_eval_s_005fa_005f10 = _jspx_th_s_005fa_005f10.doStartTag();
    if (_jspx_eval_s_005fa_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f10.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f11(_jspx_th_s_005fa_005f10, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f10);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f11 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f10);
    // /blocks/Menu.jsp(36,48) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f11.setName("listaNotizie");
    int _jspx_eval_s_005ftext_005f11 = _jspx_th_s_005ftext_005f11.doStartTag();
    if (_jspx_th_s_005ftext_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f11 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f11.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f1);
    // /blocks/Menu.jsp(37,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f11.setHref("viewinsertNotizia.action");
    int _jspx_eval_s_005fa_005f11 = _jspx_th_s_005fa_005f11.doStartTag();
    if (_jspx_eval_s_005fa_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f11.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f12(_jspx_th_s_005fa_005f11, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f11);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f12 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f11);
    // /blocks/Menu.jsp(37,46) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f12.setName("inserisciNotizia");
    int _jspx_eval_s_005ftext_005f12 = _jspx_th_s_005ftext_005f12.doStartTag();
    if (_jspx_th_s_005ftext_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felseif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f12 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f12.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felseif_005f1);
    // /blocks/Menu.jsp(38,9) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f12.setHref("viewListaNotiziaTot.action");
    int _jspx_eval_s_005fa_005f12 = _jspx_th_s_005fa_005f12.doStartTag();
    if (_jspx_eval_s_005fa_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f12.doInitBody();
      }
      do {
        if (_jspx_meth_s_005ftext_005f13(_jspx_th_s_005fa_005f12, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005fa_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.reuse(_jspx_th_s_005fa_005f12);
    return false;
  }

  private boolean _jspx_meth_s_005ftext_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fa_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f13 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f13.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fa_005f12);
    // /blocks/Menu.jsp(38,48) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f13.setName("gestioneNotizie");
    int _jspx_eval_s_005ftext_005f13 = _jspx_th_s_005ftext_005f13.doStartTag();
    if (_jspx_th_s_005ftext_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f13);
    return false;
  }
}
