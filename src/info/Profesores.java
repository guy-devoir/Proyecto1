package info;

import proyecto1.User;

public class Profesores extends User{

    public Profesores(int codigo, String nombre, String apellido, String correo, String contraseña, boolean genero) {
        //codigo, nombre, apellido, correo, contraseña, genero
        this.codigo=codigo;
        this.Name = nombre;
        this.Apellido = apellido;
        this.Correo = correo;
        this.Password = contraseña;
        this.genero = genero;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String getName() {
        return Name;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    @Override
    public String getPassword() {
        return Password;
    }

    public boolean isGenero() {
        return genero;
    }
    
}
