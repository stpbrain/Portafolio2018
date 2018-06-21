/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.Conexion;
import dal.EmpresaComboDAL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

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
     
     public ArrayList<EmpresaComboDAL> EmpresasConId() throws SQLException{
        
            ArrayList<EmpresaComboDAL> listaemp = new ArrayList();
            Conexion conexion = Conexion.getInstance();
            Connection conn = conexion.getConnection();
            String query ="select id_empresa,nombre from empresa" ;
            System.out.println(query);
            PreparedStatement consulta = conn.prepareStatement(query);
            
            ResultSet resultado = consulta.executeQuery();
            
            while(resultado.next()) {
                EmpresaComboDAL emp = new EmpresaComboDAL();
                emp.setId_empresa(resultado.getInt("id_empresa"));
                emp.setNombre_empresa(resultado.getString("nombre"));
                listaemp.add(emp);
            }

        return listaemp;
    }
    
}
