<%-- 
    Document   : Producto
    Created on : ago 14, 2023, 8:38:26 a.m.
    Author     : Axel
--%>

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
        <title>Página Producto</title>
    </head>
    <body>
        <div class="d-flex">
            <div style="background-color:#1E3E59" class="card col-sm-3">
                <div style="background-color:#1E3E59" class="card-body">
                    <form  action="Controlador?menu=Producto" method="POST">
                        <div class="form-group">
                            <label style="color:#f2f2f2 ">Nombre Producto:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Descripcion:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2" >Marca:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Precio:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Talla:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2" >Cantidad:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Codigo Proveedor:</label>
                            <input type="text" name="" class="form-control">
                        </div>
                        <div class="form-group">
                            <label style="color:#f2f2f2">Codigo Categoria:</label>
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
                        <td style="color:#0D0D0D">CODIGO</td>
                        <td style="color:#0D0D0D">NOMBRE</td>
                        <td style="color:#0D0D0D">DESCIPCIÓN</td>
                        <td style="color:#0D0D0D">MARCA</td>
                        <td style="color:#0D0D0D">PRECIO</td>
                        <td style="color:#0D0D0D">TALLA</td>
                        <td style="color:#0D0D0D">CANTIDAD</td>
                        <td style="color:#0D0D0D">PROVEEDOR</td>
                        <td style="color:#0D0D0D">CATEGORIA</td>
                        <td style="color:#0D0D0D">ACCIONES</td>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="producto" items="${productos}">
                    <tr>
                        <td>${producto.getCodigoProducto()}</td>
                                                
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
