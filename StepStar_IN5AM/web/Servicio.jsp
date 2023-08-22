

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <style>
        body {
            background-image: url('img/fondo.png');
            background-size: cover; /* Ajusta el tamaño de la imagen de fondo */
            background-repeat: no-repeat; /* Evita que la imagen de fondo se repita */
        }
    </style>
        <title>Página Servicio</title>
    </head>
    <body>
        <div class="d-flex">
            <div style="background-color:#1E3E59" class="card col-sm-3">
                <div style="background-color:#1E3E59" class="card-body">
                    <form  action="Controlador?menu=Servicio" method="POST">
                        <div class="form-group">
                            <label style="color:#f2f2f2 ">Fecha de Servicio:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Tipo de Servicio:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2" >Hora del Servicio:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Lugar del Servicio:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Teléfono:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2" >Codigo Empleado:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">
                        <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                    </form>
                </div>
            </div>
            <div class="col-sm-8">
            <table class="table table-hover">
                <thead>
                    <tr>
                        <td style="color:#0D0D0D">CÓDIGO</td>
                        <td style="color:#0D0D0D">FECHA</td>
                        <td style="color:#0D0D0D">TIPO</td>
                        <td style="color:#0D0D0D">HORA</td>
                        <td style="color:#0D0D0D">LUGAR</td>
                        <td style="color:#0D0D0D">TELÉFONO</td>
                        <td style="color:#0D0D0D">CÓDIGO EMPLEADO</td>
                        <td style="color:#0D0D0D">ACCIONES</td>
                    </tr>
                </thead>
                <tbody>
                        <c:forEach var="servicio" items="${servicio}">
                            <tr>
                                <td>${servicio.getCodigoServicio()}</td>
                                <td>${servicio.getFechaServicio()}</td>
                                <td>${servicio.getTipoServicio()}</td>
                                <td>${servicio.getHoraServicio()}</td>
                                <td>${servicio.getLugarServicio()}</td>
                                <td>${servicio.getTelefonoServicio()}</td>
                                <td>${servicio.getCodigoEmpleado()}</td>
                                <td>
                                    <a class="btn btn-warning" href="">Editar</a>
                                    <a class="btn btn-danger" href="">Eliminar</a>
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
