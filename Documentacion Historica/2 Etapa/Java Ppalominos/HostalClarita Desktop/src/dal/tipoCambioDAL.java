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
public class tipoCambioDAL {
    int id_tipo_cambio,id_moneda_origen,id_moneda_destino;
    char dsc_moneda_origen,dsc_moneda_destino,est_tipo_cambio;
     String dsc_tipo_cambio;

    public tipoCambioDAL() {
    }

    public tipoCambioDAL(int id_tipo_cambio, int id_moneda_origen, int id_moneda_destino, char dsc_moneda_origen, char dsc_moneda_destino, char est_tipo_cambio, String dsc_tipo_cambio) {
        this.id_tipo_cambio = id_tipo_cambio;
        this.id_moneda_origen = id_moneda_origen;
        this.id_moneda_destino = id_moneda_destino;
        this.dsc_moneda_origen = dsc_moneda_origen;
        this.dsc_moneda_destino = dsc_moneda_destino;
        this.est_tipo_cambio = est_tipo_cambio;
        this.dsc_tipo_cambio = dsc_tipo_cambio;
    }

    public int getId_tipo_cambio() {
        return id_tipo_cambio;
    }

    public void setId_tipo_cambio(int id_tipo_cambio) {
        this.id_tipo_cambio = id_tipo_cambio;
    }

    public int getId_moneda_origen() {
        return id_moneda_origen;
    }

    public void setId_moneda_origen(int id_moneda_origen) {
        this.id_moneda_origen = id_moneda_origen;
    }

    public int getId_moneda_destino() {
        return id_moneda_destino;
    }

    public void setId_moneda_destino(int id_moneda_destino) {
        this.id_moneda_destino = id_moneda_destino;
    }

    public char getDsc_moneda_origen() {
        return dsc_moneda_origen;
    }

    public void setDsc_moneda_origen(char dsc_moneda_origen) {
        this.dsc_moneda_origen = dsc_moneda_origen;
    }

    public char getDsc_moneda_destino() {
        return dsc_moneda_destino;
    }

    public void setDsc_moneda_destino(char dsc_moneda_destino) {
        this.dsc_moneda_destino = dsc_moneda_destino;
    }

    public char getEst_tipo_cambio() {
        return est_tipo_cambio;
    }

    public void setEst_tipo_cambio(char est_tipo_cambio) {
        this.est_tipo_cambio = est_tipo_cambio;
    }

    public String getDsc_tipo_cambio() {
        return dsc_tipo_cambio;
    }

    public void setDsc_tipo_cambio(String dsc_tipo_cambio) {
        this.dsc_tipo_cambio = dsc_tipo_cambio;
    }
   
     
}
