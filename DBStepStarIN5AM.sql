/*
	Fecha de creacion: 
		05/07/2023
    
    Fecha de modificacion: 
		07/07/2023,
		14/08/2023
        
    Programadores:
		Axel  Antonio Xitumul Chén - 2022038
        Diego Estuardo Zabala Toc - 2019001
        Juan Pablo Angel Yaxon Taquira - 2019386
*/

Drop database if exists DBStepStarIN5AM;
Create database DBStepStarIN5AM;

Use DBStepStarIN5AM;


Create table TipoEmpleado(
	codigoTipoEmpleado int not null auto_increment,
    descTipoEmpleado varchar (50) not null,
    sueldo Decimal(10,2) not null,
    bonificacion Decimal(10,2) not null,
    categoriaEmpleado varchar(150) not null,
    primary key PK_codigoTipoEmpleado (codigoTipoEmpleado)
);


Create table Cliente(
	codigoCliente int not null auto_increment,
    nombreCliente varchar(150) not null,
    apellidoCliente varchar(150) not null,
    nit varchar(15)not null,
    estadoActivo boolean not null,
    telefonoCliente varchar(15) not null,
    primary key PK_codigoCliente (codigoCliente)
);

Create table login(
	usuario varchar (50),
    passwordLogin varchar (50),
    primary key PK_usuarioMaster (usuario)
);

Create Table Categoria(
	codigoCategoria int not null auto_increment,
    nombreCategotia varchar(150) not null,
    descCategoria varchar(150) not null,
    genero boolean not null,
    codigoProducto int not null,
    primary key PK_codigoCategoria (codigoCategoria)
);


create table Proveedores(
	codigoProveedor int not null auto_increment,
    nombreProveedor varchar(150) not null,
    direccionProveedor varchar(150) not null,
    telefonoProveedor varchar(15) not null,
    correoProveedor varchar(150) not null,
    primary key PK_codigoProveedor (codigoProveedor)
);

Create table Productos(
	codigoProducto int not null auto_increment,
	nombreProducto varchar (150) not null,
    descProductos varchar(150) not null,
    marca varchar(150) not null,
    precio Decimal(10,2) not null,
    talla int not null,
    cantidad int not null,
    codigoProveedor int not null,
    codigoCategoria int not null,
    primary key PK_codigoProducto (codigoProducto),
    constraint FK_Productos_Proveedores foreign key
		(codigoProveedor) references Proveedores (codigoProveedor),
	constraint FK_Productos_Categoria foreign key
		(codigoCategoria) references Categoria (codigoCategoria)
);

Create table Empleados(
	codigoEmpleado int not null auto_increment,
    DPI varchar(20) not null,
    apellidosEmpleado varchar (150) not null,
    nombresEmpleado varchar (150) not null,
    direccionEmpleado varchar (150) not null,
    telefonoContacto varchar (15) not null,
    codigoTipoEmpleado int not null,
    primary key PK_codigoEmpleado (codigoEmpleado),
    constraint FK_Empleados_TipoEmpleado foreign key
		(codigoTipoEmpleado) references TipoEmpleado (codigoTipoEmpleado)
);

Create table Servicios (
	codigoServicio int not null auto_increment,
    fechaServicio date not null,
    tipoServicio varchar (150) not null,
    horaServicio time not null,
    lugarServicio varchar (150) not null,
    telefonoServicio varchar (8) not null,
    codigoEmpleado int not null,
    primary key PK_codigoSevicio (codigoServicio),
    constraint FK_Servicio_Empleados foreign key
		(codigoEmpleado) references Empleados (codigoEmpleado)
);

Create table Venta(
	codigoVenta int not null auto_increment,
    fechaVenta date not null,
    descVenta varchar(150) not null,
    cantidad decimal(10,2) not null,
    direccionEnvio varchar(150) not null,
    codigoServicio int not null,
    primary key PK_codigoVenta (codigoVenta),
	constraint FK_Venta_Servicios foreign key
		(codigoServicio) references Servicios (codigoServicio)
);

Create table Compra(
	codigoCompra int not null auto_increment,
    fechaCompra Date not null,
    descCompra varchar(150) not null,
    cantidad decimal(10,2) not null,
    codigoProducto int not null,
    primary key PK_codigoCompra (codigoCompra),
    constraint FK_Compra_Productos foreign key
		(codigoProducto) references Productos (codigoProducto)
);

