/*
	Fecha de creacion: 05/07/2023
    Fecha de modificacion: 07/07/2023
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
    descripcion varchar (50) not null,
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

Create table Usuario(
	codigoUsuario int not null auto_increment,
    nombreUsuario varchar (100) not null,
    apellidoUsuario varchar (100) not null,
    usuarioLogin varchar (50) not null,
    contrasena varchar (50) not null,
    primary key PK_CodigoUsuario (codigoUsuario)
);

Create table login(
	usuario varchar (50),
    passwordLogin varchar (50),
    primary key PK_usuarioMaster (usuario)
);

Create Table Categoria(
	codigoCategoria int not null auto_increment,
    nombreCategotia varchar(150) not null,
    descripcion varchar(150) not null,
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
    descripcion varchar(150) not null,
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
    descripcion varchar(150) not null,
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
    descripcion varchar(150) not null,
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