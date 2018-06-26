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
public class productoDAL {
   int id_producto,id_tipo_producto,id_proveedor;
   String dsc_producto,fecha_vencimiento;

    public productoDAL() {
    }

    public productoDAL(int id_producto, int id_tipo_producto, int id_proveedor, String dsc_producto, String fecha_vencimiento) {
        this.id_producto = id_producto;
        this.id_tipo_producto = id_tipo_producto;
        this.id_proveedor = id_proveedor;
        this.dsc_producto = dsc_producto;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_tipo_producto() {
        return id_tipo_producto;
    }

    public void setId_tipo_producto(int id_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getDsc_producto() {
        return dsc_producto;
    }

    public void setDsc_producto(String dsc_producto) {
        this.dsc_producto = dsc_producto;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }
   
}
