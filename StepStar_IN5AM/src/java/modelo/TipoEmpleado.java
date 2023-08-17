package modelo;

public class TipoEmpleado {
    private int codigoTipoEmpleado;
    private String descTipoEmpleado;
    private int sueldo;
    private int bonificacion;
    private String categoriaEmpleado;

    public TipoEmpleado() {

    }

    public TipoEmpleado(int codigoTipoEmpleado, String descTipoEmpleado, int sueldo, int bonificacion, String categoriaEmpleado) {
        this.codigoTipoEmpleado = codigoTipoEmpleado;
        this.descTipoEmpleado = descTipoEmpleado;
        this.sueldo = sueldo;
        this.bonificacion = bonificacion;
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public int getCodigoTipoEmpleado() {
        return codigoTipoEmpleado;
    }

    public void setCodigoTipoEmpleado(int codigoTipoEmpleado) {
        this.codigoTipoEmpleado = codigoTipoEmpleado;
    }

    public String getDescTipoEmpleado() {
        return descTipoEmpleado;
    }

    public void setDescTipoEmpleado(String descTipoEmpleado) {
        this.descTipoEmpleado = descTipoEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public String getCategoriaEmpleado() {
        return categoriaEmpleado;
    }

    public void setCategoriaEmpleado(String categoriaEmpleado) {
        this.categoriaEmpleado = categoriaEmpleado;
    }
}