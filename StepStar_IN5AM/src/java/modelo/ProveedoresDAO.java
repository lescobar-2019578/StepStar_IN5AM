
import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class ProveedoresDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps; 
    ResultSet rs;
    int resp;
    
    public List listar(){
        String sql = "Select * from Proveedor";
        List<Proveedor> listaProveedor = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps= con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Proveedor pr = new Proveedor();
                pr.setCodigoProveedor(rs.getInt(1));
                pr.setNombreProveedor(rs.getString(2));
                pr.setDireccionProveedor(rs.getString(3));
                pr.setTelefonoProveedor(rs.getString(4));
                pr.setCorreoProveedor(rs.getString(5));
                listaProveedor.add(pr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaProveedor;
    }
    
    public int agregar(Proveedor pr){
        String sql = "insert into Proveedores(nombreProveedor, direccionProveedor, telefonoProveedor, correoProveedor) values(?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNombreProveedor());
            ps.setString(2, pr.getDireccionProveedor());
            ps.setString(3, pr.getTelefonoProveedor());
            ps.setString(4, pr.getCorreoProveedor());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }
    
    public Proveedor listarCodigoProveedor(int id){
        Proveedor pr = new Proveedor();
        String sql = "Select * from Proveedores where codigoProveedor = " +id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pr.setNombreProveedor(rs.getString(2));
                pr.setDireccionProveedor(rs.getString(3));
                pr.setTelefonoProveedor(rs.getString(4));
                pr.setCorreoProveedor(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pr;
    }
    
    public int actualizar(Proveedor pr){
        String sql = "Update Proveedor set nombreProveedor = ?" 
                + "direccionProveedor = ?,"
                + "telefonoProveedor = ?,"
                + "correoProveedor = ?"
                + "where codigoProveedor = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNombreProveedor());
            ps.setString(2, pr.getDireccionProveedor());
            ps.setString(3, pr.getTelefonoProveedor());
            ps.setString(4, pr.getCorreoProveedor());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }
    
    public void eliminar (int id){
        String sql = "Delete from Proveedores where codigoProveedor = " + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
