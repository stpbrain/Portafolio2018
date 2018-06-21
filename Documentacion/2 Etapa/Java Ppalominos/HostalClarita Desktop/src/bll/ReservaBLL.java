/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;
import dal.Conexion;
import dal.reservaDAL;
import dal.ReservaDetalleDAL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carlos Poblete (a.k.a Kyosuke Kasuga)
 */
public class ReservaBLL {
    
    public ResultSet ReservasPorEmpresa(int id_emp) throws SQLException {
        
        Conexion conexion = Conexion.getInstance();
        Connection conn = conexion.getConnection();
        
        String query = "SELECT RES.ID_RESERVA, EMP.NOMBRE, EMP.RUT, RES.FECHA_CHECKIN, RES.FECHA_CHECKOUT, RES.CANT_HUESPEDES ";
        query = query + "FROM RESERVA RES ";
        query = query + "INNER JOIN EMPRESA EMP ON EMP.ID_EMPRESA = RES.ID_EMPRESA ";
        query = query + "WHERE RES.ID_EMPRESA = ?" ;
        System.out.println(query);
        PreparedStatement consulta = conn.prepareStatement(query);
        consulta.setInt(1, id_emp);
               
        ResultSet resultado = consulta.executeQuery();

        return resultado;
    }
    
    public int UltimoIdReserva() throws SQLException {
        Conexion conexion = Conexion.getInstance();
        Connection conn = conexion.getConnection();
        int UltimoId = 0;
        
        String query = "SELECT MAX(ID_RESERVA) ULTIMO_IDRESERVA FROM RESERVA";
        System.out.println(query);
        PreparedStatement consulta = conn.prepareStatement(query);
       
        ResultSet resultado = consulta.executeQuery();
        
        while(resultado.next()) {
            UltimoId = resultado.getInt("ULTIMO_IDRESERVA");
        }

        return UltimoId;
    }
    
    public boolean GuardarReserva(int _idempresa, String _fechacheckin, String _fechacheckout, int _canthuespedes) throws SQLException {
        Conexion conexion = Conexion.getInstance();
        Connection conn = conexion.getConnection();
        conn.setAutoCommit(false);
        boolean resultado = false;
        
        String query = "INSERT INTO RESERVA (ID_EMPRESA, FECHA_CHECKIN, FECHA_CHECKOUT, CANT_HUESPEDES) VALUES (?, TO_DATE(?,'DD/MM/YYYY'), TO_DATE(?,'DD/MM/YYYY'), ?)";
        System.out.println(query);
        PreparedStatement consulta = conn.prepareStatement(query);
        consulta.setInt(1, _idempresa);
        consulta.setString(2, _fechacheckin);
        consulta.setString(3, _fechacheckout);
        consulta.setInt(4, _canthuespedes);
               
        if (consulta.executeUpdate() == 1) {
            System.out.println("INSERT Reserva ejecutado exitosamente");
            conn.commit();
            resultado = true;
        } else {
            System.out.println("INSERT Reserva con errores. Revisar!!");
            conn.rollback();
            resultado = false;
        }
        return resultado;
    }
    
}