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
public class proveedorDAL {
    
    int id_proveedor,id_rubro;
    String rut_proveedor,nombre_proveedor,direccion_prov,telefono_prov,nombre_contacto,mail_contacto;

    public proveedorDAL() {
    }

    public proveedorDAL(int id_proveedor, int id_rubro, String rut_proveedor, String nombre_proveedor, String direccion_prov, String telefono_prov, String nombre_contacto, String mail_contacto) {
        this.id_proveedor = id_proveedor;
        this.id_rubro = id_rubro;
        this.rut_proveedor = rut_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion_prov = direccion_prov;
        this.telefono_prov = telefono_prov;
        this.nombre_contacto = nombre_contacto;
        this.mail_contacto = mail_contacto;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public int getId_rubro() {
        return id_rubro;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public String getRut_proveedor() {
        return rut_proveedor;
    }

    public void setRut_proveedor(String rut_proveedor) {
        this.rut_proveedor = rut_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getDireccion_prov() {
        return direccion_prov;
    }

    public void setDireccion_prov(String direccion_prov) {
        this.direccion_prov = direccion_prov;
    }

    public String getTelefono_prov() {
        return telefono_prov;
    }

    public void setTelefono_prov(String telefono_prov) {
        this.telefono_prov = telefono_prov;
    }

    public String getNombre_contacto() {
        return nombre_contacto;
    }

    public void setNombre_contacto(String nombre_contacto) {
        this.nombre_contacto = nombre_contacto;
    }

    public String getMail_contacto() {
        return mail_contacto;
    }

    public void setMail_contacto(String mail_contacto) {
        this.mail_contacto = mail_contacto;
    }
    
    
}
