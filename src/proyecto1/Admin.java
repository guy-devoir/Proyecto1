/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Luciano Xiquín
 */
public class Admin extends User {

    public Admin() {
        Name = "";
        Password = "";
    }
    

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public String getPassword() {
        return Password;
    }
}
