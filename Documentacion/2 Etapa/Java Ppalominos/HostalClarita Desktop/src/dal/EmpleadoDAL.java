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
public class EmpleadoDAL {
     int id_empleado;
    String rut_empleado,nombre,apellido,telefono,pass_empleado,id_rol_usuario;

    public EmpleadoDAL(int id_empleado, String rut_empleado, String nombre, String apellido, String telefono, String pass_empleado, String id_rol_usuario) {
        this.id_empleado = id_empleado;
        this.rut_empleado = rut_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.pass_empleado = pass_empleado;
        this.id_rol_usuario = id_rol_usuario;
    }

    public EmpleadoDAL() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getRut_empleado() {
        return rut_empleado;
    }

    public void setRut_empleado(String rut_empleado) {
        this.rut_empleado = rut_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPass_empleado() {
        return pass_empleado;
    }

    public void setPass_empleado(String pass_empleado) {
        this.pass_empleado = pass_empleado;
    }

    public String getId_rol_usuario() {
        return id_rol_usuario;
    }

    public void setId_rol_usuario(String id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }

}
