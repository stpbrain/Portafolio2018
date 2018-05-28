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
public class servicioComedorDAL {

    int id_servicio;
    String dsc_servicio_comedor;
    char est_servicio_comedor;

    public servicioComedorDAL(int id_servicio, String dsc_servicio_comedor, char est_servicio_comedor) {
        this.id_servicio = id_servicio;
        this.dsc_servicio_comedor = dsc_servicio_comedor;
        this.est_servicio_comedor = est_servicio_comedor;
    }

    public servicioComedorDAL() {
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getDsc_servicio_comedor() {
        return dsc_servicio_comedor;
    }

    public void setDsc_servicio_comedor(String dsc_servicio_comedor) {
        this.dsc_servicio_comedor = dsc_servicio_comedor;
    }

    public char getEst_servicio_comedor() {
        return est_servicio_comedor;
    }

    public void setEst_servicio_comedor(char est_servicio_comedor) {
        this.est_servicio_comedor = est_servicio_comedor;
    }


}
