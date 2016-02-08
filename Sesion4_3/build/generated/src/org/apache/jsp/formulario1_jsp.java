package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>label{background-color: olive;font-weight: bolder; padding: 3px; min-width: 200px !important} div{padding:3px;}</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div style=\"background-color: goldenrod; font-weight: bolder;margin-bottom: 5px\">VIDEOCLUB ON-LINE</div>\n");
      out.write("        <form method=\"post\" action=\"CapturaDatosVideoClub\">\n");
      out.write("        <div>\n");
      out.write("            <label for=\"pelicula\">Nombre Pelicula</label>\n");
      out.write("            <input type=\"text\" name=\"pelicula\" id=\"pelicula\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"dias\">Numero Dias Alquiler</label>\n");
      out.write("            <input type=\"text\" name=\"dias\" id=\"dias\">\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label>Edad Cliente</label>\n");
      out.write("            <div>\n");
      out.write("                <input type=\"radio\" name=\"edad\" value=\"1\"> Menor de 7 años<br>\n");
      out.write("                <input type=\"radio\" name=\"edad\" value=\"2\"> Menor de 14 años<br>\n");
      out.write("                <input type=\"radio\" name=\"edad\" value=\"3\"> Menor de 18 años<br>\n");
      out.write("                <input type=\"radio\" name=\"edad\" value=\"4\"> Mayor de 18 años<br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label>Forma de Pago</label>\n");
      out.write("            <select name=\"pago\">\n");
      out.write("                <option value=\"1\">VISA</option>\n");
      out.write("                <option value=\"2\">MasterCard</option>\n");
      out.write("                <option value=\"3\">Paypal</option>\n");
      out.write("                <option value=\"4\">Contra reembolso</option>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label>Especificaciones Extras</label>                 \n");
      out.write("            <div><textarea name=\"extras\" cols=\"70\" rows=\"10\"></textarea></div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <input type=\"submit\" value=\"Enviar Pedido\">\n");
      out.write("            <input type=\"reset\" value=\"Borrar Formulario\">\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
