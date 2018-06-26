-- Generado por Oracle SQL Developer Data Modeler 4.1.3.901
--   en:        2018-05-14 21:23:20 CLT
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g




CREATE TABLE EmpleadoHosteria
  (
    EmpleadoHosteriaId   INTEGER NOT NULL ,
    Codigo_tipo_empleado INTEGER ,
    RutEmpleado          INTEGER NOT NULL ,
    NombreEmpleado       VARCHAR2 (100) NOT NULL ,
    TelefonoEmpleado     INTEGER NOT NULL ,
    ApellidoEmpleado     VARCHAR2 (100) NOT NULL ,
    Hostal_HostalId      INTEGER NOT NULL
  ) ;
ALTER TABLE EmpleadoHosteria ADD CONSTRAINT EmpleadoHosteria_PK PRIMARY KEY ( EmpleadoHosteriaId ) ;


CREATE TABLE EmpresaCliente
  (
    EmpresaClienteId INTEGER NOT NULL ,
    RutEmpresa       INTEGER NOT NULL ,
    NombreEmpresa    VARCHAR2 (100) NOT NULL ,
    Contraseña       INTEGER NOT NULL ,
    NumeroHuespedes  INTEGER NOT NULL ,
    Direccion        VARCHAR2 (100) NOT NULL ,
    Telefono         INTEGER NOT NULL ,
    Email            VARCHAR2 (100) NOT NULL ,
    Hostal_HostalId  INTEGER NOT NULL ,
    ServComedor_ServComedorId INTEGER NOT NULL ,
    HuespedId                         INTEGER NOT NULL
  ) ;
ALTER TABLE EmpresaCliente ADD CONSTRAINT EmpresaCliente_PK PRIMARY KEY ( EmpresaClienteId ) ;


CREATE TABLE FacturacionEmpresa
  (
    Nro_orden_compra    INTEGER NOT NULL ,
    FechaCreacion       DATE NOT NULL ,
    FechaRecepcion      DATE NOT NULL ,
    OrdenCompraNumero_1 INTEGER NOT NULL ,
    FechaPago           DATE NOT NULL ,
    FacturacionEmpresaId INTEGER NOT NULL ,
    OrdenCompraNumero INTEGER NOT NULL ,
    ProductoId        INTEGER NOT NULL ,
    Hostal_HostalId   INTEGER NOT NULL
  ) ;
ALTER TABLE FacturacionEmpresa ADD CONSTRAINT FacturacionEmpresa_PK PRIMARY KEY ( FacturacionEmpresaId, Hostal_HostalId ) ;


CREATE TABLE FacturacionProveedor
  (
    FacturacionProveedorId INTEGER NOT NULL ,
    FechaPago              DATE NOT NULL ,
    FechaRecepcion         DATE NOT NULL ,
    Fecha_pago_2           DATE ,
    Proveedor_ProveedorId  INTEGER NOT NULL
  ) ;
ALTER TABLE FacturacionProveedor ADD CONSTRAINT FacturacionProveedor_PK PRIMARY KEY ( FacturacionProveedorId, Proveedor_ProveedorId ) ;


CREATE TABLE Funcionario
  (
    FuncionarioId   INTEGER NOT NULL ,
    Contraseña      NUMBER (10) NOT NULL ,
    Id_nivel        INTEGER NOT NULL ,
    Hostal_HostalId INTEGER NOT NULL
  ) ;
ALTER TABLE Funcionario ADD CONSTRAINT Funcionario_PK PRIMARY KEY ( FuncionarioId ) ;


CREATE TABLE Habitacion
  (
    NumeroHabitacion    INTEGER NOT NULL ,
    Precio              INTEGER NOT NULL ,
    Disponible          CHAR (1) NOT NULL ,
    Reserva_Nro_reserva INTEGER NOT NULL ,
    Reserva_ReservaId   INTEGER NOT NULL
  ) ;
CREATE UNIQUE INDEX Habitacion__IDX ON Habitacion
  (
    Reserva_Nro_reserva ASC
  )
  ;
ALTER TABLE Habitacion ADD CONSTRAINT Habitacion_PK PRIMARY KEY ( NumeroHabitacion ) ;


CREATE TABLE Hostal
  (
    HostalId     INTEGER NOT NULL ,
    HostalNombre VARCHAR2 (100) NOT NULL ,
    Direccion    VARCHAR2 (100) NOT NULL ,
    EmpresaId    INTEGER NOT NULL
  ) ;
ALTER TABLE Hostal ADD CONSTRAINT Hostal_PK PRIMARY KEY ( HostalId ) ;


