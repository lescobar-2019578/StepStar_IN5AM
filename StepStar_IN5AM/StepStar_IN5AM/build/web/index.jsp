<%-- 
    Document   : index
    Created on : 11/08/2023, 02:23:04 AM
    Author     : llane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Acces Page</title>
    </head>
    <body>        
        <div class = "container mt-4 col-lg-4">
            <div class="card col-sm-10">
                <div class="card-body">
                    <form class = "form-sing" action="Validar" method="POST">
                        <div class= "form-group text-center">
                            <h3>Login<h3/>
                                <img src="img/ventas.png" width="130"/><br>
                            <label>Bienvenidos al Sistema</label>
                        </div>
                        <div class = "form-group">
                            <label>Usuario</label>
                            <input type="text" name="txtUser" class = "form-control">
                        </div>
                        <div class = "form-group">
                            <label>Contraseña</label>
                            <input type = "password" name="txtPass" class = "form-control" >
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class = "btn btn-primary btn-block">
                    </form>
                </div>
            </div>
        </div>
        
        <%--        <input type="button" value="Hola" class="btn btn-primary btn-block" --%>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
    </body>
</html>
