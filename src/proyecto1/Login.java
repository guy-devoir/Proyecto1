/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Usuario: ");
    JLabel PassLabel = new JLabel("Contraseña: ");
    JPasswordField pass = new JPasswordField();
    JButton boton = new JButton("Aceptar");
    JTextField text_u = new JTextField();

    Admin admin = new Admin();

    public void launch() {
        //Marco
        System.out.println(admin.getPassword());
        System.out.println(admin.getName());
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("Login");
        frame.setSize(300, 200);
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
        

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = text_u.getText();
        String password = pass.getText();
        if (user.equals(admin.getName()) && admin.getPassword().equals(password)) {
            System.out.println("success");
        }else{
            System.out.println("...");
        }

    }
}