CREATE TABLE Huesped
  (
    HuespedId           INTEGER NOT NULL ,
    Nombre              VARCHAR2 (100) NOT NULL ,
    Apellido_paterno    VARCHAR2 (100) NOT NULL ,
    Apellido_materno    VARCHAR2 (100) NOT NULL ,
    Edad                INTEGER NOT NULL ,
    Email               VARCHAR2 (100) NOT NULL ,
    Genero              VARCHAR2 (50) NOT NULL ,
    Id_empleado         INTEGER ,
    Nivel               INTEGER ,
    Cliente_Rut_empresa INTEGER NOT NULL ,
    Rut                 INTEGER NOT NULL ,
    EmpCliente_EmpClienteId INTEGER NOT NULL
  ) ;
ALTER TABLE Huesped ADD CONSTRAINT Huesped_PK PRIMARY KEY ( HuespedId ) ;


CREATE TABLE Inventario
  (
    InventarioId        INTEGER NOT NULL ,
    ProductoInventario  VARCHAR2 (100) NOT NULL ,
    FechaRecepcion      DATE NOT NULL ,
    FechaVencimiento    DATE NOT NULL ,
    Cantidad            INTEGER NOT NULL ,
    RutProveedor        INTEGER NOT NULL ,
    ProductoId          INTEGER NOT NULL ,
    Producto_ProductoId INTEGER NOT NULL
  ) ;
ALTER TABLE Inventario ADD CONSTRAINT Inventario_PK PRIMARY KEY ( InventarioId ) ;


CREATE TABLE MovimientoInventario
  (
    MovimientoInventarioId  INTEGER NOT NULL ,
    Producto                VARCHAR2 (100) NOT NULL ,
    Cantidad                INTEGER NOT NULL ,
    InventarioId            INTEGER NOT NULL ,
    Observacion             VARCHAR2 (100) NOT NULL ,
    Inventario_InventarioId INTEGER NOT NULL
  ) ;
ALTER TABLE MovimientoInventario ADD CONSTRAINT MovimientoInventario_PK PRIMARY KEY ( MovimientoInventarioId ) ;


CREATE TABLE NivelUsuario
  (
    NivelUsuarioId            INTEGER NOT NULL ,
    Administrador             NUMBER (2) ,
    Cliente                   NUMBER (2) ,
    Empleado                  NUMBER (2) ,
    Proveedor                 NUMBER (2) ,
    Descripcion               VARCHAR2 (50) NOT NULL ,
    Funcionario_FuncionarioId INTEGER NOT NULL
  ) ;
ALTER TABLE NivelUsuario ADD CONSTRAINT NivelUsuario_PK PRIMARY KEY ( NivelUsuarioId ) ;


CREATE TABLE Producto
  (
    ProductoId     INTEGER NOT NULL ,
    NombreProducto VARCHAR2 (100) NOT NULL ,
    PrecioProducto INTEGER NOT NULL ,
    TipoProducto   VARCHAR2 (100) NOT NULL ,
    Descripcion    VARCHAR2(200) NOT NULL ,
    Stock                 INTEGER NOT NULL ,
    Fecha_elavoracion     DATE NOT NULL ,
    Fecha_vencimiento     DATE NOT NULL ,
    Proveedor_ProveedorId INTEGER NOT NULL ,
    Hostal_HostalId       INTEGER NOT NULL
  ) ;
ALTER TABLE Producto ADD CONSTRAINT Producto_PK PRIMARY KEY ( ProductoId ) ;


CREATE TABLE Proveedor
  (
    ProveedorId      INTEGER NOT NULL ,
    Rut_proveedor    INTEGER NOT NULL ,
    Nombre_proveedor VARCHAR2 (100) NOT NULL ,
    Rubro            VARCHAR2 (100) NOT NULL ,
    Direccion        VARCHAR2 (100) NOT NULL ,
    Telefono         INTEGER NOT NULL ,
    Nivel            INTEGER NOT NULL
  ) ;
ALTER TABLE Proveedor ADD CONSTRAINT Proveedor_PK PRIMARY KEY ( ProveedorId ) ;


CREATE TABLE Reserva
  (
    Nro_reserva              INTEGER NOT NULL ,
    Nro_habitacion           INTEGER NOT NULL ,
    "Check-in"               CHAR (1) NOT NULL ,
    Check_out                CHAR (1) NOT NULL ,
    EmpresaCliente_EmpresaId INTEGER NOT NULL ,
    ReservaId                 INTEGER NOT NULL
  ) ;
ALTER TABLE Reserva ADD CONSTRAINT Reserva_PK PRIMARY KEY ( ReservaId ) ;


