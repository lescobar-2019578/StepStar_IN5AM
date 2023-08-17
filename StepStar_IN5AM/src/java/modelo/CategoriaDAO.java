package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int resp;                                            

    // Método para validar una categoría por nombre y código de producto
    public Categoria validarCategoria(String nombreCategoria, int codigoProducto) {
        Categoria categoria = new Categoria();
        String sql = "SELECT * FROM Categoria WHERE nombreCategotia = ? AND codigoProducto = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreCategoria);
            ps.setInt(2, codigoProducto);
            rs = ps.executeQuery();
            while (rs.next()) {
                categoria.setCodigoCategoria(rs.getInt("codigoCategoria"));
                categoria.setNombreCategoria(rs.getString("nombreCategotia"));
                categoria.setDescripcion(rs.getString("descCategoria"));
                categoria.setGenero(rs.getBoolean("genero"));
                categoria.setCodigoProducto(rs.getInt("codigoProducto"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categoria;
    }

    // Método para listar todas las categorías
    public List listar() {
        String sql = "SELECT * FROM Categoria";
        List<Categoria> listaCategorias = new ArrayList<>();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setCodigoCategoria(rs.getInt("codigoCategoria"));
                categoria.setNombreCategoria(rs.getString("nombreCategotia"));
                categoria.setDescripcion(rs.getString("descCategoria"));
                categoria.setGenero(rs.getBoolean("genero"));
                categoria.setCodigoProducto(rs.getInt("codigoProducto"));
                listaCategorias.add(categoria);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaCategorias;
    }

    // Método para agregar una nueva categoría
    public int agregarCategoria(Categoria categoria) {
        String sql = "INSERT INTO Categoria (nombreCategotia, descCategoria, genero, codigoProducto) VALUES (?, ?, ?, ?)";
        try {
            con = cn.Conexion();
            ps = con.prepareCall(sql);
            ps.setString(1, categoria.getNombreCategoria());
            ps.setString(2, categoria.getDescripcion());
            ps.setBoolean(3, categoria.getGenero());
            ps.setInt(4, categoria.getCodigoProducto());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    // Método para buscar una categoría por código
    public Categoria buscarPorCodigoCategoria(int codigoCategoria) {
        Categoria categoria = new Categoria();
        String sql = "SELECT * FROM Categoria WHERE codigoCategoria = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareCall(sql);
            ps.setInt(1, codigoCategoria);
            rs = ps.executeQuery();
            while (rs.next()) {
                categoria.setCodigoCategoria(rs.getInt("codigoCategoria"));
                categoria.setNombreCategoria(rs.getString("nombreCategotia"));
                categoria.setDescripcion(rs.getString("descCategoria"));
                categoria.setGenero(rs.getBoolean("genero"));
                categoria.setCodigoProducto(rs.getInt("codigoProducto"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categoria;
    }

    // Método para actualizar una categoría
    public int actualizarCategoria(Categoria categoria) {
        String sql = "UPDATE Categoria SET nombreCategotia = ?, descCategoria = ?, genero = ?, codigoProducto = ? WHERE codigoCategoria = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria.getNombreCategoria());
            ps.setString(2, categoria.getDescripcion());
            ps.setBoolean(3, categoria.getGenero());
            ps.setInt(4, categoria.getCodigoProducto());
            ps.setInt(5, categoria.getCodigoCategoria());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resp;
    }

    // Método para eliminar una categoría por código
    public void eliminarCategoria(int codigoCategoria) {
        String sql = "DELETE FROM Categoria WHERE codigoCategoria = ?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigoCategoria);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
