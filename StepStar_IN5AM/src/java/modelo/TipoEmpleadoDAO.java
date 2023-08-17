package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TipoEmpleadoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    public TipoEmpleado validar (String descripcion, String categoriaEmpleado) throws SQLException{
        //Instanciar un on¿bjeto de la entidad empleado
        TipoEmpleado tipoempleado = new  TipoEmpleado();
        //Agregar una variable de tipo String para la consulta en SQL
        String sql = "slect * from TipoEmpleado where descripcion = ? and categoria = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareCall(sql);
            ps.setString(resp, sql);
            ps.setString(1, descripcion);
            ps.setString(2, categoriaEmpleado);
            rs = ps.executeQuery();
            while(rs.next()){
                tipoempleado.setCodigiTipoEmpleado(rs.getInt("codigoTipoEmpleado"));
                tipoempleado.setDescripcion(rs.getString("descripcion"));
                tipoempleado.setSueldo(rs.getDouble("sueldo"));
                tipoempleado.setBonificacion(rs.getDouble("bonificacion"));
                tipoempleado.setCategoria(rs.getString("categoriaEmpleado"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return tipoempleado;
    }
    
    //Metodo del listar 
    public List listar() throws SQLException{
        String sql = "select * from TipoEmpleado";
        List<TipoEmpleado> listaTipoEmpleado = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                TipoEmpleado em = new TipoEmpleado();
                em.setCodigiTipoEmpleado(rs.getInt(1));
                em.setDescripcion(rs.getString(2));
                em.setSueldo(rs.getDouble(3));
                em.setBonificacion(rs.getDouble(4));
                em.setCategoria(rs.getString(5));
                listaTipoEmpleado.add(em);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaTipoEmpleado;
    }
    
    //Metodo Agregar
    public int agregar (TipoEmpleado Tmp) throws SQLException{
        String sql = "Insert int TipoEmpleado (descripcion,sueldo, bonificacion,categoriaEmpleado) values (?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, Tmp.getDescripcion());
            ps.setDouble(2, Tmp.getSueldo());
            ps.setDouble(3, Tmp.getBonificacion());
            ps.setString(3, Tmp.getCategoria());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
    
    //Metodo Buscar
    public TipoEmpleado listarCodigoTipoEmpleado (int id){
        TipoEmpleado Te = new TipoEmpleado();
        String sql = "Slect * from TipoEmpleado where codigoTipoEmpleado"+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Te.setDescripcion(rs.getString(2));
                Te.setSueldo(rs.getDouble(3));
                Te.setBonificacion(rs.getDouble(4));
                Te.setCategoria(rs.getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return Te;
    }
    
    //Metodo Editar
    public int actualizar (TipoEmpleado emp){
        String sql = "ipdate tipoempleado set descripcion = ?, sueldo = ? , bonificacion = ?,categoria = ?" 
           +"where codigoTipoEmpleado = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, emp.getDescripcion());
            ps.setDouble(2, emp.getSueldo());
            ps.setDouble(3, emp.getBonificacion());
            ps.setString(4, emp.getCategoria());
            ps.setInt(5, emp.getCodigiTipoEmpleado());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
    //Metodo Eliminar
    public void eliminar (int id){
        String sql = "delete from TipoEmpleado where codigoTipoEmpleado = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
