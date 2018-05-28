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
public class statusHabitacionDAL {

    int id_status_habitacion;
    char cod_status_habiotacion;
    String dsc_status_habitacion;

    public statusHabitacionDAL() {
    }

    public statusHabitacionDAL(int id_status_habitacion, char cod_status_habiotacion, String dsc_status_habitacion) {
        this.id_status_habitacion = id_status_habitacion;
        this.cod_status_habiotacion = cod_status_habiotacion;
        this.dsc_status_habitacion = dsc_status_habitacion;
    }

    public int getId_status_habitacion() {
        return id_status_habitacion;
    }

    public void setId_status_habitacion(int id_status_habitacion) {
        this.id_status_habitacion = id_status_habitacion;
    }

    public char getCod_status_habiotacion() {
        return cod_status_habiotacion;
    }

    public void setCod_status_habiotacion(char cod_status_habiotacion) {
        this.cod_status_habiotacion = cod_status_habiotacion;
    }

    public String getDsc_status_habitacion() {
        return dsc_status_habitacion;
    }

    public void setDsc_status_habitacion(String dsc_status_habitacion) {
        this.dsc_status_habitacion = dsc_status_habitacion;
    }
    
    
}
