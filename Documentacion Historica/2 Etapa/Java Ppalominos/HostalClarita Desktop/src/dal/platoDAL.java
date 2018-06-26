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
public class platoDAL {
   int id_plato,precio;
   String dsc_plato;

    public platoDAL() {
    }

    public platoDAL(int id_plato, int precio, String dsc_plato) {
        this.id_plato = id_plato;
        this.precio = precio;
        this.dsc_plato = dsc_plato;
    }

    public int getId_plato() {
        return id_plato;
    }

    public void setId_plato(int id_plato) {
        this.id_plato = id_plato;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDsc_plato() {
        return dsc_plato;
    }

    public void setDsc_plato(String dsc_plato) {
        this.dsc_plato = dsc_plato;
    }
    
   
}
