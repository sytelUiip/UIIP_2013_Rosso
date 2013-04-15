package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ServiceContext;
import org.apache.axis2.context.ServiceGroupContext;
import org.apache.axis2.deployment.util.PhasesInfo;
import org.apache.axis2.description.AxisModule;
import org.apache.axis2.description.AxisOperation;
import org.apache.axis2.description.AxisService;
import org.apache.axis2.description.AxisServiceGroup;
import org.apache.axis2.description.Parameter;
import org.apache.axis2.engine.AxisConfiguration;
import org.apache.axis2.engine.Handler;
import org.apache.axis2.engine.Phase;
import org.apache.axis2.util.JavaUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public final class LeftFrame_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" style=\"border-right:1px solid #CCCCCC;\">\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td colspan=\"2\" >\r\n");
      out.write("       <b>Tools </b>\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/upload\">Upload Service</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("<tr>\r\n");
      out.write("     <td colspan=\"2\" >\r\n");
      out.write("      <b><nobr>System Components&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</nobr></b>\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    </td>\r\n");
      out.write("    <td >\r\n");
      out.write("      <a href=\"axis2-admin/listService\">Available Services</a>\r\n");
      out.write("    </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    </td>\r\n");
      out.write("    <td >\r\n");
      out.write("      <a href=\"axis2-admin/listServiceGroups\">Available Service Groups</a>\r\n");
      out.write("    </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    </td>\r\n");
      out.write("    <td >\r\n");
      out.write("      <a href=\"axis2-admin/listModules\">Available Modules</a>\r\n");
      out.write("    </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    </td>\r\n");
      out.write("    <td>\r\n");
      out.write("      <a href=\"axis2-admin/globalModules\">Globally Engaged Modules</a>\r\n");
      out.write("    </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("    <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("    </td>\r\n");
      out.write("    <td >\r\n");
      out.write("      <a href=\"axis2-admin/listPhases\">Available Phases</a>\r\n");
      out.write("    </td>\r\n");
      out.write(" </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("     <td colspan=\"2\" >\r\n");
      out.write("       <b>Execution Chains</b>\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/viewGlobalHandlers\">Global Chains</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/selectService\">Operation Specific Chains</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td colspan=\"2\" >\r\n");
      out.write("       <b>Engage Module</b>\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("   <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("        &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/engagingglobally\">For all Services</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("        <td>\r\n");
      out.write("         &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>\r\n");
      out.write("          <a href=\"axis2-admin/engageToServiceGroup\">For a Service Group</a>\r\n");
      out.write("        </td>\r\n");
      out.write("     </tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/engageToService\">For a Service</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("     <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/listOperation\">For an Operation</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td colspan=\"2\" >\r\n");
      out.write("       <b>Services</b>\r\n");
      out.write("     </td>\r\n");
      out.write("  </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/deactivateService\">Deactivate Service</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/activateService\">Activate Service</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/selectServiceParaEdit\">Edit Parameters</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("     <td colspan=\"2\" >\r\n");
      out.write("       <b>Contexts</b>\r\n");
      out.write("     </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("       <td>\r\n");
      out.write("       &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("       </td>\r\n");
      out.write("       <td>\r\n");
      out.write("         <a href=\"axis2-admin/listContexts\">View Hierarchy</a>\r\n");
      out.write("       </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("</table>\r\n");
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