CREATE TABLE ServicioComedor
  (
    ServicioComedorId         INTEGER NOT NULL ,
    Ejecutivo                 INTEGER ,
    Especial                  INTEGER ,
    General                   INTEGER ,
    Buffet                    INTEGER ,
    EmpHosteria_EmpHosteriaId INTEGER NOT NULL ,
    Descripcion               VARCHAR2 (100) NOT NULL
  ) ;
ALTER TABLE ServicioComedor ADD CONSTRAINT ServicioComedor_PK PRIMARY KEY ( ServicioComedorId ) ;


CREATE TABLE Tipo_habitacion
  (
    TipoHabitacionId            INTEGER NOT NULL ,
    Descripcion                 VARCHAR2 (50) NOT NULL ,
    Disponible                  CHAR (1) NOT NULL ,
    Habitacion_NumeroHabitacion INTEGER NOT NULL
  ) ;
ALTER TABLE Tipo_habitacion ADD CONSTRAINT Tipo_habitacion_PK PRIMARY KEY ( TipoHabitacionId ) ;


ALTER TABLE EmpleadoHosteria ADD CONSTRAINT EmpleadoHosteria_Hostal_FK FOREIGN KEY ( Hostal_HostalId ) REFERENCES Hostal ( HostalId ) ;

ALTER TABLE EmpresaCliente ADD CONSTRAINT EmpresaCliente_Hostal_FK FOREIGN KEY ( Hostal_HostalId ) REFERENCES Hostal ( HostalId ) ;

ALTER TABLE EmpresaCliente ADD CONSTRAINT EmpCliente_ServComedor_FK FOREIGN KEY ( ServComedor_ServComedorId ) REFERENCES ServicioComedor ( ServicioComedorId ) ;

ALTER TABLE FacturacionEmpresa ADD CONSTRAINT FacturacionEmpresa_Hostal_FK FOREIGN KEY ( Hostal_HostalId ) REFERENCES Hostal ( HostalId ) ;

ALTER TABLE FacturacionProveedor ADD CONSTRAINT FactProveedor_Proveedor_FK FOREIGN KEY ( Proveedor_ProveedorId ) REFERENCES Proveedor ( ProveedorId ) ;

ALTER TABLE Funcionario ADD CONSTRAINT Funcionario_Hostal_FK FOREIGN KEY ( Hostal_HostalId ) REFERENCES Hostal ( HostalId ) ;

ALTER TABLE Habitacion ADD CONSTRAINT Habitacion_Reserva_FK FOREIGN KEY ( Reserva_Nro_reserva ) REFERENCES Reserva ( ReservaId ) ;

ALTER TABLE Huesped ADD CONSTRAINT Huesped_EmpresaCliente_FK FOREIGN KEY ( EmpCliente_EmpClienteId ) REFERENCES EmpresaCliente ( EmpresaClienteId ) ;

ALTER TABLE Inventario ADD CONSTRAINT Inventario_Producto_FK FOREIGN KEY ( Producto_ProductoId ) REFERENCES Producto ( ProductoId ) ;

ALTER TABLE MovimientoInventario ADD CONSTRAINT MovInventario_Inventario_FK FOREIGN KEY ( Inventario_InventarioId ) REFERENCES Inventario ( InventarioId ) ;

ALTER TABLE NivelUsuario ADD CONSTRAINT NivelUsuario_Funcionario_FK FOREIGN KEY ( Funcionario_FuncionarioId ) REFERENCES Funcionario ( FuncionarioId ) ;

ALTER TABLE Producto ADD CONSTRAINT Producto_Hostal_FK FOREIGN KEY ( Hostal_HostalId ) REFERENCES Hostal ( HostalId ) ;

ALTER TABLE Producto ADD CONSTRAINT Producto_Proveedor_FK FOREIGN KEY ( Proveedor_ProveedorId ) REFERENCES Proveedor ( ProveedorId ) ;

ALTER TABLE Reserva ADD CONSTRAINT Reserva_EmpresaCliente_FK FOREIGN KEY ( EmpresaCliente_EmpresaId ) REFERENCES EmpresaCliente ( EmpresaClienteId ) ;

ALTER TABLE ServicioComedor ADD CONSTRAINT ServComedor_EmpHosteria_FK FOREIGN KEY ( EmpHosteria_EmpHosteriaId ) REFERENCES EmpleadoHosteria ( EmpleadoHosteriaId ) ;

ALTER TABLE Tipo_habitacion ADD CONSTRAINT Tipo_habitacion_Habitacion_FK FOREIGN KEY ( Habitacion_NumeroHabitacion ) REFERENCES Habitacion ( NumeroHabitacion ) ;


