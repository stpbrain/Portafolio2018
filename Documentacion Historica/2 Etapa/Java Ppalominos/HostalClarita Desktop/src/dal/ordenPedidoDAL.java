/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

/**
 *
 * @author papalominos
 */
public class ordenPedidoDAL {
int id_orden_pedido,id_proveedor;
String fecha_solicitud,fecha_recepcion,observaciones;

    public ordenPedidoDAL() {
    }

    public ordenPedidoDAL(int id_orden_pedido, int id_proveedor, String fecha_solicitud, String fecha_recepcion, String observaciones) {
        this.id_orden_pedido = id_orden_pedido;
        this.id_proveedor = id_proveedor;
        this.fecha_solicitud = fecha_solicitud;
        this.fecha_recepcion = fecha_recepcion;
        this.observaciones = observaciones;
    }

    public int getId_orden_pedido() {
        return id_orden_pedido;
    }

    public void setId_orden_pedido(int id_orden_pedido) {
        this.id_orden_pedido = id_orden_pedido;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(String fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(String fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }


    
}
