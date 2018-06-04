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
public class HabitacionesBLL {
    
     public ResultSet ListaHabitacionesDisp() throws SQLException{
        
        Conexion conexion = Conexion.getInstance();
            Connection conn = conexion.getConnection();
            String query ="select h.ID_HABITACION,h.PRECIO,h.DISPONIBILIDAD,th.DSC_TIPO_HABITACION,sh.DSC_STATUS_HABITACION \n" +
                          "from habitacion h  \n" +
                          "join tipo_habitacion th on (h.ID_TIPO_HABITACION=th.ID_TIPO_HABITACION) \n" +
                          "join status_habitacion sh on(sh.ID_STATUS_HABITACION = h.ID_STATUS_HABITACION)" ;
            System.out.println(query);
            PreparedStatement consulta = conn.prepareStatement(query);
            
            ResultSet resultado = consulta.executeQuery();
        return resultado;
     }
}
