
package proyecto1;


public class User {
    protected int codigo;
    protected String Name;
    protected String Apellido;
    protected String Correo;
    protected String Password;
    protected boolean genero;
    
    
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return Password;
    }



    
}
