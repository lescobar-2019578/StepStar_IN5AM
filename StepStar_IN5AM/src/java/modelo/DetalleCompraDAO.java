package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DetalleCompraDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;

    // Método Agregar
    public int agregar(DetalleCompra detalleCompra) {
        String sql = "INSERT INTO DetalleCompra (fechaCom,cantidadProductos,codigoVenta, codigoCompra) VALUES (?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setDate(1, detalleCompra.getFechaCom());
            ps.setInt(2, detalleCompra.getCantidadProductos());
            ps.setInt(3, detalleCompra.getCodigoVenta());
            ps.setInt(4, detalleCompra.getCodigoCompra());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    // Método Listar
    public List<DetalleCompra> listar() {
        String sql = "SELECT * FROM DetalleCompra";
        List<DetalleCompra> listaDetalleCompra = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DetalleCompra detalleCompra = new DetalleCompra();
                detalleCompra.setCodigoDetalleCompra(rs.getInt("codigoDetalleCompra"));
                detalleCompra.setFechaCom(rs.getDate("fechaCom"));
                detalleCompra.setCantidadProductos(rs.getInt("cantidadProductos"));
                detalleCompra.setCodigoVenta(rs.getInt("codigoVenta"));
                detalleCompra.setCodigoCompra(rs.getInt("codigoCompra"));
                listaDetalleCompra.add(detalleCompra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaDetalleCompra;
    }

    // Método Editar
    public int actualizar(DetalleCompra detalleCompra) {
        String sql = "UPDATE DetalleCompra SET codigoVenta = ?, codigoCompra = ? WHERE codigoDetalleCompra = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, detalleCompra.getCodigoVenta());
            ps.setInt(2, detalleCompra.getCodigoCompra());
            ps.setInt(3, detalleCompra.getCodigoDetalleCompra());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    // Método Eliminar
    public void eliminar(int id) {
        String sql = "DELETE FROM DetalleCompra WHERE codigoDetalleCompra = "+ id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
         
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Buscar por código de detalle de compra
    public DetalleCompra listarCodigoDetalleCompra(int id) {
        DetalleCompra detalleCompra = new DetalleCompra();
        String sql = "SELECT * FROM DetalleCompra WHERE codigoDetalleCompra = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareCall(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                detalleCompra.setCodigoDetalleCompra(rs.getInt("codigoDetalleCompra"));
                detalleCompra.setCodigoVenta(rs.getInt("codigoVenta"));
                detalleCompra.setCodigoCompra(rs.getInt("codigoCompra"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return detalleCompra;
    }
}
