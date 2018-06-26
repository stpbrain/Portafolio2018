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
    
            PreparedStatement ps = conn.prepareStatement("insert into producto (dsc_producto,id_tipo_producto,id_proveedor,fecha_vencimiento,precio,stock,stock_critico) values (?,?,?,?,?,?,?)");
           
            ps.setString(1,nProd );
            ps.setInt(2, idTprod);
            ps.setInt(3, prov);
            ps.setString(4, fvenc);
            ps.setInt(5, prec);
            ps.setInt(6, stockIni);
            ps.setInt(7, stockCritico);
            ps.executeUpdate();
            String query = ("select max(id) as i from prod_final where dsc = '"+nProd+"'");
            ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("Busqueda de prod final"+query);
            int id=0;
          
                while(res.next())
             {
                 
                 id=res.getInt("i");
                 if(id==0)
                 {
                     String q1=("insert into prod_final values(1,'"+nProd+"')");
               conn.createStatement().executeQuery(q1);
                 }if(id>0)
                 {
                     id= id+1;
               String q1=("insert into prod_final values("+id+",'"+nProd+"')");
               conn.createStatement().executeQuery(q1);
                 }
                 System.out.println("soy el valor de la consulta__>"+id);
                 
             }
                
           
               
            
            
            
            return 1;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegistroNuevoProd.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("problemas para agregar producto !!");
            return 0;
        }
    
    
        
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
          String query =("select id_tipo_producto from tipo_producto where dsc_tipo_producto='"+nomb+"'");
          
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 
                  id_prod=res.getInt("id_tipo_producto");
                 System.out.println("soy la familia id: "+id_prod);
                 
             }
             } catch (Exception e) {
              System.out.println("problema con traer la familia");
         }
       return id_prod;
        }
        public int traeIdProv(String prov) throws SQLException
        {
           int id_prov=0;
          Conexion conexion = Conexion.getInstance();
          Connection conn = conexion.getConnection();
          String query =("select id_proveedor from proveedor where nombre_proveedor = '"+prov+"'");
          
          try {
              ResultSet res =  conn.createStatement().executeQuery(query);
            System.out.println("correcto");
             while(res.next())
             {
                 
                  id_prov=res.getInt("id_proveedor");
                 System.out.println("soy la id de proveedor: "+id_prov);
                 
             }
             } catch (Exception e) {
              System.out.println("problema con traer el id prov"); 
            }
          return id_prov;
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
     
     public int traeCod(String nomb,String fecha)
     {
         int cod = 0;
         try {
             Conexion conexion = Conexion.getInstance();
             Connection conn = conexion.getConnection();
             String query = ("select ID_PROVEEDOR||ID_TIPO_PRODUCTO||replace(FECHA_VENCIMIENTO,'/','')||MAX(ID) as cod from producto d join prod_final pf on(d.DSC_PRODUCTO=pf.DSC)  where d.DSC_PRODUCTO = '"+nomb+"' and d.FECHA_VENCIMIENTO = '"+fecha+"' GROUP BY ID_PROVEEDOR||ID_TIPO_PRODUCTO||replace(FECHA_VENCIMIENTO,'/','')");
                              
             ResultSet res1 =  conn.createStatement().executeQuery(query);
             
            while(res1.next())
             {
                 cod = res1.getInt("cod");
                 System.out.println("soy el codigo-->"+cod );
                 System.out.println(query);
             }
             return cod;
             
         } catch (SQLException ex) {
             Logger.getLogger(RegistroNuevoProd.class.getName()).log(Level.SEVERE, null, ex);
             System.out.println("problemas para traer codigo de producto");
             return cod;
         }
     
     }
}
