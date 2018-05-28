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
public class ReservaDetalleDAL {

    int id_reserva_detalle,id_reserva,id_habitacion,id_huesped;
    char confirma_reserva;

    public ReservaDetalleDAL() {
    }

    public ReservaDetalleDAL(int id_reserva_detalle, int id_reserva, int id_habitacion, int id_huesped, char confirma_reserva) {
        this.id_reserva_detalle = id_reserva_detalle;
        this.id_reserva = id_reserva;
        this.id_habitacion = id_habitacion;
        this.id_huesped = id_huesped;
        this.confirma_reserva = confirma_reserva;
    }

    public int getId_reserva_detalle() {
        return id_reserva_detalle;
    }

    public void setId_reserva_detalle(int id_reserva_detalle) {
        this.id_reserva_detalle = id_reserva_detalle;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public int getId_huesped() {
        return id_huesped;
    }

    public void setId_huesped(int id_huesped) {
        this.id_huesped = id_huesped;
    }

    public char getConfirma_reserva() {
        return confirma_reserva;
    }

    public void setConfirma_reserva(char confirma_reserva) {
        this.confirma_reserva = confirma_reserva;
    }
    
    
}
