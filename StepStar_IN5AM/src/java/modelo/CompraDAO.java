
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CompraDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    // Método Listar
    public List listar(){
        String sql = "Select * from Compra";
        List<Compra> listaCompras = new ArrayList<Compra>();
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Compra com = new Compra();
                com.setCodigoCompra(rs.getInt(1));
                com.setFechaCompra(rs.getString(2));
                com.setDescripcionCompra(rs.getString(3));
                com.setCantidad(rs.getInt(4));
                com.setCodigoProducto(rs.getInt(5));
                listaCompras.add(com);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listaCompras;
    }
    
    // Método Agregar
    public int agregar(Compra com){
        String sql = "Insert into Compra(fechaCompra, descCompra, cantidad, codigoProducto)values(?,?,?,?)";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, com.getFechaCompra());
            ps.setString(2, com.getDescripcionCompra());
            ps.setDouble(3, com.getCantidad());
            ps.setInt(4, com.getCodigoProducto());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return resp;
    }
    
    // Método Buscar
    public Compra listarCodigoCompra(int id){
        Compra com  = new Compra();
        String sql = "Select * from Compra where codigoCompra =" + id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                com.setFechaCompra(rs.getString(2));
                com.setDescripcionCompra(rs.getString(3));
                com.setCantidad(rs.getInt(4));
                com.setCodigoProducto(rs.getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return com;
    }
    
    //Método Editar
    public int actualizar (Compra com){
        String sql = "Update Compra set fechaCompra = ?, descCompra = ?, cantidad = ?, codigoProducto = ? where codigoCompra = ?";
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, com.getFechaCompra());
            ps.setString(2, com.getDescripcionCompra());
            ps.setDouble(3, com.getCantidad());
            ps.setInt(4, com.getCodigoProducto());
            ps.setInt(5, com.getCodigoCompra());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return resp;
    }
    
    // Método Eliminar
    public void eliminar(int id){
        String sql = "Delete from Compra where codigoCompra =" + id;
        try{
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
}
