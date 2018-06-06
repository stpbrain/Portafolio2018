/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;
import dal.Conexion;
import dal.EmpresaDAL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author papalominos
 */
public class RegistroNuevaEmpBLL {


public boolean crearEmpresa( String nombre,String rut,String contrasena,String direccion,String telefono,String email) throws SQLException
{
    boolean estado=false;
    Conexion conexion = Conexion.getInstance();
    Connection conn = conexion.getConnection();
    
            PreparedStatement ps = conn.prepareStatement("insert into empresa (NOMBRE,RUT,CONTRASEÑA,DIRECCION,TELEFONO,EMAIL) values(?,?,?,?,?,?)");
           
            ps.setString(1, nombre);
            ps.setString(2, rut);
            ps.setString(3, contrasena);
            ps.setString(4, direccion);
            ps.setString(5, telefono);
            ps.setString(6, email);
            ps.executeUpdate();
            if(ps.executeUpdate() ==1)
            {
                estado = true;
            }
            
    return estado;
}
    
}
