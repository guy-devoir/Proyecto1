/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import GUIs.AdminGUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Luciano Xiquín
 */
public class Login implements ActionListener{
    JFrame frame = new JFrame("Login");
    
    JPanel panel = new JPanel();
    //Campo del usuario
    JLabel label = new JLabel("Usuario: ");
    JTextField text_u = new JTextField();
    //Campo de la contraseña
    JLabel PassLabel = new JLabel("Contraseña: ");
    JPasswordField pass = new JPasswordField();
    JButton boton = new JButton("Aceptar");
    //Bottom half
    JLabel error = new JLabel("Ingrese un usuario");
    
    Admin admin = new Admin();

    public void launch() {
        //Marco
        /*System.out.println(admin.getPassword());
        System.out.println(admin.getName());
        */
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        
        frame.setSize(300, 220);
        /*
        Text Field de Usuario
        
         */

        text_u.setBounds(1, 5, 10, 1);
        panel.add(label);
        panel.setBounds(1, 4, 10, 1);
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(text_u);

        PassLabel.setBounds(1, 5, 10, 1);
        
        pass.setBounds(1, 8, 10, 1);
        panel.add(PassLabel);
        panel.add(pass);
        /**
         * Botones
         */
        panel.add(boton);
        boton.setBounds(1, 8, 10, 1);
        boton.addActionListener(this);
        panel.add(error);
        error.setBounds(1, 10, 10, 1);
        
        

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = text_u.getText();
        String password = pass.getText();

        if (user.equals(admin.getName()) && admin.getPassword().equals(password)) {
            AdminGUI guiadmin = new AdminGUI();
            guiadmin.launch();
            frame.setVisible(false);
            
        }else{
            error.setForeground(Color.red);
            error.setText("Usuario no válido");
        }

    }
}
