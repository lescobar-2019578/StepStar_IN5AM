package modelo;

public class DetalleCompra {
    private int codigoDetalleCompra;
    private int codigoVenta;
    private int codigoCompra;

    public DetalleCompra() {
    }

    public DetalleCompra(int codigoDetalleCompra, int codigoVenta, int codigoCompra) {
        this.codigoDetalleCompra = codigoDetalleCompra;
        this.codigoVenta = codigoVenta;
        this.codigoCompra = codigoCompra;
    }

    public int getCodigoDetalleCompra() {
        return codigoDetalleCompra;
    }

    public void setCodigoDetalleCompra(int codigoDetalleCompra) {
        this.codigoDetalleCompra = codigoDetalleCompra;
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
