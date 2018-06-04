/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author papalominos
 */
public class InformesCantidades {
    
    public int cantidadUsuariosEmpresa() throws SQLException
    {
         int cantU=0;
          Conexion conexion = Conexion.getInstance();
          Connection conn = conexion.getConnection();
          String query =("select count(*) as tot from empresa");
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 
                 cantU=res.getInt("tot");
                 System.out.println("somos "+cantU+" usuarios");
                 
             }
         } catch (Exception e) {
              System.out.println("problema con traer el id del rubro");
         }
       
     
         return cantU;
    
    
    }
    public int cantidadUsuariosHuesp() throws SQLException
    {
    int cantU=0;
          Conexion conexion = Conexion.getInstance();
          Connection conn = conexion.getConnection();
          String query =("select count(*) as tot from huesped");
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 
                 cantU=res.getInt("tot");
                 System.out.println("somos "+cantU+" usuarios");
                 
             }
         } catch (Exception e) {
              System.out.println("problema con traer el id del rubro");
         }
       
     
         return cantU;
    
    }
    public int cantidadUsuariosEmpleados() throws SQLException
    {
    int cantU=0;
          Conexion conexion = Conexion.getInstance();
          Connection conn = conexion.getConnection();
          String query =("select count(*) as tot from empleado");
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 
                 cantU=res.getInt("tot");
                 System.out.println("somos "+cantU+" usuarios");
                 
             }
         } catch (Exception e) {
              System.out.println("problema el total");
         }
       
     
         return cantU;
    
    }
    
}

