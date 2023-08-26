<%-- 
    Document   : Ventas
    Created on : 16/08/2023, 09:56:37 PM
    Author     : llane
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <form action="Controlador?menu=Ventas" method="POST">
                        <div class="form-group">
                            <label style="color: #f2f2f2">Fecha Venta:</label>
                            <input type="date" id="nacimiento" value="${ventaEncontrada.getFechaVenta()}" name="txtFecha"  class="sm-form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Descripción:</label>
                            <input type="text" value="${ventaEncontrada.getDescripcion()}" name="txtDescripcion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Cantidad:</label>
                            <input type="text" value="${ventaEncontrada.getCantidad()}" name="txtCantidad" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Dirección Envio:</label>
                            <input type="text" value="${ventaEncontrada.getDireccionEnvio()}" name="txtDireccion" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Código Servicio</label>
                            <select name="cmbCodServicio" class="form-control" >
                                <option disable selected value="">Seleccione un dato</option>
                                <c:forEach var="venta" items="${servicio}">
                                    <option value="${venta.getCodigoServicio()}">${venta.getCodigoServicio()} | ${venta.getTipoServicio()}</option>          
                                </c:forEach>
                            </select>
                        </div>
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
                            <td style="color:#0D0D0D"><strong>FECHA VENTA</strong></td>
                            <td style="color:#0D0D0D"><strong>DESCRIPCION</strong></td>
                            <td style="color:#0D0D0D"><strong>CANTIDAD</strong></td>
                            <td style="color:#0D0D0D"><strong>DIRECCION ENVIO</strong></td>
                            <td style="color:#0D0D0D"><strong>CODIGO SERVICIO</strong></td>
                            <td style="color:#0D0D0D"><strong>ACCIONES</strong></td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="venta" items="${venta}">
                            <tr>
                                <td>${venta.getCodigoVenta()}</td>
                                <td>${venta.getFechaVenta()}</td>
                                <td>${venta.getDescripcion()}</td>
                                <td>${venta.getCantidad()}</td>
                                <td>${venta.getDireccionEnvio()}</td>
                                <td>${venta.getCodigoServicio()}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controlador?menu=Ventas&accion=Editar&codigoVenta=${venta.getCodigoVenta()}">Editar</a>
                                    <a class="btn btn-danger" href="Controlador?menu=Ventas&accion=Eliminar&codigoVenta=${venta.getCodigoVenta()}">Eliminar</a>
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

