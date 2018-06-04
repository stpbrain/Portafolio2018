/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author papalominos
 */
public class RegistroNuevoHuespedBLL {
    
    public boolean CrearNuevoHuesped (String nombre, String ap, String am, String rut,String fnac, String mail, String sexo) throws SQLException
    {
        boolean estado=false;
    Conexion conexion = Conexion.getInstance();
    Connection conn = conexion.getConnection();
    
            PreparedStatement ps = conn.prepareStatement("insert into huesped (nombre,ap_paterno,ap_materno,rut,fecha_nac,email,sexo) values (?,?,?,?,?,?,?)");
           
            ps.setString(1, nombre);
            ps.setString(2, ap);
            ps.setString(3, am);
            ps.setString(4, rut);
            ps.setString(5, fnac);
            ps.setString(6, mail);
            ps.setString(7, sexo);
            System.out.println(ps.executeUpdate());
            if(ps.executeUpdate() ==1)
            {
                estado = true;
            }
            
    return estado;
    
        
    }
    
}
