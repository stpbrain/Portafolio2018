/*
Script de creación de tablas, para base de datos del proyecto Hostal Doña Clarita
Autor: Carlos Poblete Araya (a.k.a Kyosuke Kasuga)
Fecha: 16-05-2018
*/

CREATE TABLE RESERVA
( ID_RESERVA      NUMBER(10,0) NOT NULL,
  ID_USUARIO      NUMBER(10,0),
  FECHA_CHECKIN   DATE,
  FECHA_CHECKOUT  DATE,
  CANT_HUESPEDES  NUMERIC(3,0),
  CONSTRAINT RESERVA_PK PRIMARY KEY
  ( ID_RESERVA) ENABLE
);

CREATE TABLE RESERVA_DETALLE
( ID_RESERVA_DETALLE  NUMBER(10,0) NOT NULL,
  ID_RESERVA          NUMBER(10,0),
  ID_HABITACION       NUMBER(10,0),
  ID_PERSONA          NUMBER(10,0),
  CONFIRMA_RESERVA    CHAR(1),
  CONSTRAINT RESERVA_DETALLE_PK PRIMARY KEY
  ( ID_RESERVA_DETALLE) ENABLE
);

CREATE TABLE HABITACION
( ID_HABITACION       NUMBER(10,0) NOT NULL,
  PRECIO              NUMBER(18,4),
  DISPONIBILIDAD      CHAR(1 CHAR),
  ID_TIPO_HABITACION  NUMBER(10,0),
  ID_STATUS_HABITACION  NUMBER(10,0),
  CONSTRAINT HABITACION_PK PRIMARY KEY
  ( ID_HABITACION) ENABLE
);

CREATE TABLE TIPO_HABITACION
( ID_TIPO_HABITACION  NUMBER(10,0) NOT NULL,
  DSC_TIPO_HABITACION VARCHAR2(50 CHAR) ,
  COD_TIPO_HABITACION VARCHAR2(10 CHAR),
  CONSTRAINT TIPO_HABITACION_PK PRIMARY KEY
  ( ID_TIPO_HABITACION) ENABLE
);

CREATE TABLE STATUS_HABITACION
( ID_STATUS_HABITACION  NUMBER(10,0) NOT NULL,
  COD_STATUS_HABITACION CHAR(4 CHAR),
  DSC_STATUS_HABITACION VARCHAR2(50 CHAR),
  CONSTRAINT STATUS_HABITACION_PK PRIMARY KEY
  ( ID_STATUS_HABITACION) ENABLE
);

CREATE TABLE PERSONA
( ID_PERSONA        NUMBER(10,0) NOT NULL,
  NOMBRE            VARCHAR2(100 CHAR),
  AP_PATERNO        VARCHAR2(50 CHAR),
  AP_MATERNO        VARCHAR2(50 CHAR),
  RUT               VARCHAR2(8 CHAR),
  DV                CHAR(1 CHAR),
  FECHA_NACIMIENTO  DATE,
  EDAD              NUMBER(3,0),
  SEXO              CHAR(1 CHAR),
  DIRECCION         VARCHAR2(100 CHAR),
  EMAIL             VARCHAR2(60 CHAR),
  TELEFONO          VARCHAR2(20 CHAR),
  ID_TIPO_PERSONA   NUMBER(10,0),
  CONSTRAINT PERSONA_PK PRIMARY KEY
  ( ID_PERSONA) ENABLE
);

CREATE TABLE TIPO_PERSONA
( ID_TIPO_PERSONA   NUMBER(10,0) NOT NULL,
  DSC_TIPO_PERSONA  VARCHAR2(50 CHAR),
  ABR_TIPO_PERSONA  VARCHAR(3 CHAR),
  CONSTRAINT TIPO_PERSONA_PK PRIMARY KEY
  ( ID_TIPO_PERSONA) ENABLE
);

CREATE TABLE USUARIO
( ID_USUARIO      NUMBER(10,0) NOT NULL,
  ID_PERSONA      NUMBER(10,0),
  USER_NAME       VARCHAR2(30 CHAR),
  USER_PASS       VARCHAR2(500 CHAR),
  ID_ROL_USUARIO  NUMBER(10,0),
  CONSTRAINT USUARIO_PK PRIMARY KEY
  ( ID_USUARIO) ENABLE
);

CREATE TABLE ROL_USUARIO
( ID_ROL_USUARIO  NUMBER(10,0) NOT NULL,
  ROL_USUARIO     VARCHAR2(50 CHAR),
  DESCRIPCION     VARCHAR2(200 CHAR),
  CONSTRAINT ROL_USUARIO_PK PRIMARY KEY
  ( ID_ROL_USUARIO) ENABLE
);

CREATE TABLE PROVEEDOR
( ID_PROVEEDOR      NUMERIC(10,0) NOT NULL,
  ID_PERSONA        NUMERIC(10,0) NOT NULL,
  ID_RUBRO          NUMERIC(10,0) NOT NULL,
  NOMBRE_CONTACTO   VARCHAR2(100 CHAR),
  TELEFONO_CONTACTO VARCHAR2(20 CHAR),
  EMAIL_CONTACTO    VARCHAR2(50 CHAR),
  CONSTRAINT PROVEEDOR_PK PRIMARY KEY
  ( ID_PROVEEDOR) ENABLE
);

CREATE TABLE RUBRO
( ID_RUBRO  NUMBER(10,0) NOT NULL,
  DSC_RUBRO VARCHAR2(100 CHAR),
  CONSTRAINT RUBRO_PK PRIMARY KEY
  ( ID_RUBRO) ENABLE
);

