
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VentasDAO {
   Conexion cn = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int resp;
   
   //Método Listar
   public List listar(){
       String sql = "select * from Venta";
       List<Ventas> listaVentas = new ArrayList<>();
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               Ventas ven = new Ventas();
               ven.setCodigoVenta(rs.getInt(1));
               ven.setFechaVenta(rs.getString(2));
               ven.setDescripcion(rs.getString(3));
               ven.setCantidad(rs.getInt(4));
               ven.setDireccionEnvio(rs.getString(5));
               ven.setCodigoServicio(rs.getInt(6));
               listaVentas.add(ven);
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return listaVentas;
   }
   
   //Método Agregar
   public int agregar(Ventas ven){
       String sql = "insert into Venta(fechaVenta, descVenta, cantidad, direccionEnvio, codigoServicio)\n" +
"	values (?, ?, ?, ?, ?);";
       try{
          con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, ven.getFechaVenta());
            ps.setString(2, ven.getDescripcion());
            ps.setInt(3, ven.getCantidad());
            ps.setString(4, ven.getDireccionEnvio());
            ps.setInt(5, ven.getCodigoServicio());
            ps.executeUpdate(); 
       }catch(Exception e){
           e.printStackTrace();
       }
            return resp;
       }
   
   // Método Buscar
   public Ventas listarCodigoVentas(int id){
       Ventas ven = new Ventas();
       String sql = "Select * from Venta where codigoVenta = " + id;
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               ven.setFechaVenta(rs.getString(2));
               ven.setDescripcion(rs.getString(3));
               ven.setCantidad(rs.getInt(4));
               ven.setDireccionEnvio(rs.getString(5));
               ven.setCodigoServicio(rs.getInt(6));
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return ven;
   }
   
   //Método Editar
   public int actualizar(Ventas ven){
       String sql = "update Venta set fechaVenta = ?, descVenta = ?, cantidad = ?, direccionEnvio = ? where codigoVenta = ?";
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           ps.setString(1, ven.getFechaVenta());
           ps.setString(2, ven.getDescripcion());
           ps.setInt(3, ven.getCantidad());
           ps.setString(4, ven.getDireccionEnvio());
           ps.setInt(5, ven.getCodigoVenta());
           ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
       return resp;
   }
   
   //Método Eliminar
   public void eliminar(int id){
       String sql = "delete from Venta where codigoVenta =" + id;
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
}
