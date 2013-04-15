package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/httpbase.jsp", out, false);
      out.write("\n");
      out.write("    <title>Login to Axis2 :: Administration page</title>\n");
      out.write("    <link href=\"axis2-web/css/axis-style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body onload=\"javascript:document.LoginForm.userName.focus();\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.inc", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/link-footer.jsp", out, false);
      out.write("\n");
      out.write("    <table class=\"FULL_BLANK\">\n");
      out.write("      <tr>\n");
      out.write("        <td valign=\"top\">\n");
      out.write("        \t<h2>Welcome :</h2>\n");
      out.write("        \t<p>Welcome to the Axis2 administration console. From inside the Axis2 administration console you can :</p>\n");
      out.write("\t    \t<ul style=\"list-style: none;\" class=\"loginUL\">\n");
      out.write("\t       \t\t<li>Check on the health of your Axis2 deployment.</li>\n");
      out.write(" \t       \t\t<li>Change any parameters at run time.</li>\n");
      out.write(" \t       \t\t<li>Upload new services into Axis2 [Service hot-deployment].</li>\n");
      out.write(" \t   \t\t</ul>\n");
      out.write("\t        <font color=\"orange\">Warning: Please note that configuration changes done through the administration console\n");
      out.write("    \t    will be lost when the server is restarted.</font>\n");
      out.write("    \t</td>\n");
      out.write("        <td valign=\"top\" align=\"left\">\n");
      out.write("          <form method=\"post\" name=\"LoginForm\" action=\"axis2-admin/login\">\n");
      out.write("            <table class=\"LOG_IN_FORM\">\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"center\" colspan=\"2\" bgcolor=\"#b0b0b0\" color=\"#FFFFFF\"><font color=\"#FFFFFF\">Login</font></td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                 <td align=\"center\" colspan=\"2\">&nbsp;</td>\n");
      out.write("               </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"right\">Username:</td>\n");
      out.write("                <td><input align=\"left\" type=\"text\" name=\"userName\" tabindex=\"1\">\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"right\">Password : </td>\n");
      out.write("                <td><input align=\"left\" type=\"password\" name=\"password\" tabindex=\"2\">\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td colspan=\"2\">\n");
      out.write("                  <br>\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"center\" colspan=\"2\">\n");
      out.write("                  <input name=\"cancel\" type=\"reset\" value=\" Clear \"> &nbsp; &nbsp;\n");
      out.write("                  <input name=\"submit\" type=\"submit\" value=\" Login \">\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td align=\"center\" colspan=\"2\">\n");
      out.write("                  <font color=\"red\">&nbsp;");
 if (request.getAttribute("errorMessage") != null) {
      out.print( request.getAttribute("errorMessage"));
 } 
      out.write("&nbsp;</font>\n");
      out.write("                </td>\n");
      out.write("              </tr>\n");
      out.write("            </table>\n");
      out.write("          </form>\n");
      out.write("          <br/><br/><br/><br/><br/><br/>\n");
      out.write("        </td>\n");
      out.write("      </tr>\n");
      out.write("    </table>\n");
      out.write("    <p>Test</p>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.inc", out, false);
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
}
