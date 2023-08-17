
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;                                            
    
    public Cliente Validar(String nombresCliente, String nit){
        //instanciar un objeto de la entidad empleado
        Cliente cliente = new Cliente();
        //Agregamos una variable de tipo String para nuestra consulta SQL
        String sql = "select * from Cliente where nombresCliente = ? and nit = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareCall(sql);
            ps.setString(1, nombresCliente);
            ps.setString(2, nit);
            rs = ps.executeQuery();
            while(rs.next()){
                cliente.setCodigoCliente(rs.getInt("codigoCliente"));
                cliente.setNombresCliente(rs.getString("nombresCliente"));
                cliente.setApellidoCliente(rs.getString("apellidoCliente"));
                cliente.setNit(rs.getString("nit"));
                cliente.setEstadoActivo(rs.getString("estadoActivo"));
                cliente.setTelefonoCliente(rs.getString("telefonoCliente"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return cliente; //Empleado encontrado
    }
    
    //Método Listar
    public List listar(){
        String sql = "select * from Cliente";
        List<Cliente> listaCliente = new ArrayList<>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente cli = new Cliente();
                cli.setCodigoCliente(rs.getInt(1));
                cli.setNombresCliente(rs.getString(2));
                cli.setApellidoCliente(rs.getString(3));
                cli.setNit(rs.getString(4));
                cli.setEstadoActivo(rs.getString(5));
                cli.setTelefonoCliente(rs.getString(6));
                listaCliente.add(cli);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listaCliente;
    }
    //Método Agregar
    public int agregar(Cliente emp){
        String sql = "Insert into Cliente (nombresCliente, apellidoCliente, nit, estadoActivo, telefonoCliente) values (?, ?, ?, ?, ?)";
        try{
           con = cn.Conexion();
           ps = con.prepareCall(sql);
           ps.setString(1, emp.getNombresCliente());
           ps.setString(2, emp.getApellidoCliente());
           ps.setString(3, emp.getNit());
           ps.setString(4, emp.getEstadoActivo());
           ps.setString(5, emp.getTelefonoCliente());
           ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    
    //Buscar por codigo
    public Cliente listarCodigoCliente(int id){
        Cliente cli = new Cliente();
        String sql = "Select * from Cliente where codigoCliente =" +id;
        try{
            con = cn.Conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cli.setNombresCliente(rs.getString(2));
                cli.setApellidoCliente(rs.getString(3));
                cli.setNit(rs.getString(4));
                cli.setEstadoActivo(rs.getString(5));
                cli.setTelefonoCliente(rs.getString(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return cli;
    }
    
    //Método Editar
    public int actualizar(Cliente emp){
        String sql = "update Cliente set nit = ?, nombresCliente = ?, apellidoCliente = ?, nit = ?, telefonoCliente = ? where codigoCliente = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, emp.getNombresCliente());
            ps.setString(2, emp.getApellidoCliente());
            ps.setString(3, emp.getNit());
            ps.setString(4, emp.getEstadoActivo());
            ps.setString(5, emp.getNombresCliente());
            ps.setInt(6, emp.getCodigoCliente());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        return resp;
    }
    //Método Eliminar
    public void eliminar(int id){
        String sql = "delete from Cliente where codigoCliente = "+id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
