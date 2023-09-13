package modelo;

<<<<<<< HEAD
=======
import java.io.InputStream;

>>>>>>> origin/dzabala-2019001
public class Productos {
    private int codigoProducto;
    private String nombreProducto;
    private String descripcion;
    private String marca;
    private double precio;
    private int talla;
    private int cantidad;
<<<<<<< HEAD
=======
    private InputStream fotoDeProductos;
>>>>>>> origin/dzabala-2019001
    private int codigoProveedor;
    private int codigoCategoria;

    public Productos() {
    }

<<<<<<< HEAD
    public Productos(int codigoProducto, String nombreProducto, String descripcion, String marca, double precio, int talla, int cantidad, int codigoProveedor, int codigoCategoria) {
=======
    public Productos(int codigoProducto, String nombreProducto, String descripcion, String marca, double precio, int talla, int cantidad, InputStream fotoDeProductos, int codigoProveedor, int codigoCategoria) {
>>>>>>> origin/dzabala-2019001
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
        this.talla = talla;
        this.cantidad = cantidad;
<<<<<<< HEAD
=======
        this.fotoDeProductos = fotoDeProductos;
>>>>>>> origin/dzabala-2019001
        this.codigoProveedor = codigoProveedor;
        this.codigoCategoria = codigoCategoria;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

<<<<<<< HEAD
=======
    public InputStream getFotoDeProductos() {
        return fotoDeProductos;
    }

    public void setFotoDeProductos(InputStream fotoDeProductos) {
        this.fotoDeProductos = fotoDeProductos;
    }

>>>>>>> origin/dzabala-2019001
    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }
<<<<<<< HEAD
    
=======

>>>>>>> origin/dzabala-2019001
    
    
}
