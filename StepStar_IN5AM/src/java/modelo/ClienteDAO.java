
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
    public int agregar(Cliente cli){
        String sql = "Insert into Cliente (nombreCliente, apellidoCliente, NIT, estadoActivo, telefonoCliente) values (?, ?, ?, ?, ?)";
        try{
           con = cn.Conexion();
           ps = con.prepareCall(sql);
           ps.setString(1, cli.getNombresCliente());
           ps.setString(2, cli.getApellidoCliente());
           ps.setString(3, cli.getNit());
           ps.setString(4, cli.getEstadoActivo());
           ps.setString(5, cli.getTelefonoCliente());
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
    public int actualizar(Cliente cli){
        String sql = "update Cliente set nombreCliente = ?, apellidoCliente = ?, NIT = ?, estadoActivo = ?, telefonoCliente = ? where codigoCliente = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombresCliente());
            ps.setString(2, cli.getApellidoCliente());
            ps.setString(3, cli.getNit());
            ps.setString(4, cli.getEstadoActivo());
            ps.setString(5, cli.getTelefonoCliente());
            ps.setInt(6, cli.getCodigoCliente());
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
