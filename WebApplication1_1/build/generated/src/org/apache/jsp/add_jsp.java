package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang = \"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"css/about_us.css\">\n");
      out.write("        <!--Bootstrap--> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Register</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <style>\n");
      out.write("            p.heading{\n");
      out.write("                text-align : center;\t\n");
      out.write("                padding : 20px;\n");
      out.write("                font-size : 50px;\n");
      out.write("                color : orange;\n");
      out.write("                font-family: HeadFont;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("                background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('img/d.jpg');\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-attachment:fixed;\n");
      out.write("                background-position : center center;\n");
      out.write("   }\n");
      out.write("\n");
      out.write("            input[type=text], input[type=password], input[type=email] {\n");
      out.write("                width: 90%;\n");
      out.write("                padding: 5px 2px;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 5px;\n");
      out.write("\n");
      out.write("            } \n");
      out.write("\n");
      out.write("            .start_login{\n");
      out.write("                padding: 16px;\n");
      out.write("                text-align : center;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form_design{\n");
      out.write("                margin : 3% 30% 0% 35%;\n");
      out.write("                width  : 30%;\n");
      out.write("                background: linear-gradient(rgba(0,0,0,.6), rgba(0,0,0,.6));\n");
      out.write("                border: 1px solid blueviolet;\n");
      out.write("                border-radius: 40px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            *{\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @font-face {\n");
      out.write("                font-family: NavFont;\n");
      out.write("                src: url(Fonts/fon4.otf);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            @font-face{\n");
      out.write("                font-family: TextFont;\n");
      out.write("                src: url(Fonts/font1.otf);;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @font-face {\n");
      out.write("                font-family: HeadFont;\n");
      out.write("                src: url(Fonts/font2.otf);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("          ");

    if(session.getAttribute("username")== null){
        response.sendRedirect("index.html");
    }
    
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li><a href=\"Index.html\">Home</a></li>\n");
      out.write("\n");
      out.write("                    <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    \n");
      out.write("                     <li><a href=\"logout.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <p class = \"heading\"><b>Place Your Order</b></p>\n");
      out.write("\n");
      out.write("        <form class = \"form_design\"  action = \"add\" method = \"post\">\n");
      out.write("\n");
      out.write("            <div class = \"start_login\">\n");
      out.write("\n");
      out.write("                  <label for = \"name\" style = \"font-size:30px; color:#F5FFFA;\">Name</label>\n");
      out.write("                <input type = \"text\" placeholder = \"Enter Name\" name = \"name\" required>\n");
      out.write("                \n");
      out.write("                  <label for = \"location\" style = \"font-size:30px; color:#F5FFFA;\"> Location</label>\n");
      out.write("                <input type = \"text\" placeholder = \"Enter Location\" name = \"location\" required><br><br>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <label for = \"weight\" style = \"font-size:30px; color:#F5FFFA;\">Weight of Clothes</label>\n");
      out.write("                <input type = \"text\" placeholder = \"Enter Weight of Clothes\" name = \"weight\" required><br><br>\n");
      out.write("\n");
      out.write("              \n");
      out.write("              \n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                \n");
      out.write("                <button type = \"submit\" class=\"btn btn-primary\" name = \"user-register\" style=\"font-size: 20px; width: 50%;\"><b>Submit Order</b></button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      \n");
      out.write(" ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
