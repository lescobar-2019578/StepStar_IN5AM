package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProductosDAO {
   Conexion cn = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int resp;
   
   //Metodo Listar
   public List listar(){
       String sql = "select * from Productos";
       List<Productos> listaProductos = new ArrayList<Productos>();
       try {
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               Productos pro = new Productos();
               pro.setCodigoProducto(rs.getInt(1));
               pro.setNombreProducto(rs.getString(2));
               pro.setDescripcion(rs.getString(3));
               pro.setMarca(rs.getString(4));
               pro.setPrecio(rs.getDouble(5));
               pro.setTalla(rs.getInt(6));
               pro.setCantidad(rs.getInt(7));
               pro.setCodigoProveedor(rs.getInt(8));
               pro.setCodigoCategoria(9);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return listaProductos;
   }
   
   //Metodo Agregar
   public int agregar(Productos pro){
       String sql = "insert into Productos(nombreProducto, descripcion, marca, precio, talla, cantidad, codigoProveedor, codigoCategoria) values (?,?,?,?,?,?,?,?)";
       try {
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           ps.setString(1, pro.getNombreProducto());
           ps.setString(2, pro.getDescripcion());
           ps.setString(3, pro.getMarca());
           ps.setDouble(3, pro.getPrecio());
           ps.setInt(5, pro.getTalla());
           ps.setInt(6, pro.getCantidad());
           ps.setInt(7, pro.getCodigoProveedor());
           ps.setInt(8, pro.getCodigoCategoria());
           ps.executeUpdate();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return resp;
   }
   //Metodo Buscar
       public Productos listarCodigoProductos(int id){
           Productos pro = new Productos();
           String sql = "Select * from Productos where codigoProducto = " + id;
           try {
               con = cn.Conexion();
               ps = con.prepareStatement(sql);
               rs = ps.executeQuery();
               while(rs.next()){
                   pro.setNombreProducto(rs.getString(2));
                   pro.setDescripcion(rs.getString(3));
                   pro.setMarca(rs.getString(4));
                   pro.setPrecio(rs.getDouble(5));
                   pro.setTalla(rs.getInt(6));
                   pro.setCantidad(rs.getInt(7));
                   pro.setCodigoProveedor(rs.getInt(8));
                   pro.setCodigoCategoria(rs.getInt(9));
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return pro;
       }
       
       //Metodo Editar
       public int actualizar(Productos pro){
           String sql = "update Productos set nombreProducto = ?, descripcion = ?, marca = ?, precio = ?, talla = ?, cantidad = ?," + "where codigoProducto = ?";
           try {
               con = cn.Conexion();
               ps = con.prepareStatement(sql);
               ps.setString(1, pro.getNombreProducto());
               ps.setString(2, pro.getDescripcion());
               ps.setString(3, pro.getMarca());
               ps.setDouble(4, pro.getPrecio());
               ps.setInt(5, pro.getTalla());
               ps.setInt(6, pro.getCantidad());
               ps.executeUpdate();
           } catch (Exception e) {
               e.printStackTrace();
           }
           return resp;
       }
       
       //Metodo Eliminar
       public void eliminar(int id){
           String sql = "delete from Productos where codigoProductos =" + id;
           try {
               con = cn.Conexion();
               ps = con.prepareStatement(sql);
               ps.executeUpdate();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
}
