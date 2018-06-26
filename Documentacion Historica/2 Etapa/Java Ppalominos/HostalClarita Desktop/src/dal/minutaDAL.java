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
public class minutaDAL {

    int id_plato,id_servicio_comedor,id_dia_semana;

    public minutaDAL() {
    }

    public minutaDAL(int id_plato, int id_servicio_comedor, int id_dia_semana) {
        this.id_plato = id_plato;
        this.id_servicio_comedor = id_servicio_comedor;
        this.id_dia_semana = id_dia_semana;
    }

    public int getId_plato() {
        return id_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;
    }

    public int getId_servicio_comedor() {
        return id_servicio_comedor;
    }

    public void setId_servicio_comedor(int id_servicio_comedor) {
        this.id_servicio_comedor = id_servicio_comedor;
    }

    public int getId_dia_semana() {
        return id_dia_semana;
    }

    public void setId_dia_semana(int id_dia_semana) {
        this.id_dia_semana = id_dia_semana;
    }
    
    
}
