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
public class RegistroNuevoHuespedBLL {
    
    public boolean CrearNuevoHuesped (String nombre, String ap, String am, String rut,String fnac, String mail, String sexo, int emp) throws SQLException
    {
        boolean estado=false;
    Conexion conexion = Conexion.getInstance();
    Connection conn = conexion.getConnection();
    
            PreparedStatement ps = conn.prepareStatement("insert into huesped (nombre,ap_paterno,ap_materno,rut,fecha_nac,email,sexo,id_empresa) values (?,?,?,?,?,?,?,?)");
           
            ps.setString(1, nombre);
            ps.setString(2, ap);
            ps.setString(3, am);
            ps.setString(4, rut);
            ps.setString(5, fnac);
            ps.setString(6, mail);
            ps.setString(7, sexo);
            ps.setInt(8,emp);
            System.out.println(ps.executeUpdate());
            if(ps.executeUpdate() ==1)
            {
                estado = true;
            }
            
    return estado;
    
        
    }
    
      public static ArrayList<String> llenaEmpresa() throws SQLException
   {
       Statement consulta = null;
       
       ArrayList<String> llena = new ArrayList<String>();
       Conexion conexion = Conexion.getInstance();
       Connection conn = conexion.getConnection();
        String query =("select nombre  from empresa");
        try{
           ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 llena.add(res.getString("nombre"));  
             }
          }catch(Exception e){
              System.out.println("problemas de conexion :( ");
          }

       return llena;        
   
   }
      
       public static int obtieneIDemp(String nemp) throws SQLException
     {
         int id=0;
          Conexion conexion = Conexion.getInstance();
          Connection conn = conexion.getConnection();
          String query =("select id_empresa from empresa where nombre = '"+nemp+"'");
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 id=res.getInt("id_empresa");
             }
         } catch (Exception e) {
              System.out.println("problema con traer el id empresa");
         }
         return id;
     }
}
