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
public class RegistroNuevoProv {
    
   
     public boolean NuevoProv (String rutP,int rubro,String nombreP, String DirP,String Telp, String nCont, String Telc, String MailC) throws SQLException
    {
        boolean estado=false;
    Conexion conexion = Conexion.getInstance();
    Connection conn = conexion.getConnection();
    
            PreparedStatement ps = conn.prepareStatement("insert into proveedor (rut_proveedor,id_rubro,nombre_proveedor,direccion_prov,telefono_prov,nombre_contacto,telefono_contacto,email_contacto) values (?,?,?,?,?,?,?,?)");
           
            ps.setString(1,rutP );
            ps.setInt(2, rubro);
            ps.setString(3, nombreP);
            ps.setString(4, DirP);
            ps.setString(5, Telp);
            ps.setString(6, nCont);
            ps.setString(7, Telc);
            ps.setString(8, MailC);
            System.out.println(ps.executeUpdate());
            if(ps.executeUpdate() ==1)
            {
                estado = true;
            }
            
    return estado;
    
        
    }
     
     
              public static ArrayList<String> ListarRubro() throws SQLException
   {
       Statement consulta = null;
       
       ArrayList<String> llena = new ArrayList<String>();
       Conexion conexion = Conexion.getInstance();
       Connection conn = conexion.getConnection();
        String query =("select dsc_rubro from rubro");
        try{
           ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 llena.add(res.getString("dsc_rubro"));  
             }
          }catch(Exception e){
              System.out.println("problemas de conexion :( ");
          }

       return llena;        
   
   }
   
public int obtieneIDrubro(String rubro) throws SQLException
     {
         int id=0;
          Conexion conexion = Conexion.getInstance();
          Connection conn = conexion.getConnection();
          String query =("select id_rubro from rubro where dsc_rubro ='"+rubro+"'");
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 
                 id=res.getInt("id_rubro");
                 System.out.println("soy el id del rubro "+id);
                 
             }
         } catch (Exception e) {
              System.out.println("problema con traer el id del rubro");
         }
       
     
         return id;
     }
              
              
    
}
