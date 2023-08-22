
package modelo;

public class Compra {
   private int codigoCompra;
   private String fechaCompra;
   private String descripcionCompra;
   private Double cantidad;
   private int codigoProducto;
   
   public  Compra(){}

    public Compra(int codigoCompra, String fechaCompra, String descripcionCompra, Double cantidad, int codigoProducto) {
        this.codigoCompra = codigoCompra;
        this.fechaCompra = fechaCompra;
        this.descripcionCompra = descripcionCompra;
        this.cantidad = cantidad;
        this.codigoProducto = codigoProducto;
    }

    public int getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(int codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getDescripcionCompra() {
        return descripcionCompra;
    }

    public void setDescripcionCompra(String descripcionCompra) {
        this.descripcionCompra = descripcionCompra;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
   
   
}
