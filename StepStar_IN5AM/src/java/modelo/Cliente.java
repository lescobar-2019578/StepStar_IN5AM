
package modelo;

public class Cliente {
    private int codigoCliente;
    private String nombresCliente;
    private String apellidoCliente;
    private String NIT;
    private String estadoActivo;
    private String telefonoCliente;

    public Cliente() {
    }

    public Cliente(int codigoCliente, String nombresCliente, String apellidoCliente, String NIT, String estadoActivo, String telefonoCliente) {
        this.codigoCliente = codigoCliente;
        this.nombresCliente = nombresCliente;
        this.apellidoCliente = apellidoCliente;
        this.NIT = NIT;
        this.estadoActivo = estadoActivo;
        this.telefonoCliente = telefonoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getNit() {
        return NIT;
    }

    public void setNit(String NIT) {
        this.NIT = NIT;
    }

    public String getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(String estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    
}
