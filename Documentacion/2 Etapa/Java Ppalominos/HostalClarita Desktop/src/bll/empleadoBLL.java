/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author papalominos
 */
public class empleadoBLL {
    
    public boolean validarUsuario(String usuario, String pass) throws SQLException
    {
        boolean resultado = false;
        Conexion conexion = Conexion.getInstance();
        Connection conn = conexion.getConnection();
        
        String query = "select * from empleado where rut_empleado = "+usuario+" and pass_empleado='"+pass+"'  ";
        System.out.println(query);
        
        PreparedStatement consulta = conn.prepareStatement(query);
        ResultSet rs = consulta.executeQuery();
   
        while(rs.next())
        {
            System.out.println("Fila: "+rs.getRow());
            resultado = (rs.getRow()>1)?false:true;      
        }
       
        return resultado;

    }
  public String traeNombre(String rut) throws SQLException
  {
     String res="";
     Conexion conexion = Conexion.getInstance();
        Connection conn = conexion.getConnection();
        
        String query = "select nombre, apellido from empleado where rut_empleado = "+rut+" ";
        System.out.println(query);
        
        PreparedStatement consulta = conn.prepareStatement(query);
        ResultSet rs = consulta.executeQuery();
   
        while(rs.next())
        {
            System.out.println(rs.getString("nombre")+" "+rs.getString("apellido"));
            res = rs.getString("nombre")+" "+rs.getString("apellido");
            
            
            
        }
     
     
     return res;
  }
    
}