Create table DetalleCompra(
	codigoDetalleCompra int not null auto_increment,
    codigoVenta int not null,
    codigoCompra int not null,
    primary key PK_codigoDetalleCompra(codigoDetalleCompra),
    constraint FK_DetalleCompra_Venta foreign key
		(codigoVenta) references Venta (codigoVenta),
    constraint FK_DetalleCompra_Compra foreign key
		(codigoCompra) references Compra (codigoCompra)
);

Create table DetalleVenta(
	codigoDetalleVenta int not null auto_increment,
    codigoCliente int not null,
    codigoVenta int not null,
    codigoProducto int not null,
    primary key PK_codigoDetalleVenta (codigoDetalleVenta),
    constraint FK_DetalleVenta_Cliente foreign key
		(codigoCliente) references Cliente (codigoCliente),
	constraint FK_DetalleVenta_Venta foreign key
		(codigoVenta) references Venta (codigoVenta),
	constraint FK_DetalleVenta_Productos foreign key
		(codigoProducto) references Productos (codigoProducto)
);


-- TipoEmpleado:

insert into TipoEmpleado(codigoTipoEmpleado, descTipoEmpleado, sueldo, bonificacion, categoriaEmpleado)
	values(1,'vende zapatos de ADIDAS',3500.00,250.00,'Vendedor');
insert into TipoEmpleado(codigoTipoEmpleado, descTipoEmpleado, sueldo, bonificacion, categoriaEmpleado)
	values(2,'cobro de productos en caja',3500.00,250.00,'Cajero');
insert into TipoEmpleado(codigoTipoEmpleado, descTipoEmpleado, sueldo, bonificacion, categoriaEmpleado)
	values(3,'limpieza de la empresa',3500.00,250.00,'Conserje');    
    
-- Cliente:

insert into Cliente(codigoCliente, nombreCliente, apellidoCliente, nit, estadoActivo, telefonoCliente)
	values(1,'Diego','Zabala','601278-7',1,'42464357');
insert into Cliente(codigoCliente, nombreCliente, apellidoCliente, nit, estadoActivo, telefonoCliente)
	values(2,'David','Godoy','247516-7',1,'37181157');
insert into Cliente(codigoCliente, nombreCliente, apellidoCliente, nit, estadoActivo, telefonoCliente)
	values(3,'Axel','Xitumul','121456-2',1,'24741959');

-- Categoria:

insert into Categoria(codigoCategoria, nombreCategotia, descCategoria, genero, codigoProducto)
	values(1,'Zapato Formal','Zapato de vestir',1,1);
insert into Categoria(codigoCategoria, nombreCategotia, descCategoria, genero, codigoProducto)
	values(2,'Casual','Zapato informal',0,2);
insert into Categoria(codigoCategoria, nombreCategotia, descCategoria, genero, codigoProducto)
	values(3,'Deportivo','Zapato para deporte',1,3);
    
-- Proveedores:

insert into Proveedores(codigoProveedor, nombreProveedor, direccionProveedor, telefonoProveedor, correoProveedor)  
	values(1,'ADIDAS','Zona 7 Tikal 1','24741959','Adidas@Yahoo.com');
insert into Proveedores(codigoProveedor, nombreProveedor, direccionProveedor, telefonoProveedor, correoProveedor)  
	values(2,'NIKE','Zona 10 De Mixco, Guatemala','12405896','Nike@gmail.com');
insert into Proveedores(codigoProveedor, nombreProveedor, direccionProveedor, telefonoProveedor, correoProveedor)  
	values(3,'Flexi','C.C. Miraflores, 2do Nivel, Local 255','24741959','Flexi@Yahoo.com');
  
-- Productos:

insert into Productos(codigoProducto, nombreProducto, descProductos, marca, precio, talla, cantidad, codigoProveedor, codigoCategoria)
	values(1,'STAN SMITH SHOES ', 'Color verde con cuerdas extra','ADIDAS',879.99,10,10,1,1);