CREATE TABLE PRODUCTO
( ID_PRODUCTO         NUMBER(10,0) NOT NULL,
  DSC_PRODUCTO        VARCHAR2(100 CHAR),
  ID_TIPO_PRODUCTO    NUMBER(10,0),
  ID_PROVEEDOR        NUMBER(10,0),
  FECHA_VENCIMIENTO   DATE,
  CONSTRAINT PRODUCTO_PK PRIMARY KEY
  ( ID_PRODUCTO) ENABLE
);

CREATE TABLE TIPO_PRODUCTO
( ID_TIPO_PRODUCTO  NUMBER(10,0) NOT NULL,
  DSC_TIPO_PRODUCTO VARCHAR2(100 CHAR),
  CONSTRAINT TIPO_PRODUCTO_PK PRIMARY KEY
  ( ID_TIPO_PRODUCTO) ENABLE
);

CREATE TABLE TIPO_CAMBIO
( ID_TIPO_CAMBIO      NUMBER(10,0) NOT NULL,
  ID_MONEDA_ORIGEN    NUMBER(10,0),
  DSC_MONEDA_ORIGEN   CHAR(3 CHAR),
  ID_MONEDA_DESTINO   NUMBER(10,0),
  DSC_MONEDA_DESTINO  CHAR(3 CHAR),
  DSC_TIPO_CAMBIO     VARCHAR2(30 CHAR),
  EST_TIPO_CAMBIO     CHAR(3 CHAR),
  CONSTRAINT TIPO_CAMBIO_PK PRIMARY KEY
  ( ID_TIPO_CAMBIO) ENABLE
);

CREATE TABLE MONEDA
( ID_MONEDA   NUMBER(10,0) NOT NULL,
  DSC_MONEDA  VARCHAR2(20 CHAR),
  COD_MONEDA  CHAR(3 CHAR),
  CONSTRAINT MONEDA_PK PRIMARY KEY
  ( ID_MONEDA) ENABLE
);

CREATE TABLE TIPO_CAMBIO_VALOR
( ID_TIPO_CAMBIO_VALOR  NUMBER(10,0) NOT NULL,
  ID_TIPO_CAMBIO        NUMBER(10,0),
  FECHA                 DATE,
  VALOR_TIPO_CAMBIO     NUMBER(10,4),
  CONSTRAINT TIPO_CAMBIO_VALOR_PK PRIMARY KEY
  ( ID_TIPO_CAMBIO_VALOR) ENABLE
);

/*
CREATE TABLE INVENTARIO
( ID_INVENTARIO NUMBER(10,0) NOT NULL,
  ID_PRODUCTO   NUMBER(10,0),
  
);
*/
CREATE TABLE PLATO
( ID_PLATO  NUMBER(10,0) NOT NULL,
  DSC_PLATO VARCHAR2(50 CHAR),
  PRECIO    NUMBER(18,4),
  CONSTRAINT PLATO_PK PRIMARY KEY
  ( ID_PLATO) ENABLE
);

CREATE TABLE SERVICIO_COMEDOR
( ID_SERVICIO_COMEDOR       NUMBER(10,0) NOT NULL,
  DSC_SERVICIO_COMEDOR      VARCHAR2(50),
  EST_SERVICIO_COMEDOR  CHAR(3 CHAR),
  CONSTRAINT SERVICIO_COMEDOR_PK PRIMARY KEY
  ( ID_SERVICIO_COMEDOR) ENABLE
);

CREATE TABLE MINUTA
( ID_PLATO            NUMBER(10,0) NOT NULL,
  ID_SERVICIO_COMEDOR NUMBER(10,0) NOT NULL,
  ID_DIA_SEMANA       NUMBER(10,0) NOT NULL,
  CONSTRAINT MINUTA_PK PRIMARY KEY
  ( ID_PLATO, ID_SERVICIO_COMEDOR, ID_DIA_SEMANA) ENABLE
);

CREATE TABLE DIA_SEMANA
( ID_DIA_SEMANA NUMBER(10,0) NOT NULL,
  DSC_DIA_SEMANA  VARCHAR2(10 CHAR),
  CONSTRAINT DIA_SEMANA_PK PRIMARY KEY
  ( ID_DIA_SEMANA) ENABLE
);

CREATE TABLE ORDEN_PEDIDO
( ID_ORDEN_PEDIDO NUMBER(10,0) NOT NULL,
  ID_PROVEEDOR    NUMBER(10,0) NOT NULL,
  FECHA_SOLICITUD DATE,
  FECHA_RECEPCION DATE,
  ID_USUARIO_CREA_OP  NUMBER(10,0),
  OBSERVACIONES       VARCHAR2(500 CHAR),
  CONSTRAINT ORDEN_PEDIDO_PK PRIMARY KEY
  ( ID_ORDEN_PEDIDO) ENABLE
);

CREATE TABLE ORDEN_PEDIDO_DET
( ID_ORDEN_PEDIDO_DET   NUMBER(10,0) NOT NULL,
  ID_ORDEN_PEDIDO       NUMBER(10,0),
  SEC_ORDEN_PEDIDO_DET  NUMBER(3,0),
  ID_PRODUCTO           NUMBER(10,0),
  CANTIDAD              NUMBER(10,0),
  PRECIO_UNITARIO       NUMBER(18,4),
  MONTO_TOTAL_OP        NUMBER(18,4),
  CONSTRAINT  ORDEN_PEDIDO_DET_PK PRIMARY KEY
  ( ID_ORDEN_PEDIDO_DET) ENABLE
);
  