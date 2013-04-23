package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/httpbase.jsp", out, false);
      out.write("\r\n");
      out.write("    <title>Axis 2 - Home</title>\r\n");
      out.write("    <link href=\"axis2-web/css/axis-style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.inc", out, false);
      out.write("\r\n");
      out.write("    <br/>\r\n");
      out.write("\r\n");
      out.write("    <h1>Welcome!</h1>\r\n");
      out.write("    Welcome to the new generation of Axis. If you can see this page you have\r\n");
      out.write("    successfully deployed the Axis2 Web Application. However, to ensure that Axis2\r\n");
      out.write("    is properly working, we encourage you to click on the validate link.\r\n");
      out.write("    <br/>\r\n");
      out.write("    <ul>\r\n");
      out.write("      <li><a href=\"services/listServices\">Services</a>\r\n");
      out.write("        <br/>\r\n");
      out.write("        View the list of all the available services deployed in this server.\r\n");
      out.write("      </li>\r\n");
      out.write("      <li><a href=\"axis2-web/HappyAxis.jsp\">Validate</a>\r\n");
      out.write("        <br/>\r\n");
      out.write("        Check the system to see whether all the required libraries are in place\r\n");
      out.write("        and view the system information.\r\n");
      out.write("      </li>\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("      <li><a href=\"axis2-admin/\">Administration</a>\r\n");
      out.write("        <br/>\r\n");
      out.write("        Console for administering this Axis2 installation.\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.inc", out, false);
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