insert into Productos(codigoProducto, nombreProducto, descProductos, marca, precio, talla, cantidad, codigoProveedor, codigoCategoria)
	values(2,'AIR JORDAN 1 RETRO HI OG RMSTD HOMBRE DZ5485-051 ', 'Color Gris con cuerdas extra','JORDAN',2199.00,10,5,2,2);
insert into Productos(codigoProducto, nombreProducto, descProductos, marca, precio, talla, cantidad, codigoProveedor, codigoCategoria)
	values(3,'RACER TR23 SHOES', 'Color gris con un par de cuerdas extra','ADIDAS',550.00,8,50,1,3);
    
-- Empleados:

insert into Empleados(codigoEmpleado, DPI, apellidosEmpleado, nombresEmpleado, direccionEmpleado, telefonoContacto, codigoTipoEmpleado)
    values(1,'123456789123' ,'Garcia','Carlos','Zona 7, Tikal 1 30-07', '24741959',1 );
insert into Empleados(codigoEmpleado,  DPI, apellidosEmpleado, nombresEmpleado, direccionEmpleado, telefonoContacto, codigoTipoEmpleado)
    values(2,'358812220101' ,'Perez','Jose', 'Zona 1, Mixco', '36589632', 3 );
insert into Empleados(codigoEmpleado,  DPI, apellidosEmpleado, nombresEmpleado, direccionEmpleado, telefonoContacto, codigoTipoEmpleado)
    values(3, '654622430101','Litera','Sandra','Ciudad De Plata ', '42464357',2);
 
-- Servicios:

insert into Servicios(codigoServicio, fechaServicio, tipoServicio, horaServicio, lugarServicio, telefonoServicio, codigoEmpleado)
	values(1,'2023-03-30','Domicilio','13:00:00','Zona 7 Tikal 1 30-07','28356985',1);
insert into Servicios(codigoServicio, fechaServicio, tipoServicio, horaServicio, lugarServicio, telefonoServicio, codigoEmpleado)
	values(2,'2022-04-22','Domicilio','18:00:00','MAJADAS','37181157',1);
insert into Servicios(codigoServicio, fechaServicio, tipoServicio, horaServicio, lugarServicio, telefonoServicio, codigoEmpleado)
	values(3,'2023-03-15','Domicilio','08:00:00','Ciudad De Plata','19592474',1);
    
-- Venta:

insert into Venta(codigoVenta, fechaVenta, descVenta, cantidad, direccionEnvio, codigoServicio)
	values(1,'2023-03-30','Compra de Jordan 1',2,'Zona 7 Tikal 1 30-07',1);
insert into Venta(codigoVenta, fechaVenta, descVenta, cantidad, direccionEnvio, codigoServicio)
	values(2,'2023-03-30','Compra de zapato deportivo',1,'2022-04-22',2);
insert into Venta(codigoVenta, fechaVenta, descVenta, cantidad, direccionEnvio, codigoServicio)
	values(3,'2023-03-30','Compra de Zapato formal',1,'2023-03-15',3);
    
-- Compra:

insert into Compra(codigoCompra, fechaCompra, descCompra, cantidad, codigoProducto)
	values(1,'2023-03-30','Compra de Jordan 1',2,1);
insert into Compra(codigoCompra, fechaCompra, descCompra, cantidad, codigoProducto)
	values(2,'2023-03-30','Compra de zapatos deportivos',4,3);
insert into Compra(codigoCompra, fechaCompra, descCompra, cantidad, codigoProducto)
	values(3,'2023-03-30','Compra de Zapato formal',1,2);
    
-- DetalleCompra:

insert into DetalleCompra(codigoDetalleCompra, codigoVenta, codigoCompra)
	values(1,1,1);
insert into DetalleCompra(codigoDetalleCompra, codigoVenta, codigoCompra)
	values(2,2,2);
insert into DetalleCompra(codigoDetalleCompra, codigoVenta, codigoCompra)
	values(3,3,3);
    
-- DetalleVenta

insert into DetalleVenta(codigoDetalleVenta, codigoCliente, codigoVenta, codigoProducto)
	values(1,2,1,1);
insert into DetalleVenta(codigoDetalleVenta, codigoCliente, codigoVenta, codigoProducto)
	values(2,1,2,2);
insert into DetalleVenta(codigoDetalleVenta, codigoCliente, codigoVenta, codigoProducto)
	values(3,3,3,3);




    
    