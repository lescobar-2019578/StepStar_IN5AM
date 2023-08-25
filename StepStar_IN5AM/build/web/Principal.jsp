<%-- 
    Document   : Principal2
    Created on : 13/08/2023, 05:35:08 PM
    Author     : Antony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <title>Principal</title>
    <link href="resource/estilos.css" rel="stylesheet" >
</head>
<body>

    <nav class="navbar navbar-expand-lg nvbar-light">    

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <img src="img/stepstar3.png"  alt="" style="margin-left: 20px; padding-bottom: 10px; height: 100px; width: 110x;">
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Home" target="myFrame">Home</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Clientes&accion=Listar" target="myFrame">Clientes</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Categoria&accion=Listar" target="myFrame">Categoría</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Proveedor&accion=Listar" target="myFrame">Proveedores</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Productos&accion=Listar" target="myFrame">Productos</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Empleados&accion=Listar" target="myFrame">Empleados</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Servicios&accion=Listar" target="myFrame">Servicios</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Ventas&accion=Listar" target="myFrame">Venta</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=Compra&accion=Listar" target="myFrame">Compra</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=DetalleCompra&accion=Listar" target="myFrame">Detalle Compra</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=DetalleVenta&accion=Listar" target="myFrame">Detalle Venta</a>
                </li>
                <li class="nav-item" style="padding-top: 28px;">
                    <a style="margin-left: 10px; border: none" class="btn btn-outline-light" href="Controlador?menu=TipoEmpleado&accion=Listar" target="myFrame">Tipo Empleado</a>
                </li>
            </ul>
        </div>
        <div class="dropdown" style="margin-right: 20px;">
            <button style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
              ${usuario.getNombresEmpleado()}
            </button>
            <div class="dropdown-menu dropdown-menu-right text-center" aria-labelledby="dropdawnMenuButton"> 
                <a class="dropdown-item" href="#"></a>
                    <img src="img/imagen.png" alt="60" width="60"/>
                <a class="dropdown-item" href="#">${usuario.getNombresEmpleado()}</a>
                <a class="dropdown-item" href="#">${usuario.getNombresEmpleado()}@gmail.com</a>
                    <div class="dropdown-divider"></div>
                <form action="Validar" method="POST">
                    <button name="accion" name="Salir" class="dropdown-item"> Salir </button>
                </form>
            </div>
        </div>
    </nav>

            <div class="m-4" style=" height: 640px">
                <iframe name="myFrame" style="height: 100%; width: 100%; border: none"></iframe>
            </div>


 

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>

