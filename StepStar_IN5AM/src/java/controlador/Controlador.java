/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Categoria;
import modelo.CategoriaDAO;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Compra;
import modelo.CompraDAO;
import modelo.DetalleCompra;
import modelo.DetalleCompraDAO;
import modelo.DetalleVenta;
import modelo.DetalleVentaDAO;
import modelo.Empleados;
import modelo.EmpleadosDAO;
import modelo.Productos;
import modelo.ProductosDAO;
import modelo.Proveedor;
import modelo.ProveedoresDAO;
import modelo.Servicios;
import modelo.ServiciosDAO;
import modelo.TipoEmpleado;
import modelo.TipoEmpleadoDAO;
import modelo.Ventas;
import modelo.VentasDAO;

/**
 *
 * @author informatica
 */
public class Controlador extends HttpServlet {
    Productos productos = new Productos();
    ProductosDAO productosDao = new ProductosDAO();
    int codProducto;
    Empleados empleado = new Empleados();
    EmpleadosDAO empleadoDao = new EmpleadosDAO();
    int codEmpleado;
    Compra compras = new Compra();
    CompraDAO compraDao = new CompraDAO();
    int codCompra;
    DetalleCompra detalleCompra = new DetalleCompra();
    DetalleCompraDAO detalleCompraDao = new DetalleCompraDAO();
    int codDetalleCompra;
    Categoria categoria = new Categoria();
    CategoriaDAO categoriaDao = new CategoriaDAO();
    int codCategoria;
    Cliente clientes = new Cliente();
    ClienteDAO clientesDao = new ClienteDAO();
    int codCliente;
    Ventas ventas = new Ventas();
    VentasDAO ventasDao = new VentasDAO();
    int codVentas;
    Servicios servicios = new Servicios();
    ServiciosDAO serviciosDao = new ServiciosDAO();
    int codServicio;
    DetalleVenta detalleVen = new DetalleVenta();
    DetalleVentaDAO detalleVentaDao = new DetalleVentaDAO();
    int codDetalleVenta;
    TipoEmpleado tipoEmpleado = new TipoEmpleado();
    TipoEmpleadoDAO tipoEmpleadoDao = new TipoEmpleadoDAO();
    int codTipoEmpleado;
    Proveedor proveedor =  new Proveedor();
    ProveedoresDAO proveedoresDao =  new ProveedoresDAO();
    int codProveedor;

    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String menu = request.getParameter("menu");
            String accion = request.getParameter("accion");
            if(menu.equals("Principal")){
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
                
            }else if(menu.equals("Productos")){
                switch(accion){
                    case "Listar":
                        List listaProductos = productosDao.listar();
                        request.setAttribute("producto", listaProductos);
                        break;
                        
                }
                request.getRequestDispatcher("Producto.jsp").forward(request, response);
            }else if(menu.equals("Empleados")){
                switch(accion){
                    case "Listar":
                        List listaEmpleados = empleadoDao.listar();
                        request.setAttribute("empleados", listaEmpleados);
                        List listaTipoEmpleado = tipoEmpleadoDao.listar();
                        request.setAttribute("tipoEmpleado", listaTipoEmpleado);
                        break;
                    case "Agregar":
                        String DPI = request.getParameter("txtDPIEmpleado");
                        String apellidos = request.getParameter("txtApellidoEmpleado");
                        String nombres = request.getParameter("txtNombreEmpleado");
                        String direccion = request.getParameter("txtDireccionEmpleado");
                        String telefono = request.getParameter("txtTelefonoEmpleado");
                        int codigoTipoEmpleado = Integer.parseInt(request.getParameter("cmbCodigoTipoEmpleado"));
                        empleado.setDPI(DPI);
                        empleado.setApellidosEmpleado(apellidos);
                        empleado.setNombresEmpleado(nombres);
                        empleado.setDireccionEmpleado(direccion);
                        empleado.setTelefonoContacto(telefono);
                        empleado.setCodigoTipoEmpleado(codigoTipoEmpleado);
                        empleadoDao.agregar(empleado);
                        request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);
                        break;   
                    case "Editar":
                        codEmpleado =  Integer.parseInt(request.getParameter("codigoEmpleado"));
                        Empleados e = empleadoDao.listarCodigoEmpleados(codEmpleado);
                        request.setAttribute("empleadoEncontrado", e);
                        request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);
                        break;
                    case "Actualizar":
                        String DPIEmp = request.getParameter("txtDPIEmpleado");
                        String apellidosEmp = request.getParameter("txtApellidoEmpleado");
                        String nombresEmp = request.getParameter("txtNombreEmpleado");
                        String direccionEmp = request.getParameter("txtDireccionEmpleado");
                        String telefonoEmp = request.getParameter("txtTelefonoEmpleado");
                        int codigoTipoEmpleadoEmp = Integer.parseInt(request.getParameter("cmbCodigoTipoEmpleado"));
                        empleado.setDPI(DPIEmp);
                        empleado.setApellidosEmpleado(apellidosEmp);
                        empleado.setNombresEmpleado(nombresEmp);
                        empleado.setDireccionEmpleado(direccionEmp);
                        empleado.setTelefonoContacto(telefonoEmp);
                        empleado.setCodigoTipoEmpleado(codigoTipoEmpleadoEmp);
                        empleado.setCodigoEmpleado(codEmpleado);
                        empleadoDao.actualizar(empleado);
                        request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);
                        break;
                    case "Eliminar":
                        codEmpleado = Integer.parseInt(request.getParameter("codigoEmpleado"));
                        empleadoDao.eliminar(codEmpleado);
                        request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);
                        break;
                        
                }
                request.getRequestDispatcher("Empleado.jsp").forward(request, response);
    }
            else if(menu.equals("Compras")){
                switch(accion){
                    case "Listar":
                        List listaCompras = compraDao.listar();
                        request.setAttribute("compra", listaCompras);
                        break;
                        
                }
                request.getRequestDispatcher("Compra.jsp").forward(request, response);
            }
            else if (menu.equals("DetalleCompra")) {
            switch (accion) {
                case "Listar":
                    List listaDetalleCompra = detalleCompraDao.listar();
                    request.setAttribute("detalleCompras", listaDetalleCompra);
                    break;
            }
            request.getRequestDispatcher("DetalleCompra.jsp").forward(request, response);
        }
            else if(menu.equals("Categoria")){
                   switch(accion){
                       case "Listar":
                           List listaCategoria = categoriaDao.listar();
                           request.setAttribute("categoria", listaCategoria);
                           break;
                        
                }
                request.getRequestDispatcher("Categoria.jsp").forward(request, response);
                }else if(menu.equals("Clientes")){
                switch(accion){
                    case "Listar":
                        List listaClientes = clientesDao.listar();
                        request.setAttribute("cliente", listaClientes);
                        break;
                
            }
                request.getRequestDispatcher("Cliente.jsp").forward(request, response);
        }  else if(menu.equals("Ventas")){
            switch(accion){
                case "Listar":
                    List listaVentas = ventasDao.listar();
                    request.setAttribute("venta", listaVentas);
                    break;
                
            }
            request.getRequestDispatcher("Ventas.jsp").forward(request, response);
            
        
        }else if(menu.equals("Servicios")){
                switch(accion){
                    case "Listar":
                        List listaServicios = serviciosDao.listar();
                        request.setAttribute("servicio", listaServicios);
                        break;
                        
                }
                request.getRequestDispatcher("Servicio.jsp").forward(request, response);
                
                
            }else if(menu.equals("DetalleVenta")){
                switch(accion){
                    case "Listar":
                        List listaDetalleVenta = detalleVentaDao.listar();
                        request.setAttribute("detalleVenta", listaDetalleVenta);
                        break;
                        
                }
                request.getRequestDispatcher("DetalleVenta.jsp").forward(request, response);
            }else if(menu.equals("TipoEmpleado")){
                switch(accion){
                    case "Listar":
                        List listaTipoEmpleado = tipoEmpleadoDao.listar();
                        request.setAttribute("tipoEmpleado", listaTipoEmpleado);
                        break;
                        
                }
                request.getRequestDispatcher("TipoEmpleado.jsp").forward(request, response);
            }else if(menu.equals("Proveedor")){
                switch(accion){
                    case "Listar":
                        List listaProveedor = proveedoresDao.listar();
                        request.setAttribute("proveedores", listaProveedor);
                        break;
                    case "Agregar":
                        String nombrePro = request.getParameter("txtNombreProveedor");
                        String direcPro = request.getParameter("txtDireccionProveedor");
                        String telPro = request.getParameter("txtTelefonoProveedor");
                        String correoPro = request.getParameter("txtCorreoProveedor");
                        proveedor.setNombreProveedor(nombrePro);
                        proveedor.setDireccionProveedor(direcPro);
                        proveedor.setTelefonoProveedor(telPro);
                        proveedor.setCorreoProveedor(correoPro);
                        proveedoresDao.agregar(proveedor);
                        request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                        break;
                    case "Editar":
                        codProveedor = Integer.parseInt(request.getParameter("codigoProveedor"));
                        Proveedor pr = proveedoresDao.listarCodigoProveedor(codProveedor);
                        request.setAttribute("proveedor", pr);
                        request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                        break;
                    case "Actualizar":
                        String nombreProve = request.getParameter("txtNombreProveedor");
                        String direcProve = request.getParameter("txtDireccionProveedor");
                        String telProve = request.getParameter("txtTelefonoProveedor");
                        String correoProve = request.getParameter("txtCorreoProveedor");
                        proveedor.setNombreProveedor(nombreProve);
                        proveedor.setDireccionProveedor(direcProve);
                        proveedor.setTelefonoProveedor(telProve);
                        proveedor.setCorreoProveedor(correoProve);
                        proveedor.setCodigoProveedor(codProveedor);
                        proveedoresDao.actualizar(proveedor);
                        request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                        break;
                    case "Eliminar":
                        codProveedor = Integer.parseInt(request.getParameter("codigoProveedor"));
                        proveedoresDao.eliminar(codProveedor);
                        request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                        break;
                }
                request.getRequestDispatcher("Proveedor.jsp").forward(request, response);
            }else if(menu.equals("Home")){
                 request.getRequestDispatcher("Home.jsp").forward(request, response);
            }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
