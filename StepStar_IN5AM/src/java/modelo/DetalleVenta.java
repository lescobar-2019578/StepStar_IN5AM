package modelo;

public class DetalleVenta {
    private int codigoDetalleVenta;
    private String fechaVen;
    private int cantidadPro;
    private String total;
    private int codigoVenta;
    private int codigoProducto;

    public DetalleVenta() {
    }

    public DetalleVenta(int codigoDetalleVenta, String fechaVen, int cantidadPro, String total, int codigoVenta, int codigoProducto) {
        this.codigoDetalleVenta = codigoDetalleVenta;
        this.fechaVen = fechaVen;
        this.cantidadPro = cantidadPro;
        this.total = total;
        this.codigoVenta = codigoVenta;
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoDetalleVenta() {
        return codigoDetalleVenta;
    }

    public void setCodigoDetalleVenta(int codigoDetalleVenta) {
        this.codigoDetalleVenta = codigoDetalleVenta;
    }

    public String getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(String fechaVen) {
        this.fechaVen = fechaVen;
    }

    public int getCantidadPro() {
        return cantidadPro;
    }

    public void setCantidadPro(int cantidadPro) {
        this.cantidadPro = cantidadPro;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
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
