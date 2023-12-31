package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DetalleVentaDAO {
   Conexion conx = new Conexion();
   Connection conec;
   PreparedStatement ps;
   ResultSet rs;
   int tot;
   
   //Método Listar
   public List listar(){
       String sql = "select * from DetalleVenta";
       List<DetalleVenta> listaDetalleVenta = new ArrayList<DetalleVenta>();
       try{
           conec = conx.Conexion();
           ps = conec.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               DetalleVenta detalleVen = new DetalleVenta();
               detalleVen.setCodigoDetalleVenta(rs.getInt(1));
               detalleVen.setFechaVen(rs.getString(2));
               detalleVen.setCantidadPro(rs.getInt(3));
               detalleVen.setTotal(rs.getString(4));
               detalleVen.setCodigoVenta(rs.getInt(5));
               detalleVen.setCodigoProducto(rs.getInt(6));
               listaDetalleVenta.add(detalleVen);
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return listaDetalleVenta;
   }
   
   //Método Agregar
   public int agregar(DetalleVenta detalleVen){
       String sql = "insert into DetalleVenta(fechaVen, cantidadPro, total, codigoVenta, codigoProducto)\n" +
"	values (?, ?, ?, ?, ?);";
       try{
          conec = conx.Conexion();
            ps = conec.prepareStatement(sql);
            ps.setString(1, detalleVen.getFechaVen());
            ps.setInt(2, detalleVen.getCantidadPro());
            ps.setString(3, detalleVen.getTotal());
            ps.setInt(4, detalleVen.getCodigoVenta());
            ps.setInt(5, detalleVen.getCodigoProducto());
            ps.executeUpdate(); 
       }catch(Exception e){
           e.printStackTrace();
       }
            return tot;
       }
   
   // Método Buscar
   public DetalleVenta listarCodigoDetalleVenta(int cod){
       DetalleVenta detalleVen = new DetalleVenta();
       String sql = "Select * from DetalleVenta where codigoDetalleVenta = " + cod;
       try{
           conec = conx.Conexion();
           ps = conec.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               detalleVen.setFechaVen(rs.getString(2));
               detalleVen.setCantidadPro(rs.getInt(3));
               detalleVen.setTotal(rs.getString(4));
               detalleVen.setCodigoVenta(rs.getInt(5));
               detalleVen.setCodigoProducto(rs.getInt(6));   
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       return detalleVen;
   }
   
   //Método Eliminar
   public void eliminar(int cod){
       String sql = "delete from DetalleVenta where codigoDetalleVenta =" + cod;
       try{
           conec = conx.Conexion();
           ps = conec.prepareStatement(sql);
           ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
}
