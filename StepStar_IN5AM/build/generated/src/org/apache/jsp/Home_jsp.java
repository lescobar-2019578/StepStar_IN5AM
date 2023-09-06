package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"img/stepstar3.png\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resource/home.css\">\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <title>HOME </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header\" id=\"inicio\">\n");
      out.write("            <img src=\"img/hamburguesa.svg\" alt=\"\" class=\"hamburguer\">\n");
      out.write("            <nav class=\"menu-navegacion \">\n");
      out.write("                <a href=\"#inicio\">Inicio</a>\n");
      out.write("                <a href=\"#servicio\">Quienes Somos</a>\n");
      out.write("                <a href=\"#portafolio\">Algunos Estilos</a>\n");
      out.write("                <a href=\"#expertos\">Marcas</a>\n");
      out.write("                <a href=\"#contacto\">Contacto</a>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"contenedor head\">\n");
      out.write("                <h1 class=\"titulo\">StepStar</h1>\n");
      out.write("                <p class=\"copy\">Camina con estilo y brilla en cada paso</p>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <main>\n");
      out.write("            <section class=\"contenedor\" id=\"servicio\">\n");
      out.write("                <h2 class=\"subtitulo\">Quienes Somos</h2>\n");
      out.write("                <div class=\"contenedor-servicio\">\n");
      out.write("                    <img src=\"img/imagen8.jpg\" alt=\"\">\n");
      out.write("                    <div class=\"checklist-servicio\">\n");
      out.write("                        <div class=\"service\">\n");
      out.write("                            <h3 class=\"n-service\"><span class=\"number\">1</span>Mision</h3>\n");
      out.write("                            <p>En StepStar, nuestra misión es proporcionar a nuestros clientes una experiencia excepcional al adquirir calzado de\n");
      out.write("                            alta calidad que no solo complemente su estilo personal, sino que también cumpla con los más altos estándares de\n");
      out.write("                            comodidad y durabilidad. Nos esforzamos por ser mucho más que una simple tienda de zapatos; aspiramos a convertirnos\n");
      out.write("                            en el destino preferido para aquellos que buscan no solo productos de moda, sino también un servicio y una atención\n");
      out.write("                            al cliente sin igual.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"service\">\n");
      out.write("                            <h3 class=\"n-service\"><span class=\"number\">2</span>Vision</h3>\n");
      out.write("                            <p>Nuestra visión en StepStar es establecer un estándar excepcional en la industria del calzado,\n");
      out.write("                            convirtiéndonos en la tienda líder y de referencia en la mente de los clientes cuando se trata de elegancia,\n");
      out.write("                            comodidad y servicio excepcional. Nos esforzamos por moldear el futuro de la moda y el comercio minorista, creando\n");
      out.write("                            una experiencia de compra única y satisfactoria que perdure en el tiempo.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"service\">\n");
      out.write("                            <h3 class=\"n-service\"><span class=\"number\">3</span>Quienes Somos</h3>\n");
      out.write("                            <p>Somos StepStar, una tienda de zapatos comprometida con brindar a nuestros clientes una experiencia única\n");
      out.write("                            en moda y estilo. Nos enorgullecemos de ser mucho más que una simple tienda; somos un destino donde la elegancia, la\n");
      out.write("                            comodidad y la atención al cliente se unen para crear una experiencia de compra excepcional.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"gallery\" id=\"portafolio\">\n");
      out.write("                <div class=\"contenedor\">\n");
      out.write("                    <h2 class=\"subtitulo\">Algunos Estilos</h2>\n");
      out.write("                    <div class=\"contenedor-galeria\">\n");
      out.write("                        <img src=\"img/nike.png\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/aaaa.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/nose.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/imagen1.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/imagen2.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/new.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/imagen4.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/imagen5.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/imagen6.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/imagen9.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/imagen11.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                        <img src=\"img/eee.jpg\" alt=\"\" class=\"img-galeria\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("           <section class=\"imagen-light\">\n");
      out.write("                <img src=\"img/close.svg\" alt=\"\" class=\"close\">\n");
      out.write("                <img src=\"img/imagen9.jpg\" alt=\"\" class=\"agregar-imagen\">\n");
      out.write("            </section>\n");
      out.write("           <section class=\"contenedor\" id=\"expertos\">\n");
      out.write("               <h2 class=\"subtitulo\">Algunas Marcas</h2>\n");
      out.write("               <section class=\"experts\">\n");
      out.write("                   <div class=\"card\">\n");
      out.write("                   <div class=\"face front\">\n");
      out.write("                    <img src=\"img/adidas1.png\" alt=\"\">\n");
      out.write("                   </div>\n");
      out.write("                       <div class=\"face back\">                           \n");
      out.write("                            <h3>ADIDAS</h3>\n");
      out.write("                            <p>Adidas es otra importante empresa multinacional de ropa deportiva, calzado y accesorios deportivos, Adidas es una de las marcas deportivas más reconocidas y emblemáticas a nivel mundial.</p>\n");
      out.write("                         <div class=\"link\">\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"card\">\n");
      out.write("                       <div class=\"face front\">\n");
      out.write("                           <img src=\"img/converse2.avif\" alt=\"\">\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"face back\">\n");
      out.write("                           <h3>CONVERSE</h3>\n");
      out.write("                           <p>Converse es una marca de calzado y ropa estadounidense conocida principalmente por sus zapatillas deportivas icónicas y su diseño distintivo</p>\n");
      out.write("                           <div class=\"link\">                               \n");
      out.write("                           </div>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"card\">\n");
      out.write("                       <div class=\"face front\">\n");
      out.write("                           <img src=\"img/jordan4.png\" alt=\"\">\n");
      out.write("                       </div>\n");
      out.write("                       <div class=\"face back\">\n");
      out.write("                           <h3>JORDAN</h3>\n");
      out.write("                           <p>Jordan es una línea de productos deportivos y de estilo de vida de la marca Nike, Inc. Esta línea lleva el nombre del famoso exjugador de baloncesto Michael Jordan</p>\n");
      out.write("                           <div class=\"link\">\n");
      out.write("                           </div>\n");
      out.write("                       </div>\n");
      out.write("                   </div>\n");
      out.write("               </section>\n");
      out.write("           </section>\n");
      out.write("        </main>\n");
      out.write("           <footer id=\"contacto\">\n");
      out.write("               <div class=\"contenedor footer-content\">\n");
      out.write("                   <div class=\"contact-us\">\n");
      out.write("                       <h2 class=\"brand\">StepStar</h2>\n");
      out.write("                       <p>Camina con estilo y brilla en cada paso</p>\n");
      out.write("                   </div>\n");
      out.write("                   <div class=\"social-media\">\n");
      out.write("                       <a href=\"https://www.facebook.com\" class=\"social-media-icon\">\n");
      out.write("                           <i class='bx bxl-facebook'></i>\n");
      out.write("                       </a>\n");
      out.write("                       <a href=\"https://twitter.com/i/flow/login?input_flow_data=%7B\" class=\"social-media-icon\">\n");
      out.write("                           <i class='bx bxl-twitter' ></i>\n");
      out.write("                       </a>\n");
      out.write("                       <a href=\"https://www.instagram.com\" class=\"social-media-icon\">\n");
      out.write("                           <i class='bx bxl-instagram' ></i>\n");
      out.write("                       </a>\n");
      out.write("                   </div>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"line\"></div>\n");
      out.write("           </footer>\n");
      out.write("           \n");
      out.write("        <script src=\"resource/menu.js\"></script>\n");
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
