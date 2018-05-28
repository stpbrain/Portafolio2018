/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;
 
import bll.ClienteBLL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author christianlopez
 */
public class ClientesDAL {
    
    public ResultSet getAll() throws SQLException{
        
        
        
        
            Conexion conexion = Conexion.getInstance();
            Connection conn = conexion.getConnection();
            String query = "SELECT nombreempresa,rutempresa FROM empresacliente";
            System.out.println(query);
            PreparedStatement consulta = conn.prepareStatement(query);
            
            ResultSet resultado = consulta.executeQuery();
            
              
            
        
        
        return resultado;
    }
    
 
    public boolean nuevaEmpresa(String nombEmp,String dir,String mail,int rutEmp,int pass,int nHuesp,int telefono,int empClntID,int hostalID,int servComID,int huespID) throws SQLException
    {
        Conexion conexion = Conexion.getInstance();
        Connection conn = conexion.getConnection();
        
        return true;
    }
    
}
