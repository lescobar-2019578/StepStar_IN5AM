
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Antony
 */
public class ServiciosDAO {
   Conexion cn = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int resp;
   
      //METODO LISTAR
   public List listar(){
       String sql = "select * from Servicios";
       List<Servicios> listaServicios = new ArrayList<Servicios>();
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               Servicios sv = new Servicios();
               sv.setCodigoServicio(rs.getInt(1));
               sv.setFechaServicio(rs.getString(2));
               sv.setTipoServicio(rs.getString(3));
               sv.setHoraServicio(rs.getString(4));
               sv.setLugarServicio(rs.getString(5));
               sv.setTelefonoServicio(rs.getString(6));
               sv.setCodigoEmpleado(rs.getInt(7));
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       
       return listaServicios;
   }
   
   //METODO AGREGAR
   public int agregar(Servicios sv){
       String sql = "insert into Servicios(fechaServicio,tipoServicio,horaServicio,lugarServicio,telefonoServicio,codigoEmpleado) values(?,?,?,?,?,?)";
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           ps.setString(1, sv.getFechaServicio());
           ps.setString(2, sv.getTipoServicio());
           ps.setString(3, sv.getHoraServicio());
           ps.setString(4, sv.getLugarServicio());
           ps.setString(5, sv.getTelefonoServicio());
           ps.setInt(6, sv.getCodigoEmpleado());
           ps.executeUpdate();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return resp;
    }   
   
   //METODO BUSCAR
   public Servicios listarCodigoServicios(int id){
       Servicios sv = new Servicios();
       String sql = "Select * from Servicios where codigoServicio = " + id;
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               sv.setFechaServicio(rs.getString(2));
               sv.setTipoServicio(rs.getString(3));
               sv.setHoraServicio(rs.getString(4));
               sv.setLugarServicio(rs.getString(5));
               sv.setTelefonoServicio(rs.getString(6));
               sv.setCodigoEmpleado(rs.getInt(7));
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       
       return sv;
   }
  
   //METODO EDITAR
   public int actualizar(Servicios sv){
       String sql = "update Servicios set fechaServicio = ?, tipoServicio = ?, horaServicio = ?, lugarServicio = ?, telefonoServicio = ?" + "where codigoServicio = ?";
       try{
          con = cn.Conexion();
          ps = con.prepareStatement(sql);
          ps.setString(1, sv.getFechaServicio());
          ps.setString(2, sv.getTipoServicio());
          ps.setString(3, sv.getHoraServicio());
          ps.setString(4, sv.getLugarServicio());
          ps.setString(5, sv.getTelefonoServicio());
          ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
       return resp;
   }
   
   //METODOD ELIMINAR
   public void eliminar(int id){
       String sql = "delete from Servicios where codigoServicio =" + id;
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
}
