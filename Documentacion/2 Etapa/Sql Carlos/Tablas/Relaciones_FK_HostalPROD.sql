/*
Script de creación de relaciones de claves foráneas (Foreign Key) entre las tablas del modelo, para base de datos del proyecto Hostal Doña Clarita
Autor: Carlos Poblete Araya (a.k.a Kyosuke Kasuga)
Fecha: 16-05-2018
*/

ALTER TABLE RESERVA
ADD CONSTRAINT RESERVA_USUARIO_FK FOREIGN KEY ( ID_USUARIO )
    REFERENCES USUARIO ( ID_USUARIO );

ALTER TABLE RESERVA_DETALLE
ADD CONSTRAINT RESERVADET_RESERVA_FK FOREIGN KEY ( ID_RESERVA )
    REFERENCES RESERVA ( ID_RESERVA );

ALTER TABLE RESERVA_DETALLE
ADD CONSTRAINT RESERVADET_HABITACION_FK FOREIGN KEY ( ID_HABITACION )
    REFERENCES HABITACION ( ID_HABITACION );

ALTER TABLE RESERVA_DETALLE
ADD CONSTRAINT RESERVADET_PERSONA_FK FOREIGN KEY ( ID_PERSONA )
    REFERENCES PERSONA ( ID_PERSONA );

ALTER TABLE HABITACION
ADD CONSTRAINT HABITACION_TIPOHABIT_FK FOREIGN KEY ( ID_TIPO_HABITACION )
    REFERENCES TIPO_HABITACION ( ID_TIPO_HABITACION );

ALTER TABLE HABITACION
ADD CONSTRAINT HABITACION_STATUSHABIT_FK FOREIGN KEY ( ID_STATUS_HABITACION )
    REFERENCES STATUS_HABITACION ( ID_STATUS_HABITACION );    

ALTER TABLE PERSONA
ADD CONSTRAINT PERSONA_TIPOPERSONA_FK FOREIGN KEY ( ID_TIPO_PERSONA )
    REFERENCES TIPO_PERSONA ( ID_TIPO_PERSONA );

ALTER TABLE USUARIO
ADD CONSTRAINT USUARIO_PERSONA_FK FOREIGN KEY ( ID_PERSONA )
    REFERENCES PERSONA ( ID_PERSONA );

ALTER TABLE USUARIO
ADD CONSTRAINT USUARIO_ROLUSUARIO_FK FOREIGN KEY ( ID_ROL_USUARIO )
    REFERENCES ROL_USUARIO ( ID_ROL_USUARIO );    

ALTER TABLE PROVEEDOR
ADD CONSTRAINT PROVEEDOR_PERSONA_FK FOREIGN KEY ( ID_PERSONA )
    REFERENCES PERSONA ( ID_PERSONA );

ALTER TABLE PROVEEDOR
ADD CONSTRAINT PROVEEDOR_RUBRO_FK FOREIGN KEY ( ID_RUBRO )
    REFERENCES RUBRO ( ID_RUBRO );    

ALTER TABLE PRODUCTO
ADD CONSTRAINT PRODUCTO_TIPOPRODUCTO_FK FOREIGN KEY ( ID_TIPO_PRODUCTO )
    REFERENCES TIPO_PRODUCTO ( ID_TIPO_PRODUCTO );

ALTER TABLE PRODUCTO
ADD CONSTRAINT PRODUCTO_PROVEEDOR_FK FOREIGN KEY ( ID_PROVEEDOR )
    REFERENCES PROVEEDOR ( ID_PROVEEDOR );    

ALTER TABLE TIPO_CAMBIO
ADD CONSTRAINT TIPOCAMBIO_MONEDAORIGEN_FK FOREIGN KEY ( ID_MONEDA_ORIGEN )
    REFERENCES MONEDA ( ID_MONEDA );

ALTER TABLE TIPO_CAMBIO
ADD CONSTRAINT TIPOCAMBIO_MONEDADESTINO_FK FOREIGN KEY ( ID_MONEDA_DESTINO )
    REFERENCES MONEDA ( ID_MONEDA );    

ALTER TABLE TIPO_CAMBIO_VALOR
ADD CONSTRAINT TIPOCAMBIOVALOR_TIPOCAMBIO_FK FOREIGN KEY ( ID_TIPO_CAMBIO )
    REFERENCES TIPO_CAMBIO ( ID_TIPO_CAMBIO );                                    

ALTER TABLE MINUTA
ADD CONSTRAINT MINUTA_PLATO_FK FOREIGN KEY ( ID_PLATO )
    REFERENCES PLATO ( ID_PLATO );

ALTER TABLE MINUTA
ADD CONSTRAINT MINUTA_SERVICIOCOMEDOR_FK FOREIGN KEY ( ID_SERVICIO_COMEDOR )
    REFERENCES SERVICIO_COMEDOR ( ID_SERVICIO_COMEDOR );

ALTER TABLE MINUTA
ADD CONSTRAINT MINUTA_DIASEMANA_FK FOREIGN KEY ( ID_DIA_SEMANA )
    REFERENCES DIA_SEMANA ( ID_DIA_SEMANA );        

ALTER TABLE ORDEN_PEDIDO
ADD CONSTRAINT ORDENPEDIDO_PROVEEDOR_FK FOREIGN KEY ( ID_PROVEEDOR )
    REFERENCES PROVEEDOR ( ID_PROVEEDOR );

ALTER TABLE ORDEN_PEDIDO
ADD CONSTRAINT ORDENPEDIDO_USUARIO_FK FOREIGN KEY ( ID_USUARIO_CREA_OP )
    REFERENCES USUARIO ( ID_USUARIO );

ALTER TABLE ORDEN_PEDIDO_DET
ADD CONSTRAINT ORDENPEDIDODET_ORDENPEDIDO_FK FOREIGN KEY ( ID_ORDEN_PEDIDO )
    REFERENCES ORDEN_PEDIDO ( ID_ORDEN_PEDIDO );

ALTER TABLE ORDEN_PEDIDO_DET
ADD CONSTRAINT ORDENPEDIDODET_PRODUCTO_FK FOREIGN KEY ( ID_PRODUCTO )
    REFERENCES PRODUCTO ( ID_PRODUCTO );    