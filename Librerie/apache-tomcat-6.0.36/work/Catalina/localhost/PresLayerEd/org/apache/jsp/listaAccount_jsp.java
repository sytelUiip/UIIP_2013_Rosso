package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listaAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fa_0026_005fhref;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fdisabled;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fdisabled = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.release();
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.release();
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fdisabled.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
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
      out.write("<div style=\"vertical-align: middle\" align=\"center\">\r\n");
      out.write("\t<h1>Lista Account Registrati</h1>\r\n");
      out.write("\t");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_s_005factionmessage_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_s_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>");
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

  private boolean _jspx_meth_s_005factionerror_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionerror
    org.apache.struts2.views.jsp.ui.ActionErrorTag _jspx_th_s_005factionerror_005f0 = (org.apache.struts2.views.jsp.ui.ActionErrorTag) _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionErrorTag.class);
    _jspx_th_s_005factionerror_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionerror_005f0.setParent(null);
    int _jspx_eval_s_005factionerror_005f0 = _jspx_th_s_005factionerror_005f0.doStartTag();
    if (_jspx_th_s_005factionerror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.reuse(_jspx_th_s_005factionerror_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005factionmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:actionmessage
    org.apache.struts2.views.jsp.ui.ActionMessageTag _jspx_th_s_005factionmessage_005f0 = (org.apache.struts2.views.jsp.ui.ActionMessageTag) _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.get(org.apache.struts2.views.jsp.ui.ActionMessageTag.class);
    _jspx_th_s_005factionmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005factionmessage_005f0.setParent(null);
    int _jspx_eval_s_005factionmessage_005f0 = _jspx_th_s_005factionmessage_005f0.doStartTag();
    if (_jspx_th_s_005factionmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.reuse(_jspx_th_s_005factionmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f0.setParent(null);
    // /listaAccount.jsp(8,1) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f0.setTest("#request['lista_utenti'] != null");
    int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
    if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("   <table id=\"lista_acc\" border=\"0\" cellspacing=\"5px\" cellpadding=\"15px\" style=\"border:1px solid #000; margin-bottom:40px;\">\r\n");
        out.write("    <tr style=\"background-color: #EEDFE0;\">\r\n");
        out.write("    \t<th>Nome</th>\r\n");
        out.write("   \t\t<th>Cognome</th>\r\n");
        out.write("   \t\t<th style=\"border-right:1px solid rgb( 153, 153, 153 );\">Username</th>\r\n");
        out.write("   \t</tr>\r\n");
        out.write("   \t\r\n");
        out.write("   \t");
        if (_jspx_meth_s_005fiterator_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   </table>\r\n");
        out.write("   ");
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

  private boolean _jspx_meth_s_005fiterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:iterator
    org.apache.struts2.views.jsp.IteratorTag _jspx_th_s_005fiterator_005f0 = (org.apache.struts2.views.jsp.IteratorTag) _005fjspx_005ftagPool_005fs_005fiterator_0026_005fvar_005fvalue.get(org.apache.struts2.views.jsp.IteratorTag.class);
    _jspx_th_s_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fiterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /listaAccount.jsp(16,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setValue("#request['lista_utenti']");
    // /listaAccount.jsp(16,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fiterator_005f0.setVar("utenti_reg");
    int _jspx_eval_s_005fiterator_005f0 = _jspx_th_s_005fiterator_005f0.doStartTag();
    if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("   \t \t<tr style=\"border-bottom:1px solid rgb( 153, 153, 153 );\">\r\n");
        out.write("<!--    \t \t\t<td> -->\r\n");
        out.write("\r\n");
        out.write("<!--    \t \t\t</td> -->\r\n");
        out.write("<!--    \t \t\t<td> -->\r\n");
        out.write("\r\n");
        out.write("<!--    \t \t\t</td> -->\r\n");
        out.write("<!--    \t \t\t<td> -->\r\n");
        out.write("\r\n");
        out.write("<!--    \t \t\t</td> -->\r\n");
        out.write("\t\t\t<td style=\"border-bottom:1px solid rgb( 153, 153, 153 );\">\r\n");
        out.write("   \t \t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${utenti_reg.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" \r\n");
        out.write("   \t \t\t</td>\r\n");
        out.write("   \t \t\t<td style=\"border-bottom:1px solid rgb( 153, 153, 153 );\">\r\n");
        out.write("   \t \t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${utenti_reg.cognome}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" \r\n");
        out.write("   \t \t\t</td>\r\n");
        out.write("   \t \t\t<td style=\"border-right:1px solid rgb( 153, 153, 153 ); border-bottom:1px solid rgb( 153, 153, 153 );\">\r\n");
        out.write("   \t \t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${utenti_reg.username}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(" \r\n");
        out.write("   \t \t\t</td>\r\n");
        out.write("<!--    \t \t\t<td> -->\r\n");
        out.write("\r\n");
        out.write("<!--    \t \t\t</td> -->\r\n");
        out.write("<!--    \t \t\t<td> -->\r\n");
        out.write("\r\n");
        out.write("<!--    \t \t\t</td> -->\r\n");
        out.write("<!--    \t \t\t<td> -->\r\n");
        out.write("\r\n");
        out.write("<!--    \t \t\t</td> -->\r\n");
        out.write("   \t \t\t<td style=\"border-bottom:1px solid rgb( 153, 153, 153 );\">\r\n");
        out.write("   \t \t\t\t");
        if (_jspx_meth_s_005fa_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   \t \t\t</td>\r\n");
        out.write("   \t \t\t<td style=\"border-bottom:1px solid rgb( 153, 153, 153 );\">\r\n");
        out.write("   \t \t\t\t");
        if (_jspx_meth_s_005fa_005f1(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   \t \t\t</td>\r\n");
        out.write("   \t \t\t<td style=\"border-bottom:1px solid rgb( 153, 153, 153 );\">\r\n");
        out.write("   \t \t\t\t");
        if (_jspx_meth_s_005fif_005f1(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   \t \t\t\t");
        if (_jspx_meth_s_005felse_005f0(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   \t \t\t</td>\r\n");
        out.write("   \t \t\t<td style=\"border-bottom:1px solid rgb( 153, 153, 153 );\">\r\n");
        out.write("   \t \t\t\t");
        if (_jspx_meth_s_005fa_005f4(_jspx_th_s_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("   \t \t\t</td>\r\n");
        out.write("   \t \t\t\r\n");
        out.write("   \t\t</tr>\r\n");
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

  private boolean _jspx_meth_s_005fa_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f0 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /listaAccount.jsp(46,8) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f0.setHref("viewDettagliAccount.action?username=%{#utenti_reg.username}");
    int _jspx_eval_s_005fa_005f0 = _jspx_th_s_005fa_005f0.doStartTag();
    if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f0.doInitBody();
      }
      do {
        out.write("Dettagli");
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

  private boolean _jspx_meth_s_005fa_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f1 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /listaAccount.jsp(49,8) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f1.setHref("viewUpdateAccount.action?username=%{#utenti_reg.username}");
    int _jspx_eval_s_005fa_005f1 = _jspx_th_s_005fa_005f1.doStartTag();
    if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f1.doInitBody();
      }
      do {
        out.write("Modifica");
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

  private boolean _jspx_meth_s_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:if
    org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f1 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
    _jspx_th_s_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /listaAccount.jsp(52,8) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fif_005f1.setTest("%{#utenti_reg.stato} == 'C'");
    int _jspx_eval_s_005fif_005f1 = _jspx_th_s_005fif_005f1.doStartTag();
    if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fif_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fif_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fif_005f1.doInitBody();
      }
      do {
        if (_jspx_meth_s_005fa_005f2(_jspx_th_s_005fif_005f1, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_s_005fa_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f2 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fdisabled.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f2.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f1);
    // /listaAccount.jsp(52,49) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f2.setHref("cancellaAccount.action?username=%{#utenti_reg.username}");
    // /listaAccount.jsp(52,49) name = disabled type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f2.setDisabled("true");
    int _jspx_eval_s_005fa_005f2 = _jspx_th_s_005fa_005f2.doStartTag();
    if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f2.doInitBody();
      }
      do {
        out.write("Cancella");
        int evalDoAfterBody = _jspx_th_s_005fa_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fa_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fa_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fdisabled.reuse(_jspx_th_s_005fa_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fa_0026_005fhref_005fdisabled.reuse(_jspx_th_s_005fa_005f2);
    return false;
  }

  private boolean _jspx_meth_s_005felse_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:else
    org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f0 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
    _jspx_th_s_005felse_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005felse_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    int _jspx_eval_s_005felse_005f0 = _jspx_th_s_005felse_005f0.doStartTag();
    if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005felse_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005felse_005f0.doInitBody();
      }
      do {
        if (_jspx_meth_s_005fa_005f3(_jspx_th_s_005felse_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_s_005felse_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005felse_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fa_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f3 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f3.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f0);
    // /listaAccount.jsp(53,16) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f3.setHref("cancellaAccount.action?username=%{#utenti_reg.username}");
    int _jspx_eval_s_005fa_005f3 = _jspx_th_s_005fa_005f3.doStartTag();
    if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f3.doInitBody();
      }
      do {
        out.write("Cancella");
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

  private boolean _jspx_meth_s_005fa_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fiterator_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:a
    org.apache.struts2.views.jsp.ui.AnchorTag _jspx_th_s_005fa_005f4 = (org.apache.struts2.views.jsp.ui.AnchorTag) _005fjspx_005ftagPool_005fs_005fa_0026_005fhref.get(org.apache.struts2.views.jsp.ui.AnchorTag.class);
    _jspx_th_s_005fa_005f4.setPageContext(_jspx_page_context);
    _jspx_th_s_005fa_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fiterator_005f0);
    // /listaAccount.jsp(56,8) name = href type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fa_005f4.setHref("gestoreAccount.action?username=%{#utenti_reg.username}");
    int _jspx_eval_s_005fa_005f4 = _jspx_th_s_005fa_005f4.doStartTag();
    if (_jspx_eval_s_005fa_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fa_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fa_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fa_005f4.doInitBody();
      }
      do {
        out.write("Gestisci Ruoli");
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
}
