/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.10
 * Generated at: 2022-01-09 08:47:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Quenmk_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".popover.primary {\r\n");
      out.write("	border-color: #337ab7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.primary>.arrow {\r\n");
      out.write("	border-top-color: #337ab7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.primary>.popover-title {\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	background-color: #337ab7;\r\n");
      out.write("	border-color: #337ab7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.success {\r\n");
      out.write("	border-color: #d6e9c6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.success>.arrow {\r\n");
      out.write("	border-top-color: #d6e9c6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.success>.popover-title {\r\n");
      out.write("	color: #3c763d;\r\n");
      out.write("	background-color: #dff0d8;\r\n");
      out.write("	border-color: #d6e9c6;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.info {\r\n");
      out.write("	border-color: #bce8f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.info>.arrow {\r\n");
      out.write("	border-top-color: #bce8f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.info>.popover-title {\r\n");
      out.write("	color: #31708f;\r\n");
      out.write("	background-color: #d9edf7;\r\n");
      out.write("	border-color: #bce8f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.warning {\r\n");
      out.write("	border-color: #faebcc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.warning>.arrow {\r\n");
      out.write("	border-top-color: #faebcc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.warning>.popover-title {\r\n");
      out.write("	color: #8a6d3b;\r\n");
      out.write("	background-color: #fcf8e3;\r\n");
      out.write("	border-color: #faebcc;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.danger {\r\n");
      out.write("	border-color: #ebccd1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.danger>.arrow {\r\n");
      out.write("	border-top-color: #ebccd1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".popover.danger>.popover-title {\r\n");
      out.write("	color: #a94442;\r\n");
      out.write("	background-color: #f2dede;\r\n");
      out.write("	border-color: #ebccd1;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container\" >\r\n");
      out.write("\r\n");
      out.write("		<h3 style=\"color: #00BFFF; text-align: center;\">Forgot Password?</h3>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-lg-6\">\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<label>Username</label>\r\n");
      out.write("					<div class=\"input-group\">\r\n");
      out.write("						<span class=\"input-group-addon\"><span\r\n");
      out.write("							class=\"glyphicon glyphicon-user\"></span></span> <input type=\"text\"\r\n");
      out.write("							class=\"form-control\" name=\"Username\" id=\"Username\"\r\n");
      out.write("							placeholder=\"Requested Username\" required value=\"User\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<label>Email</label>\r\n");
      out.write("					<div class=\"input-group\">\r\n");
      out.write("						<span class=\"input-group-addon\"><span\r\n");
      out.write("							class=\"glyphicon glyphicon-envelope\"></span></span> <input type=\"text\"\r\n");
      out.write("							class=\"form-control\" name=\"Email\" id=\"Email\"\r\n");
      out.write("							placeholder=\"Requested Email\" required\r\n");
      out.write("							value=\"Sean.Wessell@gmail.com\"></div>\r\n");
      out.write("							\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<label>ID User</label>\r\n");
      out.write("					<div class=\"input-group\">\r\n");
      out.write("						<span class=\"input-group-addon\"><span\r\n");
      out.write("							class=\"glyphicon glyphicon-user\"></span></span> <input type=\"text\"\r\n");
      out.write("							class=\"form-control\" name=\"Username\" id=\"Username\"\r\n");
      out.write("							placeholder=\"Requested Username\" required value=\"ID\">\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<label>OTP</label>\r\n");
      out.write("				<div class=\"input-group\">\r\n");
      out.write("					<span class=\"input-group-addon\"><span\r\n");
      out.write("						class=\"glyphicon glyphicon-user\"></span></span> <input type=\"text\"\r\n");
      out.write("						class=\"form-control\" name=\"Username\" id=\"Username\"\r\n");
      out.write("						placeholder=\"Requested Username\" required value=\"OTP\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Submit\"\r\n");
      out.write("			class=\"btn btn-primary pull-left\" herf=\"NewFile.jsp\">\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
