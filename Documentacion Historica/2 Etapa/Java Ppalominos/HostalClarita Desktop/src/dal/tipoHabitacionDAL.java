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
public class tipoHabitacionDAL {
int id_tipo_habitacion;
String dsc_tipo_habitacion,cod_tipo_habitacion; 

    public tipoHabitacionDAL() {
    }

    public tipoHabitacionDAL(int id_tipo_habitacion, String dsc_tipo_habitacion, String cod_tipo_habitacion) {
        this.id_tipo_habitacion = id_tipo_habitacion;
        this.dsc_tipo_habitacion = dsc_tipo_habitacion;
        this.cod_tipo_habitacion = cod_tipo_habitacion;
    }

    public int getId_tipo_habitacion() {
        return id_tipo_habitacion;
    }

    public void setId_tipo_habitacion(int id_tipo_habitacion) {
        this.id_tipo_habitacion = id_tipo_habitacion;
    }

    public String getDsc_tipo_habitacion() {
        return dsc_tipo_habitacion;
    }

    public void setDsc_tipo_habitacion(String dsc_tipo_habitacion) {
        this.dsc_tipo_habitacion = dsc_tipo_habitacion;
    }

    public String getCod_tipo_habitacion() {
        return cod_tipo_habitacion;
    }

    public void setCod_tipo_habitacion(String cod_tipo_habitacion) {
        this.cod_tipo_habitacion = cod_tipo_habitacion;
    }


}
