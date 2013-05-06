package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class InsertNewNotiziaForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionerror_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fsize_005fname_005fkey_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fkey_005fcols;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fstyle_005fmethod_005fkey_005falign_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fmethod_005fkey_005falign_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fsize_005fname_005fkey_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fkey_005fcols = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fstyle_005fmethod_005fkey_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fmethod_005fkey_005falign_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionerror_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005factionmessage_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fsize_005fname_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fkey_005fcols.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fstyle_005fmethod_005fkey_005falign_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fmethod_005fkey_005falign_005fnobody.release();
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
      out.write("\t\t\r\n");
      out.write("\t<div style=\"vertical-align: middle\" align=\"center\">\r\n");
      out.write("\t<h1>");
      if (_jspx_meth_s_005ftext_005f0(_jspx_page_context))
        return;
      out.write("</h1>\r\n");
      out.write("\t<div style=\"border:1px solid rgb( 153, 153, 153 ); padding:40px 20px 40px 10px; width: 700px; border-radius:15px 15px 15px 15px; margin-bottom:30px;\">\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005factionerror_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_s_005factionmessage_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t<div align=\"right\" style=\"margin-right:10px; margin-top:30px; margin-bottom:-20px;\">\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_s_005fform_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_s_005ftext_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:text
    org.apache.struts2.views.jsp.TextTag _jspx_th_s_005ftext_005f0 = (org.apache.struts2.views.jsp.TextTag) _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.get(org.apache.struts2.views.jsp.TextTag.class);
    _jspx_th_s_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftext_005f0.setParent(null);
    // /InsertNewNotiziaForm.jsp(5,5) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftext_005f0.setName("inserisciNotizia");
    int _jspx_eval_s_005ftext_005f0 = _jspx_th_s_005ftext_005f0.doStartTag();
    if (_jspx_th_s_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_s_005ftext_005f0);
    return false;
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

  private boolean _jspx_meth_s_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /InsertNewNotiziaForm.jsp(9,5) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("insertNotizia.action");
    // /InsertNewNotiziaForm.jsp(9,5) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setMethod("post");
    // /InsertNewNotiziaForm.jsp(9,5) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setValidate("true");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\r\n");
        out.write("    \t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t\t\t\t\t");
        if (_jspx_meth_s_005ftextfield_005f1(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t\t\t\t\t");
        if (_jspx_meth_s_005ftextarea_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    \t\t\t\t\r\n");
        out.write("<!-- \t\t\t\t\t<table cellpadding=\"2\"> -->\r\n");
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write('\r');
        out.write('\n');
        out.write("\r\n");
        out.write("<!--     \t\t\t\t</table> -->\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fsize_005fname_005fkey_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /InsertNewNotiziaForm.jsp(11,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setName("titolo");
    // /InsertNewNotiziaForm.jsp(11,9) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setKey("label.titolo");
    // /InsertNewNotiziaForm.jsp(11,9) name = size type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f0.setSize("94");
    // /InsertNewNotiziaForm.jsp(11,9) null
    _jspx_th_s_005ftextfield_005f0.setDynamicAttribute(null, "style", new String("margin-top:10px;"));
    int _jspx_eval_s_005ftextfield_005f0 = _jspx_th_s_005ftextfield_005f0.doStartTag();
    if (_jspx_th_s_005ftextfield_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fsize_005fname_005fkey_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fsize_005fname_005fkey_005fnobody.reuse(_jspx_th_s_005ftextfield_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005ftextfield_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_005ftextfield_005f1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fsize_005fname_005fkey_005fnobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_005ftextfield_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextfield_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /InsertNewNotiziaForm.jsp(12,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setName("sotto_titolo");
    // /InsertNewNotiziaForm.jsp(12,9) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setKey("label.sotto_titolo");
    // /InsertNewNotiziaForm.jsp(12,9) name = size type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextfield_005f1.setSize("94");
    // /InsertNewNotiziaForm.jsp(12,9) null
    _jspx_th_s_005ftextfield_005f1.setDynamicAttribute(null, "style", new String("margin-top:10px;"));
    int _jspx_eval_s_005ftextfield_005f1 = _jspx_th_s_005ftextfield_005f1.doStartTag();
    if (_jspx_th_s_005ftextfield_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fsize_005fname_005fkey_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextfield_0026_005fstyle_005fsize_005fname_005fkey_005fnobody.reuse(_jspx_th_s_005ftextfield_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005ftextarea_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textarea
    org.apache.struts2.views.jsp.ui.TextareaTag _jspx_th_s_005ftextarea_005f0 = (org.apache.struts2.views.jsp.ui.TextareaTag) _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fkey_005fcols.get(org.apache.struts2.views.jsp.ui.TextareaTag.class);
    _jspx_th_s_005ftextarea_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005ftextarea_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /InsertNewNotiziaForm.jsp(13,9) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setName("testo");
    // /InsertNewNotiziaForm.jsp(13,9) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setKey("label.testo");
    // /InsertNewNotiziaForm.jsp(13,9) name = cols type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setCols("70");
    // /InsertNewNotiziaForm.jsp(13,9) name = rows type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005ftextarea_005f0.setRows("10");
    // /InsertNewNotiziaForm.jsp(13,9) null
    _jspx_th_s_005ftextarea_005f0.setDynamicAttribute(null, "style", new String("margin-top:10px;"));
    int _jspx_eval_s_005ftextarea_005f0 = _jspx_th_s_005ftextarea_005f0.doStartTag();
    if (_jspx_eval_s_005ftextarea_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005ftextarea_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005ftextarea_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005ftextarea_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    \t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005ftextarea_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005ftextarea_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005ftextarea_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fkey_005fcols.reuse(_jspx_th_s_005ftextarea_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005ftextarea_0026_005fstyle_005frows_005fname_005fkey_005fcols.reuse(_jspx_th_s_005ftextarea_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fstyle_005fmethod_005fkey_005falign_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /InsertNewNotiziaForm.jsp(15,9) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setMethod("execute");
    // /InsertNewNotiziaForm.jsp(15,9) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setKey("label.insertNotizia");
    // /InsertNewNotiziaForm.jsp(15,9) name = align type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setAlign("center");
    // /InsertNewNotiziaForm.jsp(15,9) null
    _jspx_th_s_005fsubmit_005f0.setDynamicAttribute(null, "style", new String("margin-top:20px;"));
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fstyle_005fmethod_005fkey_005falign_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fstyle_005fmethod_005fkey_005falign_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fform_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f1 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f1.setParent(null);
    // /InsertNewNotiziaForm.jsp(26,6) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setAction("viewListaNotizie.action?pag=1");
    // /InsertNewNotiziaForm.jsp(26,6) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setMethod("post");
    // /InsertNewNotiziaForm.jsp(26,6) name = validate type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f1.setValidate("true");
    int _jspx_eval_s_005fform_005f1 = _jspx_th_s_005fform_005f1.doStartTag();
    if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f1(_jspx_th_s_005fform_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005fvalidate_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f1);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fmethod_005fkey_005falign_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f1);
    // /InsertNewNotiziaForm.jsp(27,6) name = method type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setMethod("execute");
    // /InsertNewNotiziaForm.jsp(27,6) name = key type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setKey("label.indietromod");
    // /InsertNewNotiziaForm.jsp(27,6) name = align type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f1.setAlign("center");
    int _jspx_eval_s_005fsubmit_005f1 = _jspx_th_s_005fsubmit_005f1.doStartTag();
    if (_jspx_th_s_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fmethod_005fkey_005falign_005fnobody.reuse(_jspx_th_s_005fsubmit_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fmethod_005fkey_005falign_005fnobody.reuse(_jspx_th_s_005fsubmit_005f1);
    return false;
  }
}
