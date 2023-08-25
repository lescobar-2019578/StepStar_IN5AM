<%-- 
    Document   : Empleados
    Created on : 14/08/2023, 10:18:26 PM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <style>
        body {
            background-image: url('img/fondo.jpeg');
            background-size: cover; /* Ajusta el tamaño de la imagen de fondo */
            background-repeat: no-repeat; /* Evita que la imagen de fondo se repita */
            /* Puedes agregar más propiedades de estilo según tus necesidades */
        }
    </style>
        <title>Página Empleados</title>
    </head>
    <body>
        <div class="d-flex">
            <div style="background-color:#1E3E59" class="card col-sm-4">
                <div style="background-color:#1E3E59" class="card-body">
                    <form  action="Controlador?menu=Empleados" method="POST">
                        <div class="form-group">
                            <label style="color:#f2f2f2 ">Apellido Empleado:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Nombre Empleado:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2" >Direccion</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Telefono:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Talla:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2" >Tipo Empleado</label>
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
                        <td style="color:#f2f2f2">CODIGO</td>
                        <td style="color:#f2f2f2">APELLIDOS</td>
                        <td style="color:#f2f2f2">NOMBRES</td>
                        <td style="color:#f2f2f2">DIRECCION</td>
                        <td style="color:#f2f2f2">TELEFONO</td>
                        <td style="color:#f2f2f2">TIPOEMPLEADO</td> 
                        <td style="color:#f2f2f2">ACCIONE</td> 
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="empleados" items="${empleados}">
                    <tr>
                        <td style="color:#f2f2f2">${empleados.getCodigoEmpleado()}</td>
                        <td style="color:#f2f2f2">${empleados.getApellidosEmpleado()}</td>
                        <td style="color:#f2f2f2">${empleados.getNombresEmpleado()}</td>
                        <td style="color:#f2f2f2">${empleados.getDireccionEmpleado()}</td>
                        <td style="color:#f2f2f2">${empleados.getTelefonoContacto()}</td>
                        <td style="color:#f2f2f2">${empleados.getCodigoTipoEmpleado()}</td>
                                      
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

