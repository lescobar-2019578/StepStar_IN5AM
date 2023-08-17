package modelo;

public class DetalleVenta {
    private int codigoDetalleVenta;
    private int codigoCliente;
    private int codigoVenta;
    private int codigoProducto;


    public DetalleVenta() {

    }

    public DetalleVenta(int codigoDetalleVenta, int codigoCliente, int codigoVenta, int codigoProducto) {
        this.codigoDetalleVenta = codigoDetalleVenta;
        this.codigoCliente = codigoCliente;
        this.codigoVenta = codigoVenta;
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoDetalleVenta() {
        return codigoDetalleVenta;
    }

    public void setCodigoDetalleVenta(int codigoDetalleVenta) {
        this.codigoDetalleVenta = codigoDetalleVenta;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    
    

}
