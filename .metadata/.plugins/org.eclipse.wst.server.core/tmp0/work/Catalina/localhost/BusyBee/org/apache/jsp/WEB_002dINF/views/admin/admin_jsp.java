/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-03-17 15:46:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Main View</title>\n");
      out.write("\n");
      out.write("<!-- 부트스트랩 JavaScript 및 의존성 -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.3/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 원하는 글꼴 추가 -->\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Dongle:wght@300;400;700&family=Jua&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Font Awesome 아이콘 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("body{\n");
      out.write("font-family: 'Black Han Sans', sans-serif;\n");
      out.write("font-family: 'Dongle', sans-serif;\n");
      out.write("font-family: 'Jua', sans-serif;\n");
      out.write(" justify-content: center;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".flex-container {\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: center;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".flex-item {\n");
      out.write("  margin: 15px;\n");
      out.write("  width: 400px;\n");
      out.write("  margin: 15px;\n");
      out.write("  text-align: center;\n");
      out.write("  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-body {\n");
      out.write("  height: 500px;\n");
      out.write("  font-size: 14px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("#notice{\n");
      out.write("  display: flex;\n");
      out.write("  justify-content: center;\n");
      out.write("  text-align: center;\n");
      out.write("  font-size: 15px;\n");
      out.write("  margin-top:40px;\n");
      out.write("  margin-left: auto;\n");
      out.write("  margin-right: auto;\n");
      out.write("  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-header{\n");
      out.write("font-size: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-button{\n");
      out.write("padding: 200px 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!-- 부트스트랩 CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://bootswatch.com/5/minty/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"flex-container\" >\n");
      out.write("\n");
      out.write("<div class=\"flex-item card border-light mb-3\" >\n");
      out.write("  <div class=\"card-header\" ></div>\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("    <button class=\"card-button\" onclick=\"userList()\">회원 관리</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"flex-item card border-light mb-3\">\n");
      out.write("  <div class=\"card-header\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <button class=\"card-button\" onclick=\"boardList()\">게시글 관리</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"flex-item card border-light mb-3\">\n");
      out.write("  <div class=\"card-header\"></div>\n");
      out.write("  <div class=\"card-body\">\n");
      out.write("    <button class=\"card-button\" onclick=\"reportList()\">신고 관리</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function userList() {\n");
      out.write("	location.href=\"userList.do\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function boardList() {\n");
      out.write("	location.href=\"boardList.do\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function reportList() {\n");
      out.write("	location.href=\"reportList.do\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
