
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Categoria" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <style>
            body{
                background-image: url("img/fondo.png");
                background-size: cover;
                background-repeat: no-repeat;
            }
        </style>
        <title>Pagina Producto</title>
    </head>
    <body>
        <div class="d-flex">
            <div style="background-color:#1E3E59" class="card colo-sm-3">
                <div style="background-color:#1E3E59" class="card-body">
                    <form action="Controlador?menu=Productos" method="POST">
                        <div class="form-group">
                            <label style="color: #f2f2f2">Nombre Producto:</label>
                            <input type="text" value="${productos.getNombreProducto()}" name="txtNombreProducto" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Descipción:</label>
                            <input type="text" value="${productos.getDescripcion()}" name="txtDescripcion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Marca:</label>
                            <input type="text" value="${productos.getMarca()}" name="txtMarca" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Precio:</label>
                            <input type="text" value="${productos.getPrecio()}" name="txtPrecio" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Talla:</label>
                            <input type="text" value="${productos.getTalla()}" name="txtTalla" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Cantidad:</label>
                            <input type="text" value="${productos.getCantidad()}" name="txtCantidad" class="form-control">
                        </div>
                        <div class="form-group">
<<<<<<< HEAD
=======
                            <label style="color: #f2f2f2">Foto:</label>
                            <input type="file" value="${productos.getFotoDeProductos()}" name="fileFoto">
                        </div>
                        <div class="form-group">
>>>>>>> origin/dzabala-2019001
                            <label style="color: #f2f2f2">Codigo Proveedor:</label>
                            <select name="cmbCodProveedor" class="form-control" >
                                <option disable selected value="">Seleccione un dato</option>
                                <c:forEach var="producto" items="${proveedores}">
                                    <option value="${producto.getCodigoProveedor()}">${producto.getCodigoProveedor()} | ${producto.getNombreProveedor()}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Codigo Categoria:</label>
                            <select name="cmbCodCategoria" class="form-control">
                                <option disable selected value="">Seleccione un dato</option>
                                <c:forEach var="producto" items="${categoria}">
                                    <option value="${producto.getCodigoCategoria()}">${producto.getCodigoCategoria()} | ${producto.getNombreCategoria()}</option>
                                </c:forEach>
                            </select>
                        </div>
<<<<<<< HEAD
=======
                        
>>>>>>> origin/dzabala-2019001
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            <div class="col-sm-10">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <td style="color:#0D0D0D"><strong>CODIGO</strong></td>
                            <td style="color:#0D0D0D"><strong>NOMBRE</strong></td>
                            <td style="color:#0D0D0D"><strong>DESCIPCION</strong></td>
                            <td style="color:#0D0D0D"><strong>MARCA</strong></td>
                            <td style="color:#0D0D0D"><strong>PRECIO</strong></td>
                            <td style="color:#0D0D0D"><strong>TALLA</strong></td>
                            <td style="color:#0D0D0D"><strong>CANTIDAD</strong></td>
<<<<<<< HEAD
=======
                            <td style="color:#0D0D0D"><strong>FOTO</strong></td>
>>>>>>> origin/dzabala-2019001
                            <td style="color:#0D0D0D"><strong>PROVEEDOR</strong></td>
                            <td style="color:#0D0D0D"><strong>CATEGORIA</strong></td>
                            <td style="color:#0D0D0D"><strong>ACCIONES</strong></td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="producto" items="${producto}">
                            <tr>
                                <td>${producto.getCodigoProducto()}</td>
                                <td>${producto.getNombreProducto()}</td>
                                <td>${producto.getDescripcion()}</td>
                                <td>${producto.getMarca()}</td>
                                <td>${producto.getPrecio()}</td>
                                <td>${producto.getTalla()}</td>
                                <td>${producto.getCantidad()}</td>
<<<<<<< HEAD
=======
                                <td><img src="ControladorImagen?id=${producto.getCodigoProducto()}" width="150" height="130"></td>
>>>>>>> origin/dzabala-2019001
                                <td>${producto.getCodigoProveedor()}</td>
                                <td>${producto.getCodigoCategoria()}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controlador?menu=Productos&accion=Editar&codigoProducto=${producto.getCodigoProducto()}">Editar</a>
                                    <a class="btn btn-danger" href="Controlador?menu=Productos&accion=Eliminar&codigoProducto=${producto.getCodigoProducto()}">Eliminar</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        
        
        
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </body>
</html>
