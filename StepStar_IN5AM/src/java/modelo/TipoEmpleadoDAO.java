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

/**
 *
 * @author lisan
 */
public class TipoEmpleadoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;

    // Método Agregar
    public int agregar(TipoEmpleado tipoEmpleado) {
        String sql = "INSERT INTO TipoEmpleado (descTipoEmpleado, sueldo, bonificacion, categoriaEmpleado) VALUES (?, ?, ?, ?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, tipoEmpleado.getDescTipoEmpleado());
            ps.setInt(2, tipoEmpleado.getSueldo());
            ps.setInt(3, tipoEmpleado.getBonificacion());
            ps.setString(4, tipoEmpleado.getCategoriaEmpleado());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    // Método Listar
    public List listar() {
        String sql = "SELECT * FROM TipoEmpleado";
        List<TipoEmpleado> listaTipoEmpleado = new ArrayList<TipoEmpleado>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TipoEmpleado tipoEmpleado = new TipoEmpleado();
                tipoEmpleado.setCodigoTipoEmpleado(rs.getInt("codigoTipoEmpleado"));
                tipoEmpleado.setDescTipoEmpleado(rs.getString("descTipoEmpleado"));
                tipoEmpleado.setSueldo(rs.getInt("sueldo"));
                tipoEmpleado.setBonificacion(rs.getInt("bonificacion"));
                tipoEmpleado.setCategoriaEmpleado(rs.getString("categoriaEmpleado"));
                listaTipoEmpleado.add(tipoEmpleado);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaTipoEmpleado;
    }

    // Método Editar
    public int actualizar(TipoEmpleado tipoEmpleado) {
        String sql = "UPDATE TipoEmpleado SET descTipoEmpleado = ?, sueldo = ?, bonificacion = ?, categoriaEmpleado = ? WHERE codigoTipoEmpleado = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, tipoEmpleado.getDescTipoEmpleado());
            ps.setInt(2, tipoEmpleado.getSueldo());
            ps.setInt(3, tipoEmpleado.getBonificacion());
            ps.setString(4, tipoEmpleado.getCategoriaEmpleado());
            ps.setInt(5, tipoEmpleado.getCodigoTipoEmpleado());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    // Método Eliminar
    public void eliminar(int id) {
        String sql = "DELETE FROM TipoEmpleado WHERE codigoTipoEmpleado = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Buscar por código de tipo de empleado
    public TipoEmpleado listarCodigoTipoEmpleado(int id) {
        TipoEmpleado tipoEmpleado = new TipoEmpleado();
        String sql = "SELECT * FROM TipoEmpleado WHERE codigoTipoEmpleado = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareCall(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipoEmpleado.setCodigoTipoEmpleado(rs.getInt("codigoTipoEmpleado"));
                tipoEmpleado.setDescTipoEmpleado(rs.getString("descTipoEmpleado"));
                tipoEmpleado.setSueldo(rs.getInt("sueldo"));
                tipoEmpleado.setBonificacion(rs.getInt("bonificacion"));
                tipoEmpleado.setCategoriaEmpleado(rs.getString("categoriaEmpleado"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoEmpleado;
    }
}
