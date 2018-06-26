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
public class ServicioComedorBLL {
    
     public ResultSet ListaOpcionComedor() throws SQLException{
         
            
            Conexion conexion = Conexion.getInstance();
            Connection conn = conexion.getConnection();
            String query ="select p.DSC_PLATO, cm.DSC_SERVICIO_COMEDOR, ds.DSC_DIA_SEMANA,p.PRECIO\n" +
                          "from minuta m join plato p on(m.id_plato=p.id_plato)\n" +
                          " join servicio_comedor cm on (m.id_servicio_comedor=cm.id_servicio_comedor)\n" +
                          " join   dia_semana ds on(m.id_dia_semana=ds.id_dia_semana) ORDER BY ds.ID_DIA_SEMANA" ;
            System.out.println(query);
            PreparedStatement consulta = conn.prepareStatement(query);
            
            ResultSet rs = consulta.executeQuery();
      
       
        return rs;

    }       
    
}
