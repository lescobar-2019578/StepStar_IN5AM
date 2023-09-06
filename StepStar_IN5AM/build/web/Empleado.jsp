 <%-- 
    Document   : Empleado
    Created on : 16/08/2023, 09:47:49 AM
    Author     : diego
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <style>
            body{
                background-image: url("img/fondo.png");
                background-size: cover;
                background-repeat: no-repeat;
            }
        </style>
        <title>Pagina Empleado</title>
    </head>
    <body>
        <div class="d-flex">
            <div style="background-color:#1E3E59" class="card colo-sm-4">
                <div style="background-color:#1E3E59" class="card-body">
                    <form action="Controlador?menu=Empleados" method="POST" enctype="multipart/form-data">
                        <div class="form-group">
                            <label style="color: #f2f2f2">DPI:</label>
                            <input type="text" value="${empleadoEncontrado.getDPI()}" name="txtDPIEmpleado" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Apellido Empleado:</label>
                            <input type="text" value="${empleadoEncontrado.getApellidosEmpleado()}" name="txtApellidoEmpleado" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Nombre Empleado:</label>
                            <input type="text" value="${empleadoEncontrado.getNombresEmpleado()}" name="txtNombreEmpleado" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Dirección:</label>
                            <input type="text" value="${empleadoEncontrado.getDireccionEmpleado()}" name="txtDireccionEmpleado" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Télefono:</label>
                            <input type="text" value="${empleadoEncontrado.getTelefonoContacto()}" name="txtTelefonoEmpleado" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Usuario</label>
                            <input type="text" value="${empleadoEncontrado.getUsuario()}" name="txtUsuario" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Código TipoEmpleado:</label>
                            <select name="cmbCodigoTipoEmpleado" class="form-control" <%= (request.getAttribute("deshabilitarCombo") != null && request.getAttribute("deshabilitarCombo").equals("true")) ? "disabled" : "" %>>
                                <option disable selected value="">Seleccione un dato</option>
                                <c:forEach var="empleado" items="${tipoEmpleado}">
                                    <option value="${empleado.getCodigoTipoEmpleado()}">${empleado.getCodigoTipoEmpleado()} | ${empleado.getCategoriaEmpleado()}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Foto:</label>
                            <input type="file" value="${empleadoEncontrado.getFoto()}" name="fileFoto">
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
                            <td style="color:#0D0D0D"><strong>DPI</strong></td>
                            <td style="color:#0D0D0D"><strong>APELLIDOS</strong></td>
                            <td style="color:#0D0D0D"><strong>NOMBRES</strong></td>
                            <td style="color:#0D0D0D"><strong>DIRECCION</strong></td>
                            <td style="color:#0D0D0D"><strong>TELEFONO</strong></td>
                            <td style="color:#0D0D0D"><strong>USUARIO</strong></td>
                            <td style="color:#0D0D0D"><strong>FOTO</strong></td>
                            <td style="color:#0D0D0D"><strong>CODIGO TIPOEMPLEADO</strong></td>
                            
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="empleado" items="${empleados}">
                            <tr>
                                <td>${empleado.getCodigoEmpleado()}</td>
                                <td>${empleado.getDPI()}</td>
                                <td>${empleado.getApellidosEmpleado()}</td>
                                <td>${empleado.getNombresEmpleado()}</td>
                                <td>${empleado.getDireccionEmpleado()}</td>
                                <td>${empleado.getTelefonoContacto()}</td>
                                <td>${empleado.getUsuario()}</td>
                                <td><img src="ControladorImg?codigoEmpleado=${empleado.getCodigoEmpleado()}" width="150" height="130"></td>
                                <td>${empleado.getCodigoTipoEmpleado()}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controlador?menu=Empleados&accion=Editar&codigoEmpleado=${empleado.getCodigoEmpleado()}">Editar</a>
                                    <a class="btn btn-danger" href="Controlador?menu=Empleados&accion=Eliminar&codigoEmpleado=${empleado.getCodigoEmpleado()}">Eliminar</a>
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
