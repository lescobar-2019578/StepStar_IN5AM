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
import modelo.Empleados;
import modelo.EmpleadosDAO;
import modelo.Productos;
import modelo.ProductosDAO;
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
                        List listaProductos = empleadoDao.listar();
                        request.setAttribute("empleado", listaProductos);
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
