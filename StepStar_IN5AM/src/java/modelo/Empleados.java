package modelo;

import java.io.InputStream;


public class Empleados {
    private int codigoEmpleado;
    private String DPI;
    private String apellidosEmpleado;
    private String nombresEmpleado;
    private String direccionEmpleado;
    private String telefonoContacto;
    private InputStream foto;
    private int codigoTipoEmpleado;
    private String usuario;

    public Empleados() {
    }

    public Empleados(int codigoEmpleado, String DPI, String apellidosEmpleado, String nombresEmpleado, String direccionEmpleado, String telefonoContacto, InputStream foto, int codigoTipoEmpleado, String usuario) {
        this.codigoEmpleado = codigoEmpleado;
        this.DPI = DPI;
        this.apellidosEmpleado = apellidosEmpleado;
        this.nombresEmpleado = nombresEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.telefonoContacto = telefonoContacto;
        this.foto = foto;
        this.codigoTipoEmpleado = codigoTipoEmpleado;
        this.usuario = usuario;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }

    public int getCodigoTipoEmpleado() {
        return codigoTipoEmpleado;
    }

    public void setCodigoTipoEmpleado(int codigoTipoEmpleado) {
        this.codigoTipoEmpleado = codigoTipoEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}