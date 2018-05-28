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
public class rolUsuarioDAL {
int id_rol_usuario;
String rol_ususario,descripcion;

    public rolUsuarioDAL() {
    }

    public rolUsuarioDAL(int id_rol_usuario, String rol_ususario, String descripcion) {
        this.id_rol_usuario = id_rol_usuario;
        this.rol_ususario = rol_ususario;
        this.descripcion = descripcion;
    }

    public int getId_rol_usuario() {
        return id_rol_usuario;
    }

    public void setId_rol_usuario(int id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }

    public String getRol_ususario() {
        return rol_ususario;
    }

    public void setRol_ususario(String rol_ususario) {
        this.rol_ususario = rol_ususario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
