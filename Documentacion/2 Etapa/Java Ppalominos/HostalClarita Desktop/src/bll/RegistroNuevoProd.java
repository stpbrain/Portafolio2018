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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author papalominos
 */
public class RegistroNuevoProd {
     Conexion conexion;
    
    public int nuevoProducto(int prov, int idTprod,String fvenc,String nProd,int prec,int stockIni, int stockCritico)
    {
       
        try {

            conexion = Conexion.getInstance();
            Connection conn = conexion.getConnection();
    
            PreparedStatement ps = conn.prepareStatement("insert into producto "
                    + "(dsc_producto,id_tipo_producto,id_proveedor,fecha_vencimiento,precio,stock,stock_critico) "
                    + "values (?,?,?,?,?,?,?)");
           
            ps.setString(1,nProd );
            ps.setInt(2, idTprod);
            ps.setInt(3, prov);
            ps.setString(4, fvenc);
            ps.setInt(5, prec);
            ps.setInt(6, stockIni);
            ps.setInt(7, stockCritico);
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroNuevoProd.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("problemas para agregar producto !!");
        }
    
    
        return 0;
    }
        public boolean creaFamilia(String desc) throws SQLException
        {
            boolean r=false;
         try {
              ArrayList<String> llena = new ArrayList<String>();
       Conexion conexion = Conexion.getInstance();
       Connection conn = conexion.getConnection();
        String query =("select * from tipo_producto where DSC_TIPO_PRODUCTO ='"+desc+"'");
           ResultSet res =  conn.createStatement().executeQuery(query);
            if(res.next()== true)
            {
                System.out.println("familia esta creada");
            }else 
            {System.out.println("no esta creado");
            conexion = Conexion.getInstance();   
            String query1 = ("insert into TIPO_PRODUCTO (id_tipo_producto,dsc_tipo_producto) values(SEC_TIPO_PRODUCTO.nextval,'"+desc+"')");
           conn.createStatement().executeQuery(query1);
           r= true;
            }
         } catch (SQLException ex) {
             Logger.getLogger(RegistroNuevoProd.class.getName()).log(Level.SEVERE, null, ex);
         }
            System.out.println("resultado:"+r);
    return r;
        }
        
        public int traeIdFamilia(String nomb) throws SQLException
        { 
           int id_prod=0;
          Conexion conexion = Conexion.getInstance();
          Connection conn = conexion.getConnection();
          String query =("select id_tipo_producto where dsc_tipo_producto='"+nomb+"'");
          
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 
                  id_prod=res.getInt("id_tipo_habitacion");
                 System.out.println("soy la familia id: "+id_prod);
                 
             }
             } catch (Exception e) {
              System.out.println("problema con traer la familia");
         }
       return id_prod;
        }
        
 
    public static ArrayList<String> llenaFamilia() throws SQLException
   {
       ArrayList<String> llena = new ArrayList<String>();
       Conexion conexion = Conexion.getInstance();
       Connection conn = conexion.getConnection();
        String query =("select dsc_tipo_producto from tipo_producto");
        try{
           ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 llena.add(res.getString("dsc_tipo_producto"));  
             }
          }catch(Exception e){
              System.out.println("problemas de conexion :( ");
          }
       return llena;        
   
   }
   
     public static ArrayList<String> llenaProveedor() throws SQLException
   {
       ArrayList<String> llena = new ArrayList<String>();
       Conexion conexion = Conexion.getInstance();
       Connection conn = conexion.getConnection();
        String query =("select nombre_proveedor from proveedor");
        try{
           ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 llena.add(res.getString("nombre_proveedor"));  
             }
          }catch(Exception e){
              System.out.println("problemas de conexion :( ");
          }
       return llena;        
   }
}
