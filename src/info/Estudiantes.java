package info;

import proyecto1.User;

public class Estudiantes extends User{
Curso curso = new Curso();
    public Estudiantes() {
        
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

    public Object getNombre() {
        return Name;
    }

    public Object getGenero() {
        return genero;
    }
    
}
