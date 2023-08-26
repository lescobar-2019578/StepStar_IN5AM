/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TipoEmpleadoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;
    
    // Método Listar
    public List listar() {
        String sql = "SELECT * FROM TipoEmpleado";
        List<TipoEmpleado> listaTipoEmpleado = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TipoEmpleado TiEm = new TipoEmpleado();
                TiEm.setCodigoTipoEmpleado(rs.getInt(1));
                TiEm.setDescTipoEmpleado(rs.getString(2));
                TiEm.setSueldo(rs.getString(3));
                TiEm.setBonificacion(rs.getString(4));
                TiEm.setCategoriaEmpleado(rs.getString(5));
                listaTipoEmpleado.add(TiEm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaTipoEmpleado;
    }
    
    
    // Método Agregar
    public int agregar(TipoEmpleado TiEm) {
        String sql = "INSERT INTO TipoEmpleado (descTipoEmpleado, sueldo, bonificacion, categoriaEmpleado) VALUES (?, ?, ?, ?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, TiEm.getDescTipoEmpleado());
            ps.setString(2, TiEm.getSueldo());
            ps.setString(3, TiEm.getBonificacion());
            ps.setString(4, TiEm.getCategoriaEmpleado());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    
    // Método Editar
    public int actualizar(TipoEmpleado TiEm) {
        String sql = "UPDATE TipoEmpleado SET descTipoEmpleado = ?,sueldo = ?,bonificacion = ?,categoriaEmpleado = ? WHERE codigoTipoEmpleado = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, TiEm.getDescTipoEmpleado());
            ps.setString(2, TiEm.getSueldo());
            ps.setString(3, TiEm.getBonificacion());
            ps.setString(4, TiEm.getCategoriaEmpleado());
            ps.setInt(5,    TiEm.getCodigoTipoEmpleado());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    // Buscar por código de tipo de empleado
    public TipoEmpleado listarCodigoTipoEmpleado(int id) {
        TipoEmpleado TiEm = new TipoEmpleado();
        String sql = "SELECT * FROM TipoEmpleado WHERE codigoTipoEmpleado = "+id;
        try {
            con = cn.Conexion();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TiEm.setDescTipoEmpleado(rs.getString(2));
                TiEm.setSueldo(rs.getString(3));
                TiEm.setBonificacion(rs.getString(4));
                TiEm.setCategoriaEmpleado(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return TiEm;
    }
    
     // Método Eliminar
    public void eliminar(int id) {
        String sql = "DELETE FROM TipoEmpleado WHERE codigoTipoEmpleado ="+ id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
