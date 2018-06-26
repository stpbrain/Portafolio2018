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
public class tipoProductoDAL {
    int id_tipo_producto;
    String dsc_tipo_producto;

    public tipoProductoDAL() {
    }

    public tipoProductoDAL(int id_tipo_producto, String dsc_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
        this.dsc_tipo_producto = dsc_tipo_producto;
    }

    public int getId_tipo_producto() {
        return id_tipo_producto;
    }

    public void setId_tipo_producto(int id_tipo_producto) {
        this.id_tipo_producto = id_tipo_producto;
    }

    public String getDsc_tipo_producto() {
        return dsc_tipo_producto;
    }

    public void setDsc_tipo_producto(String dsc_tipo_producto) {
        this.dsc_tipo_producto = dsc_tipo_producto;
    }
    
}
