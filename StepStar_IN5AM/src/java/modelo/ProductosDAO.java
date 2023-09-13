package modelo;

import config.Conexion;
<<<<<<< HEAD
=======
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
>>>>>>> origin/dzabala-2019001
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
=======
import javax.servlet.http.HttpServletResponse;
>>>>>>> origin/dzabala-2019001


public class ProductosDAO {
   Conexion cn = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int resp;
   
<<<<<<< HEAD
   //Metodo Listar
   public List listar(){
       String sql = "select * from Productos";
       List<Productos> listaProductos = new ArrayList<Productos>();
=======
   public Productos listarId(int id){
       String sql = "select * from productos where codigoProducto="+id;
       Productos p = new Productos();
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               p.setCodigoProducto(rs.getInt(1));
               p.setNombreProducto(rs.getString(2));
               p.setFotoDeProductos(rs.getBinaryStream(3));
               p.setDescripcion(rs.getString(4));
               p.setPrecio(rs.getDouble(5));
               p.setCantidad(rs.getInt(6));
           }
       }catch(Exception e){
       }
       return p;
   }
   
   //Metodo Listar
   public List listar(){
       String sql = "select * from Productos";
       List<Productos> listaProductos = new ArrayList();
>>>>>>> origin/dzabala-2019001
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
<<<<<<< HEAD
               pro.setCodigoProveedor(rs.getInt(8));
               pro.setCodigoCategoria(rs.getInt(9));
=======
               pro.setFotoDeProductos(rs.getBinaryStream(8));
               pro.setCodigoProveedor(rs.getInt(9));
               pro.setCodigoCategoria(rs.getInt(10));
>>>>>>> origin/dzabala-2019001
               listaProductos.add(pro);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return listaProductos;
   }
   
   //Metodo Agregar
   public int agregar(Productos pro){
<<<<<<< HEAD
       String sql = "insert into Productos(nombreProducto, descProductos, marca, precio, talla, cantidad, codigoProveedor, codigoCategoria) values (?,?,?,?,?,?,?,?)";
=======
       String sql = "insert into Productos(nombreProducto, descProductos, marca, precio, talla, cantidad, fotoDeProductos, codigoProveedor, codigoCategoria) values (?,?,?,?,?,?,?,?,?)";
>>>>>>> origin/dzabala-2019001
       try {
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           ps.setString(1, pro.getNombreProducto());
           ps.setString(2, pro.getDescripcion());
           ps.setString(3, pro.getMarca());
           ps.setDouble(4, pro.getPrecio());
           ps.setInt(5, pro.getTalla());
           ps.setInt(6, pro.getCantidad());
<<<<<<< HEAD
           ps.setInt(7, pro.getCodigoProveedor());
           ps.setInt(8, pro.getCodigoCategoria());
=======
           ps.setBlob(7, pro.getFotoDeProductos());
           ps.setInt(8, pro.getCodigoProveedor());
           ps.setInt(9, pro.getCodigoCategoria());
>>>>>>> origin/dzabala-2019001
           ps.executeUpdate();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return resp;
   }
   //Metodo Buscar
       public Productos listarCodigoProductos(int id){
           Productos pro = new Productos();
           String sql = "select * from Productos where codigoProducto =" + id;
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
<<<<<<< HEAD
                   pro.setCodigoProveedor(rs.getInt(8));
                   pro.setCodigoCategoria(rs.getInt(9));
=======
                   pro.setFotoDeProductos(rs.getBinaryStream(8));
                   pro.setCodigoProveedor(rs.getInt(9));
                   pro.setCodigoCategoria(rs.getInt(10));
>>>>>>> origin/dzabala-2019001
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
           return pro;
       }
       
       //Metodo Editar
       public int actualizar(Productos pro){
<<<<<<< HEAD
           String sql = "update Productos set nombreProducto = ?, descProductos = ?, marca = ?, precio = ?, talla = ?, cantidad = ? where codigoProducto = ?";
=======
           String sql = "update Productos set nombreProducto = ?, descProductos = ?, marca = ?, precio = ?, talla = ?, cantidad = ?, fotoDeProductos = ? where codigoProducto = ?";
>>>>>>> origin/dzabala-2019001
           try {
               con = cn.Conexion();
               ps = con.prepareStatement(sql);
               ps.setString(1, pro.getNombreProducto());
               ps.setString(2, pro.getDescripcion());
               ps.setString(3, pro.getMarca());
               ps.setDouble(4, pro.getPrecio());
               ps.setInt(5, pro.getTalla());
               ps.setInt(6, pro.getCantidad());
<<<<<<< HEAD
               ps.setInt(7, pro.getCodigoProducto());
=======
               ps.setBlob(7, pro.getFotoDeProductos());
               ps.setInt(8, pro.getCodigoProducto());
>>>>>>> origin/dzabala-2019001
               ps.executeUpdate();
           } catch (Exception e) {
               e.printStackTrace();
           }
           return resp;
       }
       
       //Metodo Eliminar
       public void eliminar(int id){
           String sql = "delete from Productos where codigoProducto =" + id;
           try {
               con = cn.Conexion();
               ps = con.prepareStatement(sql);
               ps.executeUpdate();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
<<<<<<< HEAD
=======
       
       public void listarImg(int id, HttpServletResponse response){
           String sql = "select * from productos where codigoProducto="+ id;
           InputStream inputStream=null;
           OutputStream outputStream=null;
           BufferedInputStream bufferedInputStream = null;
           BufferedOutputStream bufferedOutputStream=null;
           try{
               outputStream = response.getOutputStream();
               con = cn.Conexion();
               ps = con.prepareStatement(sql);
               rs = ps.executeQuery();
               if(rs.next()){
                   inputStream = rs.getBinaryStream("Foto");
               }
               bufferedInputStream = new BufferedInputStream(inputStream);
               bufferedOutputStream = new BufferedOutputStream(outputStream);
               int i =0;
               while((i=bufferedInputStream.read())!=-1){
                   bufferedOutputStream.write(i);
               }
           }catch(Exception e){}
       }
>>>>>>> origin/dzabala-2019001
}
