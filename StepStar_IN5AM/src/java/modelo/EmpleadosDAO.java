
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class EmpleadosDAO {
   Conexion cn = new Conexion();
   Connection con;
   PreparedStatement ps;
   ResultSet rs;
   int resp;
   
   public Empleados Validar(String nombresEmpleado, String telefonoContacto){
       
        Empleados empleados = new Empleados();
        
        String sql = "select *  from empleados where nombresEmpleado = ? and DPI = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombresEmpleado);
            ps.setString(2, telefonoContacto);
            rs = ps.executeQuery();
            while(rs.next()){
                empleados.setCodigoEmpleado(rs.getInt("codigoEmpleado"));
                empleados.setDPI(rs.getString("DPI"));
                empleados.setApellidosEmpleado(rs.getString("apellidosEmpleado"));
                empleados.setNombresEmpleado(rs.getString("nombresEmpleado"));
                empleados.setTelefonoContacto(rs.getString("telefonoContacto"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return empleados; 
    }
   
   //METODO LISTAR
   public List listar(){
       String sql = "select * from Empleados";
       List<Empleados> listaEmpleados = new ArrayList<Empleados>();
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               Empleados em = new Empleados();
               em.setCodigoEmpleado(rs.getInt(1));
               em.setDPI(rs.getString(2));
               em.setApellidosEmpleado(rs.getString(3));
               em.setNombresEmpleado(rs.getString(4));
               em.setDireccionEmpleado(rs.getString(5));
               em.setTelefonoContacto(rs.getString(6));
               em.setCodigoTipoEmpleado(rs.getInt(7));
               listaEmpleados.add(em);
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       
       return listaEmpleados;
   }
   
   //METODO AGREGAR
   public int agregar(Empleados em){
       String sql = "insert into Empleados(apellidosEmpleado,nombresEmpleado,direccionEmpleado,telefonoContacto,codigoTipoEmpleado) values(?,?,?,?,?)";
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           
           ps.setString(1, em.getDPI());
           ps.setString(2, em.getApellidosEmpleado());
           ps.setString(3, em.getNombresEmpleado());
           ps.setString(4, em.getDireccionEmpleado());
           ps.setString(5, em.getTelefonoContacto());
           ps.setInt(6, em.getCodigoTipoEmpleado());
           ps.executeUpdate();
       } catch (Exception e) {
           e.printStackTrace();
       }
       return resp;
    }   
   
   //METODO BUSCAR
   
   public Empleados listarCodigoPredocutos(int id){
       Empleados em = new Empleados();
       String sql = "Select * from Empleados where codigoEmpleado = " + id;
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               em.setDPI(rs.getString(2));
               em.setApellidosEmpleado(rs.getString(3));
               em.setNombresEmpleado(rs.getString(4));
               em.setDireccionEmpleado(rs.getString(5));
               em.setTelefonoContacto(rs.getString(6));
               em.setCodigoTipoEmpleado(rs.getInt(7));
           }
       }catch(Exception e){
           e.printStackTrace();
       }
       
       return em;
   }
  
   //METODO EDITAR
   public int actualizar(Empleados em){
       String sql = "update Empleados set DPI = ?, apellidosEmpleado = ?, nombresEmpleado = ?, direccionEmpleado = ?, telefonoContacto = ?" + "where codigoEmpleado = ?";
       try{
          con = cn.Conexion();
          ps = con.prepareStatement(sql);
          ps.setString(1, em.getDPI());
          ps.setString(2, em.getApellidosEmpleado());
          ps.setString(3, em.getNombresEmpleado());
          ps.setString(4, em.getDireccionEmpleado());
          ps.setString(5, em.getTelefonoContacto());
          ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
       return resp;
   }
   
   //METODOD ELIMINAR
   public void eliminar(int id){
       String sql = "delete from Empleados where codigoEmpleado =" + id;
       try{
           con = cn.Conexion();
           ps = con.prepareStatement(sql);
           ps.executeUpdate();
       }catch(Exception e){
           e.printStackTrace();
       }
   }
}
