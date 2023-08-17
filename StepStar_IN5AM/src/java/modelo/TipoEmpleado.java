package Modelo;


public class TipoEmpleado {
    private int codigiTipoEmpleado;
    private String descripcion;
    private Double sueldo;
    private Double bonificacion;
    private String categoria;
    
    // Constructor Vacio 
    public TipoEmpleado(){
        
    }
    
    //Contructor Llleno
    public TipoEmpleado(int codigoTipoEmpleado,String descripcion, Double sueldo,Double bonificacion,String categoria){
        this.codigiTipoEmpleado = codigoTipoEmpleado;
        this.descripcion = descripcion;
        this.sueldo = sueldo;
        this.bonificacion = bonificacion;
        this.categoria = categoria;
    }

    public int getCodigiTipoEmpleado() {
        return codigiTipoEmpleado;
    }

    public void setCodigiTipoEmpleado(int codigiTipoEmpleado) {
        this.codigiTipoEmpleado = codigiTipoEmpleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(Double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
}