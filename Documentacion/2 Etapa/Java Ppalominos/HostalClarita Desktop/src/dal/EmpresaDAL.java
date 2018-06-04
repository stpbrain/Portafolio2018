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
public class EmpresaDAL {
   // int id_empresa;
  String nombre,rut,contrasena,direccion,telefono,email; 

    public EmpresaDAL() {
    }

    public EmpresaDAL(String nombre, String rut, String contrasena, String direccion, String telefono, String email) {
       // this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.rut = rut;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

  /*  public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }
*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
