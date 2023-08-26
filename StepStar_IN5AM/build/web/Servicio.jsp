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
                    <form  action="Controlador?menu=Servicios" method="POST">
                        <div class="form-group">
                            <label style="color:#f2f2f2 ">Fecha de Servicio:</label>
                            <input type="date" value="${servicio.getFechaServicio()}" name="txtFechaServicio"  class="sm-form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Tipo de Servicio:</label>
                            <input type="text" value="${servicio.getTipoServicio()}" name="txtTipoServicio" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2" >Hora del Servicio:</label>
                            <input type="time" value="${servicio.getHoraServicio()}" name="txtHoraServicio" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Lugar del Servicio:</label>
                            <input type="text" value="${servicio.getLugarServicio()}" name="txtLugarServicio" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Teléfono:</label>
                            <input type="text" value="${servicio.getTelefonoServicio()}" name="txtTelefonoServicio" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2" >Codigo Empleado:</label>
                            <select name="cmbCodEmpleado" class="form-control" <%= (request.getAttribute("deshabilitarCombo") != null && request.getAttribute("deshabilitarCombo").equals("true")) ? "disabled" : "" %>>
                                <option disable selected value="">Seleccione un dato</option>
                                <c:forEach var="servicio" items="${empleados}">
                                    <option value="${servicio.getCodigoEmpleado()}">${servicio.getCodigoEmpleado()} | ${servicio.getNombresEmpleado()}</option>
                                </c:forEach>
                            </select>
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
                            <td style="color:#0D0D0D"><strong>CÓDIGO</strong></td>
                            <td style="color:#0D0D0D"><strong>FECHA</strong></td>
                            <td style="color:#0D0D0D"><strong>TIPO</strong></td>
                            <td style="color:#0D0D0D"><strong>HORA</strong></td>
                            <td style="color:#0D0D0D"><strong>LUGAR</strong></td>
                            <td style="color:#0D0D0D"><strong>TELÉFONO</strong></td>
                            <td style="color:#0D0D0D"><strong>CÓDIGO EMPLEADO</strong></td>
                            <td style="color:#0D0D0D"><strong>ACCIONES</strong></td>
                        </tr>
                    </thead>
                <tbody>
                        <c:forEach var="servicio" items="${servicios}">
                            <tr>
                                <td>${servicio.getCodigoServicio()}</td>
                                <td>${servicio.getFechaServicio()}</td>
                                <td>${servicio.getTipoServicio()}</td>
                                <td>${servicio.getHoraServicio()}</td>
                                <td>${servicio.getLugarServicio()}</td>
                                <td>${servicio.getTelefonoServicio()}</td>
                                <td>${servicio.getCodigoEmpleado()}</td>
                                <td>
                                    <a class="btn btn-warning" href="Controlador?menu=Servicios&accion=Editar&codigoServicio=${servicio.getCodigoServicio()}">Editar</a>
                                    <a class="btn btn-danger" href="Controlador?menu=Servicios&accion=Eliminar&codigoServicio=${servicio.getCodigoServicio()}">Eliminar</a>
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
