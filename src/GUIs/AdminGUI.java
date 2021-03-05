/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import proyecto1.Login;

/**
 *
 * @author Luciano Xiquín
 */
public class AdminGUI extends GUI implements ActionListener{
    
    @Override
    public void launch(){
        frame.setTitle("Admin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        out.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        out.setTitle("Logout");
        out.add(panel);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        panel.add(regresar);
        regresar.addActionListener(this);

        TabsAdmin demo = new TabsAdmin();
        demo.addComponentToPane(frame.getContentPane());
        
        out.setSize(50, 50);
        out.pack();
        out.setVisible(true);
        
        frame.pack();
        frame.setVisible(true);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Login login = new Login();
        login.launch();
        frame.setVisible(false);
        out.setVisible(false);
        
    }
    
}
