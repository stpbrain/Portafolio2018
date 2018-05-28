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
public class EmpresaBLL {
     public ResultSet ListaEmpresas() throws SQLException{
        
        
        
        
            Conexion conexion = Conexion.getInstance();
            Connection conn = conexion.getConnection();
            String query ="select id_empresa,nombre,rut,direccion,telefono,email from empresa" ;
            System.out.println(query);
            PreparedStatement consulta = conn.prepareStatement(query);
            
            ResultSet resultado = consulta.executeQuery();
            
              
            
        
        
        return resultado;
    }
    
}
