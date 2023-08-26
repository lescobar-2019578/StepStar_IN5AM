/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
                        List listaProveedor = proveedoresDao.listar();
                        request.setAttribute("proveedores", listaProveedor);
                        List listaCategoria = categoriaDao.listar();
                           request.setAttribute("categoria", listaCategoria);
                        break;
                    case "Agregar":
                        String nombre = request.getParameter("txtNombreProducto");
                        String descripcion = request.getParameter("txtDescripcion");
                        String marca = request.getParameter("txtMarca");
                        double precio = Double.parseDouble(request.getParameter("txtPrecio"));
                        int talla = Integer.parseInt(request.getParameter("txtTalla"));
                        int cantidad = Integer.parseInt(request.getParameter("txtCantidad"));
                        int codigoProveedor = Integer.parseInt(request.getParameter("cmbCodProveedor"));
                        int codigoCategoria = Integer.parseInt(request.getParameter("cmbCodCategoria"));
                        productos.setNombreProducto(nombre);
                        productos.setDescripcion(descripcion);
                        productos.setMarca(marca);
                        productos.setPrecio(precio);
                        productos.setTalla(talla);
                        productos.setCantidad(cantidad);
                        productos.setCodigoProveedor(codigoProveedor);
                        productos.setCodigoCategoria(codigoCategoria);
                        productosDao.agregar(productos);
                        request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                        break;
                    case "Editar":
                        codProducto = Integer.parseInt(request.getParameter("codigoProducto"));
                        Productos p = productosDao.listarCodigoProductos(codProducto);
                        request.setAttribute("productos", p);
                        request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                        break;
                    case "Actualizar":
                        String nombrePr = request.getParameter("txtNombreProducto");
                        String descripcionPr = request.getParameter("txtDescripcion");
                        String marcaPr = request.getParameter("txtMarca");
                        double precioPr = Double.parseDouble(request.getParameter("txtPrecio"));
                        int tallaPr = Integer.parseInt(request.getParameter("txtTalla"));
                        int cantidadPr = Integer.parseInt(request.getParameter("txtCantidad"));
                        productos.setNombreProducto(nombrePr);
                        productos.setDescripcion(descripcionPr);
                        productos.setMarca(marcaPr);
                        productos.setPrecio(precioPr);
                        productos.setTalla(tallaPr);
                        productos.setCantidad(cantidadPr);
                        productos.setCodigoProducto(codProducto);
                        productosDao.actualizar(productos);
                        request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                        break;
                    case "Eliminar":
                        codProducto = Integer.parseInt(request.getParameter("codigoProducto"));
                        productosDao.eliminar(codProducto);
                        request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
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
                        request.setAttribute("deshabilitarCombo", "true");
                        request.getRequestDispatcher("Controlador?menu=Empleados&accion=Listar").forward(request, response);
                        break;
                    case "Actualizar":
                        String DPIEmp = request.getParameter("txtDPIEmpleado");
                        String apellidosEmp = request.getParameter("txtApellidoEmpleado");
                        String nombresEmp = request.getParameter("txtNombreEmpleado");
                        String direccionEmp = request.getParameter("txtDireccionEmpleado");
                        String telefonoEmp = request.getParameter("txtTelefonoEmpleado");
                        empleado.setDPI(DPIEmp);
                        empleado.setApellidosEmpleado(apellidosEmp);
                        empleado.setNombresEmpleado(nombresEmp);
                        empleado.setDireccionEmpleado(direccionEmp);
                        empleado.setTelefonoContacto(telefonoEmp);
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
            else if(menu.equals("Compra")){
                switch(accion){
                    case "Listar":
                        List listaCompras = compraDao.listar();
                        request.setAttribute("compra", listaCompras);
                        List listaProductos = productosDao.listar();
                        request.setAttribute("producto", listaProductos);
                        break;
                    case "Agregar":
                        String fecha = request.getParameter("txtFechaCompra");
                        String descripCompra = request.getParameter("txtDescripcionCompra");
                        int cantidad = Integer.parseInt(request.getParameter("txtCantidadCompra"));
                        int codPr = Integer.parseInt(request.getParameter("cmbCodProducto"));
                        compras.setFechaCompra(fecha);
                        compras.setDescripcionCompra(descripCompra);
                        compras.setCantidad(cantidad);
                        compras.setCodigoProducto(codPr);
                        compraDao.agregar(compras);
                        request.getRequestDispatcher("Controlador?menu=Compra&accion=Listar").forward(request, response);
                        break;
                    case "Editar":
                        codCompra = Integer.parseInt(request.getParameter("codigoCompra"));
                        Compra compr = compraDao.listarCodigoCompra(codCompra);
                        request.setAttribute("comprasEncontrado", compr);
                        request.getRequestDispatcher("Controlador?menu=Compra&accion=Listar").forward(request, response);
                        break;
                    case "Actualizar":
                        String fechaCompra = request.getParameter("txtFechaCompra");
                        String descripcionCompra = request.getParameter("txtDescripcionCompra");
                        int cant = Integer.parseInt(request.getParameter("txtCantidadCompra"));
                        compras.setFechaCompra(fechaCompra);
                        compras.setDescripcionCompra(descripcionCompra);
                        compras.setCantidad(cant);
                        compras.setCodigoCompra(codCompra);
                        compraDao.actualizar(compras);
                        request.getRequestDispatcher("Controlador?menu=Compra&accion=Listar").forward(request, response);
                        break;
                    case "Eliminar":
                        codCompra = Integer.parseInt(request.getParameter("codigoCompra"));
                        compraDao.eliminar(codCompra);
                        request.getRequestDispatcher("Controlador?menu=Compra&accion=Listar").forward(request, response);
                        break;   
                }
                request.getRequestDispatcher("Compra.jsp").forward(request, response);
            }
            else if (menu.equals("DetalleCompra")) {
            switch (accion) {
                case "Listar":
                    List listaDetalleCompra = detalleCompraDao.listar();
                    request.setAttribute("detalleCompras", listaDetalleCompra);
                    List listaVentas = ventasDao.listar();
                    request.setAttribute("venta", listaVentas);
                    List listaCompras = compraDao.listar();
                        request.setAttribute("compra", listaCompras);
                    break;
                case "AgregarDetalleCompra":
                    Date fechaCom = Date.valueOf(request.getParameter("fecha"));
                    int cantidad = Integer.parseInt(request.getParameter("CantidadProducto"));
                    int codigoVenta = Integer.parseInt(request.getParameter("cmbCodigoVenta"));
                    int codigoCompra = Integer.parseInt(request.getParameter("cmbCodigoCompra"));
                    detalleCompra.setFechaCom(fechaCom);
                    detalleCompra.setCantidadProductos(cantidad);
                    detalleCompra.setCodigoVenta(codigoVenta);
                    detalleCompra.setCodigoCompra(codigoCompra);
                    detalleCompraDao.agregar(detalleCompra);
                    request.getRequestDispatcher("Controlador?menu=DetalleCompra&accion=Listar").forward(request, response);
                    break;
                case "EliminarDetalleCompra":
                     codDetalleCompra = Integer.parseInt(request.getParameter("codigoDetalleCompra"));
                    detalleCompraDao.eliminar(codDetalleCompra);
                    System.out.println(codDetalleCompra);
                    request.getRequestDispatcher("Controlador?menu=DetalleCompra&accion=Listar").forward(request, response);
                    break;
            }
            request.getRequestDispatcher("DetalleCompra.jsp").forward(request, response);
        }
            else if(menu.equals("Categoria")){
                   switch(accion){
                       case "Listar":
                           List listaCategoria = categoriaDao.listar();
                           request.setAttribute("categoria", listaCategoria);
                           List listaProductos = productosDao.listar();
                           request.setAttribute("producto", listaProductos);
                           break;
                       case "Agregar":
                           String nombreCategoria = request.getParameter("txtNombreCategoria");
                           String descCategoria = request.getParameter("txtDescCategoria");
                           boolean genero = Boolean.parseBoolean(request.getParameter("txtGenero"));
                           int codigoProducto = Integer.parseInt(request.getParameter("cmbCodProducto"));
                           categoria.setNombreCategoria(nombreCategoria);
                           categoria.setDescripcion(descCategoria);
                           categoria.setGenero(genero);
                           categoria.setCodigoProducto(codigoProducto);
                           categoriaDao.agregarCategoria(categoria);
                           request.getRequestDispatcher("Controlador?menu=Categoria&accion=Listar").forward(request, response);
                           break;
                           
                       case "Editar":
                           codCategoria = Integer.parseInt(request.getParameter("codigoCategoria"));
                           Categoria c = categoriaDao.buscarPorCodigoCategoria(codCategoria);
                           request.setAttribute("categoriaEncontrada", c);
                           request.setAttribute("deshabilitarCombo", "true");
                           request.getRequestDispatcher("Controlador?menu=Categoria&accion=Listar").forward(request, response);
                           break;
                           
                       case "Actualizar":
                           String nombreCategoriaEmp = request.getParameter("txtNombreCategoria");
                           String descCategoriaEmp = request.getParameter("txtDescCategoria");
                           boolean generoEmp = Boolean.parseBoolean(request.getParameter("txtGenero"));
                           categoria.setNombreCategoria(nombreCategoriaEmp);
                           categoria.setDescripcion(descCategoriaEmp);
                           categoria.setGenero(generoEmp);
                           categoria.setCodigoCategoria(codCategoria);
                           categoriaDao.actualizarCategoria(categoria);
                           request.getRequestDispatcher("Controlador?menu=Categoria&accion=Listar").forward(request, response);
                           break;

                       case "Eliminar":
                           int codigoCategoriaEliminar = Integer.parseInt(request.getParameter("codigoCategoria"));
                           categoriaDao.eliminarCategoria(codigoCategoriaEliminar);
                           request.getRequestDispatcher("Controlador?menu=Categoria&accion=Listar").forward(request, response);
                           break;
                        
                }
                request.getRequestDispatcher("Categoria.jsp").forward(request, response);
                
                }else if(menu.equals("Clientes")){
                switch(accion){
                    case "Listar":
                        List listaClientes = clientesDao.listar();
                        request.setAttribute("clientes", listaClientes);
                        break;
                    case "Agregar":
                        String nombre = request.getParameter("txtNombresCliente");
                        String apellido = request.getParameter("txtApellidosCliente");
                        String nit = request.getParameter("txtNit");
                        String estado = request.getParameter("txtEstadoActivo");
                        String telefono = request.getParameter("txtTelefonoCliente");
                        clientes.setNombresCliente(nombre);
                        clientes.setApellidoCliente(apellido);
                        clientes.setNit(nit);
                        clientes.setEstadoActivo(estado);
                        clientes.setTelefonoCliente(telefono);
                        clientesDao.agregar(clientes);
                        request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                        break;
                    case "Editar":
                        codCliente = Integer.parseInt(request.getParameter("codigoCliente"));
                        Cliente cli = clientesDao.listarCodigoCliente(codCliente);
                        request.setAttribute("cliente", cli);
                        request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                        break;
                    case "Actualizar":
                        String nombreCli = request.getParameter("txtNombresCliente");
                        String apellidoCli = request.getParameter("txtApellidosCliente");
                        String Nit = request.getParameter("txtNit");
                        String estadoA = request.getParameter("txtEstadoActivo");
                        String telefonoCli = request.getParameter("txtTelefonoCliente");
                        clientes.setNombresCliente(nombreCli);
                        clientes.setApellidoCliente(apellidoCli);
                        clientes.setNit(Nit);
                        clientes.setEstadoActivo(estadoA);
                        clientes.setTelefonoCliente(telefonoCli);
                        clientes.setCodigoCliente(codCliente);
                        clientesDao.actualizar(clientes);
                        request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                        break;
                    case "Eliminar":
                        codCliente = Integer.parseInt(request.getParameter("codigoCliente"));
                        clientesDao.eliminar(codCliente);
                        request.getRequestDispatcher("Controlador?menu=Clientes&accion=Listar").forward(request, response);
                        break;
                
            }
                request.getRequestDispatcher("Cliente.jsp").forward(request, response);
        }  else if (menu.equals("Ventas")) {
            switch (accion) {
                case "Listar":
                    List listaVentas = ventasDao.listar();
                    request.setAttribute("venta", listaVentas);
                    List listaServicios = serviciosDao.listar();
                    request.setAttribute("servicio", listaServicios);
                    break;

                case "Agregar":
                    String fecha = request.getParameter("txtFecha");
                    String desc = request.getParameter("txtDescripcion");
                    int cantidad = Integer.parseInt(request.getParameter("txtCantidad"));
                    String direccion = request.getParameter("txtDireccion");
                    int codServicio = Integer.parseInt(request.getParameter("cmbCodServicio"));
                    ventas.setFechaVenta(fecha);
                    ventas.setDescripcion(desc);
                    ventas.setCantidad(cantidad);
                    ventas.setDireccionEnvio(direccion);
                    ventas.setCodigoServicio(codServicio);
                    ventasDao.agregar(ventas);
                    request.getRequestDispatcher("Controlador?menu=Ventas&accion=Listar").forward(request, response);
                    break;

                case "Editar":
                    codVentas = Integer.parseInt(request.getParameter("codigoVenta"));
                    Ventas v = ventasDao.listarCodigoVentas(codVentas);
                    request.setAttribute("ventaEncontrada", v);
                    request.getRequestDispatcher("Controlador?menu=Ventas&accion=Listar").forward(request, response);
                    break;

                case "Actualizar":
                    String fechaVenta = request.getParameter("txtFecha");
                    String descVenta = request.getParameter("txtDescripcion");
                    int cantidadVenta = Integer.parseInt(request.getParameter("txtCantidad"));
                    String direccionVenta = request.getParameter("txtDireccion");
                    ventas.setFechaVenta(fechaVenta);
                    ventas.setDescripcion(descVenta);
                    ventas.setCantidad(cantidadVenta);
                    ventas.setDireccionEnvio(direccionVenta);
                    ventas.setCodigoVenta(codVentas);
                    ventasDao.actualizar(ventas);
                    request.getRequestDispatcher("Controlador?menu=Ventas&accion=Listar").forward(request, response);
                    break;

                case "Eliminar":

                    codVentas = Integer.parseInt(request.getParameter("codigoVenta"));
                    ventasDao.eliminar(codVentas);
                    request.getRequestDispatcher("Controlador?menu=Ventas&accion=Listar").forward(request, response);
                    break;

            }
            request.getRequestDispatcher("Ventas.jsp").forward(request, response);
            
        
        }else if(menu.equals("Servicios")){
                switch(accion){
                    case "Listar":
                        List listaServicios = serviciosDao.listar();
                        request.setAttribute("servicios", listaServicios);
                        List listaEmpleados = empleadoDao.listar();
                        request.setAttribute("empleados", listaEmpleados);
                        break;
                    case "Agregar":
                        String fecha = request.getParameter("txtFechaServicio");
                        String tipo = request.getParameter("txtTipoServicio");
                        String hora = request.getParameter("txtHoraServicio");
                        String lugar = request.getParameter("txtLugarServicio");
                        String telefono = request.getParameter("txtTelefonoServicio");
                        int codigoEmpleado = Integer.parseInt(request.getParameter("cmbCodEmpleado"));
                        servicios.setFechaServicio(fecha);
                        servicios.setTipoServicio(tipo);
                        servicios.setHoraServicio(hora);
                        servicios.setLugarServicio(lugar);
                        servicios.setTelefonoServicio(telefono);
                        servicios.setCodigoEmpleado(codigoEmpleado);
                        serviciosDao.agregar(servicios);
                        request.getRequestDispatcher("Controlador?menu=Servicios&accion=Listar").forward(request, response);
                        break;
                    case "Editar":
                        codServicio =  Integer.parseInt(request.getParameter("codigoServicio"));
                        Servicios sv = serviciosDao.listarCodigoServicios(codServicio);
                        request.setAttribute("deshabilitarCombo", sv);
                        request.setAttribute("servicio", sv);
                        request.setAttribute("deshabilitarCombo", "true");
                        request.getRequestDispatcher("Controlador?menu=Servicios&accion=Listar").forward(request, response);
                  
                        break;
                    case "Actualizar":
                        String fechaServ = request.getParameter("txtFechaServicio");
                        String tipoServ = request.getParameter("txtTipoServicio");
                        String horaServ = request.getParameter("txtHoraServicio");
                        String lugarServ = request.getParameter("txtLugarServicio");
                        String telefonoServ = request.getParameter("txtTelefonoServicio");
                        servicios.setFechaServicio(fechaServ);
                        servicios.setTipoServicio(tipoServ);
                        servicios.setHoraServicio(horaServ);
                        servicios.setLugarServicio(lugarServ);
                        servicios.setTelefonoServicio(telefonoServ);
                        servicios.setCodigoServicio(codServicio);
                        serviciosDao.actualizar(servicios);
                        request.getRequestDispatcher("Controlador?menu=Servicios&accion=Listar").forward(request, response);
                        break;
                    case "Eliminar":
                        codServicio = Integer.parseInt(request.getParameter("codigoServicio"));
                        serviciosDao.eliminar(codServicio);
                        request.getRequestDispatcher("Controlador?menu=Servicios&accion=Listar").forward(request, response);
                        break;
                        
                }
                request.getRequestDispatcher("Servicio.jsp").forward(request, response);
                
                
            }else if(menu.equals("DetalleVenta")){
                switch(accion){
                    case "Listar":
                        List listaDetalleVenta = detalleVentaDao.listar();
                        request.setAttribute("detalleVenta", listaDetalleVenta);
                        List listaVentas = ventasDao.listar();
                        request.setAttribute("venta", listaVentas);
                        List listaProductos = productosDao.listar();
                        request.setAttribute("producto", listaProductos);
                        break;
                    case "Agregar":
                        String fechaVen = request.getParameter("txtFechaVen");
                        int cantidadPro = Integer.parseInt(request.getParameter("txtCantidadPro"));
                        String total = request.getParameter("txtTotal");
                        int codigoVenta = Integer.parseInt(request.getParameter("cmbCodVenta"));
                        int codigoProducto = Integer.parseInt(request.getParameter("cmbCodProducto"));
                        detalleVen.setFechaVen(fechaVen);
                        detalleVen.setCantidadPro(cantidadPro);
                        detalleVen.setTotal(total);
                        detalleVen.setCodigoVenta(codigoVenta);
                        detalleVen.setCodigoProducto(codigoProducto);
                        detalleVentaDao.agregar(detalleVen);
                        request.getRequestDispatcher("Controlador?menu=DetalleVenta&accion=Listar").forward(request, response);
                        break;   
                    case "Eliminar":
                        codDetalleVenta = Integer.parseInt(request.getParameter("codigoDetalleVenta"));
                        detalleVentaDao.eliminar(codDetalleVenta);
                        request.getRequestDispatcher("Controlador?menu=DetalleVenta&accion=Listar").forward(request, response);
                        break;
                }
                request.getRequestDispatcher("DetalleVenta.jsp").forward(request, response);
                
             
            }else if(menu.equals("TipoEmpleado")){
                switch(accion){
                    case "Listar":
                        List listaTipoEmpleado = tipoEmpleadoDao.listar();
                        request.setAttribute("tipoEmpleados", listaTipoEmpleado);
                        break;
                    case  "Agregar":
                        String descTipoEmpleado = request.getParameter("txtDescTipoEmpleado");
                        String suel = request.getParameter("txtSueldo");
                        String boni = request.getParameter("txtBonificacion");
                        String categoriaEmpleado = request.getParameter("txtCategoriaEmpleado");
                        tipoEmpleado.setDescTipoEmpleado(descTipoEmpleado);
                        tipoEmpleado.setSueldo(suel);
                        tipoEmpleado.setBonificacion(boni);
                        tipoEmpleado.setCategoriaEmpleado(categoriaEmpleado);
                        tipoEmpleadoDao.agregar(tipoEmpleado);
                        request.getRequestDispatcher("Controlador?menu=TipoEmpleado&accion=Listar").forward(request, response);
                        break;
                    case "Editar":
                        codTipoEmpleado = Integer.parseInt(request.getParameter("codigoTipoEmpleado"));
                        TipoEmpleado TE = tipoEmpleadoDao.listarCodigoTipoEmpleado(codTipoEmpleado);
                        request.setAttribute("tipoEmpleado", TE);
                        request.getRequestDispatcher("Controlador?menu=TipoEmpleado&accion=Listar").forward(request, response);
                        break;
                    case "Actualizar":    
                        String descTipoEmplead = request.getParameter("txtDescTipoEmpleado");
                        String sueldo = request.getParameter("txtSueldo");
                        String bonificacion = request.getParameter("txtBonificacion");
                        String categoriaEmp = request.getParameter("txtCategoriaEmpleado");
                        tipoEmpleado.setDescTipoEmpleado(descTipoEmplead);
                        tipoEmpleado.setSueldo(sueldo);
                        tipoEmpleado.setBonificacion(bonificacion);
                        tipoEmpleado.setCategoriaEmpleado(categoriaEmp);
                        tipoEmpleado.setCodigoTipoEmpleado(codTipoEmpleado);
                        tipoEmpleadoDao.actualizar(tipoEmpleado);
                        request.getRequestDispatcher("Controlador?menu=TipoEmpleado&accion=Listar").forward(request, response);
                        break;
                    case "Eliminar":    
                        codTipoEmpleado = Integer.parseInt(request.getParameter("codigoTipoEmpleado"));
                        tipoEmpleadoDao.eliminar(codTipoEmpleado);
                        request.getRequestDispatcher("Controlador?menu=TipoEmpleado&accion=Listar").forward(request, response);
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
