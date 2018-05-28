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
public class HabitacionDAL {
    
    int id_habitacion,precio,is_tipo_habitacion,id_status_habitacion;
    char disponibilidad;

    public HabitacionDAL() {
    }

    public HabitacionDAL(int id_habitacion, int precio, int is_tipo_habitacion, int id_status_habitacion, char disponibilidad) {
        this.id_habitacion = id_habitacion;
        this.precio = precio;
        this.is_tipo_habitacion = is_tipo_habitacion;
        this.id_status_habitacion = id_status_habitacion;
        this.disponibilidad = disponibilidad;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIs_tipo_habitacion() {
        return is_tipo_habitacion;
    }

    public void setIs_tipo_habitacion(int is_tipo_habitacion) {
        this.is_tipo_habitacion = is_tipo_habitacion;
    }

    public int getId_status_habitacion() {
        return id_status_habitacion;
    }

    public void setId_status_habitacion(int id_status_habitacion) {
        this.id_status_habitacion = id_status_habitacion;
    }

    public char getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(char disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
}
