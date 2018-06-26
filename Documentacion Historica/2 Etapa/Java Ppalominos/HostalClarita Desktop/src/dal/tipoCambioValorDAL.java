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
public class tipoCambioValorDAL {
    int id_tipo_cambio_valor,id_tipo_cambio,valor_tipo_cambio;
    String fecha;

    public tipoCambioValorDAL() {
    }

    public tipoCambioValorDAL(int id_tipo_cambio_valor, int id_tipo_cambio, int valor_tipo_cambio, String fecha) {
        this.id_tipo_cambio_valor = id_tipo_cambio_valor;
        this.id_tipo_cambio = id_tipo_cambio;
        this.valor_tipo_cambio = valor_tipo_cambio;
        this.fecha = fecha;
    }

    public int getId_tipo_cambio_valor() {
        return id_tipo_cambio_valor;
    }

    public void setId_tipo_cambio_valor(int id_tipo_cambio_valor) {
        this.id_tipo_cambio_valor = id_tipo_cambio_valor;
    }

    public int getId_tipo_cambio() {
        return id_tipo_cambio;
    }

    public void setId_tipo_cambio(int id_tipo_cambio) {
        this.id_tipo_cambio = id_tipo_cambio;
    }

    public int getValor_tipo_cambio() {
        return valor_tipo_cambio;
    }

    public void setValor_tipo_cambio(int valor_tipo_cambio) {
        this.valor_tipo_cambio = valor_tipo_cambio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
