<%-- 
    Document   : Home
    Created on : 22/08/2023, 09:05:54 AM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/stepstar3.png" type="image/x-icon">
        <link rel="stylesheet" href="resource/home.css">
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;700&display=swap" rel="stylesheet">
        <title>HOME </title>
    </head>
    <body>
        <header class="header" id="inicio">
            <img src="img/hamburguesa.svg" alt="" class="hamburguer">
            <nav class="menu-navegacion ">
                <a href="#inicio">Inicio</a>
                <a href="#servicio">Quienes Somos</a>
                <a href="#portafolio">Algunos Estilos</a>
                <a href="#expertos">Marcas</a>
                <a href="#contacto">Contacto</a>
            </nav>
            <div class="contenedor head">
                <h1 class="titulo">StepStar</h1>
                <p class="copy">Camina con estilo y brilla en cada paso</p>
            </div>
        </header>
        <main>
            <section class="contenedor" id="servicio">
                <h2 class="subtitulo">Quienes Somos</h2>
                <div class="contenedor-servicio">
                    <img src="img/imagen8.jpg" alt="">
                    <div class="checklist-servicio">
                        <div class="service">
                            <h3 class="n-service"><span class="number">1</span>Mision</h3>
                            <p>En StepStar, nuestra misión es proporcionar a nuestros clientes una experiencia excepcional al adquirir calzado de
                            alta calidad que no solo complemente su estilo personal, sino que también cumpla con los más altos estándares de
                            comodidad y durabilidad. Nos esforzamos por ser mucho más que una simple tienda de zapatos; aspiramos a convertirnos
                            en el destino preferido para aquellos que buscan no solo productos de moda, sino también un servicio y una atención
                            al cliente sin igual.</p>
                        </div>
                        <div class="service">
                            <h3 class="n-service"><span class="number">2</span>Vision</h3>
                            <p>Nuestra visión en StepStar es establecer un estándar excepcional en la industria del calzado,
                            convirtiéndonos en la tienda líder y de referencia en la mente de los clientes cuando se trata de elegancia,
                            comodidad y servicio excepcional. Nos esforzamos por moldear el futuro de la moda y el comercio minorista, creando
                            una experiencia de compra única y satisfactoria que perdure en el tiempo.</p>
                        </div>
                        <div class="service">
                            <h3 class="n-service"><span class="number">3</span>Quienes Somos</h3>
                            <p>Somos StepStar, una tienda de zapatos comprometida con brindar a nuestros clientes una experiencia única
                            en moda y estilo. Nos enorgullecemos de ser mucho más que una simple tienda; somos un destino donde la elegancia, la
                            comodidad y la atención al cliente se unen para crear una experiencia de compra excepcional.</p>
                        </div>
                    </div>
                </div>
            </section>
            <section class="gallery" id="portafolio">
                <div class="contenedor">
                    <h2 class="subtitulo">Algunos Estilos</h2>
                    <div class="contenedor-galeria">
                        <img src="img/nike.png" alt="" class="img-galeria">
                        <img src="img/aaaa.jpg" alt="" class="img-galeria">
                        <img src="img/nose.jpg" alt="" class="img-galeria">
                        <img src="img/imagen1.jpg" alt="" class="img-galeria">
                        <img src="img/imagen2.jpg" alt="" class="img-galeria">
                        <img src="img/new.jpg" alt="" class="img-galeria">
                        <img src="img/imagen4.jpg" alt="" class="img-galeria">
                        <img src="img/imagen5.jpg" alt="" class="img-galeria">
                        <img src="img/imagen6.jpg" alt="" class="img-galeria">
                        <img src="img/imagen9.jpg" alt="" class="img-galeria">
                        <img src="img/imagen11.jpg" alt="" class="img-galeria">
                        <img src="img/eee.jpg" alt="" class="img-galeria">
                    </div>
                </div>
            </section>
           <section class="imagen-light">
                <img src="img/close.svg" alt="" class="close">
                <img src="img/imagen9.jpg" alt="" class="agregar-imagen">
            </section>
           <section class="contenedor" id="expertos">
               <h2 class="subtitulo">Algunas Marcas</h2>
               <section class="experts">
                   <div class="card">
                   <div class="face front">
                    <img src="img/adidas1.png" alt="">
                   </div>
                       <div class="face back">                           
                            <h3>ADIDAS</h3>
                            <p>Adidas es otra importante empresa multinacional de ropa deportiva, calzado y accesorios deportivos, Adidas es una de las marcas deportivas más reconocidas y emblemáticas a nivel mundial.</p>
                         <div class="link">
                        </div>
                        </div>
                   </div>
                   <div class="card">
                       <div class="face front">
                           <img src="img/converse2.avif" alt="">
                       </div>
                       <div class="face back">
                           <h3>CONVERSE</h3>
                           <p>Converse es una marca de calzado y ropa estadounidense conocida principalmente por sus zapatillas deportivas icónicas y su diseño distintivo</p>
                           <div class="link">                               
                           </div>
                       </div>
                   </div>
                   <div class="card">
                       <div class="face front">
                           <img src="img/jordan4.png" alt="">
                       </div>
                       <div class="face back">
                           <h3>JORDAN</h3>
                           <p>Jordan es una línea de productos deportivos y de estilo de vida de la marca Nike, Inc. Esta línea lleva el nombre del famoso exjugador de baloncesto Michael Jordan</p>
                           <div class="link">
                           </div>
                       </div>
                   </div>
               </section>
           </section>
        </main>
           <footer id="contacto">
               <div class="contenedor footer-content">
                   <div class="contact-us">
                       <h2 class="brand">StepStar</h2>
                       <p>Camina con estilo y brilla en cada paso</p>
                   </div>
                   <div class="social-media">
                       <a href="https://www.facebook.com" class="social-media-icon">
                           <i class='bx bxl-facebook'></i>
                       </a>
                       <a href="https://twitter.com/i/flow/login?input_flow_data=%7B" class="social-media-icon">
                           <i class='bx bxl-twitter' ></i>
                       </a>
                       <a href="https://www.instagram.com" class="social-media-icon">
                           <i class='bx bxl-instagram' ></i>
                       </a>
                   </div>
               </div>
               <div class="line"></div>
           </footer>
           
        <script src="resource/menu.js"></script>
    </body>
</html>
