/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
public class GUI {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Usuario: ");
    JLabel PassLabel = new JLabel("Contraseña: ");
    JPasswordField pass = new JPasswordField();
    JButton boton = new JButton("E");
    public void launch(){
        
       //Marco
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("Login");
        frame.setSize(300, 200);
        /*
        Text Field de Usuario
        
        */
        JTextField text_u = new JTextField();
        text_u.setBounds(1, 5, 10, 1);
        
        panel.add(label);
        panel.setBounds(1, 4, 10, 1);
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(text_u);
        boton.setBounds(1, 6, 10, 1);
        panel.add(PassLabel);
        PassLabel.setBounds(1, 7, 10, 1);
        panel.add(pass);
        pass.setBounds(1, 8, 10, 1);
        
        panel.add(boton);


        
        frame.setVisible(true);
}
}
