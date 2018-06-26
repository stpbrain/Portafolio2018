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
public class RubroDAL {

int id_rubro;
String dsc_rubro;

    public int getId_rubro() {
        return id_rubro;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public String getDsc_rubro() {
        return dsc_rubro;
    }

    public void setDsc_rubro(String dsc_rubro) {
        this.dsc_rubro = dsc_rubro;
    }

    public RubroDAL(int id_rubro, String dsc_rubro) {
        this.id_rubro = id_rubro;
        this.dsc_rubro = dsc_rubro;
    }

    public RubroDAL() {
    }

}
