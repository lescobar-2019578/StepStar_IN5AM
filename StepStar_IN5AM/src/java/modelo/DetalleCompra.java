package modelo;

import java.sql.Date;

public class DetalleCompra {
    private int codigoDetalleCompra;
    private Date fechaCom;
    private int cantidadProductos;
    private int codigoVenta;
    private int codigoCompra;

    public DetalleCompra() {
    }

    public DetalleCompra(int codigoDetalleCompra, Date fechaCom, int cantidadProductos, int codigoVenta, int codigoCompra) {
        this.codigoDetalleCompra = codigoDetalleCompra;
        this.fechaCom = fechaCom;
        this.cantidadProductos = cantidadProductos;
        this.codigoVenta = codigoVenta;
        this.codigoCompra = codigoCompra;
    }

    public int getCodigoDetalleCompra() {
        return codigoDetalleCompra;
    }

    public void setCodigoDetalleCompra(int codigoDetalleCompra) {
        this.codigoDetalleCompra = codigoDetalleCompra;
    }

    public Date getFechaCom() {
        return fechaCom;
    }

    public void setFechaCom(Date fechaCom) {
        this.fechaCom = fechaCom;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProducto) {
        this.cantidadProductos = cantidadProducto;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }
    
    
}
