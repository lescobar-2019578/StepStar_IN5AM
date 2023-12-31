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
        <title>Pagina Cliente</title>
    </head>
    <body>
        <div class="d-flex">
            <div style="background-color:#1E3E59" class="card colo-sm-3">
                <div style="background-color:#1E3E59" class="card-body">
                    <form action="Controlador?menu=Clientes" method="POST">
                        <div class="form-group">
                            <label style="color: #f2f2f2">Nombre Cliente:</label>
                            <input type="text" value="${cliente.getNombresCliente()}" name="txtNombresCliente" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Apellido Cliente:</label>
                            <input type="text" value="${cliente.getApellidoCliente()}" name="txtApellidosCliente" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">NIT:</label>
                            <input type="text" value="${cliente.getNit()}" name="txtNit" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Estado Activo:</label>
                            <input type="text" value="${cliente.getEstadoActivo()}" name="txtEstadoActivo" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color: #f2f2f2">Telefono Cliente:</label>
                            <input type="text" value="${cliente.getTelefonoCliente()}" name="txtTelefonoCliente" class="form-control">
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
                            <td style="color:#0D0D0D"><strong>NOMBRES</strong></td>
                            <td style="color:#0D0D0D"><strong>APELLIDOS</strong></td>
                            <td style="color:#0D0D0D"><strong>NIT</strong></td>
                            <td style="color:#0D0D0D"><strong>ESTADO</strong></td>
                            <td style="color:#0D0D0D"><strong>TELEFONO</strong></td>     
                            <td style="color:#0D0D0D"><strong>ACCIONES</strong></td>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="cliente" items="${clientes}">
                            <tr>
                                <td>${cliente.getCodigoCliente()}</td>
                                <td>${cliente.getNombresCliente()}</td>
                                <td>${cliente.getApellidoCliente()}</td>
                                <td>${cliente.getNit()}</td>
                                <td>${cliente.getEstadoActivo()}</td>
                                <td>${cliente.getTelefonoCliente()}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controlador?menu=Clientes&accion=Editar&codigoCliente=${cliente.getCodigoCliente()}">Editar</a>
                                    <a class="btn btn-danger" href="Controlador?menu=Clientes&accion=Eliminar&codigoCliente=${cliente.getCodigoCliente()}">Eliminar</a>
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