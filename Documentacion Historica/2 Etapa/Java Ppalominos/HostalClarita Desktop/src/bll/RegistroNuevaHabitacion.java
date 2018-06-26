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
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author papalominos
 */
public class RegistroNuevaHabitacion {
    
  
   
    public static ArrayList<String> llenarStatusHabitacion() throws SQLException
   {
       Statement consulta = null;
       
       ArrayList<String> llena = new ArrayList<String>();
       Conexion conexion = Conexion.getInstance();
       Connection conn = conexion.getConnection();
        String query =("select id_status_habitacion, dsc_status_habitacion  from status_habitacion");
        try{
           ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 llena.add(res.getString("dsc_status_habitacion"));  
             }
          }catch(Exception e){
              System.out.println("problemas de conexion :( ");
          }

       return llena;        
   
   }
    
     public static ArrayList<String> llenarTipoHabitacion() throws SQLException
   {
       Statement consulta = null;
       
       ArrayList<String> llena = new ArrayList<String>();
       Conexion conexion = Conexion.getInstance();
       Connection conn = conexion.getConnection();
        String query =("select dsc_tipo_habitacion from tipo_habitacion");
        try{
           ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 
                 llena.add(res.getString("dsc_tipo_habitacion"));  
             }
          }catch(Exception e){
              System.out.println("problemas de conexion :( ");
          }

       return llena;        
   
   }
     
     public static int obtieneIDtipoHab(String tipo) throws SQLException
     {
         int id=0;
          Conexion conexion = Conexion.getInstance();
          Connection conn = conexion.getConnection();
          String query =("select id_tipo_habitacion from tipo_habitacion where dsc_tipo_habitacion = '"+tipo+"'");
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 
                 id=res.getInt("id_tipo_habitacion");
                 System.out.println("soy el id del tipo hab "+id);
                 
             }
         } catch (Exception e) {
              System.out.println("problema con traer el id del tipo hab");
         }
       
     
         return id;
     }
      public static int obtieneIDestadoHab(String est) throws SQLException
     {
         int ide=0;
          Conexion conexion = Conexion.getInstance();
          Connection conn = conexion.getConnection();
          String query =("select id_status_habitacion from status_habitacion where dsc_status_habitacion = '"+est+"'");
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println(query);
             while(res.next())
             {
                 
                 ide=res.getInt("id_status_habitacion");
                 System.out.println("soy el id del estado hab :"+ide);
             }
         } catch (Exception e) {
              System.out.println("problema con traer el id del estado hab");
         }
       
     
         return ide;
     }
   public boolean crearHab( int est, int tip, int val) throws SQLException
{
    boolean estado=false;
    Conexion conexion = Conexion.getInstance();
    Connection conn = conexion.getConnection();
    
            PreparedStatement ps = conn.prepareStatement("insert into habitacion (precio,id_tipo_habitacion,id_status_habitacion) values (?,?,?)");
           
         //insert into habitacion (precio,disponibilidad,id_tipo_habitacion,id_status_habitacion) values (400,null,1,1)
            ps.setInt(1, val);
            ps.setInt(2, tip);
            ps.setInt(3, est);
            ps.executeUpdate();
            if(ps.executeUpdate() ==1)
            {
                estado = true;
            }
            
    return estado;
}
}
