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
public class ordenPedidoDetalleDAL {
int id_orden_pedido_det,id_orden_pedido,sec_orden_pedido_det,id_producto,cantidad,precio_unitario,monto_total_op; 

    public ordenPedidoDetalleDAL() {
    }

    public ordenPedidoDetalleDAL(int id_orden_pedido_det, int id_orden_pedido, int sec_orden_pedido_det, int id_producto, int cantidad, int precio_unitario, int monto_total_op) {
        this.id_orden_pedido_det = id_orden_pedido_det;
        this.id_orden_pedido = id_orden_pedido;
        this.sec_orden_pedido_det = sec_orden_pedido_det;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.monto_total_op = monto_total_op;
    }

    public int getId_orden_pedido_det() {
        return id_orden_pedido_det;
    }

    public void setId_orden_pedido_det(int id_orden_pedido_det) {
        this.id_orden_pedido_det = id_orden_pedido_det;
    }

    public int getId_orden_pedido() {
        return id_orden_pedido;
    }

    public void setId_orden_pedido(int id_orden_pedido) {
        this.id_orden_pedido = id_orden_pedido;
    }

    public int getSec_orden_pedido_det() {
        return sec_orden_pedido_det;
    }

    public void setSec_orden_pedido_det(int sec_orden_pedido_det) {
        this.sec_orden_pedido_det = sec_orden_pedido_det;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(int precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getMonto_total_op() {
        return monto_total_op;
    }

    public void setMonto_total_op(int monto_total_op) {
        this.monto_total_op = monto_total_op;
    }


}
