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
public class reservaDAL {
int id_reserva,id_empresa,cant_huespedes;
String fecha_checkin,fecha_chackout;

    public reservaDAL() {
    }

    public reservaDAL(int id_reserva, int id_empresa, int cant_huespedes, String fecha_checkin, String fecha_chackout) {
        this.id_reserva = id_reserva;
        this.id_empresa = id_empresa;
        this.cant_huespedes = cant_huespedes;
        this.fecha_checkin = fecha_checkin;
        this.fecha_chackout = fecha_chackout;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getCant_huespedes() {
        return cant_huespedes;
    }

    public void setCant_huespedes(int cant_huespedes) {
        this.cant_huespedes = cant_huespedes;
    }

    public String getFecha_checkin() {
        return fecha_checkin;
    }

    public void setFecha_checkin(String fecha_checkin) {
        this.fecha_checkin = fecha_checkin;
    }

    public String getFecha_chackout() {
        return fecha_chackout;
    }

    public void setFecha_chackout(String fecha_chackout) {
        this.fecha_chackout = fecha_chackout;
    }

    
}
