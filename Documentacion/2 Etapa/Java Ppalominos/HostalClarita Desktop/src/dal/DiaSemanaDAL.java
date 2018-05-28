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
public class DiaSemanaDAL {
    int id_dia_semana;
    String dsc_dia_semana;

    public DiaSemanaDAL() {
    }

    public DiaSemanaDAL(int id_dia_semana, String dsc_dia_semana) {
        this.id_dia_semana = id_dia_semana;
        this.dsc_dia_semana = dsc_dia_semana;
    }

    public int getId_dia_semana() {
        return id_dia_semana;
    }

    public void setId_dia_semana(int id_dia_semana) {
        this.id_dia_semana = id_dia_semana;
    }

    public String getDsc_dia_semana() {
        return dsc_dia_semana;
    }

    public void setDsc_dia_semana(String dsc_dia_semana) {
        this.dsc_dia_semana = dsc_dia_semana;
    }
    
    
}
