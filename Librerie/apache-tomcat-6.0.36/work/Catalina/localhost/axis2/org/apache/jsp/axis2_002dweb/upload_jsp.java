package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminheader.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("\tfunction checkFileUpload(){\r\n");
      out.write("\t\tif (document.getElementById('serviceUpload').value == '') {\r\n");
      out.write("\t\t\talert('Please select a file before clicking the upload button.');\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tdocument.Axis2upload.submit();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("<h1>Upload an Axis Service Archive File</h1>\r\n");
      out.write("\r\n");
      out.write("<p>You can upload a packaged Axis2 service from this page in two small steps.</p>\r\n");
      out.write("<ul>\r\n");
      out.write("  <li>Browse to the location and select the axis service archive file you wish to upload</li>\r\n");
      out.write("  <li>Click \"Upload\" button</li>\r\n");
      out.write("</ul>\r\n");
      out.write("<p>Simple as that!</p>\r\n");
      out.write("\r\n");
 if ("success".equals(request.getAttribute("status"))) { 
      out.write("\r\n");
      out.write("<font color=\"green\">File ");
      out.print( request.getAttribute("filename") );
      out.write(" successfully uploaded </font><br/><br/>\r\n");

} else if ("failure".equals(request.getAttribute("status"))) {

      out.write("\r\n");
      out.write("<font color=\"red\">The following error occurred <br/> ");
      out.print( request.getAttribute("cause") );
      out.write("</font><br/>\r\n");
 } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form method=\"post\" name=\"Axis2upload\" id=\"Axis2upload\" action=\"axis2-admin/upload\"\r\n");
      out.write("      enctype=\"multipart/form-data\">\r\n");
      out.write("  <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>Service archive : </td>\r\n");
      out.write("      <td><input id=\"serviceUpload\" type=\"file\" name=\"filename\" size=\"50\"/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td>&nbsp;</td>\r\n");
      out.write("      <td><input name=\"upload\" type=\"button\" onclick=\"javascript:checkFileUpload();\" value=\" Upload \"/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("<blockquote>\r\n");
      out.write("<p>Hot deployment of new service archives is ");
      out.print(request.getAttribute("hotDeployment") );
      out.write("</p>\r\n");
      out.write("<p>Hot update of existing service archives is ");
      out.print(request.getAttribute("hotUpdate") );
      out.write("</p>\r\n");
      out.write("</blockquote>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/adminfooter.inc", out, false);
      out.write('\r');
      out.write('\n');
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
