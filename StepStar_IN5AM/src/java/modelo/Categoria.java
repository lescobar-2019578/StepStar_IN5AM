package modelo;

public class Categoria {
    private int codigoCategoria;
    private String nombreCategoria;
    private String descripcion;
    private boolean genero;
    private int codigoProducto;

    public Categoria() {
    }

    public Categoria(int codigoCategoria, String nombreCategoria, String descripcion, boolean genero, int codigoProducto) {
        this.codigoCategoria = codigoCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcion = descripcion;
        this.genero = genero;
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
}
