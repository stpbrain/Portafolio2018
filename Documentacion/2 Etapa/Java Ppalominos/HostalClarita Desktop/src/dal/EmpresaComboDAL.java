/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

/**
 *
 * @author Carlos Poblete (a.k.a Kyosuke Kasuga)
 */
public class EmpresaComboDAL {
    private int id_empresa;
    private String nombre_empresa;

    public EmpresaComboDAL() {
        this.id_empresa = 0;
        this.nombre_empresa = "";
    }
    public EmpresaComboDAL(int id_empresa, String nombre_empresa) {
        this.id_empresa = id_empresa;
        this.nombre_empresa = nombre_empresa;
    }
    
    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    @Override
    public String toString() {
        return this.nombre_empresa;
    }
    
    
    
}
