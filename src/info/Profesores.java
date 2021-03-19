package info;

import proyecto1.User;

public class Profesores {
    private int codigo;
    private String nombre;
    private String apellido;
    private String password;
    private String correo;
    private String genero;

    public Profesores() {
    }

    public Profesores(int codigo, String nombre, String password, String apellido, String correo, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.correo = correo;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getPassword() {
        return password;
    }

    public void getPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Profesores{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password + ", correo=" + correo + ", genero=" + genero + '}';
    }

    public Object setPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
