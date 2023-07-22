
package modelo;

public class Ventas {
    private int codigoVenta;
    private String fechaVenta;
    private String descripcion;
    private int cantidad;
    private String direccionEnvio;
    private int codigoServicio;

    public Ventas() {
        
    }

    public Ventas(int codigoVenta, String fechaVenta, String descripcion, int cantidad, String direccionEnvio, int codigoServicio) {
        this.codigoVenta = codigoVenta;
        this.fechaVenta = fechaVenta;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.direccionEnvio = direccionEnvio;
        this.codigoServicio = codigoServicio;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public int getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(int codigoServicio) {
        this.codigoServicio = codigoServicio;
    }
    
    
}
